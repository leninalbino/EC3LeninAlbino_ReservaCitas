package com.idat.EC3LeninAlbino_ReservaCitas.security;

import com.idat.EC3LeninAlbino_ReservaCitas.entity.UsuarioCliente;
import com.idat.EC3LeninAlbino_ReservaCitas.repository.UsuarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private UsuarioClienteRepository usuarioClienteRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioCliente usuario= usuarioClienteRepository.findByUsuario(username);
        if(usuario != null){
            List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(usuario.getRol());
            grantedAuthorityList.add(grantedAuthority);
            return new User(usuario.getUsuario(), usuario.getPassword(), grantedAuthorityList);
        }
        throw new UsernameNotFoundException("Usuario no existe " + username);
    }
}

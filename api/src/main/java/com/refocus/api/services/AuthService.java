package com.refocus.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException; 
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service; 

import com.refocus.api.models.dtos.AuthRequest;
import com.refocus.api.models.dtos.AuthResponse;
import com.refocus.api.models.entitys.UsuarioEntity;
import com.refocus.api.models.repositorys.UsuarioRepository;

@Service
public class AuthService implements UserDetailsService { // Implementa UserDetailsService

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(AuthRequest authRequest) {
        UsuarioEntity usuario = new UsuarioEntity(null);
        usuario.setNome(authRequest.getNome());
        usuario.setEmail(authRequest.getEmail());
        usuario.setSenha(passwordEncoder.encode(authRequest.getSenha()));
        usuarioRepository.save(usuario);
    }

    public AuthResponse authenticate(AuthRequest authRequest) {
        // TODO: Implementar a lógica de autenticação real aqui, possivelmente usando AuthenticationManager
        throw new UnsupportedOperationException("Método não implementado 'authenticate'");
    }

    public AuthResponse refreshToken(String refreshToken) {
        // TODO: Implementar a lógica de refresh token
        throw new UnsupportedOperationException("Método não implementado 'refreshToken'");
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UsuarioEntity usuario = usuarioRepository.findByEmail(email); // Usa seu método de repositório existente
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado com o email: " + email);
        }
        // Constrói o objeto UserDetails do Spring Security
        return new User(usuario.getEmail(), usuario.getSenha(), new ArrayList<>()); // Substitua ArrayList por papéis/autoridades reais, se tiver
    }
}
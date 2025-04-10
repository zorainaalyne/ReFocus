package com.refocus.api.services;

import com.refocus.api.models.dtos.AuthRequest;
import com.refocus.api.models.dtos.AuthResponse;
import com.refocus.api.models.entitys.UsuarioEntity;
import com.refocus.api.models.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class AuthService {

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticate'");
    }


    public AuthResponse refreshToken(String refreshToken) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refreshToken'");
    }

    
    }

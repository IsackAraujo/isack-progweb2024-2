package br.edu.utfpr.pb.pw44s.server.security;

import lombok.Data;

@Data
public class UserCredentials {
    private String username;
    private String password;
}
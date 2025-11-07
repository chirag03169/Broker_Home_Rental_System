package com.example.Borker_Login_Auth.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    public Object getPassword() {
        return this.password;
    }
}

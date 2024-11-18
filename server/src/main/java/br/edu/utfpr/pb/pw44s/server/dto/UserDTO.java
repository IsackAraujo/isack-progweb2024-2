package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int id;

    @NotNull(message = "{br.edu.pb.utfpr.pw25s.server.user.username.NotNull}")
    @Size(min = 4, max = 255)
    @Column(length = 50)
    private String username;

    @NotNull
    @Size(min = 2, max = 50)
    private String displayName;

    private String email;

    @NotNull
    @Size(min = 6)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    private String password;
}

package br.edu.utfpr.pb.pw44s.server.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class UserEntity implements UserDetails {

    //  {id: Long, nome: String, senha: String, email: String}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{br.edu.pb.utfpr.pw25s.server.user.username.NotNull}")
    @Size(min = 4, max = 255)
    @Column(length = 50)
    private String username;

    @NotNull
    @Size(min = 4, max = 255)
    @Column(length = 50, name = "display_name")
    private String displayName;

    @NotNull
    @Size(min = 6)
   // @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$",
   //         message = "{br.edu.pb.utfpr.pw25s.server.user.password.Pattern}")
    private String password;

    private String email;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_USER");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

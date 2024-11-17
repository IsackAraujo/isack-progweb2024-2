package br.edu.utfpr.pb.pw44s.server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDTO {

    private int id;

    @NotNull
    @Size(min = 2, max = 50)
    @JsonProperty("name")
    private String displayName;
}

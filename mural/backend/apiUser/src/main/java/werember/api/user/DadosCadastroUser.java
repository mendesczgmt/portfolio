package werember.api.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUser(
  @NotBlank
  String usuario,
  @NotBlank
  @Email
  String email,
  @NotBlank
  @Pattern(regexp = "\\d{8,20}")
  String senha) {

}

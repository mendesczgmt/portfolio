package werember.api.user;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaUser(
  @NotNull
  Long id,
  String usuario,
  String email,
  String senha) {
}

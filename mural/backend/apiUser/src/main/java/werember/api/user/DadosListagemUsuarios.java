package werember.api.user;

public record DadosListagemUsuarios(String usuario, String email, Long id) {
  public DadosListagemUsuarios(Usuario usuario) {
    this(usuario.getUsuario(), usuario.getEmail(), usuario.getId());
  }
}

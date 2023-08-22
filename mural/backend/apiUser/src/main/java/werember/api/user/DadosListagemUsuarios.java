package werember.api.user;

public record DadosListagemUsuarios(String usuario, String email) {
  public DadosListagemUsuarios(Usuario usuario) {
    this(usuario.getUsuario(), usuario.getEmail());
  }
}

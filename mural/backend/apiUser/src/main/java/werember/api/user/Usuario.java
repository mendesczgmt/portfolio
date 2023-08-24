package werember.api.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.*;

@Table(name="users")
@Entity(name="user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String usuario;
    private String email;
    private String senha;
    private boolean ativo;

    public Usuario(DadosCadastroUser dados) {
      this.usuario = dados.usuario();
      this.email = dados.email();
      this.senha = dados.senha();
      this.ativo = true;
    }

    public void atualizarDados(@Valid DadosAtualizaUser dados) {
      if(dados.email() != null) {
        this.email = dados.email();
      }

      if(dados.usuario() != null) {
        this.usuario = dados.usuario();
      }

      if(dados.senha() != null) {
        this.senha = dados.senha();
      }
    }

    public void excluir() {
      this.ativo = false;
    }
}

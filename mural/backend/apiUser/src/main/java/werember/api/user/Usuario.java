package werember.api.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    public Usuario(DadosCadastroUser dados) {
      this.usuario = dados.usuario();
      this.email = dados.email();
      this.senha = dados.senha();
    }
}

package werember.api.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {

    Page<Usuario> findAllByAtivoTrue(Pageable paginacao);

}

package br.com.softpethouse.domain.repository;

import br.com.softpethouse.domain.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long> {

}

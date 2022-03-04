package br.com.softpethouse.domain.service;

import br.com.softpethouse.domain.model.UserAccount;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserAccount save(UserAccount userAccount);

    List<UserAccount> findAll();

    Optional<UserAccount> findById(Long id);

    UserAccount update(UserAccount userAccount);

    void deleteById(Long id);

}

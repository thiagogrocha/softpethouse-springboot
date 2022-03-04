package br.com.softpethouse.domain.service;

import br.com.softpethouse.domain.model.UserAccount;
import br.com.softpethouse.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserAccount save(UserAccount userAccount) {
        return repo.save(userAccount);
    }

    @Override
    public List<UserAccount> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UserAccount> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public UserAccount update(UserAccount userAccount) {
        return repo.save(userAccount);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}

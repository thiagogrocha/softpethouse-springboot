package br.com.softpethouse.domain.controller;

import br.com.softpethouse.domain.model.UserAccount;
import br.com.softpethouse.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Resources.USER)
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserAccount>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserAccount>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserAccount> create(@RequestBody UserAccount userAccount){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(userAccount));
    }

    @PutMapping
    public ResponseEntity<UserAccount> update(@RequestBody UserAccount userAccount){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(userAccount));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}

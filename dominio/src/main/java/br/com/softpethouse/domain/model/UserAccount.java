package br.com.softpethouse.domain.model;

import lombok.Data;
import org.hibernate.annotations.Check;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "user_seq", sequenceName = "seq_id_user")
@Check(constraints ="upper(tp_user) in ('T', 'A')")
public class UserAccount extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    @Column(unique = true)
    private String email;

    private String name;

    private Character tpUser;


}

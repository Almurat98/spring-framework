package comcydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    private String firstName;
    private String lastName;
    @Id
    private Long id;
    private String email;

}

package comcydeo.entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
}

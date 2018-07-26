package kekproject.kekproject2;

import javax.persistence.*;

@Entity
@Table(name = "testTable")
public class testEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "testName")
    private String name;


    public testEntity(){

    }

    public testEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


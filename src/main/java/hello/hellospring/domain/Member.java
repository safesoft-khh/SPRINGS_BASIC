package hello.hellospring.domain;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity//JPA가 관리하는 Entity이다.
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

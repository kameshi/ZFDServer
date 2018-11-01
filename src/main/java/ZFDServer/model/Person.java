package ZFDServer.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONSEQUENCE")
    @SequenceGenerator(name="PERSONSEQUENCE", sequenceName="PERSONSEQUENCE", allocationSize=1)
    @Column(name = "IDPERSON")
    private Long idPerson;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "BIRTHDATE", nullable = false)
    private Date birthDate;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "ACCESSRIGHT")
    private String accessRight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDACCOUNT")
    private Account account;

    public Person(String name, String surname, Date birthDate, String email, String accessRight, Account account) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
        this.accessRight = accessRight;
        this.account = account;
    }

    public Person() {
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessRight() {
        return accessRight;
    }

    public void setAccessRight(String accessRight) {
        this.accessRight = accessRight;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

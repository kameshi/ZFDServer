package ZFDServer.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNTSEQUENCE")
    @SequenceGenerator(name="ACCOUNTSEQUENCE", sequenceName="ACCOUNTSEQUENCE", allocationSize=1)
    @Column(name = "IDACCOUNT")
    private Long idAccount;

    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "CONFIRMATION", nullable = false)
    private String confirmation;

    @Column(name = "CREATEDATE", nullable = false)
    private Date createdate;

    public Account(String login, String email, String password, String confirmation, Date createdate) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.confirmation = confirmation;
        this.createdate = createdate;
    }

    public Account() {

    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}

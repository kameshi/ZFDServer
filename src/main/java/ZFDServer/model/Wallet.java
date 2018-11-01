package ZFDServer.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "WALLET")
public class Wallet {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="WALLETSEQUENCE")
    @SequenceGenerator(name="WALLETSEQUENCE", sequenceName="WALLETSEQUENCE", allocationSize=1)
    @Column(name = "IDWALLET")
    private Long idWallet;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "AMOUNT", nullable = false)
    private float amount;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATIONDATE")
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDPERSON")
    private Person person;

    public Wallet(String name, String type, float amount, String description, Date creationDate, Person person) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.creationDate = creationDate;
        this.person = person;
    }

    public Wallet() {
    }

    public Long getIdWallet() {
        return idWallet;
    }

    public void setIdWallet(Long idWallet) {
        this.idWallet = idWallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

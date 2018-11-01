package ZFDServer.model;

import javax.persistence.*;

@Entity
@Table(name = "SOURCE")
public class Source {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOURCESEQUENCE")
    @SequenceGenerator(name="SOURCESEQUENCE", sequenceName="SOURCESEQUENCE", allocationSize=1)
    @Column(name = "IDSOURCE")
    private Long idSource;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "SOURCETYPE", nullable = false)
    private String sourceType;

    public Source(String name, String type, String address, String sourceType) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.sourceType = sourceType;
    }

    public Source() {
    }

    public Long getIdSource() {
        return idSource;
    }

    public void setIdSource(Long idSource) {
        this.idSource = idSource;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}

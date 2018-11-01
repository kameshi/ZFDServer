package ZFDServer.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TRANSFER")
public class Transfer {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSFERQUENCE")
    @SequenceGenerator(name="TRANSFERQUENCE", sequenceName="TRANSFERQUENCE", allocationSize=1)
    @Column(name = "IDTRANSFER")
    long idTransfer;

    @Column(name = "AMOUNT", nullable = false)
    private float amount;

    @Column(name = "VALUEBEFOREFROM", nullable = false)
    private float valueBeforeFrom;

    @Column(name = "VALUEBEFORETO", nullable = false)
    private float valueBeforeTo;

    @Column(name = "TRANSFERDATE", nullable = false)
    private Date transferDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDWALLETFROM")
    private Wallet walletFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDWALLETTO")
    private Wallet walletTo;

    public Transfer(float amount, float valueBeforeFrom, float valueBeforeTo, Date transferDate, Wallet walletFrom, Wallet walletTo) {
        this.amount = amount;
        this.valueBeforeFrom = valueBeforeFrom;
        this.valueBeforeTo = valueBeforeTo;
        this.transferDate = transferDate;
        this.walletFrom = walletFrom;
        this.walletTo = walletTo;
    }

    public Transfer() {
    }

    public long getIdTransfer() {
        return idTransfer;
    }

    public void setIdTransfer(long idTransfer) {
        this.idTransfer = idTransfer;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getValueBeforeFrom() {
        return valueBeforeFrom;
    }

    public void setValueBeforeFrom(float valueBeforeFrom) {
        this.valueBeforeFrom = valueBeforeFrom;
    }

    public float getValueBeforeTo() {
        return valueBeforeTo;
    }

    public void setValueBeforeTo(float valueBeforeTo) {
        this.valueBeforeTo = valueBeforeTo;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public Wallet getWalletFrom() {
        return walletFrom;
    }

    public void setWalletFrom(Wallet walletFrom) {
        this.walletFrom = walletFrom;
    }

    public Wallet getWalletTo() {
        return walletTo;
    }

    public void setWalletTo(Wallet walletTo) {
        this.walletTo = walletTo;
    }
}

package ZFDServer.springapp.dto;

import java.io.Serializable;
import java.sql.Date;

public class TransferDTO implements Serializable {

    long idTransfer;
    private float amount;
    private float valueBeforeFrom;
    private float valueBeforeTo;
    private Date transferDate;
    private WalletDTO walletFrom;
    private WalletDTO walletTo;

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

    public WalletDTO getWalletFrom() {
        return walletFrom;
    }

    public void setWalletFrom(WalletDTO walletFrom) {
        this.walletFrom = walletFrom;
    }

    public WalletDTO getWalletTo() {
        return walletTo;
    }

    public void setWalletTo(WalletDTO walletTo) {
        this.walletTo = walletTo;
    }
}

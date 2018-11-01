package ZFDServer.springapp.mapper;

import ZFDServer.model.Transfer;
import ZFDServer.springapp.dto.TransferDTO;

public class TransferMapper {

    public static TransferDTO toTransferDTO(Transfer transfer){
        TransferDTO transferDTO = new TransferDTO();
        transferDTO.setIdTransfer(transfer.getIdTransfer());
        transferDTO.setAmount(transfer.getAmount());
        transferDTO.setTransferDate(transfer.getTransferDate());
        transferDTO.setValueBeforeFrom(transfer.getValueBeforeFrom());
        transferDTO.setValueBeforeTo(transfer.getValueBeforeTo());
        transferDTO.setWalletFrom(WalletMapper.toWalletDTO(transfer.getWalletFrom()));
        transferDTO.setWalletTo(WalletMapper.toWalletDTO(transfer.getWalletTo()));
        return transferDTO;
    }

    public static Transfer toTransfer(TransferDTO transferDTO){
        Transfer transfer = new Transfer();
        transfer.setIdTransfer(transferDTO.getIdTransfer());
        transfer.setAmount(transferDTO.getAmount());
        transfer.setTransferDate(transferDTO.getTransferDate());
        transfer.setValueBeforeFrom(transferDTO.getValueBeforeFrom());
        transfer.setValueBeforeTo(transferDTO.getValueBeforeTo());
        transfer.setWalletFrom(WalletMapper.toWallet(transferDTO.getWalletFrom()));
        transfer.setWalletTo(WalletMapper.toWallet(transferDTO.getWalletTo()));
        return transfer;
    }
}

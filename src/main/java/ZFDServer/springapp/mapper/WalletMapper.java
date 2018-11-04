package ZFDServer.springapp.mapper;


import ZFDServer.model.Wallet;
import ZFDServer.springapp.dto.WalletDTO;

import javax.validation.constraints.Null;

public class WalletMapper {

    public static WalletDTO toWalletDTO(Wallet wallet){
        WalletDTO walletDTO = new WalletDTO();
        walletDTO.setIdWallet(wallet.getIdWallet());
        walletDTO.setName(wallet.getName());
        walletDTO.setType(wallet.getType());
        walletDTO.setAmount(wallet.getAmount());
        walletDTO.setCreationDate(wallet.getCreationDate());
        walletDTO.setDescription(wallet.getDescription());
        if(wallet.getPerson() != null) {
            walletDTO.setPerson(PersonMapper.toPersonDTO(wallet.getPerson()));
        }
        return walletDTO;
    }

    public static Wallet toWallet(WalletDTO walletDTO){
        Wallet wallet = new Wallet();
        wallet.setIdWallet(walletDTO.getIdWallet());
        wallet.setName(walletDTO.getName());
        wallet.setType(walletDTO.getType());
        wallet.setAmount(walletDTO.getAmount());
        wallet.setCreationDate(walletDTO.getCreationDate());
        wallet.setDescription(walletDTO.getDescription());
        if(walletDTO.getPerson() != null) {
            wallet.setPerson(PersonMapper.toPerson(walletDTO.getPerson()));
        }
        return wallet;
    }
}

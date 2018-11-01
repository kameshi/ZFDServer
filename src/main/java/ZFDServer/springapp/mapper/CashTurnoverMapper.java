package ZFDServer.springapp.mapper;

import ZFDServer.model.CashTurnover;
import ZFDServer.springapp.dto.CashTurnoverDTO;

public class CashTurnoverMapper {

    public static CashTurnoverDTO toCashTurnoverDTO(CashTurnover cashTurnover){
        CashTurnoverDTO cashTurnoverDTO = new CashTurnoverDTO();
        cashTurnoverDTO.setIdCashTurnover(cashTurnover.getIdCashTurnover());
        cashTurnoverDTO.setCashTurnoverType(cashTurnover.getCashTurnoverType());
        cashTurnoverDTO.setType(cashTurnover.getType());
        cashTurnoverDTO.setAmount(cashTurnover.getAmount());
        cashTurnoverDTO.setValueAfter(cashTurnover.getValueAfter());
        cashTurnoverDTO.setValueBefore(cashTurnover.getValueBefore());
        cashTurnoverDTO.setTurnoverDate(cashTurnover.getTurnoverDate());
        cashTurnoverDTO.setDescription(cashTurnover.getDescription());
        cashTurnoverDTO.setSource(SourceMapper.toSourceDTO(cashTurnover.getSource()));
        cashTurnoverDTO.setWallet(WalletMapper.toWalletDTO(cashTurnover.getWallet()));
        return cashTurnoverDTO;
    }

    public static CashTurnover toCashTurnover(CashTurnoverDTO cashTurnoverDTO){
        CashTurnover cashTurnover = new CashTurnover();
        cashTurnover.setIdCashTurnover(cashTurnoverDTO.getIdCashTurnover());
        cashTurnover.setCashTurnoverType(cashTurnoverDTO.getCashTurnoverType());
        cashTurnover.setType(cashTurnoverDTO.getType());
        cashTurnover.setAmount(cashTurnoverDTO.getAmount());
        cashTurnover.setValueAfter(cashTurnoverDTO.getValueAfter());
        cashTurnover.setValueBefore(cashTurnoverDTO.getValueBefore());
        cashTurnover.setTurnoverDate(cashTurnoverDTO.getTurnoverDate());
        cashTurnover.setDescription(cashTurnoverDTO.getDescription());
        cashTurnover.setSource(SourceMapper.toSource(cashTurnoverDTO.getSource()));
        cashTurnover.setWallet(WalletMapper.toWallet(cashTurnoverDTO.getWallet()));
        return cashTurnover;
    }

}

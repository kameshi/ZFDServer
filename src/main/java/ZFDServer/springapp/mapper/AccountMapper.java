package ZFDServer.springapp.mapper;

import ZFDServer.model.Account;
import ZFDServer.springapp.dto.AccountDTO;

public class AccountMapper {

    public static AccountDTO toAccountDTO(Account account){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setIdAccount(account.getIdAccount());
        accountDTO.setLogin(account.getLogin());
        accountDTO.setPassword(account.getPassword());
        accountDTO.setEmail(account.getEmail());
        accountDTO.setConfirmation(account.getConfirmation());
        accountDTO.setCreatedate(account.getCreatedate());
        return accountDTO;
    }

    public static Account toAccount(AccountDTO accountDTO){
        Account account = new Account();
        account.setIdAccount(accountDTO.getIdAccount());
        account.setLogin(accountDTO.getLogin());
        account.setPassword(accountDTO.getPassword());
        account.setEmail(accountDTO.getEmail());
        account.setConfirmation(accountDTO.getConfirmation());
        account.setCreatedate(accountDTO.getCreatedate());
        return account;
    }
}

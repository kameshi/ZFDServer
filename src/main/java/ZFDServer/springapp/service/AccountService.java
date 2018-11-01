package ZFDServer.springapp.service;

import ZFDServer.model.Account;
import ZFDServer.springapp.dto.AccountDTO;
import ZFDServer.springapp.dao.AccountDAO;
import ZFDServer.springapp.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService{

    private final AccountDAO accountDAO;

    @Autowired
    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account getAccountId(String login, String pass) {
        return null;
    }

    public Account insertAccount(AccountDTO accountDTO) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        accountDTO.setPassword(encoder.encode(accountDTO.getPassword()));
        return this.accountDAO.save(AccountMapper.toAccount(accountDTO));
    }

    public Account getAccount(Long accountId) throws Exception {
        return accountDAO.findById(accountId).get();
    }
}

package ZFDServer.springapp.web.rest;

import ZFDServer.model.Account;
import ZFDServer.springapp.dto.AccountDTO;
import ZFDServer.springapp.mapper.AccountMapper;
import ZFDServer.springapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/account")
public class AccountRestController {

    private static AccountService accountService;

    @Autowired
    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }


    public static AccountDTO getAccount(String login, String pass){
        try {
            AccountDTO accountDTO;
            Account account = accountService.getAccountId(login,pass);
            accountDTO = AccountMapper.toAccountDTO(account);
            System.out.println(accountDTO.toString());
            return accountDTO;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public static int addAccount(AccountDTO accountDTO){
        try {
            accountService.insertAccount(accountDTO);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }

}

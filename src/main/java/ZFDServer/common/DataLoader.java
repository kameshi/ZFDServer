package ZFDServer.common;

import ZFDServer.model.*;
import ZFDServer.springapp.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    private final AccountDAO accountDAO;
    private final PersonDAO personDAO;
    private final WalletDAO walletDAO;
    private final SourceDAO sourceDAO;
    private final TransferDAO transferDAO;

    public DataLoader(AccountDAO accountDAO, PersonDAO personDAO, WalletDAO walletDAO, SourceDAO sourceDAO, TransferDAO transferDAO) {
        this.accountDAO = accountDAO;
        this.personDAO = personDAO;
        this.walletDAO = walletDAO;
        this.sourceDAO = sourceDAO;
        this.transferDAO = transferDAO;
    }

    @Autowired


    public void run(ApplicationArguments args) {
        try {
            List<Account> accounts = loadAccounts();
            List<Person> persons = loadPersons(accounts);
            List<Wallet> wallets = loadWallets(persons);
            List<Source> sources = loadSources();
            List<Transfer> transfers = loadTransfers(wallets);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Account> loadAccounts() throws Exception {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        List<Account> accounts = new ArrayList<>();
        accounts.add(accountDAO.save(new Account("kameshi", "marek.madela@onet.pl", encoder.encode("333221Marekm"), "False", Date.valueOf("2018-10-01"))));
        accounts.add(accountDAO.save(new Account("marekm", "marek.madela@onet.pl", encoder.encode("333221Marekm"), "False", Date.valueOf("2018-10-03"))));
        return accounts;
    }

    private List<Person> loadPersons(List<Account> accounts) {
        List<Person> persons = new ArrayList<>();
        persons.add(personDAO.save(new Person("Marek", "Madeła", Date.valueOf("1995-07-02"), "marek.madela@onet.pl", "admin", accounts.get(1))));
        persons.add(personDAO.save(new Person("Marek2", "Madeła", Date.valueOf("1996-07-02"), "marek2.madela@onet.pl", "user", accounts.get(0))));
        persons.add(personDAO.save(new Person("Marek3", "Madeła", Date.valueOf("1997-07-02"), "marek3.madela@onet.pl", "user", accounts.get(1))));
        return persons;
    }


    private List<Source> loadSources() {
        List<Source> sources = new ArrayList<>();
        sources.add(sourceDAO.save(new Source("tesco", "spożywczy", "Kielce galeria ECHO", "shop")));
        sources.add(sourceDAO.save(new Source("biedronka", "spożywczy", "Kielce szydłówek", "shop")));
        sources.add(sourceDAO.save(new Source("tesco", "spożywczy", "Kielce galeria ECHO", "job")));
        sources.add(sourceDAO.save(new Source("tesco", "spożywczy", "Kielce galeria ECHO", "job")));
        return sources;
    }

    private List<Wallet> loadWallets(List<Person> persons) {
        List<Wallet> wallets = new ArrayList<>();
        wallets.add(walletDAO.save(new Wallet("kartaStefana", "karta", 1, "karta do konta oszczędnościowego", Date.valueOf("1997-07-02"), persons.get(2))));
        return wallets;
    }

   /* private List<CashTurnover> loadCashTurnovers(List<Wallet> wallets, List<Source> sources) {
        List<CashTurnover> cashTurnovers = new ArrayList<>();
        cashTurnovers.add(cashTurnoverDAO.save(new CashTurnover("paliwo",50, 150, 100,"orlen Kielce", new Date(2018,07,02), "gaz Seat Leon", sources.get(0),,  wallets.get(0))));
        cashTurnovers.add(cashTurnoverDAO.save(new CashTurnover("paliwo",50, 100, 50,"orlen Kielce", new Date(2018,07,02), "benzyna Seat Leon", wallets.get(1))));
        cashTurnovers.add(cashTurnoverDAO.save(new CashTurnover("produkty spożywcze",60, 260, 200,"orlen Kielce", new Date(2018,07,02), "codzienne zakupy", wallets.get(2))));
        return cashTurnovers;
    }*/



    private List<Transfer> loadTransfers(List<Wallet> wallets) {
        List<Transfer> transfers = new ArrayList<>();
        return transfers;
    }

}

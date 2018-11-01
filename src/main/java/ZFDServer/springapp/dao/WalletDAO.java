package ZFDServer.springapp.dao;

import ZFDServer.model.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletDAO extends CrudRepository<Wallet, Long> {

}

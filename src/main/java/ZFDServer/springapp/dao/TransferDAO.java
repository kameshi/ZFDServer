package ZFDServer.springapp.dao;

import ZFDServer.model.Transfer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferDAO extends CrudRepository<Transfer, Long> {
}

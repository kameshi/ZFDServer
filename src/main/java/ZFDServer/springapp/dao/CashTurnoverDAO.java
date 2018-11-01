package ZFDServer.springapp.dao;

import ZFDServer.model.CashTurnover;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashTurnoverDAO extends CrudRepository<CashTurnover, Long> {


}

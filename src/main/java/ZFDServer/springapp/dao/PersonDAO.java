package ZFDServer.springapp.dao;

import ZFDServer.model.Account;
import ZFDServer.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
    @Query("SELECT p FROM Person p WHERE p.account.idAccount in ?1")
    Iterable<Person> findPersonByAccount(@Param("accountId") Long accountId);
}

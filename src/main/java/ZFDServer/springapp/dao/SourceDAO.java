package ZFDServer.springapp.dao;

import ZFDServer.model.Source;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceDAO extends CrudRepository<Source, Long> {
}

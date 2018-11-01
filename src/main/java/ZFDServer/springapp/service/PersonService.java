package ZFDServer.springapp.service;

import ZFDServer.model.Account;
import ZFDServer.model.Person;
import ZFDServer.springapp.dao.PersonDAO;
import ZFDServer.springapp.dto.PersonDTO;
import ZFDServer.springapp.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService{

    private final PersonDAO personDAO;
    private final AccountService accountService;

    public PersonService(PersonDAO personDAO, AccountService accountService) {
        this.personDAO = personDAO;
        this.accountService = accountService;
    }

    public List<PersonDTO> getPersonDTO() {
        Iterable<Person> personIterable = personDAO.findAll();
        List<PersonDTO> personDTOList = new ArrayList<>();
        for (Person person : personIterable){
            personDTOList.add(PersonMapper.toPersonDTO(person));
        }
        return personDTOList;
    }

    public Person insertPerson(PersonDTO personDTO) {
        return this.personDAO.save(PersonMapper.toPerson(personDTO));
    }

    public void updatePerson(PersonDTO personDTO) {
    }

    public void deletePerson(Long personId) {
    }

    public List<PersonDTO> findPersonByAccount(Long accountId) throws Exception {
        Iterable<Person> personIterable = personDAO.findPersonByAccount(accountId);
        List<PersonDTO> personDTOList = new ArrayList<>();
        for (Person person : personIterable){
            personDTOList.add(PersonMapper.toPersonDTO(person));
        }
        return personDTOList;
    }
}

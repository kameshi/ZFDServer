package ZFDServer.springapp.mapper;

import ZFDServer.model.Person;
import ZFDServer.springapp.dto.PersonDTO;


public class PersonMapper {

    public static PersonDTO toPersonDTO(Person person){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setIdPerson(person.getIdPerson());
        personDTO.setName(person.getName());
        personDTO.setSurname(person.getSurname());
        personDTO.setBirthDate(person.getBirthDate());
        personDTO.setEmail(person.getEmail());
        personDTO.setAccessRight(person.getAccessRight());
        if(person.getAccount() != null) {
            personDTO.setAccount(AccountMapper.toAccountDTO(person.getAccount()));
        }
        return personDTO;
    }

    public static Person toPerson(PersonDTO personDTO){
        Person person = new Person();
        person.setIdPerson(personDTO.getIdPerson());
        person.setName(personDTO.getName());
        person.setSurname(personDTO.getSurname());
        person.setBirthDate(personDTO.getBirthDate());
        person.setEmail(personDTO.getEmail());
        person.setAccessRight(personDTO.getAccessRight());
        if(personDTO.getAccount() != null) {
            person.setAccount(AccountMapper.toAccount(personDTO.getAccount()));
        }
        return person;
    }

}

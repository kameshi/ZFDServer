package ZFDServer.springapp.web.rest;

import ZFDServer.springapp.dto.AccountDTO;
import ZFDServer.springapp.dto.PersonDTO;
import ZFDServer.springapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/person")
public class PersonRestController {

    private static PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(method = RequestMethod.POST)
    private ResponseEntity insertPerson(@RequestBody PersonDTO personDTO) throws Exception {
        try {
            personService.insertPerson(personDTO);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Object> getPersonDTO() throws Exception {
        try {
            List<PersonDTO> personDTOList = personService.getPersonDTO();
            return new ResponseEntity<Object>(personDTOList, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping(value = "/{personId}/{accountId}")
    private ResponseEntity updatePerson(@PathVariable Long personId, @PathVariable Long accountId,@RequestBody PersonDTO personDTO) throws Exception {
        try {
            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setIdAccount(accountId);
            personDTO.setAccount(accountDTO);
            personService.updatePerson(personId, personDTO);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{personId}")
    private ResponseEntity deletePerson(@PathVariable Long personId) {
        try {
            personService.deletePerson(personId);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{accountId}")
    private ResponseEntity findPersonByAccount(@PathVariable Long accountId) {
        try {
            List<PersonDTO> personDTO = personService.findPersonByAccount(accountId);
            return new ResponseEntity(personDTO, HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

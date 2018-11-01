package ZFDServer.springapp.web.rest;

import ZFDServer.model.Source;
import ZFDServer.springapp.dto.SourceDTO;
import ZFDServer.springapp.service.SourceService;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/source")
public class SourceRestController {

    private static SourceService sourceService;

    public SourceRestController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @RequestMapping(method = RequestMethod.POST)
    private ResponseEntity inserSource(@RequestBody SourceDTO sourceDTO) {
        try {
            sourceService.insertSource(sourceDTO);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public static ResponseEntity<Object> getSourceDTO(){
        try {
            List<SourceDTO> sourceDTOList = sourceService.getSourceDTO();
            return new ResponseEntity<Object>(sourceDTOList,HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

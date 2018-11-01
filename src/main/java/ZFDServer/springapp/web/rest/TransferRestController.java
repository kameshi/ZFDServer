package ZFDServer.springapp.web.rest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/transfer")
public class TransferRestController {
}

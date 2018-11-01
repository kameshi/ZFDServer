package ZFDServer.springapp.web.rest;

import ZFDServer.springapp.dto.CashTurnoverDTO;
import ZFDServer.springapp.service.CashTurnoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/cashturnover")
public class CashTurnoverRestController {

    private static CashTurnoverService cashTurnoverService;

    @Autowired
    public CashTurnoverRestController(CashTurnoverService cashTurnoverService) {
        this.cashTurnoverService = cashTurnoverService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public static int insertCashTurnover(CashTurnoverDTO cashTurnoverDTO) throws Exception {
        try {
            cashTurnoverService.insertCashTurnover(cashTurnoverDTO);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public static List<CashTurnoverDTO> getCashTurnoverDTO() throws Exception {
        try {
            List<CashTurnoverDTO> cashTurnoverDTOList = cashTurnoverService.getCashTurnoverDTO();
            return cashTurnoverDTOList;
        }
        catch (Exception e){
            return null;
        }
    }

    @PatchMapping(value = "/{carId}")
    public static int updateCashTurnover(CashTurnoverDTO cashTurnoverDTO) throws Exception {
        try {
            cashTurnoverService.updateCashTurnover(cashTurnoverDTO);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }

    @DeleteMapping(value = "/{carId}")
    public static int deleteCashTurnover(Long cashTurnoverId) {
        try {
            cashTurnoverService.deleteCashTurnover(cashTurnoverId);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }
}

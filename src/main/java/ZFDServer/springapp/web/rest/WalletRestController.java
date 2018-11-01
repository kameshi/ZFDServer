package ZFDServer.springapp.web.rest;

import ZFDServer.springapp.dto.WalletDTO;
import ZFDServer.springapp.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Scope("request")
@CrossOrigin(origins = "*")
@RequestMapping(value = "/zfd/rest/wallet")
public class WalletRestController {

    private static WalletService walletService;

    @Autowired
    public WalletRestController(WalletService walletService) {
        this.walletService = walletService;
    }

    public static int insertWallet(WalletDTO walletDTO) throws Exception {
        try {
            walletService.insertWallet(walletDTO);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }

    public static List<WalletDTO> getWalletDTO() throws Exception {
        try {
            List<WalletDTO> walletDTOList = walletService.getWalletDTO();
            return walletDTOList;
        }
        catch (Exception e){
            return null;
        }
    }

    public static int updateWallet(WalletDTO walletDTO) throws Exception {
        try {
            walletService.updateWallet(walletDTO);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }

    public static int deleteWallet(Long walletId) {
        try {
            walletService.deleteWallet(walletId);
            return 1;
        }
        catch (Exception e){
            return -1;
        }
    }
}

package ZFDServer.springapp.service;

import ZFDServer.model.CashTurnover;
import ZFDServer.springapp.dao.CashTurnoverDAO;
import ZFDServer.springapp.dto.CashTurnoverDTO;
import ZFDServer.springapp.mapper.CashTurnoverMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CashTurnoverService {

    private final CashTurnoverDAO cashTurnoverDAO;

    public CashTurnoverService(CashTurnoverDAO cashTurnoverDAO) {
        this.cashTurnoverDAO = cashTurnoverDAO;
    }

    public void insertCashTurnover(CashTurnoverDTO cashTurnoverDTO) {
    }

    public List<CashTurnoverDTO> getCashTurnoverDTO() {
        Iterable<CashTurnover> cashTurnoverIterable = this.cashTurnoverDAO.findAll();
        List<CashTurnoverDTO> cashTurnoverDTOList = new ArrayList<CashTurnoverDTO>();
        for (CashTurnover cashTurnover : cashTurnoverIterable){
            cashTurnoverDTOList.add(CashTurnoverMapper.toCashTurnoverDTO(cashTurnover));
        }
        return cashTurnoverDTOList;
    }

    public void updateCashTurnover(CashTurnoverDTO cashTurnoverDTO) {
    }

    public void deleteCashTurnover(Long cashTurnoverId) {
    }
}

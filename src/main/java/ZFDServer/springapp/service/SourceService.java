package ZFDServer.springapp.service;

import ZFDServer.model.Source;
import ZFDServer.springapp.dao.SourceDAO;
import ZFDServer.springapp.dto.SourceDTO;
import ZFDServer.springapp.mapper.SourceMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SourceService {

    private final SourceDAO sourceDAO;

    public SourceService(SourceDAO sourceDAO) {
        this.sourceDAO = sourceDAO;
    }

    public Source insertSource(SourceDTO sourceDTO) {
        return this.sourceDAO.save(SourceMapper.toSource(sourceDTO));
    }

    public List<SourceDTO> getSourceDTO() {
        Iterable<Source> sourceIterable = sourceDAO.findAll();
        List<SourceDTO> sourceDTOList = new ArrayList<SourceDTO>();
        for(Source source : sourceIterable){
            sourceDTOList.add(SourceMapper.toSourceDTO(source));
        }
        return sourceDTOList;
    }

}

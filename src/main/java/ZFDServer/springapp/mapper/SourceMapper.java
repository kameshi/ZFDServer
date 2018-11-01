package ZFDServer.springapp.mapper;

import ZFDServer.model.Source;
import ZFDServer.springapp.dto.SourceDTO;

public class SourceMapper {

    public static Source toSource(SourceDTO sourceDTO){
        Source source = new Source();
        source.setIdSource(sourceDTO.getIdSource());
        source.setAddress(sourceDTO.getAddress());
        source.setName(sourceDTO.getName());
        source.setSourceType(sourceDTO.getSourceType());
        source.setType(sourceDTO.getType());
        return source;
    }

    public static SourceDTO toSourceDTO(Source source){
        SourceDTO sourceDTO = new SourceDTO();
        sourceDTO.setIdSource(source.getIdSource());
        sourceDTO.setAddress(source.getAddress());
        sourceDTO.setName(source.getName());
        sourceDTO.setSourceType(source.getSourceType());
        sourceDTO.setType(source.getType());
        return sourceDTO;
    }
}

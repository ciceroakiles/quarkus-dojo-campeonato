package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dto.CampeonatoDTO;
import entity.Campeonato;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Mapper(componentModel = "jakarta")
public interface CampeonatoMapper {
    
    final CampeonatoMapper INSTANCE = Mappers.getMapper(CampeonatoMapper.class);

    CampeonatoDTO toDto(Campeonato campeonato);

    @Mapping(target = "id", ignore = true)
    Campeonato toEntity(CampeonatoDTO campeonatoDTO);
}

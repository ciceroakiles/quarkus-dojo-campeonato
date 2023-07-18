package service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import dto.CampeonatoDTO;
import entity.Campeonato;
import jakarta.enterprise.context.ApplicationScoped;
import mapper.CampeonatoMapper;
import service.CampeonatoService;

@ApplicationScoped
public class CampeonatoServiceImpl implements CampeonatoService {

    private CampeonatoMapper campeonatoMapper = CampeonatoMapper.INSTANCE;

    private AtomicInteger cont = new AtomicInteger();

    @Override
    public Campeonato criarCampeonato(CampeonatoDTO campeonatoDTO) {
        Campeonato campeonato = campeonatoMapper.toEntity(campeonatoDTO);
        campeonato.setId((long) cont.incrementAndGet());
        return campeonato;
    }
    
}

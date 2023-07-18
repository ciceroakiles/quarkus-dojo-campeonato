package service;

import dto.CampeonatoDTO;
import entity.Campeonato;

public interface CampeonatoService {
    
    Campeonato criarCampeonato(CampeonatoDTO campeonatoDTO);
}

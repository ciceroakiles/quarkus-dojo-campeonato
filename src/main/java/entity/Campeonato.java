package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Campeonato {

    Long id;
    String nome;
    String tipo;
    String data;
}

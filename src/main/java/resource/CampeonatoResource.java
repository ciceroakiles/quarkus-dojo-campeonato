package resource;

import org.apache.hc.core5.http.HttpStatus;

import dto.CampeonatoDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.CampeonatoService;

@Path("/campeonato")
public class CampeonatoResource {

    @Inject
    private CampeonatoService campeonatoService;

    @POST
    @Path("/criar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarCampeonato(CampeonatoDTO campeonatoDTO) {
        return Response
            .status(HttpStatus.SC_CREATED)
            .entity(campeonatoService.criarCampeonato(campeonatoDTO))
            .build();
    }
}

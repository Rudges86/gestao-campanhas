package br.com.gestao_campanha.adapters.in.doc;

import br.com.gestao_campanha.adapters.in.dto.NovaCampanhaDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Endpoint de gestão")
public interface CampanhaControllerDoc {


    public ResponseEntity<String> helloWorld();

    @Operation(
            summary = "Cadastra uma campanha",
            description = "Realizar o cadastro de uma campanha"
    )

    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Criação da campanha."),
            @ApiResponse(responseCode =" 400", description = "Ocorreu um problema ao criar a campanha")
    })
    public ResponseEntity<String> cadastrarCampanha(NovaCampanhaDTO campanhaDTO);

}

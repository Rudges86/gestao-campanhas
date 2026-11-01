package br.com.gestao_campanha.adapters.in;

import br.com.gestao_campanha.adapters.in.doc.CampanhaControllerDoc;
import br.com.gestao_campanha.adapters.in.dto.NovaCampanhaDTO;
import br.com.gestao_campanha.ports.in.ICampanhaInputPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campanha")
public class CampanhaController implements CampanhaControllerDoc {
    private final ICampanhaInputPort iCampanhaInput;

    public CampanhaController(ICampanhaInputPort iCampanhaInput) {
        this.iCampanhaInput = iCampanhaInput;
    }
    @GetMapping
    @Override
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(this.iCampanhaInput.hello());
    }

    @PostMapping
    @Override
    public ResponseEntity<String> cadastrarCampanha(@RequestBody NovaCampanhaDTO campanhaDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body("");
    }
}

package br.com.gestao_campanha.domain.usecase;

import br.com.gestao_campanha.ports.in.ICampanhaInputPort;
import br.com.gestao_campanha.ports.out.ICampanhaOutputPort;
import org.springframework.stereotype.Service;

@Service
public class CampanhaUseCase implements ICampanhaInputPort {
    private final ICampanhaOutputPort outputPort;

    public CampanhaUseCase(ICampanhaOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public String hello() {
        return this.outputPort.hello();
    }
}

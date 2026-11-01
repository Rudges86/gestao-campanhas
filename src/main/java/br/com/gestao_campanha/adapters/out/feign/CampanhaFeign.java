package br.com.gestao_campanha.adapters.out.feign;

import br.com.gestao_campanha.ports.out.ICampanhaOutputPort;
import org.springframework.stereotype.Component;

@Component
public class CampanhaFeign implements ICampanhaOutputPort {
    @Override
    public String hello() {
        return "Hello!!";
    }
}

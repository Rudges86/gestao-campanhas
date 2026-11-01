package br.com.gestao_campanha.adapters.in;

import br.com.gestao_campanha.adapters.in.dto.NovaCampanhaDTO;
import br.com.gestao_campanha.domain.usecase.CampanhaUseCase;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigInteger;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(CampanhaController.class)
class CampanhaControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private CampanhaUseCase useCase;


    @Test
    @DisplayName("Teste básico")
    void criarCampanha() throws Exception {
        var create = new NovaCampanhaDTO(
                "Doação de sangue",
                "Doar sangue salva vidas",
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(5L),
                new BigInteger("5"));

        mockMvc.perform(post("/campanha")
                .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(create))
        ).andDo(print())
                .andExpect(status().isCreated());
    }



}
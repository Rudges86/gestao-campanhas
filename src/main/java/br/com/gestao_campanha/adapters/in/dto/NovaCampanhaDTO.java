package br.com.gestao_campanha.adapters.in.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Schema(description = "Dados do livro")
public record NovaCampanhaDTO(
        @Schema(description = "Título da campanha", example = "Doação de sangue")
        String titulo,
        @Schema(description = "Descrição da campanha", example = "Doar sangue salva vidas.")
        String mensagem,
        @Schema(description = "Data de início da campanha", example = "11/11/1111")
        LocalDateTime dataInicio,
        @Schema(description = "Data de término da campanha", example = "11/11/1111")
        LocalDateTime dataFim,
        @Schema(description = "Quantidade de republicações da campanha no durante o período", example = "1")
        BigInteger quantidadeRepeticoes
) {
}

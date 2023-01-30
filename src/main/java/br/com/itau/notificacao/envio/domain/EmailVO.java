package br.com.itau.notificacao.envio.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmailVO {

	@NotNull(message = "O campo destinatário não pode ser nulo.")
	private String destinatario;
	@NotNull(message = "O campo mensagem não pode ser nulo.")
	private String mensagem;
	@NotNull(message = "O campo assunto não pode ser nulo.")
	private String assunto;
}

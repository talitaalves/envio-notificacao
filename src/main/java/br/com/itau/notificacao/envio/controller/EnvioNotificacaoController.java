package br.com.itau.notificacao.envio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.notificacao.envio.domain.EmailVO;
import br.com.itau.notificacao.envio.service.EnvioNotificacaoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/email")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class EnvioNotificacaoController {

	private final EnvioNotificacaoService envioNotificacaoService;
	
	@PostMapping(produces = "application/json")
	@Operation(summary = "Envia um email.")
	public ResponseEntity<Void> conta(@RequestBody EmailVO emailVO){
		this.envioNotificacaoService.enviaEmail(emailVO);
		return ResponseEntity.noContent().build();
	}
}

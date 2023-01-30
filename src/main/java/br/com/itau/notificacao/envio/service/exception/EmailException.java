package br.com.itau.notificacao.envio.service.exception;

public class EmailException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6004369408467889204L;

	public EmailException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailException(String message) {
		super(message);
	}

	
	
}

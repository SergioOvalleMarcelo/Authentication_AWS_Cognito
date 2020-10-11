package br.com.alelo.exceptions;

public class WebClientException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public WebClientException(String msg){
		super(msg);
	}

	public WebClientException(String msg, Throwable cause) {
		super(msg, cause);
	}

}

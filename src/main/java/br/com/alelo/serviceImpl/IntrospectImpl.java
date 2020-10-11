package br.com.alelo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import br.com.alelo.domain.IntrospectDomain;
import br.com.alelo.exceptions.WebClientException;
import br.com.alelo.service.IntrospectService;
import reactor.core.publisher.Mono;

@Service
public class IntrospectImpl implements IntrospectService {

	@Autowired
	private WebClient webClient;

	@Override
	public IntrospectDomain apiIntrospect(String token) {
		try {
			Mono<IntrospectDomain> userInfo = this.webClient.method(HttpMethod.GET).uri("/oauth2/userInfo")
					.header("Authorization", "Bearer " + token).retrieve().bodyToMono(IntrospectDomain.class);
			IntrospectDomain returnIntrospect = userInfo.block();
			returnIntrospect.setActive(true);
			return returnIntrospect;
		} catch (WebClientResponseException e) {
			throw new WebClientException("Erro ao chamar o AWS Cognito");
		}
		

	}

}

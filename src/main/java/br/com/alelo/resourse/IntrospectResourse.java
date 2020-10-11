package br.com.alelo.resourse;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.Claim;

import br.com.alelo.service.IntrospectService;


@RestController
@RequestMapping(value="/introspect")
public class IntrospectResourse {
	
	private static Logger LOG = LoggerFactory.getLogger(IntrospectResourse.class);
	
	@Autowired
	private IntrospectService introspectService;

	@GetMapping
	public ResponseEntity<?> introspect(
			@RequestParam(value = "token_type_hint") String type,
			@RequestParam(value = "token") String token){
		return ResponseEntity.status(HttpStatus.OK).body(introspectService.apiIntrospect(token));
	}
	
//	@GetMapping(value = "/teste")
//	public ResponseEntity<?> introspect(String token){
//		Claim claim = Jwts.parser()
//	            .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
//	            .parseClaimsJws(jwt).getBody();
//		return ResponseEntity.status(HttpStatus.OK).body(introspectService.apiIntrospect(token));
//	}
	
	
	
//	public static Claims decodeJWT(String jwt) {
//	    //This line will throw an exception if it is not a signed JWS (as expected)
//	    Claims claims = Jwts.parser()
//	            .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
//	            .parseClaimsJws(jwt).getBody();
//	    return claims;
}

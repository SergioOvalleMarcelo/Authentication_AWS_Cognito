package br.com.alelo.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class IntrospectDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sub;
	@JsonAlias("email_verified")
	private String emailVerified;
	private String email;
	private String username;
	private Boolean active; 

	public IntrospectDomain(String sub, String emailVerified, String email, String username, Boolean active) {
		super();
		this.sub = sub;
		this.emailVerified = emailVerified;
		this.email = email;
		this.username = username;
		this.active = active;
	}

	public IntrospectDomain() {
		super();
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emailVerified == null) ? 0 : emailVerified.hashCode());
		result = prime * result + ((sub == null) ? 0 : sub.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntrospectDomain other = (IntrospectDomain) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emailVerified == null) {
			if (other.emailVerified != null)
				return false;
		} else if (!emailVerified.equals(other.emailVerified))
			return false;
		if (sub == null) {
			if (other.sub != null)
				return false;
		} else if (!sub.equals(other.sub))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}

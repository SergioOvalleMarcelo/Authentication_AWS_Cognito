package br.com.alelo.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStamp;
	private Boolean active; 
	
	public StandardError() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StandardError(Integer status, String msg, Long timeStamp, Boolean active) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
		this.active = active;
	}


	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}

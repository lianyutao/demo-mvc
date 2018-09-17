package com.example.mvc.model.response;


import java.io.Serializable;
public class ResultResponse implements Serializable{
	/**
     * 
     */
    private static final long serialVersionUID = 3985176161610847530L;
    private Integer code;
	private String message;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

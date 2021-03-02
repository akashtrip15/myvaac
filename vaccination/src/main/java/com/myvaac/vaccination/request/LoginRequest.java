package com.myvaac.vaccination.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LoginRequest implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;
}

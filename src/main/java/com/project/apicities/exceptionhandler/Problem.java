package com.project.apicities.exceptionhandler;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Problem {

	private OffsetDateTime timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
}

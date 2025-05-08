package com.edge.exception;

public class ErrorResponse {
	private String message;
	private String path;
	private int status;

	public ErrorResponse(String message, String path, int status) {
		this.message = message;
		this.path = path;
		this.status = status;
	}

	// Getters and Setters
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}

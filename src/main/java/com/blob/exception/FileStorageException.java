package com.blob.exception;

public class FileStorageException extends RuntimeException
{

	private static final long serialVersionUID = -1238712371240057441L;

	public FileStorageException(String message)
	{
		super(message);
	}

	public FileStorageException(String message, Throwable cause)
	{
		super(message, cause);
	}
}

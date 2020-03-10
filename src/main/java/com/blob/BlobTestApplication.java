package com.blob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;

//import com.blob.domain.FileStorageProperties;

@SpringBootApplication
//@EnableConfigurationProperties(
//{ FileStorageProperties.class })
public class BlobTestApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BlobTestApplication.class, args);
	}

}

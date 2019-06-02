package com.sargenteacao;

import java.text.SimpleDateFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SargenteacaoApplication implements CommandLineRunner{
	
	

	public static void main(String[] args) {
		SpringApplication.run(SargenteacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					
		System.out.println(sdf.parse("11/11/1974"));
		
		
	}

}

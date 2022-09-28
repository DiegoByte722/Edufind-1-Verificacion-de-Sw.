package com.fisi.proyectocursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoEdufindApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(ProyectoEdufindApplication.class, args);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

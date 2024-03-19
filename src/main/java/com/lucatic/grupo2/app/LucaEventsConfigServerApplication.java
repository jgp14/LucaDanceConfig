package com.lucatic.grupo2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Clase principal del ConfigServer
 *
 * @author BlueDevTeam
 * @version 1.0.0
 * @since 15-03-2024
 */
@SpringBootApplication
@EnableConfigServer
public class LucaEventsConfigServerApplication {

	/**
	 * Punto de entrada al programa principal del ConfigServer
	 * 
	 * @param args Argumentos por línea de comandos
	 */
	public static void main(String[] args) {
		SpringApplication.run(LucaEventsConfigServerApplication.class, args);
	}

}

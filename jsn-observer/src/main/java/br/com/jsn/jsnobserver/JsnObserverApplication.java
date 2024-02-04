package br.com.jsn.jsnobserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * 
 Plataforma de Recrutamento:

    Observadores são notificados sobre novos currículos
	 cadastrados, atualizações em perfis de candidatos
	  e mudanças no status de candidaturas.

Aplicativo de Busca de Emprego:

    Observadores recebem notificações sobre novas 
	oportunidades de emprego, atualizações nos 
	requisitos das vagas e alterações no status de 
	candidatura.
 * 
*/
@SpringBootApplication
public class JsnObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsnObserverApplication.class, args);
	}

}

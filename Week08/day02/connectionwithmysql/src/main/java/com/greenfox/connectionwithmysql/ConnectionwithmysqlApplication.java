package com.greenfox.connectionwithmysql;

import com.greenfox.connectionwithmysql.models.Todo;
import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
		todoRepository.save(new Todo("Start the day"));
		todoRepository.save(new Todo("Finish H2 workshop"));
	}
}

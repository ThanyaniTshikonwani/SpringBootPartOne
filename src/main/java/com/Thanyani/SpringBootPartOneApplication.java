package com.Thanyani;

import com.Thanyani.repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootPartOneApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPartOneApplication.class,args);
	}

}


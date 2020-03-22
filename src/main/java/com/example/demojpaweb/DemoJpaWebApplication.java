package com.example.demojpaweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demojpaweb.demo.Acount;
import com.example.demojpaweb.demo.FilteringDataModel;
import com.example.demojpaweb.repo.FilterRepo;
import com.example.demojpaweb.repo.UserRepository;

@SpringBootApplication
public class DemoJpaWebApplication {

	@Autowired
	private UserRepository repo;
	@Autowired
	private FilterRepo f_repo;

	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			repo.saveAll(Arrays.asList(new Acount("Ram"), new Acount("Bam"), new Acount("Dam"), new Acount("Kam"),
					new Acount("Nam"), new Acount("Pam")));
			f_repo.saveAll(Arrays.asList(
					new FilteringDataModel("GENPACT", "SOURAV", "RAMESH", "SURESH", "RAJESH"),
					new FilteringDataModel("CAPGEMINI", "RANI", "NARUTO", "CHERRY", "INDIA"),
					new FilteringDataModel("GENPACT", "RAGHAV", "NIKHIL", "QUEEN", "SARAH"),
					new FilteringDataModel("CAPGEMINI", "MUNNI", "MOJITO", "APRIL", "NIKOLEY"),
					new FilteringDataModel("GENPACT", "CHANDRA", "RAMESH", "FOXY", "GURU"),
					new FilteringDataModel("CAPGEMINI", "CHUNNI", "MIKUTO", "ROXY", "SUNNY"),
					new FilteringDataModel("GENPACT", "SOURAV", "GOURI", "LOTUS", "SADHU"),
					new FilteringDataModel("CAPGEMINI", "CHUNNI", "MIKUTO", "MILEY", "NIKOLEY"),
					new FilteringDataModel("GENPACT", "RAGHAV", "LUCKY", "AVINAV", "SARAH"),
					new FilteringDataModel("CAPGEMINI", "RANI", "MOJITO", "APRIL", "DANISH"),
					new FilteringDataModel("GENPACT", "CHANDRA", "LUCKY", "ACHARA", "RAJESH"),
					new FilteringDataModel("CAPGEMINI", "MUNNI", "SINJO", "QUEEN", "LILLY")));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaWebApplication.class, args);
	}

}

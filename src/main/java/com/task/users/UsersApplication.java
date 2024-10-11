package com.task.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.task.users.model.ERole;
import com.task.users.model.Role;
import com.task.users.repository.RoleRepository;
import com.task.users.repository.UserRepository;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, RoleRepository rolesRepository) {
		return args -> {
			System.out.println("Hello from the command line runner!");
			Role admin = new Role(ERole.ROLE_ADMIN);
			Role moder = new Role(ERole.ROLE_MODERATOR);
			Role user = new Role(ERole.ROLE_USER);

			rolesRepository.save(admin);
			rolesRepository.save(moder);
			rolesRepository.save(user);
		};
	}

}

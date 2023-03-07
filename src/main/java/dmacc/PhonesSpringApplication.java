package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Phones;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhonesRepository;

@SpringBootApplication
public class PhonesSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PhonesSpringApplication.class, args);
	}

	@Autowired
	PhonesRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Phones c = appContext.getBean("phones", Phones.class);
		
		repo.save(c);
		
		Phones d = new Phones("Samsung", "Andriod", "Galaxy");
		
		repo.save(d);
		
		List<Phones> allPhones = repo.findAll();
		for(Phones phone: allPhones) {
			System.out.println(phone.toString());
			
		}
		((AbstractApplicationContext) appContext).close();
		
	}

}

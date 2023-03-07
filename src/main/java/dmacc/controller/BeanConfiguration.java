package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phones;

public class BeanConfiguration {
	@Bean
	public Phones phones() {
		Phones bean = new Phones();
		bean.setManufacturer("Apple");
		bean.setOS("IOS 15");
		bean.setPhoneModel("iPhone 13 max");
		return bean;
	}
}

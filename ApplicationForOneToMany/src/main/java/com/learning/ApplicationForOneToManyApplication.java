package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.repository.AddressRepository;
import com.learning.repository.StaffRepository;

@SpringBootApplication
public class ApplicationForOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationForOneToManyApplication.class, args);

		// Staffs staffs = new Staffs();
		// staffs.setName("Ganapathi");
		// staffs.setSalary(123456);
		// Address address = new Address();
		// address.setCity("KovilPatti");
		// address.setState("TN");
		// address.setCountry("India");
		// address.setPinCode(630001);
		// address.setStaff(staffs);
		// Address address1 = new Address();
		// address1.setCity("Kanchipuram");
		// address1.setState("TN");
		// address1.setCountry("India");
		// address1.setPinCode(631501);
		// address1.setStaff(staffs);
		// List<Address> addrList = Arrays.asList(address, address1);
		// staffs.setAddr(addrList);

		StaffRepository staffRepository = applicationContext.getBean(StaffRepository.class);
		AddressRepository addressRepository = applicationContext.getBean(AddressRepository.class);
		// staffRepository.save(staffs);
		// staffRepository.findById(1);
		addressRepository.deleteById(1);

	}

}

package br.com.StudentRegistration.Student;

import br.com.StudentRegistration.functions.CreateParameter;

public class Student {
	
	private Integer id ;
	private String fullName;
	private Integer age ;
	private String email;
	private String graduation;
	private String registrationDate;
	private String address ;
	private String phone;
	
	public Student() {
		
		CreateParameter createParameter = new CreateParameter();
		this.fullName = createParameter.createString("Digite o seu nome: ");
		this.age = createParameter.createInt("Digite a sua idade: ");
		this.email = createParameter.createString("Seu email: ");
		this.graduation = createParameter.createString("Seu curso: ");
		this.registrationDate = createParameter.createString("data do inicio: ");
		this.address = createParameter.createString("Seu endereço: ");
		this.phone = createParameter.createString("telefone: ");
		
	}

	public  String getFullName() {
		return this.fullName;
		
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
		
	}
	
	public String getGraduation() {
		return this.graduation;
	}
	
	public String getRegistrationDate() {
		
		return this.registrationDate;
	}
	
	public String getAddress() {
		
		return this.address;
	}
	
	public String getPhone() {
		
		return this.phone;
	}
	


}




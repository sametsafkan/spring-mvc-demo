package com.sametsafkan;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message = "is required.")
	@Size(min = 2, message = "is required.")
	private String lastName;
	private String country;
	private String favoriteProgrammingLanguage;
	private String[] operatingSystem;
	@NotNull(message = "is required")
	@Min(value = 18, message = "Age must be greater than or equal 18.")
	@Max(value = 120, message = "Age must be less than or equal 120.")
	private Integer age;
	@NotNull(message = "is required.")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	@ClassCode(value = "MSS", message = "must start with MSS.")
	private String classCode;
	private LinkedHashMap<String, String> countries;
	private LinkedHashMap<String, String> programmingLanguages;
	private LinkedHashMap<String, String> operatingSystems;


	
	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("TR", "Turkey");
		countries.put("FR", "France");
		countries.put("BR", "Brasil");
		countries.put("US", "United States");
		countries.put("IN", "India");
		programmingLanguages = new LinkedHashMap<>();
		programmingLanguages.put("Java", "Java");
		programmingLanguages.put("C#", "C#");
		programmingLanguages.put("Ruby", "Ruby");
		programmingLanguages.put("Kotlin", "Kotlin");
		operatingSystems = new LinkedHashMap<>();
		operatingSystems.put("Linux","Linux");
		operatingSystems.put("Windows","Windows");
		operatingSystems.put("MacOS","MacOS");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}

	public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}
	

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operationSystem) {
		this.operatingSystem = operationSystem;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	
	public LinkedHashMap<String, String> getProgrammingLanguages() {
		return programmingLanguages;
	}
	
	public LinkedHashMap<String, String> getOperatingSystems() {
		return operatingSystems;
	}

	public String toString() {
		return this.firstName + " " + this.lastName + " - " + this.country;
	}
	
}

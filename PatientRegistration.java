package com.adalitek.mph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PATIENT_REGISTRATION")
public class PatientRegistration {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PATIENT_ID")
	private int id;
	@Column(name = "frst_nme")
	@NotEmpty(message = "*Please provide an name")
	private String firstName;
    @Column(name = "lst_nme")
	@NotEmpty(message = "*Please provide an lastName")
	private String lastName;
    @Column(name = "gen")
	@NotEmpty(message = "*Please provide an gender")
	private String gender;
    @Column(name = "dte_of_brth")
	@NotEmpty(message = "*Please provide an dateOfBirth")
	private String dateOfBirth;
    @Column(name = "age")
	@NotEmpty(message = "*Please provide an age")
	private int age;
    @Column(name = "ins_no")
	@NotEmpty(message = "*Please provide an insuranceNumber")
	private String insuranceNumber;
    @Column(name = "ins_mem_frst_nme")
	@NotEmpty(message = "*Please provide an IH firstName")
	private String insuranceFirstName;
    @Column(name = "ins_mem_lst_nme")
	@NotEmpty(message = "*Please provide an IH lastName")
	private String insuranceLastName;
    @Column(name = "rel_wth_mem")
	@NotEmpty(message = "*Please provide an IH lastName")
	private String relationMember;
    @Column(name = "email")
	@Email(message = "*Please provide a valid email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
    @Column(name = "cont_phn")
    @Length(min = 10, message = "*Please enter valid contactPhone")
	@NotEmpty(message = "*Please provide an contactPhone")
	private long contactPhone;
    @Column(name = "alt_phn")
    @Length(min = 10, message = "*Please enter valid alternatePhone")
	@NotEmpty(message = "*Please provide an alternatePhone")
	private long alternatePhone;
    @Column(name = "addrs1")
    @NotEmpty(message = "*Please provide an address1")
	private String address1;
    @Column(name = "addrs2")
    @NotEmpty(message = "*Please provide an address2")
	private String address2;
    @Column(name = "city")
    @NotEmpty(message = "*Please provide an city")
	private String city;
    @Column(name = "county")
    @NotEmpty(message = "*Please provide an county")
	private String county;
    @Column(name = "state")
    @NotEmpty(message = "*Please provide an state")
	private String state;
    @Column(name = "country")
    @NotEmpty(message = "*Please provide an country")
	private String country;
    @Column(name = "zip")
    @NotEmpty(message = "*Please provide an zip")
	private int zip;
   
    //setter & getter methods
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
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	 public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public String getInsuranceNumber() {
			return insuranceNumber;
		}

		public void setInsuranceNumber(String insuranceNumber) {
			this.insuranceNumber = insuranceNumber;
		}
		
		public String  getInsuranceFirstName() {
			return insuranceFirstName;
		}

		public void setInsuranceFirstName(String insuranceFirstName) {
			this.insuranceFirstName = insuranceFirstName;
		}
		
		public String  getInsuranceLastName() {
			return insuranceLastName;
		}

		public void setInsuranceLastName(String insuranceLastName) {
			this.insuranceLastName = insuranceLastName;
		}
		
		public String  getRelationMember() {
			return relationMember;
		}

		public void setRelationMember(String relationMember) {
			this.relationMember = relationMember;
		}
		
		public String  getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public long  getContactPhone() {
			return contactPhone;
		}

		public void setContactPhone(long contactPhone) {
			this.contactPhone = contactPhone;
		}
		
		public long  getAlternatePhone() {
			return alternatePhone;
		}

		public void setAlternatePhone(long alternatePhone) {
			this.alternatePhone = alternatePhone;
		}
		
		public String  getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		
		public String  getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		
		public String  getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		public String  getCounty() {
			return county;
		}

		public void setCounty(String county) {
			this.county = county;
		}
		
		public String  getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		public String  getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		
		public int  getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}
	

}

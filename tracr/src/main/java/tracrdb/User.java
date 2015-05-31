package tracrdb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")	
	private String firstName;

	@Column(name = "last_name")	
	private String lastName;

	@Column(name = "user_phone")		
	private String userPhone;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")	
	private String address2;

	@Column(name = "city")		
	private String city;

	@Column(name = "country")			
	private String country;
}

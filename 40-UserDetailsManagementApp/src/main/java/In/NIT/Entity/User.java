package In.NIT.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "User_Details")
public class User {

	@Id
	@Column(name = "user_id")
	private Integer id;
	
	@Column(name = "user_firstname")
	private String firstname;
	
	@Column(name = "user_lastname")
	private String lastname;
	
	@Column(name = "user_phonenum")
	private Long phonenum;
	
	@Column(name = "user_email")
	private String email;
	
}

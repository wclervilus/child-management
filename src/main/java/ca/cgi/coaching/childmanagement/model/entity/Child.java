package ca.cgi.coaching.childmanagement.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CHILD")
public class Child extends Base{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
    @Column(name = "FIRST_NAME", nullable = false)
    @Length(min=3,max=50, message="Incorrect First Name")
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @Length(min=3,max=50, message="Incorrect last Name")
    private String lastName;
    
    @Column(name = "MAIL", nullable = false)
    @Email(message="Incorrect Email address")
    private String mail;
}

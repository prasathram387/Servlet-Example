import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Student {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }
    
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }
}
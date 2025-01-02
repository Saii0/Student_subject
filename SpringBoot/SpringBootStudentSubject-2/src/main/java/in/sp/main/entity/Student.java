package in.sp.main.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class Student {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String dateOfBirth;
    @Column
    private String address;
    @Column
    private String mobile;
    @Column
    private String backgroundEducation;
    
    
    @ManyToMany
    private List<Subject> subjects;
    
    

    public Student(String name, String dateOfBirth, String address, String mobile, String backgroundEducation,
			List<Subject> subjects) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.mobile = mobile;
		this.backgroundEducation = backgroundEducation;
		this.subjects = subjects;
	}

	
    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", mobile=" + mobile + ", backgroundEducation=" + backgroundEducation + ", subjects=" + subjects
				+ "]";
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBackgroundEducation() {
        return backgroundEducation;
    }

    public void setBackgroundEducation(String backgroundEducation) {
        this.backgroundEducation = backgroundEducation;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    
}

package in.sp.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Subject {

    @Id
    private String code; 
    @Column
    private String name;
    @Column
    private String type;  
    
    

   
    public Subject(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
    
    

	@Override
	public String toString() {
		return "Subject [code=" + code + ", name=" + name + ", type=" + type + "]";
	}



	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

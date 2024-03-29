package com.ems.bean;
import java.lang.annotation.Native;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="emp_table5")
public class Employee {
	 @Id
	    @Column(name ="id")
	    private int id ;
	    
	    @Column(name ="name")
	    private String name;
	    
	    @Column(name ="department")
	    private String department;
	    
	    
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}

	    }

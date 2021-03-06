package fit.se.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@SuppressWarnings("serial")
@Entity
@Table(name = "people")
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Type(type = "objectid")
	private String id;
	private String name;
	private String country;
	public Person() {
	}
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public Person(String id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public Object getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
}

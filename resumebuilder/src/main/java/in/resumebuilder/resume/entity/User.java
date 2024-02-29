package in.resumebuilder.resume.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fullName;
	private String jobTitle;
	private int mobile;
	private String address;
	private String linkedIn;
	private String email;
	private String profileSummary;

	@ElementCollection
	private List<String> keySkills;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Experience> experience;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Projects> projects;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Education> education;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileSummary() {
		return profileSummary;
	}

	public void setProfileSummary(String profileSummary) {
		this.profileSummary = profileSummary;
	}

	public List<String> getKeySkills() {
		return keySkills;
	}

	public void setKeySkills(List<String> keySkills) {
		this.keySkills = keySkills;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", jobTitle=" + jobTitle + ", mobile=" + mobile
				+ ", address=" + address + ", linkedIn=" + linkedIn + ", email=" + email + ", profileSummary="
				+ profileSummary + ", keySkills=" + keySkills + ", experience=" + experience + ", projects=" + projects
				+ ", education=" + education + "]";
	}

	
}

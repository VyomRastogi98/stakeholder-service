package com.axis.stakeholderservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stakeholder {
	@Id
	@GeneratedValue
	private int stakeholderId;
	private String stakeholderName;
	private String stakeholderEmail;
	private long stakeholderMobNo;
	private int projectId;
	public Stakeholder() {
	}
	public Stakeholder(int stakeholderId, String stakeholderName, String stakeholderEmail, long stakeholderMobNo,
			int projectId) {
		this.stakeholderId = stakeholderId;
		this.stakeholderName = stakeholderName;
		this.stakeholderEmail = stakeholderEmail;
		this.stakeholderMobNo = stakeholderMobNo;
		this.projectId = projectId;
	}
	public int getStakeholderId() {
		return stakeholderId;
	}
	public void setStakeholderId(int stakeholderId) {
		this.stakeholderId = stakeholderId;
	}
	public String getStakeholderName() {
		return stakeholderName;
	}
	public void setStakeholderName(String stakeholderName) {
		this.stakeholderName = stakeholderName;
	}
	public String getStakeholderEmail() {
		return stakeholderEmail;
	}
	public void setStakeholderEmail(String stakeholderEmail) {
		this.stakeholderEmail = stakeholderEmail;
	}
	public long getStakeholderMobNo() {
		return stakeholderMobNo;
	}
	public void setStakeholderMobNo(long stakeholderMobNo) {
		this.stakeholderMobNo = stakeholderMobNo;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "stakeholder [stakeholderId=" + stakeholderId + ", stakeholderName=" + stakeholderName
				+ ", stakeholderEmail=" + stakeholderEmail + ", stakeholderMobNo=" + stakeholderMobNo + ", projectId="
				+ projectId + "]";
	}
}

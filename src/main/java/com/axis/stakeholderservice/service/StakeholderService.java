package com.axis.stakeholderservice.service;

import java.util.List;

import com.axis.stakeholderservice.entity.Stakeholder;



public interface StakeholderService {
	public Stakeholder findById(int stakeholderId);

	public List<Stakeholder> getAllStakeholders();

	public Stakeholder addStakeholder(Stakeholder stakeholder);

	public void deleteStakeholderById(int stakeholderId);

	public Stakeholder updateStakeholderById(Stakeholder stakeholder, int stakeholderId);
}

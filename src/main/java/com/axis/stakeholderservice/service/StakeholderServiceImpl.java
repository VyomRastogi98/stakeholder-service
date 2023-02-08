package com.axis.stakeholderservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.stakeholderservice.entity.Stakeholder;
import com.axis.stakeholderservice.exception.StakeholderNotFoundException;
import com.axis.stakeholderservice.repository.StakeholderRepository;
@Service
public class StakeholderServiceImpl implements StakeholderService{
	
	@Autowired
	StakeholderRepository stakeholderRepository;
	
	@Override
	public Stakeholder findById(int stakeholderId) {
		// TODO Auto-generated method stub
		Optional<Stakeholder> stakeholderOpt = stakeholderRepository.findById(stakeholderId);
		if(!stakeholderOpt.isPresent())
			throw new StakeholderNotFoundException("Employee Not Found by Id "+stakeholderId);
		return stakeholderOpt.get();
	}

	@Override
	public List<Stakeholder> getAllStakeholders() {
		// TODO Auto-generated method stub
		return stakeholderRepository.findAll();
	}

	@Override
	public Stakeholder addStakeholder(Stakeholder stakeholder) {
		// TODO Auto-generated method stub
		return stakeholderRepository.save(stakeholder);
	}

	@Override
	public void deleteStakeholderById(int stakeholderId) {
		// TODO Auto-generated method stub
		stakeholderRepository.deleteById(stakeholderId);
	}

	@Override
	public Stakeholder updateStakeholderById(Stakeholder stakeholder, int stakeholderId) {
		// TODO Auto-generated method stub
		Stakeholder toUpdate = stakeholderRepository.findById(stakeholderId).get();
		toUpdate.setStakeholderName(stakeholder.getStakeholderName());
		toUpdate.setStakeholderEmail(stakeholder.getStakeholderEmail());
		toUpdate.setStakeholderMobNo(stakeholder.getStakeholderMobNo());
		toUpdate.setProjectId(stakeholder.getProjectId());
		return stakeholderRepository.save(toUpdate);
	}

}

package com.axis.stakeholderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.stakeholderservice.entity.Stakeholder;

import com.axis.stakeholderservice.service.StakeholderService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class StakeholderController {
	@Autowired
	StakeholderService stakeholderService;
	@GetMapping("/stakeholder/{stakeholderId}")
	public Stakeholder getStakeholderById(@PathVariable int stakeholderId){
		return stakeholderService.findById(stakeholderId);
	}
	@GetMapping("/stakeholders")
	public List<Stakeholder> getAllStakeholders(){
		return stakeholderService.getAllStakeholders();
	}
	@PostMapping("/stakeholder")
	public Stakeholder addStakeholder(@RequestBody Stakeholder stakeholder) {
		return stakeholderService.addStakeholder(stakeholder);		
	}
	@DeleteMapping("/stakeholder/{stakeholderId}")
	public void deleteStakeholderById(@PathVariable int stakeholderId) {
		stakeholderService.deleteStakeholderById(stakeholderId);
	}
	@PutMapping("/stakeholder/{stakeholderId}")
	public Stakeholder updaStakeholder(@RequestBody Stakeholder stakeholder, @PathVariable int stakeholderId) {
		return stakeholderService.updateStakeholderById(stakeholder, stakeholderId);
		
	}
	
}

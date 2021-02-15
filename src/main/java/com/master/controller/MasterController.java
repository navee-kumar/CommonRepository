package com.master.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.service.ISimpleMasterService;

@RestController
@RequestMapping("master")
public class MasterController {

	@Autowired
	private ISimpleMasterService iSimpleMasterService;

	@GetMapping("welcome")
	public String welcome() {
		return "welcome..";
	}

	@PostMapping("fetch")
	public String getData() {
		return iSimpleMasterService.getData();
	}

}

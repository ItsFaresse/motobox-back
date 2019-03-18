package com.hoc.motobox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoc.motobox.entity.Ad;
import com.hoc.motobox.entity.User;
import com.hoc.motobox.service.AdService;
import com.hoc.motobox.utils.SuperController;
import com.hoc.motobox.utils.SuperRestService;

@RestController
@RequestMapping("/user")
public class UserController extends SuperController<User> {
	
	@Autowired
	AdService adService;

    public UserController(SuperRestService<User> service) {
        super(service);
    }
    
    
	@PostMapping("/ad")
	public Ad saveAd(@RequestBody Ad ad) {
		return adService.save(ad);
		
	}
    

}

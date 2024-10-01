package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dto.EmailTransfer;
import com.boot.pojo.*;
import com.boot.service.EmailServiceImpl;
import com.boot.service.TourismService;

@RestController
@CrossOrigin
public class TourismController {
	@Autowired
	TourismService tourServ;

	@Autowired
	EmailServiceImpl emailServ;

	// SMTP
	@PostMapping("/addemaildata")
	public void sendEmail(@RequestBody EmailTransfer transfer) {
		emailServ.sendEmail(transfer.getToEmail(), transfer.getSubject(), transfer.getBody());
	}

	// Registration-customer
	@PostMapping("/addcustomdetails")
	public void addCustomerDetails(@RequestBody Customer custom) {
		tourServ.saveUserData(custom);
	}

	// Login
	@GetMapping("/login-by-Id-Password/{loginId}/{pass}")
	public UserLogin getLoginIn(@PathVariable String loginId, @PathVariable String pass) {
		UserLogin user = tourServ.getLogIn(loginId, pass);
		System.out.println(loginId);
		System.out.println(pass);
		System.out.println(user);

		return user;

	}

	// Destination
	@PostMapping("/adddestination")
	public void addDestination(@RequestBody Destinations dest) {
		tourServ.saveDestinationDetail(dest);
	}

	@GetMapping("/find-by-Destination-Name/{name}")
	public List<Destinations> findByDestinationName(@PathVariable String name) {
		return tourServ.findByDestinationName(name);

	}

	@GetMapping("/getAllDestinations")
	public List<Destinations> getAllDestinations() {
		return tourServ.getAllDestinations();
	}

	@PostMapping("/addhome")
	public void addHome(@RequestBody Home home) {
		tourServ.savehomeDetail(home);
	}

	@PostMapping("/addActivities")
	public void addActivities(@RequestBody Activities act) {
		tourServ.saveActivities(act);
	}

	@PostMapping("/addImages")
	public void addImages(@RequestBody Images img) {
//		tourServ.saveImages(img);)
	}

	// Hotels
	@PostMapping("/addhotels")
	public void addHotels(@RequestBody Hotel hot) {
		tourServ.saveHotelsDetail(hot);
	}

	@GetMapping("/getAllHotels")
	public List<Hotel> getAllHotels() {
		return tourServ.getAllHotels();
	}

	@GetMapping("/find-by-Hotel-name/{name}")
	public List<Hotel> findByHotelName(@PathVariable String name) {
		return tourServ.findByHotelName(name);
	}

	@PostMapping("/addpackkage")
	public void addPackkage(@RequestBody Package1 pack) {
		tourServ.savePackkageDetail(pack);
	}

	@PostMapping("/addpayment")
	public void addPayment(@RequestBody Payment pay) {
		tourServ.savePaymentDetail(pay);
	}

	@PostMapping("/addpay")
	public void addPay(@RequestBody Pay p) {
		tourServ.savePayDetail(p);
	}
}

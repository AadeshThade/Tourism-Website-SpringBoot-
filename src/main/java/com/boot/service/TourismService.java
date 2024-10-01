package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.*;
import com.boot.pojo.*;
import com.boot.pojo.Package1;

@Service
public class TourismService {
	@Autowired
	private UserLoginDao userDao;

	@Autowired
	private CustomerDao custDao;
	
	@Autowired
	private AdministratorDao adminDao;
	
	@Autowired
	private DestinationDao destDao;
	
	@Autowired
	private HomeDao homeDao;
	
	@Autowired
	private HotelsDao hotDao;
	
	@Autowired
	private PackkageDao packDao;
	
	@Autowired
	private PaymentDao payDao;
	
	@Autowired
	private PayDao pDao;
	
	@Autowired
	private ActivitiesDao actDao;
	@Autowired
	private ImagesDao imgDao;
	
	//Login-Part
	public void saveUserData(Customer cust) {
		custDao.save(cust);
	}
	
	public UserLogin getLogIn(String loginId, String pass) {
		return userDao.findByLoginIdAndPass(loginId, pass);
	}
	
	public void saveAdminData(Administrator admin) {
		adminDao.save(admin);
	}
	
	//Destination-Part
	
	public void saveDestinationDetail(Destinations destin) {
		destDao.save(destin);
	}
	
	public List <Destinations> findByDestinationName(String name) {
		List <Destinations> dest= destDao.findByName(name);
		return dest;
	}
	public List <Destinations> getAllDestinations(){
		List <Destinations> des=destDao.findAll();
		return des;
	}
	
	public void savehomeDetail(Home home) {
		homeDao.save(home);
	}
	
	//Hotels
	public void saveHotelsDetail(Hotel hot) {
		hotDao.save(hot);
	}
	public List <Hotel> getAllHotels(){
		List <Hotel> hot=hotDao.findAll();
		return hot;
	}
	
	public List<Hotel> findByHotelName(String name){
		List <Hotel> hotel = hotDao.findByName(name);
		return hotel;
	}

	public void savePackkageDetail(Package1 pack) {
		packDao.save(pack);
	}
	
	public void saveActivities(Activities act) {
		actDao.save(act);
	}
	public void saveImages(Images img) {
		imgDao.save(img);
	}
	public void savePaymentDetail(Payment pay) {
		payDao.save(pay);
	}
	public void savePayDetail(Pay p) {
		pDao.save(p);
	}
}

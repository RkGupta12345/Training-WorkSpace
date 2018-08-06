package com.training.exilant.restfulworks.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDAOService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public User getOneUser(@PathVariable int userId)
	{
		User getUser=userService.getUser(userId);
		if(getUser==null) {
		throw new UserNotFoundException("id=>"+userId);
		
	}
		return getUser;
	}
	
	@PostMapping("/users1")
	public void createUser(@RequestBody User user)
	{
		User saveUser=userService.saveUser(user);
		System.out.println("Saved User=>"+saveUser);
	}
	
	@PostMapping("/users2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user)
	{
		User saveUser=userService.saveUser(user);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}").buildAndExpand(saveUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	@PutMapping("/users3")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
		
		
	}
	@DeleteMapping("/users4/{userId}")
	public User deleteUser(@PathVariable int userId)
	{
		System.out.println("delete method");
		return userService.deleteUser(userId);
	}
	
	@GetMapping("/users/{userId}")
	public org.springframework.hateoas.Resource<User> getOneUserv2(@PathVariable int userId)
	{
		User getUser=userService.getUser(userId);
		if(getUser==null) {
		throw new UserNotFoundException("id=>"+userId);
		
	}
		//give the link for getting all users
		//with metadata allusers
		org.springframework.hateoas.Resource<User> resource=new org.springframework.hateoas.Resource<User>(getUser);
		
		ControllerLinkBuilder linkTo=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getAllUsers());
		ControllerLinkBuilder linkTo1=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getOneUser(userId));
		resource.add(linkTo.withRel("all-users"));
		
		
		resource.add(linkTo1.withRel("get-another-way"));
		return resource;
	}
	
	@PostMapping("/users5")
	public org.springframework.hateoas.Resource<User> createUsers(@RequestBody User user)
	{
		User saveUser=userService.saveUser(user);
		ControllerLinkBuilder linkTo2=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getOneUser(saveUser.getUserId()));
		org.springframework.hateoas.Resource<User> resource=new org.springframework.hateoas.Resource<User>(saveUser);
		resource.add(linkTo2.withRel("select-user"));
		return resource;
		
	}
}

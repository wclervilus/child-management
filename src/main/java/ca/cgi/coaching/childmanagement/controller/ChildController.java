package ca.cgi.coaching.childmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ca.cgi.coaching.childmanagement.model.entity.Child;
import ca.cgi.coaching.childmanagement.service.ChildService;
@RestController
@RequestMapping("/api/children")
public class ChildController {
	private final ChildService service;
	@Autowired
	public ChildController(ChildService service) {
		this.service=service;
	}
	@GetMapping("/")
	public List<Child> findAll() {
		return service.findAll();
	}
}

package ca.cgi.coaching.childmanagement.service;

import java.util.List;

import ca.cgi.coaching.childmanagement.model.entity.Child;



public interface ChildService {
	public List<Child> findAll();
	public Child save(Child parent);
	public Child findById(Long childId);
	public void deleteById(Long childId);
}

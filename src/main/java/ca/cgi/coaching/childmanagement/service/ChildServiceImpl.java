package ca.cgi.coaching.childmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.cgi.coaching.childmanagement.model.entity.Child;
import ca.cgi.coaching.childmanagement.repository.ChildRepository;
@Service
public class ChildServiceImpl implements ChildService {
	private final ChildRepository repository;
	@Autowired
	public ChildServiceImpl(ChildRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public List<Child> findAll() {
		return repository.findAll();
	}

	@Override
	public Child save(Child parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Child findById(Long childId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long childId) {
		// TODO Auto-generated method stub

	}

}

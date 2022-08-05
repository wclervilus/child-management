package ca.cgi.coaching.childmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.cgi.coaching.childmanagement.model.entity.Child;
import ca.cgi.coaching.childmanagement.repository.ChildRepository;

@Service
public class ChildServiceImpl implements ChildService {
	private final ChildRepository repository;

	@Autowired
	public ChildServiceImpl(ChildRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Child> findAll() {
		return repository.findAll();
	}

	@Override
	public Child save(Child child) {
		return repository.save(child);
	}

	@Override
	public Child findById(Long childId) {
		Optional<Child> oChild = repository.findById(childId);
		Child child = null;
		if (oChild.isPresent()) {
			child = oChild.get();
		}
		return child;
		// user.isPresent()?user.get():null;
	}

	@Override
	public void deleteById(Long childId) {
		repository.deleteById(childId);
	}

	@Override
	public Child update(Child child) {
		return repository.save(child);
	}

}

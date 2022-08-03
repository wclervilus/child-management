package ca.cgi.coaching.childmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.cgi.coaching.childmanagement.model.entity.Child;
@Repository
public interface ChildRepository extends JpaRepository<Child, Long>{

}

package com.kazmazschool.kasmazschool.repository;

import com.kazmazschool.kasmazschool.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
@Repository stereotype annotation is used to add a bean of this class
type to the Spring context and indicate that given Bean is used to perform
DB related operations and
* */
@Repository
public interface ContactsRepository extends CrudRepository<Contact,Integer> {
    List<Contact> findByStatus(String status);
}

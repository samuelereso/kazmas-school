package com.kazmazschool.kasmazschool.repository;

import com.kazmazschool.kasmazschool.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ContactsRepository extends CrudRepository<Contact,Integer> {
}

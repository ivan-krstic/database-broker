package me.krstic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krstic.model.Print;

@Repository
public interface PrintRepository extends CrudRepository<Print, Long> {

}

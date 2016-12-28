package me.krstic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krstic.model.Denomination;

@Repository
public interface DenominationRepository extends CrudRepository<Denomination, Long> {

}

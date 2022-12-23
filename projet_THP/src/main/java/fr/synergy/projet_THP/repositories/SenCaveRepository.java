package fr.synergy.projet_THP.repositories;

import fr.synergy.projet_THP.entities.SensCaveEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SenCaveRepository extends CrudRepository<SensCaveEntity, Long> {

    @Query(value ="SELECT * FROM sens_cave ORDER BY id_cave DESC LIMIT 24",
            nativeQuery = true)
    Iterable<SensCaveEntity> findByIdInvOrderLast24();



}

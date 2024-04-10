package edu.historyservice.repository;

import java.util.List;
import edu.historyservice.model.PrimesRecord;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PrimesHistoryRepository
extends CrudRepository<PrimesRecord, Integer> {
    List<PrimesRecord> findAllByCustomer(String Customer);
}

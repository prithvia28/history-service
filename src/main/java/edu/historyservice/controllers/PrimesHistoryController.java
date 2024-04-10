package edu.historyservice.controllers;

import edu.historyservice.model.PrimesRecord;
import edu.historyservice.repository.PrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;

    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @GetMapping("/{customer}") // Corrected the path variable syntax
    public List<PrimesRecord> findAll(@PathVariable String customer) {
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}

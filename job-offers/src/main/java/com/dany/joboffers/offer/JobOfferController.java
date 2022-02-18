package com.dany.joboffers.offer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobOfferController {

    private final JobOfferRepository repository;

    public JobOfferController(JobOfferRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/joboffers")
    public List<JobOffer> all() {
        return repository.findAll();
    }

    @PostMapping("/joboffers")
    JobOffer newJobOffer(@RequestBody JobOffer jobOffer) {
        return repository.save(jobOffer);
    }

    @GetMapping("/joboffers/{id}")
    JobOffer one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new JobOfferNotFound(id));
    }

    @PutMapping("/joboffers/{id}")
    JobOffer update(@RequestBody JobOffer newJobOffer, @PathVariable Long id) {
        return repository.findById(id)
                .map(jobOffer -> {
                    jobOffer.setName(newJobOffer.getName());
                    jobOffer.setDescription(newJobOffer.getDescription());
                    jobOffer.setCity(newJobOffer.getCity());
                    jobOffer.setCompanyName((newJobOffer.getCompanyName()));
                    return repository.save(jobOffer);
                })
                .orElseGet(() -> {
                    newJobOffer.setId(id);
                    return repository.save(newJobOffer);
                });
    }

    @DeleteMapping("/joboffers/{id}")
    void deleteJoboffer(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

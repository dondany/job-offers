package com.dany.joboffers;

import com.dany.joboffers.offer.JobOffer;
import com.dany.joboffers.offer.JobOfferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDb(JobOfferRepository repostiory) {
        return args -> {
            repostiory.save(new JobOffer("Junior Java Developer", "We're hiring a Junior Java Developer. Join us now!", "Lodz", "Yolomax"));
            repostiory.save(new JobOffer("Senior Java Developer", "We're hiring a Senior Java Developer. Join us now!", "Lodz","Yolomax"));
            repostiory.save(new JobOffer("QA Specialist", "We're hiring a QA Specialist. Join us now!", "Wroclaw", "Fishon"));
        };
    }
}

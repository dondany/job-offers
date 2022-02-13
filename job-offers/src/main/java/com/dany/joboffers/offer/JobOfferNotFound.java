package com.dany.joboffers.offer;

public class JobOfferNotFound extends RuntimeException {
    public JobOfferNotFound(Long id) {
        super("Could not find job offer " + id);
    }
}

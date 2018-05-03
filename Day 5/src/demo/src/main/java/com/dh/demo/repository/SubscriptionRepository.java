package com.dh.demo.repository;

import com.dh.demo.domain.Subscription;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jhonny on 6/10/17.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription, String> {
}

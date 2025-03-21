package com.heathcl.service;

import com.heathcl.model.PlanType;
import com.heathcl.model.Subscription;
import com.heathcl.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}

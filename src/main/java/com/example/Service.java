package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by sathish on 12/3/16.
 */
@Repository
@Transactional
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    AccountRepository accountRepository;
}

package com.homework3.service;

import com.homework3.DAO.CustomerDao;
import com.homework3.DAO.CustomerJpaRepository;
import com.homework3.domain.Currency;
import com.homework3.domain.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    private final CustomerDao<Customer> customerDao;
    private final CustomerJpaRepository customerJpaRepository;

    public CustomerService(CustomerDao<Customer> customerDao, CustomerJpaRepository customerJpaRepository) {
        this.customerDao = customerDao;
        this.customerJpaRepository = customerJpaRepository;
    }

    public Customer update(Customer customer) {
        return customerJpaRepository.save(customer);
    }

    public void save(Customer c) {
        customerJpaRepository.save(c);
    }

    public Customer createAccount(Currency currency, Long id) {
        return customerDao.createAccount(currency, id);
    }

    public Customer deleteAccount(String accNumber, Long id) {
        return customerDao.deleteAccount(accNumber, id);
    }

    public void delete(Customer c) {
        customerJpaRepository.delete(c);
    }

    public void deleteAll(List<Customer> entities) {
        customerJpaRepository.deleteAll(entities);
    }

    public void saveAll(List<Customer> entities) {
        customerJpaRepository.saveAll(entities);
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return customerJpaRepository.findAll();
    }

    public void deleteById(Long id) {
        customerJpaRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Customer getById(Long id) {
        return customerJpaRepository.getById(id);
    }
}

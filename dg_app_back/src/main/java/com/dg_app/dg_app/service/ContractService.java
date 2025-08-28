package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.Contract;
import com.dg_app.dg_app.repository.ContractRepository;

@Service
public class ContractService implements IContractService{

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> getAllContracts() {
        
        return contractRepository.findAll();
        
    }

    @Override
    public Contract getContractById(Long id) {
        
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public Contract saveContract(Contract contract) {
        
        return contractRepository.save(contract);
    }

    @Override
    public void deleteContract(Long id) {
        
        contractRepository.deleteById(id);

    }

    @Override
    public Contract updateContract(Long id, Contract contract) {
        
        return contractRepository.save(contract);
        
    }

}

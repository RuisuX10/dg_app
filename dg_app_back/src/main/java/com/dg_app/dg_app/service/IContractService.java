package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.Contract;

public interface IContractService {

    List<Contract> getAllContracts();

    Contract getContractById(Long id);

    Contract saveContract(Contract contract);

    void deleteContract(Long id);

    Contract updateContract(Long id, Contract contract);

}

package com.dg_app.dg_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dg_app.dg_app.model.Contract;
import com.dg_app.dg_app.service.IContractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/contract")
public class ContractController {

    @Autowired
    private IContractService contractService;

    @GetMapping("")
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
    }
    

}

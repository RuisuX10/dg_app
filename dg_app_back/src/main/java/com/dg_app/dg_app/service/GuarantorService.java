package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.Guarantor;

import com.dg_app.dg_app.repository.GuarantorRepository;

@Service
public class GuarantorService implements IGuarantorService {

    @Autowired
    private GuarantorRepository guarantorRepository;

    @Override
    public List<Guarantor> getAllGuarantors() {
        List<Guarantor> guarantors = guarantorRepository.findAll();
        return guarantors;
    }

    @Override
    public Guarantor getGuarantorById(Long id) {
        Guarantor guarantor = guarantorRepository.findById(id).orElse(null);
        return guarantor;
    }

    @Override
    public Guarantor saveGuarantor(Guarantor guarantor) {
        return guarantorRepository.save(guarantor);
    }

    @Override
    public void deleteGuarantor(Long id) {
        guarantorRepository.deleteById(id);
    }

    @Override
    public Guarantor updateGuarantor(Long id, Guarantor guarantor) {
        Guarantor existingGuarantor = guarantorRepository.findById(id).orElse(null);
        if (existingGuarantor != null) {
            existingGuarantor.setName(guarantor.getName());
            existingGuarantor.setLast_name(guarantor.getLast_name());
            existingGuarantor.setDni(guarantor.getDni());
            existingGuarantor.setPhone(guarantor.getPhone());
            existingGuarantor.setEmail(guarantor.getEmail());
            return guarantorRepository.save(existingGuarantor);
        } else {
            return null;
        }
    }


}

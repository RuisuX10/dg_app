package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.Guarantor;

public interface IGuarantorService {

    List<Guarantor> getAllGuarantors();

    Guarantor getGuarantorById(Long id);

    Guarantor saveGuarantor(Guarantor guarantor);

    void deleteGuarantor(Long id);

    Guarantor updateGuarantor(Long id, Guarantor guarantor);

}

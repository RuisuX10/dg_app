package com.dg_app.dg_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.dg_app.dg_app.service.IGuarantorService;
import com.dg_app.dg_app.model.Guarantor;

@RestController
@RequestMapping("/api/guarantors")
public class GuarantorController {

    @Autowired
    private IGuarantorService guarantorService;

    @GetMapping
    public List<Guarantor> getAllGuarantors() {
        return guarantorService.getAllGuarantors();
    }

    @GetMapping("/{id}")
    public Guarantor getGuarantorById(@PathVariable Long id) {
        return guarantorService.getGuarantorById(id);
    }

    @PostMapping
    public Guarantor createGuarantor(@RequestBody Guarantor guarantor) {
        return guarantorService.saveGuarantor(guarantor);
    }

    @PutMapping("/{id}")
    public Guarantor updateGuarantor(@PathVariable Long id, @RequestBody Guarantor guarantor) {
        return guarantorService.updateGuarantor(id, guarantor);
    }

    @DeleteMapping("/{id}")
    public void deleteGuarantor(@PathVariable Long id) {
        guarantorService.deleteGuarantor(id);
    }
}

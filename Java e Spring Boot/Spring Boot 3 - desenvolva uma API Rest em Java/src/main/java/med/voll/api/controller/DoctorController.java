package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.NonNull;

import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.ListDataDoctors;
import med.voll.api.doctor.RegisterDataDoctors;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;
    
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisterDataDoctors data){
        repository.save(new Doctor(data));
    }

    @GetMapping
    public Page<ListDataDoctors> list(@NonNull @PageableDefault(size=10, sort={"name"}) Pageable pageable){
        return repository.findAll(pageable).map(ListDataDoctors::new);
    }
}
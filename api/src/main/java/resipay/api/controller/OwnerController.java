package resipay.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import resipay.api.domain.owner.Owner;
import resipay.api.domain.owner.OwnerData;
import resipay.api.domain.owner.OwnerRepository;


@RestController
@RequestMapping("owner")
public class OwnerController {
    @Autowired
    private OwnerRepository repository;
    @PostMapping
    @Transactional
    public void save(@RequestBody OwnerData data){
        repository.save(new Owner(data));
    }




    }

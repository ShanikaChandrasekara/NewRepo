package com.one23.official.resource;

import com.one23.official.repository.StoreManagerRepository;
import com.one23.official.model.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StoreManagerController {
    @Autowired
    private StoreManagerRepository smrepository;

    @PostMapping("/addStoreManager")
    public String saveStoreManager(@RequestBody StoreManager storeManager){
        smrepository.save(storeManager);
        return "Added Store Manager with ID : " + storeManager.getId();
    }

    @GetMapping("/findAllStoreManagers")
    public List<StoreManager> getStoreManagers() {
        return smrepository.findAll();
    }

    @GetMapping("/findAllStoreManagers/{id}")
    public Optional<StoreManager> getOneStoreManagerById(@PathVariable String id){
        return smrepository.findById(id);
    }

    @DeleteMapping("/deleteStoreManager/{id}")
    public String deleteStoreManager(@PathVariable String id){
        smrepository.deleteById(id);
        return "Store Manager deleted with ID : " + id;
    }


}

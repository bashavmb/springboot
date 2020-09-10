package com.basha.gcpfirestore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirestoreController {




    @Autowired
    private FirestoreDAO firestoreDAO;



    @GetMapping("/users")
    public List<Users> retrieveAllUsers()
    {
        return firestoreDAO.retrieveAllUsers();
    }

}

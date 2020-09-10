package com.basha.gcpfirestore;

// [START fs_include_dependencies]
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutionException;
// [END fs_include_dependencies]

@Component
public class FirestoreDAO {

    @Autowired
    private FirestoreConfig firestoreConfig;
    private List<Users> Users;


    public List<Users> retrieveAllUsers() {

        System.out.println("Hello From DAO");
        //  query.get() blocks on response


        try {
            ApiFuture<QuerySnapshot> query =
                    firestoreConfig.FirestoreConfig().collection("users").get();
            System.out.println(query.toString());
            System.out.println("Inside Try Block");
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (QueryDocumentSnapshot document : documents) {
                System.out.println("Inside fro loop");
                System.out.println("User: " + document.getId());
                //user.setFirstName(document.getString("first"));
                System.out.println("First: " + document.getString("firstName"));


            }

            return this.Users;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return this.Users;
    }
}
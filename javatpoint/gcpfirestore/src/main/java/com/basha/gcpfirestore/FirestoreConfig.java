package com.basha.gcpfirestore;


import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import jdk.jfr.DataAmount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class FirestoreConfig {

    private String collectionName;
    private String projectId;

    @Bean
    public  Firestore FirestoreConfig ()
    {


        FirestoreOptions firestoreOptions =
                FirestoreOptions.getDefaultInstance().toBuilder()
                        .setProjectId("durable-jet-287003")
                        .build();
        Firestore db = firestoreOptions.getService();
        // [END fs_initialize_project_id]
        return db;

    }
}

package de.alwi.instagram.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseConnector {

    private final static String PERSISTENCE_UNIT = "instagram_persistence";
    private final EntityManagerFactory entityManagerFactory;

    public DatabaseConnector() {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}

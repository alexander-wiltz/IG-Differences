package de.alwi.instagram.dao;

import de.alwi.instagram.dto.UserDTO;
import de.alwi.instagram.utils.DatabaseConnector;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Singleton
public class UserDAO {

    private static final DatabaseConnector databaseConnector = new DatabaseConnector();

    /**
     * Get List of all users.
     *
     * @return List of Users
     */
    public List<UserDTO> getAllUsers() {
        EntityManager entityManager = databaseConnector.getEntityManager();
        List<UserDTO> users = entityManager.createQuery("SELECT u FROM UserDTO u").getResultList();
        entityManager.close();

        if(users == null || users.isEmpty()) {
            log.error("No users found");
            return null;
        }

        log.debug("Loaded {} users from database.", users.size());

        return users;
    }

    /**
     * Update a Users in Table
     * @param user   UserDTO
     */
    public void updateUser(UserDTO user) {
        EntityManager entityManager = databaseConnector.getEntityManager();
        UserDTO neoUser = entityManager.find(UserDTO.class, user.getUserId());

        entityManager.getTransaction().begin();
        neoUser.setUsername(user.getUsername());
        neoUser.setFullName(user.getFullName());
        neoUser.setFollower(user.isFollower());
        neoUser.setFollowing(user.isFollowing());
        neoUser.setBrand(user.isBrand());
        neoUser.setFame(user.isFame());
        neoUser.setUsersFollowers(user.getUsersFollowers());
        neoUser.setUsersFollowings(user.getUsersFollowings());
        neoUser.setPosts(user.getPosts());
        neoUser.setCountFollowing(user.getCountFollowing());
        neoUser.setCountUnfollow(user.getCountUnfollow());
        neoUser.setInserted(user.getInserted());
        neoUser.setLastseen(user.getLastseen());

        entityManager.getTransaction().commit();
        entityManager.close();

        log.debug("User successfully updated in database.");
    }

    /**
     * Save a User in Table
     * @param user   UserDTO
     */
    public void saveUser(UserDTO user) {
        EntityManager entityManager = databaseConnector.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();

        log.debug("User successfully saved in database.");
    }
}

package de.alwi.instagram.services;

import de.alwi.instagram.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;

import javax.ejb.Stateless;

@Slf4j
@Stateless
public class UserService {

    /**
     * Checked User not found. Add to database.
     *
     * @param user User
     */
    public void addNewUser(UserDTO user) {

    }

    /**
     * Check if User is follower/following
     *
     * @param user User
     */
    public void checkUserFollowing(UserDTO user) {

    }

    /**
     * Check user stats, e.g. relativity of follower/following
     *
     * @param user User
     */
    public void proofUserStats(UserDTO user) {

    }

    /**
     * Check user ist Fame or Brand.
     * If is and not set, then set.
     *
     * @param user User
     */
    public void checkUsersState(UserDTO user) {

    }
}

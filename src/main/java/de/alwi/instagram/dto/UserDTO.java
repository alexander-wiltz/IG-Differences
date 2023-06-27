package de.alwi.instagram.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
@JsonTypeName("Account")
@Entity
@Table(name = "account")
public class UserDTO {

    @Id
    @PrimaryKeyJoinColumn
    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "isFollower", nullable = false)
    private boolean isFollower;

    @Column(name = "isFollowing", nullable = false)
    private boolean isFollowing;

    @Column(name = "isBrand", nullable = false)
    private boolean isBrand;

    @Column(name = "isFame", nullable = false)
    private boolean isFame;

    @Column(name = "users_followers", nullable = false)
    private Integer usersFollowers;

    @Column(name = "users_followings", nullable = false)
    private Integer usersFollowings;

    @ToString.Exclude
    @Column(name = "posts")
    private Integer posts;

    @Column(name = "countFollowing")
    private Integer countFollowing; // count up when following, switched to unfollow

    @Column(name = "countUnfollow")
    private Integer countUnfollow; // count up when account unfollowed (state switch)

    @ToString.Exclude
    @Column(name = "inserted_timestamp")
    private LocalDateTime insertedTimestamp;

    @ToString.Exclude
    @Column(name = "last_seen")
    private LocalDateTime lastseenTimestamp;
}

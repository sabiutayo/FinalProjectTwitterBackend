package sda.backend.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "avatar")
public class Avatar {

    @Id
    @Column(nullable = false, unique = true, name = "avatar_id")
    private Long avatarId;
    @Column(nullable = false, name = "account_id")
    private Long accountId;
    @Column
    private String path;

}
package sda.backend.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id", unique = true, nullable = false)
    private Long tagId;

    @Column(length = 50)
    private String content;

    @Column
    private String link;

    @Column(name = "tag_entry_id")
    private Long tagEntryId;
}
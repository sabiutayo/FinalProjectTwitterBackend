package sda.backend.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tag_entry")
public class TagEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_entry_id", nullable = false, unique = true)
    private Long tagEntryId;

    @Column(name = "tag_id", nullable = false)
    private Long tagId;

    @Column(name = "entry_id", nullable = false)
    private  Long entryId;
}
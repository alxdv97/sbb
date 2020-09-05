package ru.deyev.sbb.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class SimpleEntity {

    @Id
    @GeneratedValue(generator = "table", strategy = GenerationType.TABLE)
    @TableGenerator(name = "table")
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleEntity)) return false;
        SimpleEntity that = (SimpleEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

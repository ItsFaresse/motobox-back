package com.hoc.motobox.utils;


import javax.persistence.*;
import java.util.Date;

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@MappedSuperclass
public abstract class SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = true)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = true,insertable = false)
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    private void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    private void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    void onCreate(){
        this.setCreatedAt(new Date());
    }

    @PreUpdate
    void onUpdate(){
        this.setUpdatedAt(new Date());
    }
}

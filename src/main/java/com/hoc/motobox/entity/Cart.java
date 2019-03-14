package com.hoc.motobox.entity;

import com.hoc.motobox.utils.SuperEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart extends SuperEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private  User user;


    // Tomemory On peut faire du bi-directionnele ctd untiliser @Column mappedBy = "name)" et pareil dans l'Entity referencée
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private List<Ad> ad;


    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user =  user;
    }

    public List<Ad> getAd() {
        return ad;
    }

    public void setAd(List<Ad> ad) {
        this.ad = ad;
    }
}

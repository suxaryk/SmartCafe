package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "user_history", schema = "smart_cafe")
public class UserHistory implements Serializable {
    private static final long serialVersionUID = 5921421077206761390L;

    private int id;
    private Timestamp dateTimeIn;
    private Timestamp dateTimeOut;

    public UserHistory() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_history_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "date_time_in", nullable = false)
    public Timestamp getDateTimeIn() {
        return dateTimeIn;
    }

    public void setDateTimeIn(Timestamp dateTimeIn) {
        this.dateTimeIn = dateTimeIn;
    }

    @Column(name = "date_time_out", nullable = true)
    public Timestamp getDateTimeOut() {
        return dateTimeOut;
    }

    public void setDateTimeOut(Timestamp dateTimeOut) {
        this.dateTimeOut = dateTimeOut;
    }


}

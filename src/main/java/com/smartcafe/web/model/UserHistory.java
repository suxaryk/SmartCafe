package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "user_history", schema = "smart_cafe")
public class UserHistory implements Serializable {
    private static final long serialVersionUID = -8502016898082903780L;

    private int id;
    private Date dateTimeIn;
    private Date dateTimeOut;
    private User user;

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "user_history_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int userHistoryId) {
        this.id = userHistoryId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time_in", nullable = false)
    public Date getDateTimeIn() {
        return dateTimeIn;
    }
    public void setDateTimeIn(Timestamp dateTimeIn) {
        this.dateTimeIn = dateTimeIn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time_out", nullable = false)
    public Date getDateTimeOut() {
        return dateTimeOut;
    }

    public void setDateTimeOut(Timestamp dateTimeOut) {
        this.dateTimeOut = dateTimeOut;
    }

    @ManyToOne
    @JoinColumn(name = "username")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

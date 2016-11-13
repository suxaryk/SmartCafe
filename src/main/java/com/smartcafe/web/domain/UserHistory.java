package com.smartcafe.web.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "user_history", schema = "smart_cafe")
public class UserHistory extends AbstractDomain {
    private static final long serialVersionUID = -8502016898082903780L;

    private int id;
    private Date dateTimeIn;
    private Date dateTimeOut;
    private User user;


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

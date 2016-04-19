package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "employee_visit_history", schema = "smart_cafe")
public class EmployeeVisitHistory implements Serializable {
    private static final long serialVersionUID = 5921421077206761390L;

    private int id;
    private Timestamp dateTimeIn;
    private Timestamp dateTimeOut;

    public EmployeeVisitHistory() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeVisitHistory that = (EmployeeVisitHistory) o;

        if (id != that.id) return false;
        if (dateTimeIn != null ? !dateTimeIn.equals(that.dateTimeIn) : that.dateTimeIn != null) return false;
        if (dateTimeOut != null ? !dateTimeOut.equals(that.dateTimeOut) : that.dateTimeOut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateTimeIn != null ? dateTimeIn.hashCode() : 0);
        result = 31 * result + (dateTimeOut != null ? dateTimeOut.hashCode() : 0);
        return result;
    }
}

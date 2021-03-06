package org.vaadin.activiti.simpletravel.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TravelRequestDecision extends AbstractEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "Please approve or deny the request")
    protected Decision decision;
    @Column(nullable = false)
    @NotNull(message = "Please enter a motivation for your decision")
    @Size(min = 3, message = "Please enter a motivation for your decision")
    protected String motivationOfDecision;
    @Column(nullable = false)
    protected String managerUserId;
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dateOfDecision;

    protected TravelRequestDecision() {
    }

    public TravelRequestDecision(Decision decision, String motivationOfDecision, String managerUserId, Date dateOfDecision) {
        this.decision = decision;
        this.motivationOfDecision = motivationOfDecision;
        this.managerUserId = managerUserId;
        this.dateOfDecision = dateOfDecision;
    }

    public Decision getDecision() {
        return decision;
    }

    public String getManagerUserId() {
        return managerUserId;
    }

    public String getMotivationOfDecision() {
        return motivationOfDecision;
    }

    public Date getDateOfDecision() {
        return dateOfDecision;
    }
}

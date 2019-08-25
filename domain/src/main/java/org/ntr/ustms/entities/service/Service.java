package org.ntr.ustms.entities.service;

import java.util.List;
import java.util.Objects;
import org.ntr.ustms.entities.issue.Issue;
import org.ntr.ustms.entities.supporter.Supporter;

/**
 *
 * @author Rafailov
 */
public abstract class Service {

    private Long id;

    private String serviceName;
    private List<Issue> issues;
    private List<Supporter> supporter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<Supporter> getSupporter() {
        return supporter;
    }

    public void setSupporter(List<Supporter> supporter) {
        this.supporter = supporter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.serviceName);
        hash = 79 * hash + Objects.hashCode(this.issues);
        hash = 79 * hash + Objects.hashCode(this.supporter);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Service other = (Service) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.serviceName, other.serviceName)) {
            return false;
        }
        if (!Objects.equals(this.issues, other.issues)) {
            return false;
        }
        if (!Objects.equals(this.supporter, other.supporter)) {
            return false;
        }
        return true;
    }
    
    
    
}

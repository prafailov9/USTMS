package org.ntr.ustms.entities.supporter;

import java.util.List;
import java.util.Objects;
import org.ntr.ustms.entities.service.Service;

/**
 *
 * @author Rafailov
 */
public class Supporter {
    
    private Long id;
    private String supporterName;
    private List<Service> services;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupporterName() {
        return supporterName;
    }

    public void setSupporterName(String supporterName) {
        this.supporterName = supporterName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.supporterName);
        hash = 43 * hash + Objects.hashCode(this.services);
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
        final Supporter other = (Supporter) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.supporterName, other.supporterName)) {
            return false;
        }
        if (!Objects.equals(this.services, other.services)) {
            return false;
        }
        return true;
    }
    
    
    
}

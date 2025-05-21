package ma.ehtp.loadbalancer.load_balancer.domain;

import org.springframework.stereotype.Indexed;

@Entity
public class SimulatedServer {
    @Id 
    @GeneratedValue
    private boolean active ;
    private int currentLoad ;
    
}

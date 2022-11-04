import java.util.Iterator;
import java.util.LinkedHashSet;
public class HealthcareWorkerTeam implements HealthcareServiceable{

    private LinkedHashSet<HealthcareServiceable> members = new LinkedHashSet();

    public HealthcareWorkerTeam() {
    }

    public void addMember(Object healthcareWorker){
        this.members.add((HealthcareServiceable) healthcareWorker);
    }
    public void removeMember(Object healthcareWorker){
        this.members.remove((HealthcareServiceable) healthcareWorker);
    }
    @Override
    public double getPrice() {
        double sum = 0;
        Iterator<HealthcareServiceable> i = this.members.iterator();
        while(i.hasNext())
            sum+=i.next().getPrice();
        return sum;
    }

    @Override
    public void service() {
        Iterator<HealthcareServiceable> i = this.members.iterator();
        while(i.hasNext())
            i.next().service();
    }

}
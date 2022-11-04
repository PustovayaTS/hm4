package transport;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TransportList {
    private Set<Transport1> transportSet= new HashSet<>();

    public void addList(Transport1 transport){
        transportSet.add(transport);
    }

    public void addListAll(List<Transport1> transport){
        transportSet.addAll(transport);
    }

    @Override
    public String toString() {
        return "TransportList{" +
                "transportSet=" + transportSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportList that = (TransportList) o;
        return Objects.equals(transportSet, that.transportSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportSet);
    }


}

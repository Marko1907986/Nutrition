package domain;

import java.util.Objects;

/**
 *
 * @author Marko Milosevic
 */
public class ThermalProcessing {

    private Long id;
    private String name;
    private String hermeticLid;
    private String ordinaryCover;

    public ThermalProcessing() {
    }

    public ThermalProcessing(Long id, String name, String hermeticLid, String ordinaryCover) {
        this.id = id;
        this.name = name;
        this.hermeticLid = hermeticLid;
        this.ordinaryCover = ordinaryCover;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHermeticLid() {
        return hermeticLid;
    }

    public void setHermeticLid(String hermeticLid) {
        this.hermeticLid = hermeticLid;
    }

    public String getOrdinaryCover() {
        return ordinaryCover;
    }

    public void setOrdinaryCover(String ordinaryCover) {
        this.ordinaryCover = ordinaryCover;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.hermeticLid);
        hash = 37 * hash + Objects.hashCode(this.ordinaryCover);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThermalProcessing other = (ThermalProcessing) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.hermeticLid, other.hermeticLid)) {
            return false;
        }
        if (!Objects.equals(this.ordinaryCover, other.ordinaryCover)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ThermalProcessing{" + "id=" + id + ", name=" + name + ", hermeticLid=" + hermeticLid
                + ", ordinaryCover=" + ordinaryCover + '}';
    }

}

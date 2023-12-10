package domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Marko Milosevic
 */
public class FoodItemAnnex {

    private Long id;
    private String name;
    private BigDecimal flatSmallSpoon;
    private BigDecimal fullSmallSpoon;
    private BigDecimal flatSpoon;
    private BigDecimal fullSpoon;
    private String cup;

    public FoodItemAnnex() {
    }

    public FoodItemAnnex(Long id, String name, BigDecimal flatSmallSpoon, BigDecimal fullSmallSpoon,
            BigDecimal flatSpoon, BigDecimal fullSpoon, String cup) {
        this.id = id;
        this.name = name;
        this.flatSmallSpoon = flatSmallSpoon;
        this.fullSmallSpoon = fullSmallSpoon;
        this.flatSpoon = flatSpoon;
        this.fullSpoon = fullSpoon;
        this.cup = cup;
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

    public BigDecimal getFlatSmallSpoon() {
        return flatSmallSpoon;
    }

    public void setFlatSmallSpoon(BigDecimal flatSmallSpoon) {
        this.flatSmallSpoon = flatSmallSpoon;
    }

    public BigDecimal getFullSmallSpoon() {
        return fullSmallSpoon;
    }

    public void setFullSmallSpoon(BigDecimal fullSmallSpoon) {
        this.fullSmallSpoon = fullSmallSpoon;
    }

    public BigDecimal getFlatSpoon() {
        return flatSpoon;
    }

    public void setFlatSpoon(BigDecimal flatSpoon) {
        this.flatSpoon = flatSpoon;
    }

    public BigDecimal getFullSpoon() {
        return fullSpoon;
    }

    public void setFullSpoon(BigDecimal fullSpoon) {
        this.fullSpoon = fullSpoon;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.flatSmallSpoon);
        hash = 37 * hash + Objects.hashCode(this.fullSmallSpoon);
        hash = 37 * hash + Objects.hashCode(this.flatSpoon);
        hash = 37 * hash + Objects.hashCode(this.fullSpoon);
        hash = 37 * hash + Objects.hashCode(this.cup);
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
        final FoodItemAnnex other = (FoodItemAnnex) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cup, other.cup)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.flatSmallSpoon, other.flatSmallSpoon)) {
            return false;
        }
        if (!Objects.equals(this.fullSmallSpoon, other.fullSmallSpoon)) {
            return false;
        }
        if (!Objects.equals(this.flatSpoon, other.flatSpoon)) {
            return false;
        }
        return Objects.equals(this.fullSpoon, other.fullSpoon);
    }

    @Override
    public String toString() {
        return "FoodItemAnnex{" + "id=" + id + ", name=" + name + ", flatSmallSpoon=" + flatSmallSpoon
                + ", fullSmallSpoon=" + fullSmallSpoon + ", flatSpoon=" + flatSpoon + ", fullSpoon=" + fullSpoon
                + ", cup=" + cup + '}';
    }

}

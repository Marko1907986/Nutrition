package domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Marko Milosevic
 */
public class Recipe {

    private Long id;
    private TypeOfDish typeOfDish;
    private String name;
    private String energyValue;
    private BigDecimal protein;
    private BigDecimal fats;
    private BigDecimal carbohydrates;
    private BigDecimal calcium;
    private BigDecimal iron;
    private BigDecimal vitaminA;
    private BigDecimal vitaminB1;
    private BigDecimal vitaminB2;
    private BigDecimal niacin;
    private BigDecimal vitaminC;

    public Recipe() {
    }

    public Recipe(Long id, TypeOfDish typeOfDish, String name, String energyValue, BigDecimal protein, BigDecimal fats,
            BigDecimal carbohydrates, BigDecimal calcium, BigDecimal iron, BigDecimal vitaminA, BigDecimal vitaminB1,
            BigDecimal vitaminB2, BigDecimal niacin, BigDecimal vitaminC) {
        this.id = id;
        this.typeOfDish = typeOfDish;
        this.name = name;
        this.energyValue = energyValue;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calcium = calcium;
        this.iron = iron;
        this.vitaminA = vitaminA;
        this.vitaminB1 = vitaminB1;
        this.vitaminB2 = vitaminB2;
        this.niacin = niacin;
        this.vitaminC = vitaminC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeOfDish getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(TypeOfDish typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(String energyValue) {
        this.energyValue = energyValue;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public BigDecimal getFats() {
        return fats;
    }

    public void setFats(BigDecimal fats) {
        this.fats = fats;
    }

    public BigDecimal getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(BigDecimal carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public BigDecimal getCalcium() {
        return calcium;
    }

    public void setCalcium(BigDecimal calcium) {
        this.calcium = calcium;
    }

    public BigDecimal getIron() {
        return iron;
    }

    public void setIron(BigDecimal iron) {
        this.iron = iron;
    }

    public BigDecimal getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(BigDecimal vitaminA) {
        this.vitaminA = vitaminA;
    }

    public BigDecimal getVitaminB1() {
        return vitaminB1;
    }

    public void setVitaminB1(BigDecimal vitaminB1) {
        this.vitaminB1 = vitaminB1;
    }

    public BigDecimal getVitaminB2() {
        return vitaminB2;
    }

    public void setVitaminB2(BigDecimal vitaminB2) {
        this.vitaminB2 = vitaminB2;
    }

    public BigDecimal getNiacin() {
        return niacin;
    }

    public void setNiacin(BigDecimal niacin) {
        this.niacin = niacin;
    }

    public BigDecimal getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(BigDecimal vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.typeOfDish);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.energyValue);
        hash = 97 * hash + Objects.hashCode(this.protein);
        hash = 97 * hash + Objects.hashCode(this.fats);
        hash = 97 * hash + Objects.hashCode(this.carbohydrates);
        hash = 97 * hash + Objects.hashCode(this.calcium);
        hash = 97 * hash + Objects.hashCode(this.iron);
        hash = 97 * hash + Objects.hashCode(this.vitaminA);
        hash = 97 * hash + Objects.hashCode(this.vitaminB1);
        hash = 97 * hash + Objects.hashCode(this.vitaminB2);
        hash = 97 * hash + Objects.hashCode(this.niacin);
        hash = 97 * hash + Objects.hashCode(this.vitaminC);
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
        final Recipe other = (Recipe) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.energyValue, other.energyValue)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.typeOfDish != other.typeOfDish) {
            return false;
        }
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        if (!Objects.equals(this.fats, other.fats)) {
            return false;
        }
        if (!Objects.equals(this.carbohydrates, other.carbohydrates)) {
            return false;
        }
        if (!Objects.equals(this.calcium, other.calcium)) {
            return false;
        }
        if (!Objects.equals(this.iron, other.iron)) {
            return false;
        }
        if (!Objects.equals(this.vitaminA, other.vitaminA)) {
            return false;
        }
        if (!Objects.equals(this.vitaminB1, other.vitaminB1)) {
            return false;
        }
        if (!Objects.equals(this.vitaminB2, other.vitaminB2)) {
            return false;
        }
        if (!Objects.equals(this.niacin, other.niacin)) {
            return false;
        }
        return Objects.equals(this.vitaminC, other.vitaminC);
    }

    @Override
    public String toString() {
        return "Receptura{" + "id=" + id + ", typeOfDish=" + typeOfDish + ", name=" + name
                + ", energyValue=" + energyValue + ", protein=" + protein + ", fats=" + fats
                + ", carbohydrates=" + carbohydrates + ", calcium=" + calcium + ", iron=" + iron
                + ", vitaminA=" + vitaminA + ", vitaminB1=" + vitaminB1 + ", vitaminB2=" + vitaminB2
                + ", niacin=" + niacin + ", vitaminC=" + vitaminC + '}';
    }

}

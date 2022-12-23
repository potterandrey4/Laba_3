package Characters;

public abstract class Something {
    private String name;
    private String benefit;

    public Something(String name) {
        this.setName(name);
    }

    public Something(String name, String benefit) {
        this.setName(name);
        this.setBenefit(benefit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getBenefit() {
        return this.benefit;
    }

    @Override
    public String toString() {
        return this.getName();
    }


    @Override
    public int hashCode() {
        int result = 31;
        result = result * this.getName().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Something something = (Something) o;
        return this.getName().equals(something.getName());
    }

}

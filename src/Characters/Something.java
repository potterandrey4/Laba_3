package Characters;

public abstract class Something {
    private String name;

    public Something(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

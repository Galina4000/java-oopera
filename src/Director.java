public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfShows;
        return result;
    }
}


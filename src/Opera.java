public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Opera opera = (Opera) o;
        return choirSize == opera.choirSize;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + choirSize;
        return result;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "choirSize=" + choirSize +
                '}';
    }
}

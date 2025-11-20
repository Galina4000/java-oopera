import java.util.Objects;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthor, that.musicAuthor) && Objects.equals(librettoText, that.librettoText);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(musicAuthor);
        result = 31 * result + Objects.hashCode(librettoText);
        return result;
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}

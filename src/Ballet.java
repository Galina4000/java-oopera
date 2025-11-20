import java.util.Objects;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ballet ballet = (Ballet) o;
        return Objects.equals(choreographer, ballet.choreographer);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(choreographer);
        return result;
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "choreographer=" + choreographer +
                '}';
    }
}

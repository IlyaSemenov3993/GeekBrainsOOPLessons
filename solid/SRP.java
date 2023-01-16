import java.util.Comparator;

public class Teacher extends User implements Comparator<Teacher>{
    private String rank;

    public Teacher(String firstName, String lastName, int id, String rank) {
        super(firstName, lastName, id);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.rank.compareTo(o2.rank);
    }
}
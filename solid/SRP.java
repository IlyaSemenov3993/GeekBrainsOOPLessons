import java.util.Comparator;

public class Lion extends Animal implements Comparator<Lion>{
    private int volumeOfGriva;

    public Lion(String name, String volumeOfGriva, int age) {
        super(name, age);
        this.volumeOfGriva = volumeOfGriva;
    }

    public String getVolumeOfGriva() {
        return volumeOfGriva;
    }

    public void setVolumeOfGriva(String volumeOfGriva) {
        this.volumeOfGriva = volumeOfGriva;
    }

    @Override
    public int compare(Lion o1, Lion o2) {
        return o1.volumeOfGriva.compareTo(o2.volumeOfGriva);
    }
}

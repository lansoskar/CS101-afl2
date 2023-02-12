package Override;

public class NewSchoolRap extends RapSong{
    public NewSchoolRap() {}

    @Override
    public void play() {
        System.out.println("Playing new school rap");
    }
}

package Override;

public class Main {
    public static void main(String[] args) {
        RapSong iWonder = new RapSong();
        OldSchoolRap putItOn = new OldSchoolRap();
        NewSchoolRap walkin = new NewSchoolRap();

        iWonder.play();
        putItOn.play();
        walkin.play();
    }
}

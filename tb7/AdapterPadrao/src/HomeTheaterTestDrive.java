public class HomeTheaterTestDrive {
    public static void main(String[] args){
        
        HomeTheaterFacade homeTheater;
        homeTheater = new HomeTheatherFacade(amp, tuner,dvd,
                cd,projector, screen,lights,popper);
        
        homeTheater.watchMovie("RAiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

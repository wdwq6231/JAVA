package Main5_1;

public class Example6_7 {
    public static void main(String args[]) {
        AdvertisementBoard board = new AdvertisementBoard();
        board.show();
        board.setAdvertisement(new BlackLandCorp());
        board.show();
        board.setAdvertisement(new WhiteCloudCorp());
        board.show();
    }
}

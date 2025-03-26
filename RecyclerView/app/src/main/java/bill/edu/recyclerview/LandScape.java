package bill.edu.recyclerview;

public class LandScape {
    String landImage;
    String landCation;

    public LandScape(String landImage, String landCation) {
        this.landImage = landImage;
        this.landCation = landCation;
    }

    public String getLandImage() {
        return landImage;
    }

    public void setLandImage(String landImage) {
        this.landImage = landImage;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}

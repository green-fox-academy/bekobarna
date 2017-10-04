public class Character {
    int startPosX;
    int startPosY;
    int width;
    String type;

    public Character(int startPosX, int startPosY, int width, String type) {
        this.startPosX = startPosX;
        this.startPosY = startPosY;
        this.width = width;
        this.type = type;
    }

    public int getStartPosX() {
        return startPosX;
    }

    public void setStartPosX(int startPosX) {
        this.startPosX = startPosX;
    }

    public int getStartPosY() {
        return startPosY;
    }

    public void setStartPosY(int startPosY) {
        this.startPosY = startPosY;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class Character {
    int startPosX;
    int startPosY;
    String type;
    int amount;

    public Character(int startPosX, int startPosY, String type, int amount) {
        this.startPosX = startPosX;
        this.startPosY = startPosY;
        this.type = type;
        this.amount = amount;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return amount;
    }

    public void setNumber(int number) {
        this.amount = amount;
    }
}

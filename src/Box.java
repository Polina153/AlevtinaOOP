class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    void showVolume(){
        double volume = height * length * width;
        System.out.println(volume);
    }
}

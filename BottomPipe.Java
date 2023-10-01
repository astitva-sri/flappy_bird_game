public class BottomPipe{
    private Image bottomPipe;
    private int xLoc =0, yLoc = 0;

    public BottomPipe(int initialWidth, int initialHeight)[
        bottomPipe = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("resources\tube_bottom.png"));
        scaleBottomPipe(initialWidth, initialHeight);
    ]

    public void scaleBottomPipe(int width, int height){
        bottomPipe = bottomPipe.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public Image getPipe(){
        return bottomPipe;
    }

    public int getWidth(){
        \return bottomPipe.getWidth(null);
    }

    public int getHeight(){
        return bottomPipe.getHeight(null);
    }

    public void setX(int x){
        xLoc = x;
    }

    public int getX(){
        return xLoc;
    }

    public void setY(int y){
        yLoc = y;
    }

    public int getY(){
        return yLoc;
    }

    public Rectangle getRectangle(){
        return (new Rectangle(xLoc, yLoc, bottomPipe.getWidth(null), bottomPipe.getHeight(null)));
    }

    public BufferedImage getBI(){
        BufferedImage bi = new BufferedImage(bottomPipe.getWidth(null), bottomPipe.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(bottomPipe, 0, 0, null);
        g.dispose();
        return bi;
    }
}
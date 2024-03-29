package DataStructure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rajeevan
 */
public interface Map {

    public int getWidth();

    public int getHeight();

    public Boolean isBlocked(int x, int y);

    public void setMap(Boolean[][] floor);

    public void setPath(Path p);

    public Path getPath();

    public Boolean[][] getFloorPlan();

    public Direction pathStartingDirection();

    public Direction destinationDirection(int currentX, int currentY);

    public int getTerminalX();

    public int getTerminalY();
    
    public Coordinate getTerminal(int currentX,int currentY);
        
    public Coordinate getDest();
    
    //public boolean hasObstacleInRange(Coordinate currentPosition,Direction currentDirection);
    
    public Direction getObstacleDirection(Coordinate currentPosition,Direction currentDirection);
    
    
}

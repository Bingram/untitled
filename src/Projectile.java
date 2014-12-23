import java.awt.*;

/**
 * Created by Brian on 12/17/2014.
 */
public class Projectile extends Object {

    private int frameRate = 1/60; // 60FPS

    private Double width = outLine.getWidth();

    // Store velocity as point for X and Y values
    // An array may be faster...
    private Point velocity;

    // Restitution value is the given "bounciness" of the projectile
    // Default is 0, other values may be used for different behavior
    private Double restitution = 0.0;

    // Coefficient of drag, how much "wind" drag the projectile experiences
    private Double cD = 0.47; // Dimensionless

    // rHo is the density of what the projectile is travelling through
    // For air this would 1.22 kg/m^3
    private Double rHo = 1.22;

    //Area is just as it's named, the surface area acted upon by other forces
    private Double Area = Math.PI * width * (width/1000);// m^2

    // aG is the acceleration of Gravity for this projectile
    // Default is 9.81 for the rate on Earth
    private Double aG = 9.81;// m per sec^2

    public Projectile(){

    }

    public Projectile(Point start){

        centerMiddle = start;

        velocity.x = 0;
        velocity.y = 0;

        weight = 0.1;

    }

    private void updatePosition(){

        // Do physics
        // Drag force: Fd = -1/2 * Cd * A * rho * v * v
        Double Fx = -0.5 * cD * Area * rHo * velocity.x * velocity.x * velocity.x / Math.abs(velocity.x);
        Double Fy = -0.5 * cD * Area * rHo * velocity.y * velocity.y * velocity.y / Math.abs(velocity.y);

        /* Borrowed from original code
        Used to check if value calculated is usable
        Fx = (isNaN(Fx) ? 0 : Fx);
        Fy = (isNaN(Fy) ? 0 : Fy);*/

        // Calculate acceleration ( F = ma )
        Double aX = Fx / weight;
        Double aY = aG + (Fy / weight);
        // Integrate to get velocity
        velocity.x += aX*frameRate;
        velocity.y += aY*frameRate;

        // Integrate to get position
        centerMiddle.x += velocity.x*frameRate*100;
        centerMiddle.y += velocity.y*frameRate*100;


    }

}

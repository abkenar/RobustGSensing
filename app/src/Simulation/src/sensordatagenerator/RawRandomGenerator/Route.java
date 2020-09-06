/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

/**
 *
 * @author DELL
 */
public class Route {

    public Location[] waypoints;

    public Route(Location... waypoints) {
        this.waypoints = waypoints;
    }

    public Location[] getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(Location[] waypoints) {
        this.waypoints = waypoints;
    }
    
    
    
}

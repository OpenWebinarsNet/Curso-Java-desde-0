/**
 * 
 */
package valoryreferencia;

/**
 * @author Openwebinars
 *
 */
public class PasoPorReferencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle(2,3);
		
		System.out.println(circle);
		
		moveCircle(circle, 23, 56);
		
		System.out.println(circle);

	}
	
	public static void moveCircle(Circle circle, int deltaX, int deltaY) {
	    // code to move origin of circle to x+deltaX, y+deltaY
	    circle.setX(circle.getX() + deltaX);
	    circle.setY(circle.getY() + deltaY);

	    // code to assign a new reference to circle
	    circle = new Circle(0, 0);
	}

}

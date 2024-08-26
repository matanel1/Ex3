package assignments.ex3;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class represents a 2D map as a "screen" or a raster matrix or maze over integers.
 * @author boaz.benmoshe
 *
 */
public class Map implements Map2D, Serializable{
	private int[][] _map;
	private boolean _cyclicFlag = true;
	
	/**
	 * Constructs a w*h 2D raster map with an init value v.
	 * @param w
	 * @param h
	 * @param v
	 */
	public Map(int w, int h, int v) {init(w,h, v);}
	/**
	 * Constructs a square map (size*size).
	 * @param size
	 */
	public Map(int size) {this(size,size, 0);}
	
	/**
	 * Constructs a map from a given 2D array.
	 * @param data
	 */
	public Map(int[][] data) {
		init(data);
	}
	@Override
	public void init(int w, int h, int v) {
		// add you code here
		_map  = new int [h][w]; //num of rows = h ,num of columns = w
		//set each value in the 2D array to the value v
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
			_map[i][j] = v;
		////////////////////
			}
		}
	}
	@Override
	public void init(int[][] arr) {
		// add you code here
		_map  = new int [arr.length][arr[0].length];
		// deep copy each row from arr to _map
		for (int i = 0; i < arr.length; i++) {
			_map[i] = Arrays.copyOf(arr[i], arr[i].length);
		////////////////////
		}
	}
	@Override
	public int[][] getMap() {
		// add you code here
		int[][] ans = new int[_map.length][];
		//deep copy each row from _map to ans
		for (int i = 0; i < _map.length; i++) {
			ans [i]= Arrays.copyOf(_map[i], _map[i].length);
		////////////////////
		return ans;
	}
	@Override
	public int getWidth() {return _map.length;}
	@Override
	public int getHeight() {return _map[0].length;}
	@Override
	public int getPixel(int x, int y) { return _map[x][y];}
	@Override
	public int getPixel(Pixel2D p) {
		return this.getPixel(p.getX(),p.getY());
	}
	@Override
	public void setPixel(int x, int y, int v) {_map[x][y] = v;}
	@Override
	public void setPixel(Pixel2D p, int v) {
		setPixel(p.getX(), p.getY(), v);
	}


	@Override
	/** 
	 * Fills this map with the new color (new_v) starting from p.
	 * https://en.wikipedia.org/wiki/Flood_fill
	 */
	public int fill(Pixel2D xy, int new_v) {
		int ans = -1;
		// add you code here

		////////////////////
		return ans;
	}


	/**
	 * Computes the distance of the shortest path (minimal number of consecutive neighbors) from p1 to p2.
	 * Notes: the distance is using computing the shortest path and returns its length-1, as the distance fro  a point
	 * to itself is 0, while the path contains a single point.
	 
	 */
	public int shortestPathDist(Pixel2D p1, Pixel2D p2, int obsColor) {
		int ans = -1;
		// add you code here

		////////////////////
		return ans;
	}
	@Override
	/**
	 * BFS like shortest the computation based on iterative raster implementation of BFS, see:
	 * https://en.wikipedia.org/wiki/Breadth-first_search
	 */
	public Pixel2D[] shortestPath(Pixel2D p1, Pixel2D p2, int obsColor) {
		Pixel2D[] ans = null;  // the result.
		// add you code here

		////////////////////
		return ans;
	}

	@Override
	public Pixel2D[] shortestPath(Pixel2D[] points, int obsColor) {
		Pixel2D[] ans = null;
		// add you code here

		////////////////////
		return ans;
	}

	@Override
	public boolean isInside(Pixel2D p) {
		return isInside(p.getX(),p.getY());
	}

	@Override
	public boolean isCyclic() {
		return _cyclicFlag;
	}

	@Override
	public void setCyclic(boolean cy) {
		_cyclicFlag = cy;
	}

	private boolean isInside(int x, int y) {
		return x>=0 && y>=0 && x<this.getWidth() && y<this.getHeight();
	}
	@Override
	public Map2D allDistance(Pixel2D start, int obsColor) {
		Map2D ans = null;
		// add you code here
		////////////////////
		return ans;
	}
	@Override
	public int numberOfConnectedComponents(int obsColor) {
		int ans = -1;
		// add you code here

		////////////////////
		return ans;
	}

	@Override
	public boolean equals(Object ob) {
		boolean ans = false;
		// add you code here
		if (ob == null || !(ob instanceof Map2D)) {return ans;}
		Map2D obm = (Map2D)ob;
		ans =Arrays.deepEquals(this._map,obm.getMap());
		////////////////////
		return ans;
	}
	////////////////////// Private Methods ///////////////////////
	// add you code here

	////////////////////

}

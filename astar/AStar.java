package com.magic.astar;
import java.util.*;

public class AStar
{
	public final static int BAR = 1; 
	public final static int PATH = 2; 
	public final static int DIRECT_VALUE = 10; 
	public final static int OBLIQUE_VALUE = 14; 
	
	Queue<Node> openList = new PriorityQueue<Node>(); 
	List<Node> closeList = new ArrayList<Node>();
	List<Coord> pathList=new ArrayList<Coord>();
	
	
	public void start(MapInfo mapInfo)
	{
		if(mapInfo==null) return;
		// clean
		openList.clear();
		closeList.clear();
		
		openList.add(mapInfo.start);
		moveNodes(mapInfo);
	}

	public List<Coord>  getWay(){
		return pathList;
	}
	
	private void moveNodes(MapInfo mapInfo)
	{
		while (!openList.isEmpty())
		{
			if (isCoordInClose(mapInfo.end.coord))
			{
				drawPath(mapInfo.maps, mapInfo.end);
				break;
			}
			Node current = openList.poll();
			closeList.add(current);
			addNeighborNodeInOpen(mapInfo,current);
		}
	}
	
	
	private void drawPath(int[][] maps, Node end)
	{
		if(end==null||maps==null) return;
		while (end != null)
		{
			Coord c = end.coord;
//			System.out.println("(" + c.x + c.y + ")");
			maps[c.y][c.x] = PATH;
			end = end.parent;
			pathList.add(c);
		}
	}


	private void addNeighborNodeInOpen(MapInfo mapInfo,Node current)
	{
		int x = current.coord.x;
		int y = current.coord.y;
		
		addNeighborNodeInOpen(mapInfo,current, x - 1, y, DIRECT_VALUE);
		
		addNeighborNodeInOpen(mapInfo,current, x, y - 1, DIRECT_VALUE);
		
		addNeighborNodeInOpen(mapInfo,current, x + 1, y, DIRECT_VALUE);
		
		addNeighborNodeInOpen(mapInfo,current, x, y + 1, DIRECT_VALUE);
	}

	private void addNeighborNodeInOpen(MapInfo mapInfo,Node current, int x, int y, int value)
	{
		if (canAddNodeToOpen(mapInfo,x, y))
		{
			Node end=mapInfo.end;
			Coord coord = new Coord(x, y);
			int G = current.G + value; // 璁＄畻閭荤粨鐐圭殑G鍊�
			Node child = findNodeInOpen(coord);
			if (child == null)
			{
				int H=calcH(end.coord,coord); // 璁＄畻H鍊�
				if(isEndNode(end.coord,coord))
				{
					child=end;
					child.parent=current;
					child.G=G;
					child.H=H;
				}
				else
				{
					child = new Node(coord, current, G, H);
				}
				openList.add(child);
			}
			else if (child.G > G)
			{
				child.G = G;
				child.parent = current;
				openList.add(child);
			}
		}
	}

	
	private Node findNodeInOpen(Coord coord)
	{
		if (coord == null || openList.isEmpty()) return null;
		for (Node node : openList)
		{
			if (node.coord.equals(coord))
			{
				return node;
			}
		}
		return null;
	}


	private int calcH(Coord end,Coord coord)
	{
		return Math.abs(end.x - coord.x)
				+ Math.abs(end.y - coord.y);
	}
	

	private boolean isEndNode(Coord end,Coord coord)
	{
		return coord != null && end.equals(coord);
	}

	
	private boolean canAddNodeToOpen(MapInfo mapInfo,int x, int y)
	{
		
		if (x < 0 || x >= mapInfo.width || y < 0 || y >= mapInfo.hight) return false;
		
		if (mapInfo.maps[y][x] == BAR) return false;
		
		if (isCoordInClose(x, y)) return false;

		return true;
	}


	private boolean isCoordInClose(Coord coord)
	{
		return coord!=null&&isCoordInClose(coord.x, coord.y);
	}

	
	private boolean isCoordInClose(int x, int y)
	{
		if (closeList.isEmpty()) return false;
		for (Node node : closeList)
		{
			if (node.coord.x == x && node.coord.y == y)
			{
				return true;
			}
		}
		return false;
	}
}

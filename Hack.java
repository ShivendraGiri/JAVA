package infytq1;

import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class Hack
{   
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; 
   
    Hack(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v,int w) { adj[v].add(w); }
    Boolean isReachable(int s, int d)
    {
        LinkedList<Integer>temp;
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            int n;
            i = adj[s].listIterator();
            while (i.hasNext())
            {
                n = i.next();
                if (n==d)
                    return true;
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        
        Hack g = new Hack(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int u = 1;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("Yes " );
        else
            System.out.println("No" );

        u = 3;
        v = 1;
       
    }
}
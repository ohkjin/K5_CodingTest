package codingTest.bfs;

public class IceBubble {
	int n;
	int m;
	int[][] graph;
	
    public int solution(int n, int m, int[][] graph) {
        int answer = 0;
        this.n=n;
        this.m=m;
        this.graph=graph;
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(dfs(i,j)==true) answer+=1;
        	}
        }
        return answer;
    }
    //recursive function:'for' unneeded
    public boolean dfs(int x,int y) {
    	//escape route
    	if(x<=-1|x>=graph.length|y<=-1|y>=graph[0].length) return false;
    	if(graph[x][y]==0) {
    		graph[x][y]=1;
    		dfs(x-1,y);
    		dfs(x+1,y);
    		dfs(x,y-1);
    		dfs(x,y+1);
    		return true;
    	}
    	
    	return false;
    }
   
	public static void main(String[] args) {
		IceBubble test1 = new IceBubble();
		int[][] graph = {{0,0,1,1,0},{0,0,0,1,1},{1,1,1,1,1},{0,0,0,0,0}};
		
		System.out.println(test1.solution(4, 5, graph));
		IceBubble test2 = new IceBubble();
		int[][] graph2 = {{0,0,1,1,0,0},{0,0,0,1,1,1},{1,1,1,1,1,0},{0,0,0,0,0,1},{0,0,0,1,1,1},{1,1,1,1,1,0},{0,0,1,1,0,0}};
		
		System.out.println(test1.solution(7, 6, graph2));

	}

}

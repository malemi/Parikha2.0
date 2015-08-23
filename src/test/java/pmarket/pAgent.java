package pmarket;

import org.neo4j.graphdb.Node;

import market.Agent;
import market.NodeWrapper;


public class pAgent extends Agent  {
	
	public pAgent(Node underlyingNode) {
		super(underlyingNode);
	}

	private static final String KEY_LEVEL = "Level";

    public String getLevel()    {
        return ( String ) this.getUnderlyingNode().getProperty( KEY_LEVEL );
    }
    
	public void setLevel( String level)    {
		this.getUnderlyingNode().setProperty( KEY_LEVEL, level);
	}
	

}

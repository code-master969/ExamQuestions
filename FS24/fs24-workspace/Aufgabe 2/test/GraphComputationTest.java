import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class GraphComputationTest {
	
	/** a) **/
	
	@Test
	public void testBasicA() {
		Node n4 = freshLeafNode();
		Node n5 = freshLeafNode();
		
		Node n1 = freshNodeWithOneTarget("b", n4);
		Node n2 = freshNodeWithOneTarget("a", n5);
		Node n3 = freshLeafNode();
		
		HashMap<String, Node> neighbours0 = new HashMap<String, Node>();
		neighbours0.put("a", n1);
		neighbours0.put("b", n2);
		neighbours0.put("c", n3);
		Node n0 = new Node();
		n0.neighbors = neighbours0;
		
		Graph.reverseLeaves(n0);
		
		assertEquals(Map.of("a", n1, "b", n2, "c", n3), n0.neighbors);
		assertEquals(Map.of("b", n5), n1.neighbors);
		assertEquals(Map.of("a", n4), n2.neighbors);
		assertEquals(Map.of(), n3.neighbors);
		
		assertEquals(Map.of(), n4.neighbors);
		assertEquals(Map.of(), n5.neighbors);
	}
	
	@Test
	public void testExampleA() {
		Node [] n = graphExampleA();
		
		Graph.reverseLeaves(n[0]);
		
		assertEquals(Map.of("y", n[1], "b", n[2], "c", n[3]), n[0].neighbors);
		
		assertEquals(Map.of("a", n[4]), n[1].neighbors);
		
		assertEquals(Map.of("c", n[7]), n[2].neighbors);
		
		assertEquals(Map.of("a", n[6], "b", n[5]), n[3].neighbors);
		
		assertEquals(Map.of("c", n[10]), n[4].neighbors);
		
		assertEquals(Map.of(), n[5].neighbors);
		
		assertEquals(Map.of("z", n[9], "y", n[8]), n[6].neighbors);
		
		assertEquals(Map.of(), n[7].neighbors);
		
		assertEquals(Map.of(), n[8].neighbors);
		assertEquals(Map.of(), n[9].neighbors);
		assertEquals(Map.of(), n[10].neighbors);
	}
	
	public static Node[] graphExampleA() {
		Node n8 = freshLeafNode();
		Node n9 = freshLeafNode();
		Node n10 = freshLeafNode();

		Node n4 = freshNodeWithOneTarget("c", n8);
		Node n5 = freshLeafNode();
		
		
		Node n6 = new Node();
		{
			HashMap<String, Node> neighbors7 = new HashMap<String, Node>();
			neighbors7.put("z", n9);
			neighbors7.put("y", n10);
			n6.neighbors = neighbors7;
		}
		
		Node n7 = freshLeafNode();
		
		Node n1 = freshNodeWithOneTarget("a", n4);
		Node n2 = freshNodeWithOneTarget("c", n5);
		
		Node n3 = new Node();
		{
			HashMap<String, Node> neighbors4 = new HashMap<String, Node>();
			neighbors4.put("a", n6);
			neighbors4.put("b", n7);
			n3.neighbors = neighbors4;
		}
		
		Node n0 = new Node();
		{
			HashMap<String, Node> neighbors1 = new HashMap<String, Node>();
			neighbors1.put("y", n1);
			neighbors1.put("b", n2);
			neighbors1.put("c", n3);
			n0.neighbors = neighbors1;
		}
		
		return new Node[] {
				n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10
		};
	}
	
	/** b) **/
	
	@Test
	public void testBasicB1() {
		Node [] roots = new Node[2];
		
		{
			//roots[0]
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("c", freshLeafNode());
			map.put("d", freshLeafNode());
			roots[0] = new Node();
			roots[0].neighbors = map;
		}
		
		{
			//roots[1]
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("e", freshLeafNode());
			map.put("b", freshLeafNode());
			roots[1] = new Node();
			roots[1].neighbors = map;
		}
		
		Set<String> result = Graph.findPaths(roots);
		
		assertEquals(Set.of("c#e", "c#b", "d#e", "d#b"), result);
	}
	
	
	@Test
	public void testBasicB2() {
		Node [] roots = new Node[4];
		
		{
			//roots[0]
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("a", freshLeafNode());
			map.put("z", freshLeafNode());
			roots[0] = new Node();
			roots[0].neighbors = map;			
		}
		
		{
			//roots[1]
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("c", freshLeafNode());
			map.put("d", freshLeafNode());
			map.put("b", freshLeafNode());
			map.put("a", freshLeafNode());

			
			roots[1] = new Node();
			roots[1].neighbors = map;
		}
		
		{
			//roots[2]
			Node n1 = freshLeafNode();
			roots[2] = freshNodeWithOneTarget("w", n1);
		}
		
		{
			//roots[3]
			Node q1 = freshLeafNode();
			roots[3] = freshNodeWithOneTarget("c", q1);
		}
		
		Set<String> result = Graph.findPaths(roots);
		
		assertEquals(Set.of("a#c#w#c", "a#b#w#c", "a#a#w#c"), result);
	}
	
	@Test
	public void testExampleB() {
		Node [] roots = new Node[3];
		
		{
			//roots[0]			
			Node m3 = freshLeafNode();
			Node m1 = freshLeafNode();
			Node m2 = freshNodeWithOneTarget("c", m3);
			
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("e", m1);
			map.put("b", m2);
			roots[0] = new Node();
			roots[0].neighbors = map;
		}
		
		{
			//roots[1]
			Node n1 = freshLeafNode();
			Node n2 = freshLeafNode();
			HashMap<String, Node> map = new HashMap<String, Node>();
			map.put("a", n1);
			map.put("h", n2);
			roots[1] = new Node();
			roots[1].neighbors = map;
		}
		
		{
			//roots[2]
			Node r2 = freshLeafNode();
			Node r1 = freshNodeWithOneTarget("a", r2);
			roots[2] = freshNodeWithOneTarget("d", r1);			
		}
		
		Set<String> result = Graph.findPaths(roots);
		assertEquals(
			Set.of("bc#a#da", "bc#h#da"),
			result
		);
	}
	
	
	public static Node freshLeafNode() {
		Node n = new Node();
		n.neighbors = new HashMap<String, Node>();
		return n;
	}
	
	public static Node freshNodeWithOneTarget(String s, Node target) {		
		HashMap<String, Node> map = new HashMap<String, Node>();
		map.put(s, target);
		
		Node n = new Node();
		n.neighbors = map;
		return n;
	}
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mill;

/**
 *
 * @author Alex
 */
public class Mill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fabrika Fab = new Fabrika(); 
       Material glass = new Material("Стекло");
       Material plastic = new Material("Пластик");
       Material metal = new Material("Металл");
       Material tree = new Material("Дерево");
       Material paper = new Material("Бумага");
       System.out.println(glass.get());
       System.out.println(plastic.get());
       System.out.println(metal.get());
       System.out.println(tree.get());
       Fab.convert(glass);
       Fab.convert(plastic);
       Fab.convert(metal);
       Fab.convert(tree);
       System.out.println(glass.get());
       System.out.println(plastic.get());
       System.out.println(metal.get());
       System.out.println(tree.get());
       
    }
    
}

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
public class Fabrika {
  Fabrika(){
  }
  void convert(Material a){
      if (a.get() == "Стекло")
              a.set("Пластик");
      if (a.get() == "Дерево")
          a.set("Бумага");
//      if (a.get() == "Пластик") 
//          System.out.println("Нельзя преобразовать");
//      if (a.get() == "Металл")
//          System.out.println("Нельзя преобразовать");
          
  }
  
  
  
}

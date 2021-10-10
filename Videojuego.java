import java.util.*;
public class Videojuego {
    
   
 


public static List<String> grupos(List<String> lista1){
 List<String> lista2= new ArrayList<>();

   
   
    for (int i=0;i<lista1.size();i++){
    if (!lista2.contains(lista1.get(i))){ 
    lista2.add(lista1.get(i));
    
}
}
    
    return lista2;
 
        

     
}
public static List<Integer> necesito_del_grupo (List<Integer> lista1,List<String> lista2, String x){

List<Integer> lista3=new ArrayList<>();

List<Integer> lista4=new ArrayList<>();


    for (int i=0;i<lista2.size();i++){
    if (Objects.equals(x, lista2.get(i))){ 
    lista3.add(i);
    }
    }
    for (int j=0;j<lista1.size();j++){
    for (int n=0;n<lista3.size();n++){
    if (Objects.equals(lista3.get(n), lista1.get(j))){ 
    lista4.add(lista1.get(j));
    }
    }
    }

return lista4;


}
public static List<String> sirven_a_nestor(List<String> lista1,List<String>lista2){
  
 List<String>lista3=new ArrayList<>();
   
  for (int i=0;i<lista1.size();i++){
    if (!lista2.contains(lista1.get(i))){ 
    lista3.add(lista1.get(i));
     
    }
  }
  return lista3;
}

public static Integer cuantos_cambian(List<String>lista1,List<String>lista2){
int contador = 0;

    for (int i=0;i<lista1.size();i++){
    if (!lista2.contains(lista1.get(i))){ 
    contador++;
    
    }
    }
    
    int contador1 = 0;

    for (int i=0;i<lista2.size();i++){
    if (!lista1.contains(lista2.get(i))){ 
    contador1++;
    
    }
    }
    
    if (contador>contador1){
    return contador1;
}
else{
    return contador;
}
}

}

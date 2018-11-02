import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int s){
    super(s);
  }
  public T set(int x, T s){
    if (s==null){
      throw new IllegalArgumentException();
    }
    else{return super.set(x,s);}
  }
  public boolean add(T s){
    if(s==null){
      throw new IllegalArgumentException();
    }
    else{return super.add(s);}
  }

}

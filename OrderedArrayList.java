import java.util.ArrayList;
public class OrderedArrayList<T> extends NoNullArrayList<T>{
  public NoNullArrayList(){
      super();
    }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
    }
  public E set(int index, E element) {
    if (element == null) {
      throw new IllegalArgumentException();
      }
    return super.set(index, element);}

    }



}

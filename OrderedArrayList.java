import java.util.ArrayList;
public class OrderedArrayList<T> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");}
    for (int i = 0; i < size(); i++) {
      if (String.valueOf(value).compareTo(String.valueOf(this.get(i))) <= 0) {
       super.add(i, value);
       return true;}
     }
    super.add(0, value);
    return true;
 }
}

import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    int count = 0;
    for (int i = 0; i < this.size(); i++){
      if ((element.compareTo(this.get(i))) > 0){
        count = i + 1;
      }
    }
    super.add(count, element);
    return true;
  }
  public void add(int index, T element){
    add(element);
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    T returnValue = super.remove(index);
    add(element);
    return returnValue;
  }
}

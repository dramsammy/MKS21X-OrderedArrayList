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
    for (int i = 0; i < this.size(); i++){
      if ((element.compareTo(this.get(i))) > 0){
        super.add(i, element);
      }
      else {
        super.add(i-1,element);
    }
  }
    return super.add(element);
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

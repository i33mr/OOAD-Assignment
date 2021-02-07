import java.util.Comparator;

public class propertyComparatorByActive implements Comparator<Property>{
	public int compare(Property a, Property b)
    {
        return a.getPropertyActivationStatus().compareTo(b.getPropertyActivationStatus());
    }
}

package Java.Generic.Column;

import org.junit.Assert;
import org.junit.Test;

/**
 * Utility package
 */
public class Main {

    /**
     * Test that we can get the type of the column
     * We can't see if it's a string at runtime
     */
    @Test
    public void getClassTest() {
        Column<String> stringColumn = new Column<>(String.class);
        Assert.assertEquals("Type is equal",Column.class,stringColumn.getClass());
    }

    @Test
    public void getMaxTest() {
        Column<String> stringColumn = new Column<>(String.class);
        String max = ColumnUtilities.getMax(stringColumn);
        Assert.assertEquals("Value are equals","3",max);

        Column<Integer> integerColumn = new Column<>(Integer.class);
        Integer maxInteger = ColumnUtilities.getMax(integerColumn);
        Assert.assertEquals("Value are equals",(Integer) 3,maxInteger);

    }
}

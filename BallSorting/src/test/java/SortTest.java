import com.innowise.ballfactory.comparator.ColorComparator;
import com.innowise.ballfactory.comparator.SizeComparator;
import com.innowise.ballfactory.comparator.TypeComparator;
import com.innowise.ballfactory.comparator.WeightComparator;
import com.innowise.ballfactory.sorter.MergeSort;
import com.innowise.ballfactory.sorter.Sorter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;


class SortTest {
    private final Sorter sorter = new MergeSort();
    private final PreTestData preTestData = new PreTestData();

    @Test
    void quickSortMakesAscendingOrderByType() {
        assertIterableEquals(preTestData.getExpectedListSortedByType(), sorter.sort(new TypeComparator(), preTestData.getListToSort()));
    }

    @Test
    void quickSortMakesAscendingOrderByColor() {
        for (int i = 0; i < preTestData.getExpectedListSortedByColor().size(); i++) {
            assertEquals(preTestData.getExpectedListSortedByColor().get(i).getColor().ordinal(),
                    sorter.sort(new ColorComparator(), preTestData.getListToSort()).get(i).getColor().ordinal());
        }
    }

    @Test
    void quickSortMakesAscendingOrderBySize() {
        assertIterableEquals(preTestData.getExpectedListSortedBySize(), sorter.sort(new SizeComparator(), preTestData.getListToSort()));
    }

    @Test
    void quickSortMakesAscendingOrderByWeight() {
        assertIterableEquals(preTestData.getExpectedListSortedByWeight(), sorter.sort(new WeightComparator(), preTestData.getListToSort()));
    }
}
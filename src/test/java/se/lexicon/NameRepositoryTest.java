package se.lexicon;
import org.junit.Assert;
import org.junit.Test;

public class NameRepositoryTest {
    @Test
    public void GetSizeTest() {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        int actualSize = NameRepository.getSize();
        Assert.assertEquals(4, actualSize);
    }

    @Test
    public void SetNameTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String[] actualArray = NameRepository.findAll();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void ClearAnArrayTest()
    {
        String[] expectedArr = new String[0];
        NameRepository.clear();
        String[] actualArr = NameRepository.findAll();
        Assert.assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void FindAllFromArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String[] actualArray = NameRepository.findAll();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void FindFromAnArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String expectedName = "kerry space";
        String actualName = NameRepository.find("kerry space");
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void SetFullNameToAnArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String newName = "iswarya";
        NameRepository.setFullName(newName);
        String actualName = NameRepository.find(newName);
        Assert.assertEquals(newName, actualName);
    }

    @Test
    public void AddNameToAnArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String newName = "iswarya";
        boolean result = NameRepository.add(newName);
        Assert.assertTrue(result);
    }

    @Test
    public void FindByFirstNameToAnArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String[] expectedArr = {"sandra love"};
        String[] findArr = NameRepository.findByFirstName("sandra");
        Assert.assertArrayEquals(expectedArr, findArr);
    }

    @Test
    public void FindByLastNameToAnArrayTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String[] expectedArr = {"sandra love"};
        String[] findArr = NameRepository.findByLastName("love");
        Assert.assertArrayEquals(expectedArr, findArr);
    }

    @Test
    public void UpdateAnArrayReturnTrueTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String updatedName = "iswarya";
        boolean result = NameRepository.update("sandra love", updatedName);
        Assert.assertTrue(result);
    }

    @Test
    public void UpdateAnArrayReturnFalseTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String updatedName = "iswarya";
        boolean result = NameRepository.update("Mehred", updatedName);
        Assert.assertFalse(result);
    }

    @Test
    public void RemoveNameFromAnArrayReturnTrueTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String name = "amin aa";
        boolean result = NameRepository.remove(name);
        Assert.assertTrue(result);
    }

    @Test
    public void RemoveNameFromAnArrayReturnFalseTest()
    {
        String[] expectedArray = {"kerry space", "sandra love","amin aa", "wayne dr"};
        NameRepository.clear();
        NameRepository.setNames(expectedArray);
        String name = "iswarya";
        boolean result = NameRepository.remove(name);
        Assert.assertFalse(result);
    }

}

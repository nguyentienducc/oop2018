package week3;
import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    @Test
    public void Test() {


        // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(3,Week3.max(2,3));
        Assert.assertEquals(5,Week3.max(4,5));
        Assert.assertEquals(7,Week3.max(6,7));
        Assert.assertEquals(-2,Week3.max(-3,-2));
        Assert.assertEquals(-9,Week3.max(-17,-9));
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int arr1 [] = {4,5,6,7,8,9};
        int arr2 [] = {38,27,16,54,67};
        int arr3 [] = {1,3,7,34,87,65,23,83};
        int arr4 [] = {8,4,23,45,90,61,43};
        int arr5 [] = {22,33,44,55,66,77,88,99};
        Assert.assertEquals(4,Week3.minOfArray(arr1));
        Assert.assertEquals(16,Week3.minOfArray(arr2));
        Assert.assertEquals(1,Week3.minOfArray(arr3));
        Assert.assertEquals(4,Week3.minOfArray(arr4));
        Assert.assertEquals(22,Week3.minOfArray(arr5));
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        double weight1=50,height1=1.6,weight2=60,height2=1.55,weight3=55,height3=1.75,weight4=65,height4=1.68,weight5=45,height5=1.5;
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight1,height1)); //bmi=19.53
        Assert.assertEquals("Beo Phi",Week3.calculateBMI(weight2,height2)); //bmi=26.66
        Assert.assertEquals("Thieu Can",Week3.calculateBMI(weight3,height3)); //bmi=17.95
        Assert.assertEquals("Thua Can",Week3.calculateBMI(weight4,height4)); //bmi=23.03
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight5,height5)); //bmi=20
    }
}

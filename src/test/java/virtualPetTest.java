import org.junit.Assert;
import org.junit.Test;

public class virtualPetTest {
	
	VirtualPet flower = new VirtualPet(50, 50, 50);
	
	@Test
	public void shouldSubtractTenEvery3Actions() {
		boolean underTest = VirtualPet.isallowedaccess ("tick");
	
		Assert.assertEquals(true, underTest);

}
}

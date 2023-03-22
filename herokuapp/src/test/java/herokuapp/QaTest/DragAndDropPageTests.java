package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuDragAndDropPage;

public class DragAndDropPageTests extends BaseTest {
	
	
	@Test
	public void dragAndDropTest() throws IOException, InterruptedException{
		
		HeroKuDragAndDropPage heroKuDragAndDrop = herokuHomePage.goToDragAndDropPage();
		heroKuDragAndDrop.dragAndDropBtoA();
		Thread.sleep(3000);
		String currentColumAText = heroKuDragAndDrop.getFirstColumnText();
		System.out.print(currentColumAText);
		Assert.assertTrue(currentColumAText.equalsIgnoreCase("B"));
		
		
	}
		

}

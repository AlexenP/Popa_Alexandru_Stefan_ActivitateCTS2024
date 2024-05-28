package tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PachetTuristicTest;
import tests.PersoanaTest;
import tests.categories.CuMock;
import tests.categories.FaraMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {

}

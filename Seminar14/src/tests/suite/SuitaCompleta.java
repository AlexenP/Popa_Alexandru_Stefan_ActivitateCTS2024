package tests.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PachetTuristicTest;
import tests.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {
}

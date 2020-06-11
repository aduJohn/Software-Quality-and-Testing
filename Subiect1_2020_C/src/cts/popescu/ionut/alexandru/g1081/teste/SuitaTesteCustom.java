package cts.popescu.ionut.alexandru.g1081.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({InverseCalculValoareTVA.class,RightSetPret.class,BoundarySetPret.class})
@Categories.IncludeCategory(ICategorieTeste.class)
public class SuitaTesteCustom {
}

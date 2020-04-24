package teste;

import categorii.ICategorieTesteFun;
import categorii.ICategorieTesteNoFun;
import clase.Persoana;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({Persoana.class, PachetTuristicTest.class,AgentieTurismTest.class})
@Categories.IncludeCategory({ICategorieTesteNoFun.class})
public class SuitaTesteCustomNoFun {
}

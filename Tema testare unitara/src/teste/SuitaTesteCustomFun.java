package teste;

import categorii.ICategorieTesteFun;
import categorii.ICategorieTestePersoaneTinere;
import categorii.ICategorieTestePersoaneVarstnice;
import clase.Persoana;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({Persoana.class, PachetTuristicTest.class,AgentieTurismTest.class})
@Categories.IncludeCategory({ICategorieTesteFun.class})
public class SuitaTesteCustomFun {
}

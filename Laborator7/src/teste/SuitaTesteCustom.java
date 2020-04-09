package teste;

import categorii.ICategorieTestePersoaneTinere;
import categorii.ICategorieTestePersoaneVarstnice;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CheckCNPTest.class, PachetTuristicTest.class,GetVarstaTest.class})
//@Categories.IncludeCategory({ICategorieTestePersoaneTinere.class})
@Categories.ExcludeCategory({ICategorieTestePersoaneVarstnice.class})
public class SuitaTesteCustom {
}

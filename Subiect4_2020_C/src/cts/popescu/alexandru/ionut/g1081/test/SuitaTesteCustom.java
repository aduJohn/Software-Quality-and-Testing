package cts.popescu.alexandru.ionut.g1081.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.w3c.dom.ranges.Range;

@RunWith(Categories.class)
@Suite.SuiteClasses({ExistenceCalculValoareTVA.class, RangeSetPret.class,RightSetPret.class})
@Categories.IncludeCategory(ICategorieTeste.class)
public class SuitaTesteCustom {
}

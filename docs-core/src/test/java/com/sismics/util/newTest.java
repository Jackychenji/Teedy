package com.sismics.util;

import org.junit.Assert;
import org.junit.Test;
import java.util.Locale;

/**
 * Test of the LocaleUtil class.
 *
 * @author yourname
 */
public class newTest {

    @Test
    public void testGetLocale() {
        // Test with valid locale code
        Locale locale1 = LocaleUtil.getLocale("fr_FR");
        Assert.assertEquals(Locale.FRENCH, locale1.getLanguage());
        Assert.assertEquals(Locale.FRANCE, locale1.getCountry());

        // Test with locale code missing country
        Locale locale2 = LocaleUtil.getLocale("en");
        Assert.assertEquals(Locale.ENGLISH, locale2);

        // Test with locale code missing variant
        Locale locale3 = LocaleUtil.getLocale("de_DE");
        Assert.assertEquals(Locale.GERMAN, locale3.getLanguage());
        Assert.assertEquals(Locale.GERMANY, locale3.getCountry());
    }

    @Test
    public void testGetLocaleWithEmptyCode() {
        // Test with empty locale code
        Locale locale = LocaleUtil.getLocale("");
        Assert.assertEquals(Locale.ENGLISH, locale);
    }

    @Test
    public void testGetLocaleWithNullCode() {
        // Test with null locale code
        Locale locale = LocaleUtil.getLocale(null);
        Assert.assertEquals(Locale.ENGLISH, locale);
    }
}

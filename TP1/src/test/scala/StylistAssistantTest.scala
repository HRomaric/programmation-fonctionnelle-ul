package degrees

class StylistAssistantTest extends munit.FunSuite:
    
    test("shouldIWearAJacket(0) should be 'Wear a jacket'"):
        assertEquals(shouldIWearAJacket(0.0), "Wear a jacket")

    test("shouldIWearAJacket(100) should be 'Wear nothing'"):
        assertEquals(shouldIWearAJacket(100.0), "Wear nothing")

    test("shouldIWearAJacketDegreeOrFahrenheit(12.0, C) should be `Wear a jacket`"):
        assertEquals(shouldIWearAJacketDegreeOrFahrenheit(12.0, "C"), "Wear a jacket")

    test("shouldIWearAJacketDegreeOrFahrenheit(25.0, C) should be `Wear nothing`"):
        assertEquals(shouldIWearAJacketDegreeOrFahrenheit(25.0, "C"), "Wear nothing")

    test("shouldIWearAJacketDegreeOrFahrenheit(30.0, F) should be `Wear a jacket`"):
        assertEquals(shouldIWearAJacketDegreeOrFahrenheit(30.0, "F"), "Wear a jacket")

    test("shouldIWearAJacketDegreeOrFahrenheit(70.0, F) should be `Wear nothing`"):
        assertEquals(shouldIWearAJacketDegreeOrFahrenheit(70.0, "F"), "Wear nothing")

    test("shouldIWearAJacketDegreeOrFahrenheit(70.0, X) should be `Unknown unit`"):
        assertEquals(shouldIWearAJacketDegreeOrFahrenheit(25.0, "X"), "Unknown unit")


    test("shouldIWearAJacketWithThreshold(12.0, 30.0) should be `Yes`"):
        assertEquals(shouldIWearAJacketWithThreshold(12.0, 30.0), "Yes")

    test("shouldIWearAJacketWithThreshold(12.0, 10.0) should be `No`"):
        assertEquals(shouldIWearAJacketWithThreshold(12.0, 10.0), "No")
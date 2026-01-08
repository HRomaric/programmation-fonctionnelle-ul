package degrees

/*** Tells you what to wear today */
def shouldIWearAJacket(temperature: Double) : String = 
    if temperature < 20.0
        then "Wear a jacket"
        else "Wear nothing"

        
/*** Tells you what to wear today */
def shouldIWearAJacketDegreeOrFahrenheit(temperature: Double, unit: String) : String = 
    val tempCelsius = 
        if unit == "F" || unit == "f" then fahrenheitToCelsius(temperature)
        else temperature
    if unit == "F" || unit == "f" || unit == "fahrenheit" || unit == "C" || unit == "c" || unit == "celcius"
        then
            if tempCelsius < 20.0
                then "Wear a jacket"
                else "Wear nothing"
    else "Unknown unit"


/*** Tells you what to wear today with parametrizable threshold */
def shouldIWearAJacketWithThreshold(temperature: Double, threshold: Double) : String = 
  if temperature < threshold
    then "Yes"
    else "No"
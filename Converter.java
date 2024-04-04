
import java.util.*;
public class Converter
{
	public static void main(String[] args)
	{
		String country;
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country");
		country=sc.nextLine();
		System.out.println("Enter amount in Rupees");
		a=sc.nextDouble();
		switch(country)
		{
		case "USA":
			System.out.println((a*0.012)+" dollars");			
			break;
		case "UK":
			System.out.println((a*0.0094)+" Pounds");		
			break;		
		case "China":
			System.out.println((a*0.0876)+" Yaun");			
			break;
		case "Thailand":
			System.out.println((a*0.4255)+" Baht");
			break;
		case "Pakistan":
			System.out.println((a*3.5714)+" Pakistani Rupee");
			break;
		case"Japan":
			System.out.println((a*(1.75))+" Yen");
			break;
		case"South Korea":
			System.out.println((a*(16.13))+" won");
			break;
		case"Australia":
			System.out.println((a*0.0189)+" dollar");
			break;
		case "Indonesia":
		    System.out.println((a*185.19)+" Rupiah");
		    break;
		case "Vietnam":
			System.out.println((a*285.71)+" dong");
			break;
		case "Germany":
		    System.out.println((a*0.011)+" Euro");
		    break;
		case"Canada":
			System.out.println((a*0.0163)+" Dollar");
			break;
		case"France":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Brazil":
			System.out.println((a*0.06)+" Real");
			break;
		case"Bangladesh":
			System.out.println((a*1.32)+" Taka");
			break;
		case"Belgium":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Cuba":
			System.out.println((a*0.29)+" Peso");
			break;
		case"Greece":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Afghanistan":
			System.out.println((a*1.02)+" Afghani");
			break;
		case"Denmark":
			System.out.println((a*0.082)+" Krone");
			break;
		case"Bulgaria":
			System.out.println((a*0.022)+" Lev");
			break;
		case"Egypt":
			System.out.println((a*0.37)+" Pound");
			break;
		case"Hungary":
			System.out.println((a*4.30)+" Forint");
			break;
		case"Austria":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Poland":
			System.out.println((a*0.050)+" Zloty");
			break;
		case"Singapore":
			System.out.println((a*0.016)+" Dollar");
			break;
		case"Puerto rico":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"Malaysia":
			System.out.println((a*0.056)+" Ringgit");
			break;
		case"Peru":
			System.out.println((a*0.45)+" Sol");
			break;
		case"Turkey":
			System.out.println((a*0.31)+" lira");
			break;
		case"Iraq":
			System.out.println((a*15.86)+" Dinar");
			break;
		case"Iran":
			System.out.println((a*511.84)+" Rial");
			break;
		case"Syria":
			System.out.println((a*30.415)+" Pound");
			break;
		case"Oman":
			System.out.println((a*0.0047)+" Rial");
			break;
		case"Kazakhstan":
			System.out.println((a*5.64)+" Tenge");
			break;
		case"Uzbekistan":
			System.out.println((a*146.30)+" Som");
			break;
		case"Bhutan":
			System.out.println((a)+" Ngultrum");
			break;
		case"Myanmar":
			System.out.println((a*25.45)+" Kyat");
			break;
		case"Nepal":
			System.out.println((a*1.60)+" Rupee");
			break;
		case"Philippines":
			System.out.println((a*0.69)+" Peso");
			break;
		case"Sri Lanka":
			System.out.println((a*3.93)+" Rupee");
			break;
		case"Mongolia":
			System.out.println((a*41.794)+" Tugrik");
			break;
		case"New Zealand":
			System.out.println((a*0.021)+" Dollar");
			break;
		case"Russia":
			System.out.println((a*1.14)+" Ruble");
			break;
		case"Ukraine":
			System.out.println((a*0.45)+" hryvnia");
			break;
		case"Italy":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Spain":
			System.out.println((a*0.011)+"Euro");
			break;
		case"Portugal":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Ireland":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Norway":
			System.out.println((a*0.13)+" Krone");
			break;
		case"Switzerland":
			System.out.println((a*0.011)+" Franc");
			break;
		case"Luxembourg":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Finland":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Sweden":
			System.out.println((a*0.13)+" Krona");
			break;
		case"South Africa":
			System.out.println((a*0.23)+" Rand");
			break;
		case"Zimbabwe":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"North Macedonia":
			System.out.println((a*0.69)+" Denar");
			break;
		case"Bularia":
			System.out.println((a*0.022)+" Lev");
			break;
		case"Serbia":
			System.out.println((a*1.31)+" Dinar");
			break;
		case"Romania":
			System.out.println((a*0.055)+" Leu");
			break;
		case"Slovakia":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Georgia":
			System.out.println((a*0.032)+"Lari");
			break;
		case"Netherland":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Scotland":
			System.out.println((a*0.0096)+" sterling");
			break;
		case"Greenland":
			System.out.println((a*0.083)+" Krone");
			break;
		case"Iceland":
			System.out.println((a*1.60)+" Krona");
			break;
		case"Estonia":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Latvia":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Saudi Arabia":
			System.out.println((a*0.045)+" Riyal");
			break;
		case"United Arab Emirates":
			System.out.println((a*0.044)+" Dirham");
			break;
		case"Qatar":
			System.out.println((a*0.044)+" Riyal");
			break;
		case"Yemen":
			System.out.println((a*3.03)+" Rial");
			break;
		case"Sudan":
			System.out.println((a*7.28)+"pound");
			break;
		case"North Korea":
			System.out.println((a*10.90)+" Won");
			break;
		case"Hong Kong":
			System.out.println((a*0.095)+" Dollar");
			break;
		case"Taiwan":
			System.out.println((a*0.39)+" Dollar");
			break;
		case"Colombia":
			System.out.println((a*49.28)+" Peso");
			break;
		case"Mexico":
			System.out.println((a*0.20)+" Peso");
			break;
		case"Nigeria":
			System.out.println((a*9.15)+" Naira");
			break;
		case"Ethiopia":
			System.out.println((a*0.67)+" Birr");
			break;
		case"DR Congo":
			System.out.println((a*30.09)+" Franc");
			break;
		case"Tanzania":
			System.out.println((a*30.33)+" Shilling");
			break;
		case"Kenya":
			System.out.println((a*1.75)+" Shilling");
			break;
		case"Uganda":
			System.out.println((a*44.92)+" Shilling");
			break;
		case"Argentina":
			System.out.println((a*4.24)+" Peso");
			break;
		case"Algeria":
			System.out.println((a*1.65)+" Dinar");
			break;
		case"Morocco":
			System.out.println((a*0.12)+" Dirham");
			break;
		case"Angola":
			System.out.println((a*10.01)+" Kwanza");
			break;
		case"Ghana":
			System.out.println((a*0.14)+" Cedi");
			break;
		case"Mozambique":
			System.out.println((a*0.77)+" metical");
			break;
		case"Madagascar":
			System.out.println((a*54.18)+" Ariary");
			break;
		case"Togo":
			System.out.println((a*7.3183)+" Franc");
			break;
		case"Chile":
			System.out.println((a*10.35)+" Peso");
			break;
		case"Jordan":
			System.out.println((a*0.0086)+" Dinar");
			break;
		case"Laos":
			System.out.println((a*234.51)+" Kip");
			break;
		case"Congo":
			System.out.println((a*30.09)+" Franc");
			break;
		case"Costa Rica":
			System.out.println((a*6.53)+" Colon");
			break;
		case"Albania":
			System.out.println((a*1.20)+" Lek");
			break;
		case"Andorra":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Antigua and Barbuda":
			System.out.println((a*0.033)+" East Caribbean");
			break;
		case"Armenia":
			System.out.println((a*4.64)+" Dram");
			break;
		case"Azerbaijan":
			System.out.println((a*0.020)+" Manat");
			break;
		case"The Bahamas":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"Bahrain":
			System.out.println((a*0.0045)+" Dinar");
			break;
		case"Barbados":
			System.out.println((a*0.024)+" Dollar");
			break;
		case"Belarus":
			System.out.println((a*0.030)+" Ruble");
			break;
		case"Belize":
			System.out.println((a*0.024)+" Dollar");
			break;
		case"Benin":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Bolivia":
			System.out.println((a*0.083)+" boliviano");
			break;
		case"Botswana":
			System.out.println((a*0.16)+" Pula");
			break;
		case"Brunei":
			System.out.println((a*0.016)+" Dollar");
			break;
		case"Burkina Faso":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Burundi":
			System.out.println((a*34.29)+" franc");
			break;
		case"Combodia":
			System.out.println((a*49.92)+" riel");
			break;
		case"Cameroon":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Cape Verde":
			System.out.println((a*1.24)+" Escudo");
			break;
		case"Central African Republic":
			System.out.println((a*7.37)+" CFA");
			break;
		case"Chad":
			System.out.println((a*7.37)+" CFA");
			break;
		case"Comoros":
			System.out.println((a*5.54)+" Franc");
			break;
		case"Cote d'Ivoire":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Croatia":
			System.out.println((a*0.085)+" Kuna");
			break;
		case"Cyprus":
			System.out.println((a*0.011)+" Euro");
			break;
		case"Czech Republic":
			System.out.println((a*3.70)+" Koruna");
			break;
		case"Djibouti":
			System.out.println((a*2.14)+" Franc");
			break;
		case"Dominica":
			System.out.println((a*0.033)+" East Caribbean");
			break;
		case"Dominican Republic":
			System.out.println((a*0.68)+" Peso");
			break;
		case"East Timor":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"Ecuador":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"EI Salvador":
			System.out.println((a*0.11)+" Colon");
			break;
		case"Venezuela":
			System.out.println((a*0.40)+" Bolivares");
			break;
		case"Niger":
			System.out.println((a*9.50)+" Naira");
			break;
		case"Mali":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Malawi":
			System.out.println((a*13.11)+" Kwacha");
			break;
		case"Zambia":
			System.out.println((a*0.25)+" Kwacha");
			break;
		case"Somalia":
			System.out.println((a*0.012)+" Dollar");
			break;
		case"Guatemala":
			System.out.println((a*0.095)+" Quetzal");
			break;
		case"Senegal":
			System.out.println((a*7.1428)+" franc");
			break;
		case"Guinea":
			System.out.println((a*103.09)+" Franc");
			break;
		case"Rwanda":
			System.out.println((a*14.44)+" Franc");
			break;
		case"Tunisia":
			System.out.println((a*0.038)+" Dinar");
			break;
		case"Haiti":
			System.out.println((a*1.62)+" Gourde");
			break;
		case"South Sudan":
			System.out.println((a*7.23)+" Pound");
			break;
		case"Honduras":
			System.out.println((a*0.30)+" Lempira");
			break;
		case"Papua New Guinea":
			System.out.println((a*0.043)+" Kina");
			break;
		case"Tajikistan":
			System.out.println((a*0.13)+" Somoni");
			break;
		case"Israel":
			System.out.println((a*0.046)+" New Shekel");
			break;
		case"Sierra Leone":
			System.out.println((a*237.59)+" Leone");
			break;
		case"Nicaragua":
			System.out.println((a*0.44)+" Cordoba");
			break;
		case"Libya":
			System.out.println((a*0.058)+" Dinar");
			break;
		case"Paraguay":
			System.out.println((a*87.36)+" Guarani");
			break;
		case"Kyrgyzstan":
			System.out.println((a*1.06)+" Som");
			break;
		case"Turkmenistan":
			System.out.println((a*0.042)+" Manat");
			break;
		case"EL Salvador":
			System.out.println((a*0.11)+" Colon");
			break;
		case"Liberia":
			System.out.println((a*2.24)+" Dollar");
			break;
		case"State of Palestine":
			System.out.println((a*0.046)+" New Shekel");
			break;
		case"Lebanon":
			System.out.println((a*180.97)+" Pound");
			break;
		case"Mauritania":
			System.out.println((a*0.46)+" Ouguiya");
			break;
		case"Panama":
			System.out.println((a*0.012)+" Balboa");
			break;
		case"Kuwait":
			System.out.println((a*0.0037)+" Dinar");
			break;
		case"Eritrea":
			System.out.println((a*0.18)+" Nakfa");
			break;
		case"Moldova":
			System.out.println((a*0.22)+" Leu");
			break;
		case"Uruguay":
			System.out.println((a*0.46)+" Peso");
			break;
		case"Bosnia and Herzegovina":
			System.out.println((a*0.02)+"Marka");
			break;
		case"Jamaica":
			System.out.println((a*1.86)+" Dollar");
			break;
			default:
				System.out.println("Invalid case");
		}
	
	}

}

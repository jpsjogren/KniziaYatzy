package program;

public class GameRules {

	public static void howToPLay() {

		System.out.println(
"Man börjar alltid med att bestämma vilken spelare som ska börja.\r\n" +
"Det sker genom att man tar en tärning som varje spelare får slå.\r\n" +
"Den spelare som slår högst börjar och sedan går man medurs oavsett\r\n" +
"hur höga tal de andra spelarna fått på tärningen.\r\n" +
"\r\n" +
"När det är en spelares tur tar denne alla fem tärningarna i en hand och\r\n" +
"slår dem. Det gäller sedan att se vilka prickar tärningarna visar för\r\n" +
"att få en hög poäng. Det är värt att komma ihåg att spelaren vid\r\n" +
"varje tur har tre slag på sig att få ett så bra resultat som möjligt.\r\n" +
"\r\n" +
"Slagen får inte sparas om spelaren till exempel bara använder ett slag.\r\n" +
"\r\n" +
"När spelaren har slagit en gång bestämmer denne om några tärningar\r\n" +
"ska sparas under nästa slag eller om alla tärningar ska slås om. Så\r\n" +
"sker under spelarens samtliga tre kast.\r\n" +
"\r\n" +
"När en spelare har kastat eller slagit tärningarna tre gånger förs\r\n" +
"resultatet in i blocket.\r\n" +
"\r\n" +
"Man behöver inte följa ordningen som de olika slagen står i på blocket.\r\n" +
"");

	}

	public static void protocolUpperPart() {

		System.out.println(
"Den övre delen av protokollet innehåller ettor, tvåor, treor, fyror,\r\n" +
"femmor och sexor. Det handlar om att spelaren ska få så många som\r\n" +
"möjligt av var och en av de här siffrorna.\r\n" +
"\r\n" +
"Spelaren får till exempel tre slag på sig att få så många fyror\r\n" +
"som möjligt. Resultatet skrivs sedan in i protokollet.\r\n" +
"\r\n" +
"Turen går sedan vidare till nästa person.\r\n" +
"\r\n" +
"När den första spelaren får tärningarna igen får denne tre nya slag\r\n" +
"på sig att försöka få ettor eller något annat.\r\n" +
"");
	}

	public static void bonus() {
		System.out.println(
"Efter att den första delen av protokollet har blivit fyllt räknar man\r\n" +
"ihop hur många poäng varje spelare har fått och summan skrivs sedan\r\n" +
"in i protokollet.\r\n" +
"\r\n" +
"Efter det gäller det att kolla om någon spelare har lyckats få bonus.\r\n" +
"Den maximala summan att få på den övre delen av protokollet är 105 poäng.\r\n" +
"\r\n" +
"Om spelaren har fått mer än 63 poäng på den övre delen av protokollet\r\n" +
"får denne en bonus. Den här bonusen är på 50 poäng. Det är sedan\r\n" +
"dags att gå vidare till protokollets undre del. Där blir det lite\r\n" +
"klurigare.\r\n" +
"");
	}

	public static void protocolDownPart() {

		System.out.println(
"I den nedre delen av protokollet handlar det inte längre om att spelaren\r\n" +
"ska få flest av en viss siffra. Här blir kombinationerna istället\r\n" +
"rejält viktiga. Här finns också en del konstiga termer som vi kommer\r\n" +
"att förklara närmare här.\r\n" +
"\r\n" +
"För det första finns basala termer som ett och två par. Det handlar\r\n" +
"helt enkelt om att spelaren bland de fem tärningarna ska få minst ett\r\n" +
"par, alternativt två par.\r\n" +
"\r\n" +
"Det innebär att spelaren ska få till exempel två treor för ett\r\n" +
"par. För två par kan spelaren få två fyror och två femmor.\r\n" +
"\r\n" +
"Det ska dock påpekas att ju högre siffror tärningarna visar, desto\r\n" +
"högre blir poängen. Två femmor ger till exempel tio poäng på ett par,\r\n" +
"medan två ettor bara ger två poäng.\r\n" +
"");
	}

	public static void threesAndFoursome() {

		System.out.println(
"Termerna tretal och fyrtal är inte heller så svåra att förstå. Man\r\n" +
"ska som spelare vid ett tretal helt enkelt få tre likadana tärningar.\r\n" +
"Vid ett fyrtal krävs fyra likadana sådana.\r\n" +
"\r\n" +
"Även här har antalet prickar på tärningarna betydelse. Ett tretal\r\n" +
"med sexor ger till exempel högre poäng än ett med tvåor. Samma sak\r\n" +
"gäller för fyrtal. Men sedan kommer de något mer komplicerade momenten.\r\n" +
"");
	}

	public static void laddersOrStraightFlush() {

		System.out.println(
"Liten och stor straight kan också kallas för liten samt stor stege.\r\n" +
"Här handlar det om att spelaren ska få alla fem tärningar att visa\r\n" +
"en stege. Det kan vara lite klurigt.\r\n" +
"\r\n" +
"I en liten straight ska tärningarna visa en etta, en tvåa, en trea,\r\n" +
"en fyra samt en femma.\r\n" +
"\r\n" +
"I en stor straight ska tärningarna istället visa siffrorna två till\r\n" +
"sex. Även med tre slag kan det vara lite klurigt att få tärningarna\r\n" +
"att visa rätt. En liten straight ger 15 poäng, och en stor ger 20.\r\n" +
"");
	}

	public static void fullHouse() {

		System.out.println(
"Även i en kåk måste spelets alla fem tärningar visa rätt symboler\r\n" +
"för att spelaren ska få poäng. Här ska spelaren få två tärningar\r\n" +
"att visa en siffra, medan de andra tre ska visa en annan.\r\n" +
"\r\n" +
"Poängen beror på vilka siffror tärningarna visar. Den bästa kåken\r\n" +
"spelaren kan få består av tre sexor och två femmor. Den ger 28 poäng.\r\n" +
"");
	}

	public static void chance() {

		System.out.println(
"När spelaren slår tärningarna finns det alltid en risk att denne\r\n" +
"inte kan få in slagen under en lämplig rubrik. Kanske slår spelaren\r\n" +
"en kåk när denne redan har haft en sådan.\r\n" +
"\r\n" +
"Då finns fältet chans. Här räknas prickarna på alla fem tärningarna\r\n" +
"samman. Maxsumman på chansen är 30 och den summan får spelaren genom\r\n" +
"att slå fem sexor.\r\n" +
"\r\n" +
"Det sker dock inte fullt så ofta. Det är viktigt att komma ihåg\r\n" +
"att spelaren inte får använda chansfältet innan den övre delen av\r\n" +
"protokollet är färdigspelad.\r\n" +
"\r\n" +
"Efter det kan dock spelaren använda fältet precis när denne\r\n" +
"vill. Många gånger är det ett sätt att slippa stryka något.\r\n" +
"");
	}

	public static void yatzy() {

		System.out.println(
"Fältet spelet har fått sitt namn av. En Yatzy ger alltid 50 poäng.\r\n" +
"Det handlar om att spelaren lyckas få alla fem tärningar att visa\r\n" +
"samma siffra.\r\n" +
"\r\n" +
"Oavsett om tärningarna visar fem ettor eller fem sexor är det 50 poäng\r\n" +
"som gäller. Även när det gäller Yatzy har spelaren tre slag på sig.\r\n" +
"");
	}

}

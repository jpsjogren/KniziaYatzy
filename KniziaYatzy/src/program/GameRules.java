package program;

public class GameRules {
	
	public static void howToPLay() {
		
		System.out.println("Man börjar alltid med att bestämma vilken spelare som ska börja. Det sker genom att man tar en tärning som varje spelare får slå. Den spelare som slår högst börjar och sedan går man medurs oavsett hur höga tal de andra spelarna fått på tärningen.\r\n" + 
				"\r\n" + 
				"När det är en spelares tur tar denne alla fem tärningarna i en hand och slår dem. Det gäller sedan att se vilka prickar tärningarna visar för att få en hög poäng. Det är värt att komma ihåg att spelaren vid varje tur har tre slag på sig att få ett så bra resultat som möjligt.\r\n" + 
				"\r\n" + 
				"Slagen får inte sparas om spelaren till exempel bara använder ett slag. När spelaren har slagit en gång bestämmer denne om några tärningar ska sparas under nästa slag eller om alla tärningar ska slås om. Så sker under spelarens samtliga tre kast.\r\n" + 
				"\r\n" + 
				"När en spelare har kastat eller slagit tärningarna tre gånger förs resultatet in i blocket. Om spelaren inte lyckas få någon korrekt kombination kan något också strykas.\r\n" + 
				"\r\n" + 
				"Man behöver inte följa ordningen som de olika slagen står i på blocket. Det ska dock påminnas om att spelarna först ska fylla den övre delen av protokollet innan den nedre delen påbörjas.");	

	}
	
	public static void protocolUpperPart() {
		
		System.out.println("Den övre delen av protokollet innehåller ettor, tvåor, treor, fyror, femmor och sexor. Det handlar om att spelaren ska få så många som möjligt av var och en av de här siffrorna.\r\n" + 
				"\r\n" + 
				"Spelaren får till exempel tre slag på sig att få så många fyror som möjligt. Om spelaren inte får några måste denne stryka något annat. Om flera fyror fås skrivs de in i protokollet.\r\n" + 
				"\r\n" + 
				"Turen går sedan vidare till nästa person. När den första spelaren får tärningarna igen får denne tre nya slag på sig att försöka få ettor eller något annat.");
	}
	
	public static void bonus() {
		System.out.println("Efter att den första delen av protokollet har blivit fyllt räknar man ihop hur många poäng varje spelare har fått och summan skrivs sedan in i protokollet.\r\n" + 
				"\r\n" + 
				"Efter det gäller det att kolla om någon spelare har lyckats få bonus. Den maximala summan att få på den övre delen av protokollet är 105 poäng.\r\n" + 
				"\r\n" + 
				"Om spelaren har fått mer än 63 poäng på den övre delen av protokollet får denne en bonus. Den här bonusen är på 50 poäng. Det är sedan dags att gå vidare till protokollets undre del. Där blir det lite klurigare.");
	}
	
	public static void protocolDownPart() {
		
		System.out.println("I den nedre delen av protokollet handlar det inte längre om att spelaren ska få flest av en viss siffra. Här blir kombinationerna istället rejält viktiga. Här finns också en del konstiga termer som vi kommer att förklara närmare här.\r\n" + 
				"\r\n" + 
				"För det första finns basala termer som ett och två par. Det handlar helt enkelt om att spelaren bland de fem tärningarna ska få minst ett par, alternativt två par.\r\n" + 
				"\r\n" + 
				"Det innebär att spelaren ska få till exempel två treor för ett par. För två par kan spelaren få två fyror och två femmor.\r\n" + 
				"\r\n" + 
				"Det ska dock påpekas att ju högre siffror tärningarna visar, desto högre blir poängen. Två femmor ger till exempel tio poäng på ett par, medan två ettor bara ger två poäng.");
	}
	
	public static void threesAndFoursome() {
		
		System.out.println("Termerna tretal och fyrtal är inte heller så svåra att förstå. Man ska som spelare vid ett tretal helt enkelt få tre likadana tärningar. Vid ett fyrtal krävs fyra likadana sådana.\r\n" + 
				"\r\n" + 
				"Även här har antalet prickar på tärningarna betydelse. Ett tretal med sexor ger till exempel högre poäng än ett med tvåor. Samma sak gäller för fyrtal. Men sedan kommer de något mer komplicerade momenten.");
	}
	
	public static void laddersOrStraightFlush() {
		
		System.out.println("Liten och stor straight kan också kallas för liten samt stor stege. Här handlar det om att spelaren ska få alla fem tärningar att visa en stege. Det kan vara lite klurigt.\r\n" + 
				"\r\n" + 
				"I en liten straight ska tärningarna visa en etta, en tvåa, en trea, en fyra samt en femma.\r\n" + 
				"\r\n" + 
				"I en stor straight ska tärningarna istället visa siffrorna två till sex. Även med tre slag kan det vara lite klurigt att få tärningarna att visa rätt. En liten straight ger 15 poäng, och en stor ger 20.");
	}
	
	public static void fullHouse() {
		
		System.out.println("Även i en kåk måste spelets alla fem tärningar visa rätt symboler för att spelaren ska få poäng. Här ska spelaren få två tärningar att visa en siffra, medan de andra tre ska visa en annan.\r\n" + 
				"\r\n" + 
				"Poängen beror på vilka siffror tärningarna visar. Den bästa kåken spelaren kan få består av tre sexor och två femmor. Den ger 28 poäng.");
	}
	
	public static void chance() {
		
		System.out.println("När spelaren slår tärningarna finns det alltid en risk att denne inte kan få in slagen under en lämplig rubrik. Kanske slår spelaren en kåk när denne redan har haft en sådan.\r\n" + 
				"\r\n" + 
				"Då finns fältet chans. Här räknas prickarna på alla fem tärningarna samman. Maxsumman på chansen är 30 och den summan får spelaren genom att slå fem sexor.\r\n" + 
				"\r\n" + 
				"Det sker dock inte fullt så ofta. Det är viktigt att komma ihåg att spelaren inte får använda chansfältet innan den övre delen av protokollet är färdigspelad.\r\n" + 
				"\r\n" + 
				"Efter det kan dock spelaren använda fältet precis när denne vill. Många gånger är det ett sätt att slippa stryka något.");
	}
	
	public static void yatzy() {
		
		System.out.println("Fältet spelet har fått sitt namn av. En Yatzy ger alltid 50 poäng. Det handlar om att spelaren lyckas få alla fem tärningar att visa samma siffra.\r\n" + 
				"\r\n" + 
				"Oavsett om tärningarna visar fem ettor eller fem sexor är det 50 poäng som gäller. Även när det gäller Yatzy har spelaren tre slag på sig.");
	}
	
	public static void cross() {
		
		System.out.println("Om spelaren inte lyckas få ett bra resultat eller om denne inte kan få in resultatet någonstans återstår det att stryka.\r\n" + 
				"\r\n" + 
				"Spelaren får bara stryka på den halva av protokollet som spelas. En bonus kan dock inte strykas.");
	}

}

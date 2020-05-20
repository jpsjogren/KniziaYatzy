package program;

public class GameRules {
	
	public static void howToPLay() {
		
		System.out.println("Man b�rjar alltid med att best�mma vilken spelare som ska b�rja. Det sker genom att man tar en t�rning som varje spelare f�r sl�. Den spelare som sl�r h�gst b�rjar och sedan g�r man medurs oavsett hur h�ga tal de andra spelarna f�tt p� t�rningen.\r\n" + 
				"\r\n" + 
				"N�r det �r en spelares tur tar denne alla fem t�rningarna i en hand och sl�r dem. Det g�ller sedan att se vilka prickar t�rningarna visar f�r att f� en h�g po�ng. Det �r v�rt att komma ih�g att spelaren vid varje tur har tre slag p� sig att f� ett s� bra resultat som m�jligt.\r\n" + 
				"\r\n" + 
				"Slagen f�r inte sparas om spelaren till exempel bara anv�nder ett slag. N�r spelaren har slagit en g�ng best�mmer denne om n�gra t�rningar ska sparas under n�sta slag eller om alla t�rningar ska sl�s om. S� sker under spelarens samtliga tre kast.\r\n" + 
				"\r\n" + 
				"N�r en spelare har kastat eller slagit t�rningarna tre g�nger f�rs resultatet in i blocket. Om spelaren inte lyckas f� n�gon korrekt kombination kan n�got ocks� strykas.\r\n" + 
				"\r\n" + 
				"Man beh�ver inte f�lja ordningen som de olika slagen st�r i p� blocket. Det ska dock p�minnas om att spelarna f�rst ska fylla den �vre delen av protokollet innan den nedre delen p�b�rjas.");	

	}
	
	public static void protocolUpperPart() {
		
		System.out.println("Den �vre delen av protokollet inneh�ller ettor, tv�or, treor, fyror, femmor och sexor. Det handlar om att spelaren ska f� s� m�nga som m�jligt av var och en av de h�r siffrorna.\r\n" + 
				"\r\n" + 
				"Spelaren f�r till exempel tre slag p� sig att f� s� m�nga fyror som m�jligt. Om spelaren inte f�r n�gra m�ste denne stryka n�got annat. Om flera fyror f�s skrivs de in i protokollet.\r\n" + 
				"\r\n" + 
				"Turen g�r sedan vidare till n�sta person. N�r den f�rsta spelaren f�r t�rningarna igen f�r denne tre nya slag p� sig att f�rs�ka f� ettor eller n�got annat.");
	}
	
	public static void bonus() {
		System.out.println("Efter att den f�rsta delen av protokollet har blivit fyllt r�knar man ihop hur m�nga po�ng varje spelare har f�tt och summan skrivs sedan in i protokollet.\r\n" + 
				"\r\n" + 
				"Efter det g�ller det att kolla om n�gon spelare har lyckats f� bonus. Den maximala summan att f� p� den �vre delen av protokollet �r 105 po�ng.\r\n" + 
				"\r\n" + 
				"Om spelaren har f�tt mer �n 63 po�ng p� den �vre delen av protokollet f�r denne en bonus. Den h�r bonusen �r p� 50 po�ng. Det �r sedan dags att g� vidare till protokollets undre del. D�r blir det lite klurigare.");
	}
	
	public static void protocolDownPart() {
		
		System.out.println("I den nedre delen av protokollet handlar det inte l�ngre om att spelaren ska f� flest av en viss siffra. H�r blir kombinationerna ist�llet rej�lt viktiga. H�r finns ocks� en del konstiga termer som vi kommer att f�rklara n�rmare h�r.\r\n" + 
				"\r\n" + 
				"F�r det f�rsta finns basala termer som ett och tv� par. Det handlar helt enkelt om att spelaren bland de fem t�rningarna ska f� minst ett par, alternativt tv� par.\r\n" + 
				"\r\n" + 
				"Det inneb�r att spelaren ska f� till exempel tv� treor f�r ett par. F�r tv� par kan spelaren f� tv� fyror och tv� femmor.\r\n" + 
				"\r\n" + 
				"Det ska dock p�pekas att ju h�gre siffror t�rningarna visar, desto h�gre blir po�ngen. Tv� femmor ger till exempel tio po�ng p� ett par, medan tv� ettor bara ger tv� po�ng.");
	}
	
	public static void threesAndFoursome() {
		
		System.out.println("Termerna tretal och fyrtal �r inte heller s� sv�ra att f�rst�. Man ska som spelare vid ett tretal helt enkelt f� tre likadana t�rningar. Vid ett fyrtal kr�vs fyra likadana s�dana.\r\n" + 
				"\r\n" + 
				"�ven h�r har antalet prickar p� t�rningarna betydelse. Ett tretal med sexor ger till exempel h�gre po�ng �n ett med tv�or. Samma sak g�ller f�r fyrtal. Men sedan kommer de n�got mer komplicerade momenten.");
	}
	
	public static void laddersOrStraightFlush() {
		
		System.out.println("Liten och stor straight kan ocks� kallas f�r liten samt stor stege. H�r handlar det om att spelaren ska f� alla fem t�rningar att visa en stege. Det kan vara lite klurigt.\r\n" + 
				"\r\n" + 
				"I en liten straight ska t�rningarna visa en etta, en tv�a, en trea, en fyra samt en femma.\r\n" + 
				"\r\n" + 
				"I en stor straight ska t�rningarna ist�llet visa siffrorna tv� till sex. �ven med tre slag kan det vara lite klurigt att f� t�rningarna att visa r�tt. En liten straight ger 15 po�ng, och en stor ger 20.");
	}
	
	public static void fullHouse() {
		
		System.out.println("�ven i en k�k m�ste spelets alla fem t�rningar visa r�tt symboler f�r att spelaren ska f� po�ng. H�r ska spelaren f� tv� t�rningar att visa en siffra, medan de andra tre ska visa en annan.\r\n" + 
				"\r\n" + 
				"Po�ngen beror p� vilka siffror t�rningarna visar. Den b�sta k�ken spelaren kan f� best�r av tre sexor och tv� femmor. Den ger 28 po�ng.");
	}
	
	public static void chance() {
		
		System.out.println("N�r spelaren sl�r t�rningarna finns det alltid en risk att denne inte kan f� in slagen under en l�mplig rubrik. Kanske sl�r spelaren en k�k n�r denne redan har haft en s�dan.\r\n" + 
				"\r\n" + 
				"D� finns f�ltet chans. H�r r�knas prickarna p� alla fem t�rningarna samman. Maxsumman p� chansen �r 30 och den summan f�r spelaren genom att sl� fem sexor.\r\n" + 
				"\r\n" + 
				"Det sker dock inte fullt s� ofta. Det �r viktigt att komma ih�g att spelaren inte f�r anv�nda chansf�ltet innan den �vre delen av protokollet �r f�rdigspelad.\r\n" + 
				"\r\n" + 
				"Efter det kan dock spelaren anv�nda f�ltet precis n�r denne vill. M�nga g�nger �r det ett s�tt att slippa stryka n�got.");
	}
	
	public static void yatzy() {
		
		System.out.println("F�ltet spelet har f�tt sitt namn av. En Yatzy ger alltid 50 po�ng. Det handlar om att spelaren lyckas f� alla fem t�rningar att visa samma siffra.\r\n" + 
				"\r\n" + 
				"Oavsett om t�rningarna visar fem ettor eller fem sexor �r det 50 po�ng som g�ller. �ven n�r det g�ller Yatzy har spelaren tre slag p� sig.");
	}
	
	public static void cross() {
		
		System.out.println("Om spelaren inte lyckas f� ett bra resultat eller om denne inte kan f� in resultatet n�gonstans �terst�r det att stryka.\r\n" + 
				"\r\n" + 
				"Spelaren f�r bara stryka p� den halva av protokollet som spelas. En bonus kan dock inte strykas.");
	}

}

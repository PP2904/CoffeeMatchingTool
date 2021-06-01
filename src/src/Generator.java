package src;
/* Copyright (C) Peter Pfrommer (2021)
* Paul Youssef, danke für deine Hilfe! (23.3.21)
*/
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
//IDEAS: Excel Liste auslesen mit beliebiger Länge an Namen; Dann je nach Länge der Liste alles anpassen (random number gen, Länge der Listen, etc.)
public class Generator {
static List<Trainee> allTrainees;
static List<Pair<String, String>> pairList;
public static void oldDates() {
pairList = new ArrayList<Pair<String, String>>();
pairList.add(new Pair<String, String>("Shabnam", "Tu"));
//pairList.add(new Pair<String, String>("Anna", "Paul"));
pairList.add(new Pair<String, String>("Mehdi", "Nico"));
pairList.add(new Pair<String, String>("Julian", "Mouheb"));
pairList.add(new Pair<String, String>("Florian B.", "Miguel"));
pairList.add(new Pair<String, String>("Sohal", "Michaela"));
pairList.add(new Pair<String, String>("Janne Philine", "Matias"));
pairList.add(new Pair<String, String>("Dominik", "Marcel"));
pairList.add(new Pair<String, String>("Peter", "Wildcard"));
pairList.add(new Pair<String, String>("Tobias", "Florian S."));
pairList.add(new Pair<String, String>("Alex", "Fabrizio"));
pairList.add(new Pair<String, String>("Clara", "Eugen"));
pairList.add(new Pair<String, String>("Shabnam", "Florian S."));
pairList.add(new Pair<String, String>("Anna", "Fabrizio"));
pairList.add(new Pair<String, String>("Mehdi", "Eugen"));
pairList.add(new Pair<String, String>("Julian", "Marcel"));
pairList.add(new Pair<String, String>("Florian B.", "Matias"));
pairList.add(new Pair<String, String>("Sohal", "Wildcard"));
pairList.add(new Pair<String, String>("Janne Philine", "Miguel"));
pairList.add(new Pair<String, String>("Dominik", "Mouheb"));
pairList.add(new Pair<String, String>("Peter", "Niko"));
//pairList.add(new Pair<String, String>("Tobias", "Paul"));
pairList.add(new Pair<String, String>("Alex", "Tu"));
pairList.add(new Pair<String, String>("Clara", "Michaela"));
pairList.add(new Pair<String, String>("Julian", "Tu"));
//pairList.add(new Pair<String, String>("Clara", "Paul"));
pairList.add(new Pair<String, String>("Mehdi", "Miguel"));
pairList.add(new Pair<String, String>("Alex", "Mouheb"));
pairList.add(new Pair<String, String>("Anna", "Niko"));
pairList.add(new Pair<String, String>("Tobias", "Michaela"));
pairList.add(new Pair<String, String>("Dominik", "Florian S."));
pairList.add(new Pair<String, String>("Florian B.", "Marcel"));
pairList.add(new Pair<String, String>("Peter", "Sohal"));
pairList.add(new Pair<String, String>("Shabnam", "Fabrizio"));
pairList.add(new Pair<String, String>("Janne Philine", "Eugen"));
pairList.add(new Pair<String, String>("Matias", "Wildcard"));
pairList.add(new Pair<String, String>("Julian", "Niko"));
pairList.add(new Pair<String, String>("Clara", "Marcel"));
//pairList.add(new Pair<String, String>("Mehdi", "Paul"));
pairList.add(new Pair<String, String>("Alex", "Michaela"));
pairList.add(new Pair<String, String>("Anna", "Matias"));
pairList.add(new Pair<String, String>("Tobias", "Tu"));
pairList.add(new Pair<String, String>("Dominik", "Wildcard"));
pairList.add(new Pair<String, String>("Florian B.", "Florian S."));
pairList.add(new Pair<String, String>("Peter", "Mouheb"));
pairList.add(new Pair<String, String>("Shabnam", "Miguel"));
pairList.add(new Pair<String, String>("Janne Philine", "Fabrizio"));
pairList.add(new Pair<String, String>("Sohal", "Eugen"));
pairList.add(new Pair<String, String>("Julian", "Eugen"));
pairList.add(new Pair<String, String>("Clara", "Fabrizio"));
pairList.add(new Pair<String, String>("Mehdi", "Florian S."));
pairList.add(new Pair<String, String>("Alex", "Matias"));
pairList.add(new Pair<String, String>("Anna", "Tu"));
pairList.add(new Pair<String, String>("Tobias", "Miguel"));
pairList.add(new Pair<String, String>("Dominik", "Michaela"));
pairList.add(new Pair<String, String>("Florian B.", "Mouheb"));
pairList.add(new Pair<String, String>("Peter", "Niko"));
//pairList.add(new Pair<String, String>("Shabnam", "Paul"));
pairList.add(new Pair<String, String>("Janne Philine", "Marcel"));
pairList.add(new Pair<String, String>("Peter", "Wildcard"));
pairList.add(new Pair<String, String>("Tobias", "Sohal"));
pairList.add(new Pair<String, String>("Shabnam", "Peter"));
pairList.add(new Pair<String, String>("Anna", "Miguel"));
pairList.add(new Pair<String, String>("Clara", "Mehdi"));
//pairList.add(new Pair<String, String>("Dominik", "Paul"));
pairList.add(new Pair<String, String>("Florian B.", "Julian"));
pairList.add(new Pair<String, String>("Tu", "Janne Philine"));
pairList.add(new Pair<String, String>("Marcel", "Florian S."));
pairList.add(new Pair<String, String>("Matias", "Fabrizio"));
pairList.add(new Pair<String, String>("Mouheb", "Eugen"));
pairList.add(new Pair<String, String>("Michaela", "Alex"));
pairList.add(new Pair<String, String>("Niko", "Wildcard"));
pairList.add(new Pair<String,String>("Michaela","Marcel"));
pairList.add(new Pair<String,String>("Mehdi","Florian B."));
pairList.add(new Pair<String,String>("Sohal","Clara"));
pairList.add(new Pair<String,String>("Eugen","Anna"));
pairList.add(new Pair<String,String>("Matias","Florian S."));
pairList.add(new Pair<String,String>("Miguel","Alex"));
pairList.add(new Pair<String,String>("Janne Philine","Shabnam"));
pairList.add(new Pair<String,String>("Fabrizio","Julian"));
pairList.add(new Pair<String,String>("Tu","Niko"));
pairList.add(new Pair<String,String>("Tobias","Mouheb"));
pairList.add(new Pair<String,String>("Dominik","Peter"));
}
public static void generateTraineeList() {
allTrainees = new ArrayList<Trainee>();
// // Using Scanner for Getting Input from User
// Scanner in = new Scanner(System.in);
//
// String s = in.nextLine();
allTrainees.add(new Trainee("Peter", 1));
allTrainees.add(new Trainee("Marcel", 2));
allTrainees.add(new Trainee("Fabrizio", 3));
//allTrainees.add(new Trainee("Paul", 4));
allTrainees.add(new Trainee("Mouheb", 4));
allTrainees.add(new Trainee("Mehdi", 5));
allTrainees.add(new Trainee("Julian", 6));
allTrainees.add(new Trainee("Michaela", 7));
allTrainees.add(new Trainee("Sohal", 8));
allTrainees.add(new Trainee("Shabnam", 9));
allTrainees.add(new Trainee("Alex", 10));
allTrainees.add(new Trainee("Florian B.", 11));
allTrainees.add(new Trainee("Florian S.", 12));
allTrainees.add(new Trainee("Tu", 13));
allTrainees.add(new Trainee("Anna", 14));
allTrainees.add(new Trainee("Matias", 15));
allTrainees.add(new Trainee("Miguel", 16));
allTrainees.add(new Trainee("Tobias", 17));
allTrainees.add(new Trainee("Janne Philine", 18));
allTrainees.add(new Trainee("Clara", 19));
allTrainees.add(new Trainee("Niko", 20));
allTrainees.add(new Trainee("Dominik", 21));
allTrainees.add(new Trainee("Eugen", 22));
//allTrainees.add(new Trainee("Wildcard", 24));
// for (int i = 0; i < allTrainees.size(); i++) {
// System.out.print(allTrainees.get(i).getName() + " - " + allTrainees.get(i).getId() + "\n");
//
// }
}
public static Trainee getByID(List<Trainee> allTrainees, int Id) {
for (int i = 0; i < allTrainees.size(); i++) {
if (allTrainees.get(i).getId() == Id) {
return allTrainees.get(i);
}
}
return null;
}
public static List<Pair<String, String>> dateGenerator() {
List<Pair<String, String>> allDates = new ArrayList<Pair<String, String>>();
List <Integer> usedIDs = new ArrayList <Integer>();
int counter = 0;
// TODO matching
while (counter < 11) {
int zahl1 = (int) (Math.random() * 22 + 1);
int zahl2 = (int) (Math.random() * 22 + 1);
if(usedIDs.contains(zahl1) || usedIDs.contains(zahl2) ) {
continue;
}
Trainee T1 = getByID(allTrainees, zahl1);
Trainee T2 = getByID(allTrainees, zahl2);
if(T1.getName() != T2.getName()) {
//Paare, die es schon gab (beide Reihenfolgen wichtig!)
Pair P1 = new Pair(T1.getName(), T2.getName());
Pair P2 = new Pair(T2.getName(), T1.getName());
if (!pairExists(P1, pairList) && !pairExists(P1, allDates) && !pairExists(P2, pairList) && !pairExists(P2, allDates)) {
allDates.add(P1);
usedIDs.add(zahl1);
usedIDs.add(zahl2);
counter ++;
}
if (allDates.size() > 11) {
break;
}
}
}
for (int i = 0; i < allDates.size(); i++) {
System.out.print(allDates.get(i).getFirst() + " - " + allDates.get(i).getSecond() + "\n");
}
for (int i = 0; i < allDates.size(); i++) {
System.out.print("pairList.add(new Pair<String,String>(" + "\"" + allDates.get(i).getFirst() + "\"" + "," + "\"" + allDates.get(i).getSecond() + "\"" + "));" + "\n");
}
return allDates;
}
public static boolean pairExists(Pair<String, String> P, List<Pair<String, String>> pairList) {
for (int i = 0; i < pairList.size(); i++) {
if (pairList.get(i).equals(P)) {
return true;
}
}
return false;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
// generateList();
oldDates();
generateTraineeList();
dateGenerator();
}
}
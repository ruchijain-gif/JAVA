var data=Java.type("java.util.HashMap");
var map=new data();
map.put("India","Delhi");
map.put("Japan", "Tokyo");
map.put("Germany", "Berlin");
map.put("Russia", "Moscow");
map.put("USA", "Washington DC");
for each (var i in map.keySet()) print(i+ " : " + map[i]);
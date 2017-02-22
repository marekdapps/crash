welcome = { ->
  def hostName;
  try {
    hostName = java.net.InetAddress.getLocalHost().getHostName();
  } catch (java.net.UnknownHostException ignore) {
    hostName = "localhost";
  }
  //""";
  return """\
   ______               __
  / ____/     _________/ /___ _
 / /     __  / ___/ __  / __ `/    Shell access by CRaSH ${crash.context.version}
/ /___  /_/ / /  / /_/ / /_/ /     More on http://www.crashub.org     
\\____/     /_/   \\__,_/\\__,_/

Welcome to $hostName
It is ${new Date()} now

""";

//  return """\
//
//   _____     ________                 _______    ____ ____
// .'     `.  |        `.             .'       `. |    |    | ${crash.context.version}
//|    |    | |    |    |  .-------.  |    |    | |    |    |
//|    |____| |    `   .' |   _|    |  .    '~_ ` |         |
//|    |    | |    .   `.  .~'      | | `~_    `| |         |
//|    |    | |    |    | |    |    | |    |    | |    |    |
// `._____.'  |____|____| `.________|  `._____.'  |____|____|
//
//Follow and support the project on http://www.crashub.org
//Welcome to $hostName + !
//It is ${new Date()} now
//""";

}

prompt = { ->
  return "% ";
}

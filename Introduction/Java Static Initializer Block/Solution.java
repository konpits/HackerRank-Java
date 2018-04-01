
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static int B;
static int H;
static boolean flag;

static {  
  try {
    B = Integer.parseInt(br.readLine());
    H = Integer.parseInt(br.readLine());
  }catch (IOException e ){;}
  if(B > 0 && H > 0) {
    flag = true;
  }
  else {
    flag = false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
  } 
}
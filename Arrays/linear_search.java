public class linear_search {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static String menucard(String menu[],String choice){
        for(int i =0;i<menu.length;i++){
            if(menu[i].equals(choice)){
                return menu[i];
            }
        }

        return "Not found";
    }


    public static void main(String[] args) {
        int number[]={2,4,6,8,100,10,45};
        String menu[]={"Dosa","Samosa","Uttapa"};
        String choice = "Uttapa";
        int key = 20;

        int index = linearSearch(number, key);
        if(index ==-1){
            System.out.println("Not Found");
        }else{
        System.out.print("The key is at the "+index +" number");
        }
        
        String chooses = menucard(menu, choice);
        if(chooses.equals(choice)){
            System.out.print("the choice is "+ chooses);
        }
    }
}

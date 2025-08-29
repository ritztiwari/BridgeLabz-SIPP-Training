public class pet
{
    
    static class pets{
        String name;
        int age;
        
        public pets(String name,int age){
            this.name= name;
            this.age= age;
        }
        
        public void display(){
            System.out.print(name+" "+age);
        }
    }
    
    static class cat extends pets{
        String name;
        int age;
        
        public cat(String name,int age){
            super(name,age);
        }

        @Override
        public void display(){
            super.display();
        }
    }

    static class bird extends pets{
        String name;
        int age;
        String breed;
        
        public bird(String name,int age,String breed){
            super(name,age);
            this.breed=breed;
        }

        @Override
        public void display(){
            super.display();
            System.out.print(" "+breed);
        }
    }
    
	public static void main(String[] args) {
		bird p = new bird("hero",6,"buglar");
		p.display();
	}
}
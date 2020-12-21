Scanner scanner = new Scanner(System.in);
//Targil 1:

	int index = 100;
	while (index <= 1000) {
       System.out.println(index);
       index = index + 100;
    }
    
    
      // Targil 2:
        int index1 = 5;
	while (index1 >= -10 ) {
        System.out.println(index1);
        index1 -= 1;
    }
    
    //Targil 4 :
        Random r = new Random();
	int random_number = r.nextInt(4)+1;
	switch (random_number) {
        case 1:
            System.out.println(" ehad");
            break;
        case 2:
            System.out.println("shtaim");
            break;
        case 3:
            System.out.println("shalosh");
            break;

        }
    

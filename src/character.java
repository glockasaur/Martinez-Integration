

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal{ //sub class
	void fly(){
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}
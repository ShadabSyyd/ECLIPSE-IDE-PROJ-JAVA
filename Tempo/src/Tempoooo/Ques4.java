package Tempoooo;

abstract class GovOffice {

    private String officeName;

    GovOffice(String officeName) {

        this.officeName = officeName;

    }

    public String getofficeName() {

        return officeName;

    }

}

 

class Ques4 extends GovOffice {

	Ques4() {

    super("Post Office");

  }

  public static void main(String[] args) {

	  Ques4 obj = new Ques4();

    System.out.println(obj.getofficeName());

  }

}


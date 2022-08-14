package pkg2;
class room
{
    int length, breadth;
    room(int x, int y)
    { length = x;
       breadth = y;
    }
   int area()
    { return (length*breadth);}
} 
class BedRoom extends room
 {
    int height;
    BedRoom ( int x, int y, int z)
      {
          super( x, y );
          height = z;
      }
     int volume()
     {return (length*breadth*height);
     }
   }


public class single_inheritance {

	public static void main(String[] args) {
		BedRoom r1 = new  BedRoom(10,11,14);
        int RoomArea=r1.area();
        int RoomVolunme=r1.volume();
        System.out.println("result " +RoomArea +RoomVolunme); 

	}

}


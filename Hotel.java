/**
	* Stores reservation objects in an array with room numbers as indexes.
	*/
	public class Hotel {
	// list[] stores reservations for each room. The index is the room number.
	// All elements are null at the beginning
	private Reservation[] list;
	public Hotel(int numbRooms) {
	list = new Reservation[numbRooms];
	
	
	}
	// Displays room numbers and reservation information.
	public void display() {
		System.out.println("Room #	 name	 rate");
		 for (int i = 0; i < list.length; i++) {
				if(list[i]!=null) { 
					System.out.println( list[i] );}
			           
			  }
	}
	
	// returns true if room is occupied
	public boolean isOccupied(int room) {
		return list[room]!=null;
	}
	// Assigns a new Reservation to the first available room.
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate) {
		int roomnum = 0;
    while(roomnum < list.length && this.isOccupied(roomnum)){
      roomnum++;
    }

    if(roomnum >= list.length) System.out.println("All rooms are occupied");
    else {
			this.list[roomnum] = new Reservation(name,rate);
			System.out.println("Room " + roomnum + ": " + this.list[roomnum].toString());
			
		}
	}
	// Assigns a new Reservation to an inputted room.
	// if room is occupied, find the first available room in the array
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate, int room) {
		
		
			if (list[room]!=null) {
				System.out.println("Your room is occupied.");
			} else {this.list[room] = new Reservation(name,rate);
		System.out.println("Room " + room + ": " + this.list[room].toString());
      }
			
		}
		
	
	// Find and return number of rooms with a reservation
	public int reservedRoomCount() {
		int roomnum = 0;
		for(int i = 0; i< this.list.length; i++) {
			if (this.isOccupied(i)) {
				roomnum++;
			} else {break;}
			
	}
		return roomnum;
	}
	// find and return the average room rate of the occupied rooms.
	public double averageRoomRate() {
		 double sum = 0;
		    int not_null = 0;
		    double average = 0;

		    for(int i=0; i < list.length; i++){
		        if(list[i] != null) {
              sum = sum + list[i].getRate();
              not_null+=1;
            }
		    }
		    average = sum/not_null;
		    return average;    
	}
	
	
	public static void main(String[] args)
	{
		Hotel hilton = new Hotel(10);
		hilton.reserveRoom("Jones", 99);
		hilton.reserveRoom("Patel", 94.99);
		hilton.reserveRoom("Garcia", 94.99);
		hilton.reserveRoom("Chen", 94.99);
		hilton.reserveRoom("Hallockson",94.99,7);
		hilton.display();
		System.out.println("Reserved Rooms: " + hilton.reservedRoomCount());
		System.out.println("Average Reservation: " + hilton.averageRoomRate());

		
	}
	}
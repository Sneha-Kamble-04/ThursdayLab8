package TajHotel;
class Room 
{
    String type;
    int costPerDay;

    public Room(String type, int costPerDay) 
    {
        this.type = type;
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() 
    {
        return type + " - $" + costPerDay + " per day";
    }
}

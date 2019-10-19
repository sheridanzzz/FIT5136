public class TimeSlot
{
    boolean morninig;
    boolean afternoon;
    boolean evening;
    public TimeSlot()
    {
        morninig = false;
        afternoon = false;
        evening = false;
    }

    public TimeSlot(boolean newMorning,boolean newAfternoon,boolean newEvening)
    {
        morninig = newMorning;
        afternoon = newAfternoon;
        evening = newEvening;
    }

    public boolean getMorning()
    {
        return morninig;
    }

    public void setMorning(boolean newMorning)
    {
        morninig = newMorning;
    }

    public boolean getAfternoon()
    {
        return afternoon;
    }

    public void setAfternoon(boolean newAfternoon)
    {
        afternoon = newAfternoon;
    }

    public boolean getEvening()
    {
        return evening;
    }

    public void setEvening(boolean newEvening)
    {
        evening = newEvening;
    }
}

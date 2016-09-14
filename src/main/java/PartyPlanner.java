public class PartyPlanner {
  private int mGuests;
  private int mFood;
  private int mDrinks;
  private int mBand;

  public PartyPlanner(int guests, int food, int drinks, int band) {
    mGuests = guests;
    mFood = food;
    mDrinks = drinks;
    mBand = band;

  }

  public int getGuests() {
    return mGuests;
  }
  public int getFood() {
    return mFood;
  }
  public int getDrinks() {
    return mDrinks;
  }
  public int getBand() {
    return mBand;
  }
public int gTotal(){
  Integer total = 0;
  if (mGuests < 49) {
    total += 120;
  } else if (mGuests > 49 && mGuests <= 99){
    total += 220;
  } else if ( mGuests > 100 && mGuests <= 200 ) {
    total += 325;
  } else {
total += (mGuests +50);
}
if (mFood < 49) {
  total += 175;
} else if (mFood > 49 && mFood <= 99){
  total += 250;
} else if ( mFood > 100 && mFood <= 200 ) {
  total += 375;
} else {
total += (mFood +50);
}
if (mDrinks < 49) {
  total += 50;
} else if (mDrinks > 49 && mDrinks <= 99){
  total += 125;
} else if ( mDrinks > 100 && mDrinks <= 200 ) {
  total += 200;
} else {
total += (mGuests +50);
}
if (mBand < 49) {
  total += 100;
} else if (mBand > 49 && mBand <= 100){
  total += 200;
} else if ( mBand > 100 && mBand <= 200 ) {
  total += 299;
} else {
total += (mBand +50);
    }
  return total;
}

}

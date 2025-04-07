package be.kuleuven;

public class Wedstrijd {
  private int id;
  private int tornooiId;
  private int speler1Id;
  private int speler2Id;
  private int winnaarId;
  private String score;
  private int finale; // Hierbij staat 1 voor finale, 2 voor halve finale, 4 voor kwart finale ...

  public Wedstrijd() {
  };

  public Wedstrijd(int id, int tornooiId, int speler1Id, int speler2Id, int winnaarId, String score, int finale) {
    this.id = id;
    this.tornooiId = tornooiId;
    this.speler1Id = speler1Id;
    this.speler2Id = speler2Id;
    this.winnaarId = winnaarId;
    this.score = score;
    this.finale = finale;
  }

  public int getId() {
    return id;
  }

  public int getTornooiId() {
    return tornooiId;
  }

  public void setTornooiId(int tornooiId) {
    this.tornooiId = tornooiId;
  }

  public int getSpeler1Id() {
    return speler1Id;
  }

  public void setSpeler1Id(int speler1Id) {
    this.speler1Id = speler1Id;
  }

  public int getSpeler2Id() {
    return speler2Id;
  }

  public void setSpeler2Id(int speler2Id) {
    this.speler2Id = speler2Id;
  }

  public int getWinnaarId() {
    return winnaarId;
  }

  public void setWinnaarId(int winnaarId) {
    this.winnaarId = winnaarId;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public int getFinale() {
    return finale;
  }

  public void setFinale(int finale) {
    this.finale = finale;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + tornooiId;
    result = prime * result + speler1Id;
    result = prime * result + speler2Id;
    result = prime * result + winnaarId;
    result = prime * result + ((score == null) ? 0 : score.hashCode());
    result = prime * result + finale;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Wedstrijd other = (Wedstrijd) obj;
    if (id != other.id)
      return false;
    if (tornooiId != other.tornooiId)
      return false;
    if (speler1Id != other.speler1Id)
      return false;
    if (speler2Id != other.speler2Id)
      return false;
    if (winnaarId != other.winnaarId)
      return false;
    if (score == null) {
      if (other.score != null)
        return false;
    } else if (!score.equals(other.score))
      return false;
    if (finale != other.finale)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Wedstrijd [id=" + id + ", tornooiId=" + tornooiId + ", speler1Id=" + speler1Id + ", speler2Id=" + speler2Id
        + ", winnaarId=" + winnaarId + ", score=" + score + ", finale=" + finale + "]";
  }

}

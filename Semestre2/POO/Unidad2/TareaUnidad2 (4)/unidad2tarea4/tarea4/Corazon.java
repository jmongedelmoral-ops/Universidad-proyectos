package tarea4;
public class Corazon {
    private int bpm = 0;

    public Corazon() {
        this.bpm = 100;
    }

    public void cambiarbpm(int nuevabpm) {
        if (this.bpm + nuevabpm >= 40 && this.bpm + nuevabpm <= 180) {
            
            this.bpm += nuevabpm;
        } else {
            System.out.println("El ritmo está fuera de rango seguro!");
        }
    }

    @Override
    public String toString() {
            // TODO Auto-generated method stub
            return "Corazon [bpm=" + bpm + " ]";
    }

}

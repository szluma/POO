public class Professor {
    private int ID;
    private String Nome;
    private String CPF;
    private String Area;
    private String Turma;

public Professor (int ID, String Nome, String CPF, String Area, String Turma){
    this.ID = ID;
    this.Nome = Nome;
    this.CPF = CPF;
    this.Area = Area;
    this.Turma = Turma;
}

public int getID(){
    return ID;
}

public void setID(int ID){
    this.ID = ID;
}

public String getNome(){
    return Nome;
}

public void setNome(String Nome){
    this.Nome = Nome;
}

public String getCPF(){
    return CPF;
}

public void setCPF(String CPF){
    this.CPF = CPF;
}

public String getArea(){
    return Area;
}

public void setArea(String Area){
    this.Area = Area;
}

public String getTurma(){
    return Turma;
}

public void setTurma(String Turma){
    this.Turma = Turma;
}

public void cadastrar(){
    System.out.println("Cadastro do professor:" + Nome);
}

public void atribuirTurma(){
    System.out.println("Turma atribuída ao professor:" + Nome);
}
}
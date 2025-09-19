public class Funcionaria {
        private String nome;
        private int ID;
    
        public Funcionaria (String nome, int ID) {
            this.nome = nome;
            this.ID = ID;
        }
    
        public void Vender () {
            System.out.println(this.nome + " fez uma venda! ");
        }
    
        public void exibirInfo() {
            System.out.println("Nome: " + this.nome + ", ID: " + this.ID );
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getID() {
            return ID;
        }
    }


public class Cliente { // Nome da classe
        // Atributos
        private String nome; // Visibilidade da classe é privada 
        private String cpf;
        private String email;
    
        // Métodos (Getters e Setters)
        public String getNome() { // Retorna o valor de um atributo (a classe tem visibilidade publica)
            return nome;
        }
    
        public void setNome(String nome) { // Altera o valor que foi atribuido
            this.nome = nome; // Acessa o conteúdo do objeto atual
        }
    
        public String getCpf() {  // Retorna o valor de um atributo
            return cpf;
        }
    
        public void setCpf(String cpf) {  // Altera o valor que foi atribuido
            this.cpf = cpf;  // Acessa o conteúdo do objeto atual
        }
    
        public String getEmail() {  // Retorna o valor de um atributo
            return email;
        }
    
        public void setEmail(String email) {  // Altera o valor que foi atribuido
            this.email = email;  // Acessa o conteúdo do objeto atual
        }
    }

    // Visibilidade: São os modificadores de acesso que determinam a acessibilidade de uma classe 
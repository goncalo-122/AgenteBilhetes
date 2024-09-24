public class AgenteBilhetes {
    private int lotacao;
    private int caixa;

    
        public AgenteBilhetes(int lotacaoInicial) {
        this.lotacao = lotacaoInicial;
        this.caixa = 0;
    }


    public String venderBilheteCrianca() {
        if (lotacao > 0) {
            lotacao--;
            caixa += 5;
            return "Bilhete de criança vendido.";
        } else {
            return "LOTAÇÃO-ESGOTADA";
        }
    }

   
    public String venderBilheteAdulto() {
        if (lotacao > 0) {
            lotacao--;
            caixa += 10;
            return "Bilhete de adulto vendido.";
        } else {
            return "LOTAÇÃO-ESGOTADA";
        }
    }

   
    public int consultarCaixa() {
        return caixa;
    }

    
    public int consultarLotacao() {
        return lotacao;
    }

    public static void main(String[] args) {
      
        AgenteBilhetes agente = new AgenteBilhetes(3); 
        
        System.out.println(agente.venderBilheteCrianca());
        System.out.println(agente.venderBilheteAdulto());  
        System.out.println(agente.venderBilheteAdulto());  
        System.out.println(agente.venderBilheteAdulto());  

     
        System.out.println("Caixa: " + agente.consultarCaixa() + " euros");
    }
}

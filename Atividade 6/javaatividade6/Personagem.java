package javaapplication6;

import java.util.HashMap;

/**
 * Esta classe representa um personagem do jogo, o qual poderá participar de lutas.
 * Cada personagem eh conectado a outros indicando as possiveis transformacoes.
 * A principio as transformacoes sao lobisomen, mumia, vampiro e zumbi. Para
 * cada transformacao possivel, o personagem guarda uma referencia para o outro
 * personagem ou null se nao for possivel aquela transformacao.
 * @author Luiz Merschmann
 * @version 29/11/2020
 */
public class Personagem {
    private String identificacao;
    private int forcaAtaque;
    private int forcaDefesa;
    
    //etapa 2 passando para private
    //private Personagem lobisomen;
    //private Personagem mumia;
    //private Personagem vampiro;
    //private Personagem zumbi;
    
    private HashMap<String,Personagem> saidas;
    
    /**
     * Cria um personagem com a "descricao" e habilidades (forca
     * de ataque e defesa) passadas. Inicialmente ele não pode
     * sofrer transformacoes.
     * @param descricao A descricao do personagem.
     * @param forcaAtaque A forca de ataque daquele personagem.
     * @param forcaDefesa A forca de defesa daquele personagem.
     */
    public Personagem(String descricao,int forcaAtaque, int forcaDefesa) {
        this.identificacao = descricao;
        this.forcaAtaque = forcaAtaque;
        this.forcaDefesa = forcaDefesa;
        saidas = new HashMap<String, Personagem>();
    }
    /**
     * Define as transformacoes possiveis. Cada transformacao leva a um
     * outro personagem ou eh null (transformacao impossivel).
     * @param t1 Transformar em lobisomen.
     * @param t2 Transformar em mumia.
     * @param t3 Transformar em vampiro.
     * @param t4 Transformar em zumbi.
     */
    
    public void addPerson(String person, Personagem p){
        saidas.put(person,p);
    }
    
    public Personagem getPersonagem(String person){
        return saidas.get(person);
    }
    
    public void getTransformacaoPossivel(){
        if (this.getPersonagem("lobisomen") != null) {
            System.out.println(this.getPersonagem("lobisomen").getDescricao());
        }
        if (this.getPersonagem("mumia") != null) {
            System.out.println(this.getPersonagem("mumia").getDescricao());
        }
        if (this.getPersonagem("vampiro") != null) {
            System.out.println(this.getPersonagem("vampiro").getDescricao());
        }
        if (this.getPersonagem("zumbi") != null) {
            System.out.println(this.getPersonagem("zumbi").getDescricao());
        }
        if (this.getPersonagem("diabo") != null) {
            System.out.println(this.getPersonagem("diabo").getDescricao());
        }
    }
    /*
    
    
    public void definirTransformacoes(Personagem t1, Personagem t2, Personagem t3, Personagem t4){
        if(t1 != null)
            saidas.put("lobisomen", t1);
        if(t2 != null)
            saidas.put("mumia", t2);
        if(t3 != null)
            saidas.put("vampiro", t3);
        if(t4 != null)
            saidas.put("zumbi", t4);
    }
    */
    //
    public void definirTransformacoes(String personagem, Personagem p){
        saidas.put(personagem,p);
    }
    /**
     * @return A descricao do personagem.
     */
    public String getDescricao() {
        return identificacao + "\t--> Força de ataque = " + forcaAtaque+ "\tForça de defesa = " + forcaDefesa;
    }
    
    
    //   
    
    public String getIdentificacao(){
        return identificacao;
    }
    public int getForcaAtaque(){
        return forcaAtaque;
    }
    public int getForcaDefesa(){
        return forcaDefesa;
    }
    
    //etapa 2, criando get
    /*
    public Personagem getLobisomem(){
        return lobisomen;
    }
    public Personagem getMumia(){
        return mumia;
    }
    public Personagem getVampiro(){
        return vampiro;
    }
    public Personagem getZumbi(){
        return zumbi;
    }
    */
    
}

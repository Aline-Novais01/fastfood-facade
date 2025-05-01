
public class ComboFacade {
    public Combo criarCombo(int codigoCombo) {
        Combo combo = new Combo();

        switch (codigoCombo) {
            case 1:
                combo.adicionarItem(new Burger("Big Cheddar", 10.00));
                combo.adicionarItem(new Bebida("Refrigerante", 4.00));
                combo.adicionarItem(new Sobremesa("Brownie", 5.00));
                break;
            case 2:
                combo.adicionarItem(new Burger("Cheeseburger", 8.00));
                combo.adicionarItem(new Bebida("Suco", 3.50));
                combo.adicionarItem(new Sobremesa("Sorvete", 6.00));
                break;
            default:
                System.out.println("Opção de combo inválida.");
                break;
        }
        return combo;
    }
}


package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materia;

public class Caderno extends Produto {


    /**
     * QUANTIDADE DE MATERIAS.
     */
    private Materia materia;


    public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + materia.getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "Tipo = " + materia + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}

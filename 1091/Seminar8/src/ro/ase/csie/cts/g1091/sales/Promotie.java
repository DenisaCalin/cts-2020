package ro.ase.csie.cts.g1091.sales;

import ro.ase.csie.cts.g1091.sales.Promotie;

public class Promotie extends AbstractPromotion{
	
	public float getDiscountFidelitate(int aniFidelitate) {
		return (aniFidelitate > Promotie.MIN_VECHIME_ANI) ? 
				Promotie.MAX_DISCOUNT_FIDELITATE : (float)aniFidelitate/100;
	}
	
	public float getPretCuDiscount(float pret, float discount, 
			float discountFidelitate) {
		return (pret - getDiscountPret(pret, discountFidelitate)) * 
				(1 - discountFidelitate);
	}
}

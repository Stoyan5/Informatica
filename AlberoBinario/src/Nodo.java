class Nodo <T>{
	T info;
	Nodo sX;
	Nodo dX;
	Nodo(T info){
		this.info=info;
		this.sX=null;
		this.dX=null;
	}
	Nodo (T info, Nodo sX,Nodo dX){
		this.info= info;
		this.dX=dX;
		this.sX=sX;
	}
}
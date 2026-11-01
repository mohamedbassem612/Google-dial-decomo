package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amzc implements defpackage.amyz {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile defpackage.amyz b;
    private volatile java.lang.Object c = a;

    private amzc(defpackage.amyz amyzVar) {
        this.b = amyzVar;
    }

    public static defpackage.amyz b(defpackage.amyz amyzVar) {
        return ((amyzVar instanceof defpackage.amzc) || (amyzVar instanceof defpackage.amyu)) ? amyzVar : new defpackage.amzc(amyzVar);
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        defpackage.amyz amyzVar = this.b;
        if (amyzVar == null) {
            return this.c;
        }
        java.lang.Object objA = amyzVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}

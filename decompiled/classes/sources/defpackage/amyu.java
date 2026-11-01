package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amyu implements defpackage.amyz, defpackage.amwu {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile defpackage.amyz b;
    private volatile java.lang.Object c = a;

    private amyu(defpackage.amyz amyzVar) {
        this.b = amyzVar;
    }

    public static defpackage.amwu b(defpackage.amyz amyzVar) {
        if (amyzVar instanceof defpackage.amwu) {
            return (defpackage.amwu) amyzVar;
        }
        amyzVar.getClass();
        return new defpackage.amyu(amyzVar);
    }

    public static defpackage.amyz c(defpackage.amyz amyzVar) {
        amyzVar.getClass();
        return !(amyzVar instanceof defpackage.amyu) ? new defpackage.amyu(amyzVar) : amyzVar;
    }

    private final synchronized java.lang.Object d() {
        java.lang.Object objA;
        objA = this.c;
        java.lang.Object obj = a;
        if (objA == obj) {
            objA = this.b.a();
            java.lang.Object obj2 = this.c;
            if (obj2 != obj && obj2 != objA) {
                throw new java.lang.IllegalStateException(defpackage.a.bl(objA, obj2, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
            }
            this.c = objA;
            this.b = null;
        }
        return objA;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        return obj == a ? d() : obj;
    }
}

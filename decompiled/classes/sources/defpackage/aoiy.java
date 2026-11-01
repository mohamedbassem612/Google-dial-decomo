package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoiy implements java.io.Serializable, defpackage.aoir {
    private defpackage.aomy a;
    private volatile java.lang.Object b;
    private final java.lang.Object c;

    public aoiy(defpackage.aomy aomyVar) {
        if (aomyVar == null) {
            defpackage.aooh.i("initializer");
        }
        this.a = aomyVar;
        this.b = defpackage.aoje.a;
        this.c = this;
    }

    private final java.lang.Object writeReplace() {
        return new aoip(a());
    }

    @Override // defpackage.aoir
    public final java.lang.Object a() {
        java.lang.Object objA;
        java.lang.Object obj = this.b;
        defpackage.aoje aojeVar = defpackage.aoje.a;
        if (obj != aojeVar) {
            return obj;
        }
        synchronized (this.c) {
            java.lang.Object obj2 = this.b;
            if (obj2 != aojeVar) {
                objA = obj2;
            } else {
                defpackage.aomy aomyVar = this.a;
                if (aomyVar == null) {
                    defpackage.aooh.g();
                }
                objA = aomyVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    @Override // defpackage.aoir
    public final boolean b() {
        return this.b != defpackage.aoje.a;
    }

    public final java.lang.String toString() {
        return b() ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

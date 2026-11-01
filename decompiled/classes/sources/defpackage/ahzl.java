package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzl implements defpackage.ahzi {
    private final defpackage.ahzs a = new defpackage.ahzs();
    private volatile defpackage.ahzi b;
    private java.lang.Object c;

    public ahzl(defpackage.ahzi ahziVar) {
        ahziVar.getClass();
        this.b = ahziVar;
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        if (this.b != null) {
            synchronized (this.a) {
                if (this.b != null) {
                    java.lang.Object objEZ = this.b.eZ();
                    this.c = objEZ;
                    this.b = null;
                    return objEZ;
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        if (obj == null) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.c) + '>';
        }
        return defpackage.a.bG((byte) 41, obj, "Suppliers.memoize(");
    }
}

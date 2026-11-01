package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzk implements java.io.Serializable, defpackage.ahzi {
    private static final long serialVersionUID = 0;
    final defpackage.ahzi a;
    volatile transient boolean b;
    transient java.lang.Object c;
    private transient defpackage.ahzs d = new defpackage.ahzs();

    public ahzk(defpackage.ahzi ahziVar) {
        defpackage.ahvr.ci(ahziVar);
        this.a = ahziVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.d = new defpackage.ahzs();
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    java.lang.Object objEZ = this.a.eZ();
                    this.c = objEZ;
                    this.b = true;
                    return objEZ;
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.b) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.c) + '>';
        } else {
            obj = this.a;
        }
        return defpackage.a.bG((byte) 41, obj, "Suppliers.memoize(");
    }
}

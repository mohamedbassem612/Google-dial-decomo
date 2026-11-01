package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzj implements java.io.Serializable, defpackage.ahzi {
    private static final long serialVersionUID = 0;
    final defpackage.ahzi a;
    final long b;
    volatile transient java.lang.Object c;
    volatile transient long d;
    private transient defpackage.ahzs e = new defpackage.ahzs();

    public ahzj(defpackage.ahzi ahziVar, long j) {
        this.a = ahziVar;
        this.b = j;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.e = new defpackage.ahzs();
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        long j = this.d;
        long jNanoTime = java.lang.System.nanoTime();
        if (j == 0 || jNanoTime - j >= 0) {
            synchronized (this.e) {
                if (j == this.d) {
                    java.lang.Object objEZ = this.a.eZ();
                    this.c = objEZ;
                    long j2 = jNanoTime + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return objEZ;
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a.toString() + ", " + this.b + ", NANOS)";
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aens {
    public final defpackage.ajcu a;
    public final int b;
    public final int c;
    public final boolean d;

    public aens(defpackage.ajcu ajcuVar, int i, int i2, boolean z) {
        this.a = ajcuVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static defpackage.aesw a() {
        defpackage.aesw aeswVar = new defpackage.aesw(null);
        aeswVar.a = 11;
        byte b = aeswVar.c;
        aeswVar.d = 2;
        aeswVar.c = (byte) (b | 3);
        aeswVar.c();
        return aeswVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aens) {
            defpackage.aens aensVar = (defpackage.aens) obj;
            defpackage.ajcu ajcuVar = this.a;
            if (ajcuVar != null ? ajcuVar.equals(aensVar.a) : aensVar.a == null) {
                if (this.b == aensVar.b && this.c == aensVar.c && this.d == aensVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.ajcu ajcuVar = this.a;
        int iHashCode = ajcuVar == null ? 0 : ajcuVar.hashCode();
        int i = this.b;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + java.lang.String.valueOf(this.a) + ", primesMetricExecutorPriority=" + this.b + ", primesMetricExecutorPoolSize=" + this.c + ", enableDeferredTasks=" + this.d + '}';
    }

    public aens() {
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizi implements java.io.Serializable {
    public static final defpackage.aizi a = new defpackage.aizi(new long[0]);
    private static final long serialVersionUID = 6402900342693743567L;
    public final int b;
    private final long[] c;

    public aizi(long[] jArr, int i) {
        this.c = jArr;
        this.b = i;
    }

    public static vm c(int i) {
        ahvr.bP(true, "Invalid initialCapacity: %s", i);
        return new vm(i, (byte[]) null);
    }

    public final long a(int i) {
        ahvr.ch(i, this.b);
        return this.c[i];
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aizi) {
            defpackage.aizi aiziVar = (defpackage.aizi) obj;
            int i = this.b;
            if (i == aiziVar.b) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (a(i2) == aiziVar.a(i2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.b; i++) {
            iM = (iM * 31) + anty.M(this.c[i]);
        }
        return iM;
    }

    java.lang.Object readResolve() {
        return b() ? a : this;
    }

    public final java.lang.String toString() {
        if (b()) {
            return "[]";
        }
        int i = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.c;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    java.lang.Object writeReplace() {
        long[] jArr = this.c;
        int i = this.b;
        return i < jArr.length ? new defpackage.aizi(java.util.Arrays.copyOfRange(jArr, 0, i)) : this;
    }

    private aizi(long[] jArr) {
        this(jArr, jArr.length);
    }
}

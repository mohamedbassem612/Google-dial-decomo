package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ety {
    public static final defpackage.ety a = new defpackage.ety(-1, -1);
    public final int b;
    public final int c;

    static {
        new defpackage.ety(0, 0);
        java.lang.String str = eum.a;
    }

    public ety(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        ahvr.bM(z);
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof defpackage.ety)) {
                return false;
            }
            defpackage.ety etyVar = (defpackage.ety) obj;
            if (this.b != etyVar.b || this.c != etyVar.c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        return this.c ^ ((i << 16) | (i >>> 16));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.b);
        sb.append('x');
        sb.append(this.c);
        return sb.toString();
    }
}

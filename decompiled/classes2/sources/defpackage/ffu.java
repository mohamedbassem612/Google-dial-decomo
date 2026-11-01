package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffu {
    public final java.lang.Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public ffu(java.lang.Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final defpackage.ffu a(java.lang.Object obj) {
        return !this.a.equals(obj) ? new defpackage.ffu(obj, this.b, this.c, this.d, this.e) : this;
    }

    public final boolean b(defpackage.ffu ffuVar) {
        if (ffuVar != null) {
            return this == ffuVar || (this.a.equals(ffuVar.a) && this.b == ffuVar.b && this.c == ffuVar.c && this.d == ffuVar.d);
        }
        return false;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ffu) {
            defpackage.ffu ffuVar = (defpackage.ffu) obj;
            if (b(ffuVar) && this.e == ffuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkn {
    public final int a;
    public final long b;
    public final int c;

    public bkn(int i, int i2, long j) {
        this.c = i;
        this.a = i2;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bkn) {
            defpackage.bkn bknVar = (defpackage.bkn) obj;
            if (this.c == bknVar.c && this.a == bknVar.a && this.b == bknVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "AnchorInfo(direction=" + ((java.lang.Object) defpackage.dpm.c(this.c)) + ", offset=" + this.a + ", selectableId=" + this.b + ')';
    }
}

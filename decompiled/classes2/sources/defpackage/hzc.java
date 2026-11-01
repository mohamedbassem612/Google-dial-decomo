package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzc {
    public final java.lang.String a;
    public final defpackage.hwy b;
    public final boolean c;

    public hzc(java.lang.String str, defpackage.hwy hwyVar, boolean z) {
        this.a = str;
        this.b = hwyVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hzc) {
            defpackage.hzc hzcVar = (defpackage.hzc) obj;
            if (aooh.n(this.a, hzcVar.a) && this.b == hzcVar.b && this.c == hzcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "CallAttributes(id=" + this.a + ", audioMode=" + this.b + ", muted=" + this.c + ')';
    }
}

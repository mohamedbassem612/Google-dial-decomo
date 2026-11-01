package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxi implements defpackage.lws {
    public final java.lang.String a;
    private final long b;
    private final java.lang.String c;

    public lxi(long j, java.lang.String str) {
        aooh.f(str, "text");
        this.b = j;
        this.a = str;
        this.c = snl.at(this, j);
    }

    public final java.lang.String a() {
        return this.c;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lxi) {
            defpackage.lxi lxiVar = (defpackage.lxi) obj;
            if (this.b == lxiVar.b && aooh.n(this.a, lxiVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.b) * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Title(id=" + this.b + ", text=" + this.a + ')';
    }
}

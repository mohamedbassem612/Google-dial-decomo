package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsp extends wsc {
    public final defpackage.wnb a;
    public final long b;

    public wsp(defpackage.wnb wnbVar, long j) {
        aooh.f(wnbVar, "data");
        this.a = wnbVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wsp) {
            defpackage.wsp wspVar = (defpackage.wsp) obj;
            if (aooh.n(this.a, wspVar.a) && this.b == wspVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "TreeItem(data=" + this.a + ", itemId=" + this.b + ')';
    }
}

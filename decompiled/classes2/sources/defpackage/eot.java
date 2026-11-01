package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eot {
    public final java.lang.Object a;
    public final eoh b;
    private final int d = 0;
    public boolean c = false;

    public eot(java.lang.Object obj, eoh eohVar) {
        this.a = obj;
        this.b = eohVar;
    }

    public final void a() {
        this.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eot) {
            defpackage.eot eotVar = (defpackage.eot) obj;
            if (aooh.n(this.a, eotVar.a) && aooh.n(this.b, eotVar.b)) {
                int i = eotVar.d;
                if (this.c == eotVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode()) * 961) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=0, isDisposable=" + this.c + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajr implements defpackage.aiq {
    public final defpackage.ajg a;
    public final long b;
    public final int c;

    public ajr(defpackage.ajg ajgVar, int i, long j) {
        this.a = ajgVar;
        this.c = i;
        this.b = j;
        if (ajgVar instanceof defpackage.alm) {
            defpackage.alm almVar = (defpackage.alm) ajgVar;
            if (almVar.a != 0 || almVar.b != 0) {
                return;
            }
        } else if (ajgVar instanceof aks) {
        } else {
            if (!(ajgVar instanceof aka)) {
                if (ajgVar instanceof akb) {
                    throw null;
                }
                if (ajgVar instanceof aiy) {
                    return;
                }
                return;
            }
            if (((aka) ajgVar).a.a != 0) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // defpackage.aiq
    public final alp a(defpackage.nf nfVar) {
        return new alw(this.a.b(nfVar), this.c, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ajr) {
            defpackage.ajr ajrVar = (defpackage.ajr) obj;
            if (defpackage.aooh.n(ajrVar.a, this.a) && ajrVar.c == this.c && ajrVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        defpackage.a.aY(i);
        long j = this.b;
        return ((iHashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }
}

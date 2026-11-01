package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ablh implements defpackage.abmh {
    public final defpackage.abmf a;
    public final abjp b;

    public ablh(defpackage.abmf abmfVar, abjp abjpVar) {
        aooh.f(abmfVar, "item");
        aooh.f(abjpVar, "shape");
        this.a = abmfVar;
        this.b = abjpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablh) {
            defpackage.ablh ablhVar = (defpackage.ablh) obj;
            if (aooh.n(this.a, ablhVar.a) && this.b == ablhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ListItem(item=" + this.a + ", shape=" + this.b + ')';
    }
}

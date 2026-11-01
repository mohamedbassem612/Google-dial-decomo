package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpl {
    public final java.lang.Object a;
    public final aono b;

    public bpl(java.lang.Object obj, aono aonoVar) {
        this.a = obj;
        this.b = aonoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bpl) {
            defpackage.bpl bplVar = (defpackage.bpl) obj;
            if (aooh.n(this.a, bplVar.a) && aooh.n(this.b, bplVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}

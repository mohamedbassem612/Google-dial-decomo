package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afol {
    public final defpackage.afoe a;
    public final defpackage.afoe b;
    public final defpackage.afoe c;
    public final int d;

    public afol(defpackage.afoe afoeVar, defpackage.afoe afoeVar2, defpackage.afoe afoeVar3) {
        this.a = afoeVar;
        this.b = afoeVar2;
        this.c = afoeVar3;
        int i = afoeVar2.d;
        if (i == 0 && (i = afoeVar.d) == 0) {
            i = afoeVar3.d;
        }
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afol) {
            defpackage.afol afolVar = (defpackage.afol) obj;
            if (aooh.n(this.a, afolVar.a) && aooh.n(this.b, afolVar.b) && aooh.n(this.c, afolVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "GooglePhotosResource(meSuggestedPhotosResource=" + this.a + ", clustersResource=" + this.b + ", suggestedPhotosResource=" + this.c + ')';
    }
}

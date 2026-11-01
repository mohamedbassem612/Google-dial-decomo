package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dki {
    public final dkh a;
    public final defpackage.dkg b;

    public dki() {
        this(new defpackage.dkg(null));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dki) {
            defpackage.dki dkiVar = (defpackage.dki) obj;
            if (defpackage.aooh.n(this.b, dkiVar.b)) {
                dkh dkhVar = dkiVar.a;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ')';
    }

    public dki(defpackage.dkg dkgVar) {
        this.a = null;
        this.b = dkgVar;
    }
}

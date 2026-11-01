package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gah extends defpackage.dzn {
    public final defpackage.gab a;
    public final defpackage.gab b = null;

    public gah(defpackage.gab gabVar) {
        this.a = gabVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gah) {
            defpackage.gah gahVar = (defpackage.gah) obj;
            if (defpackage.aooh.n(this.a, gahVar.a)) {
                defpackage.gab gabVar = gahVar.b;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return defpackage.aoov.n(("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ").concat("|)"));
    }
}

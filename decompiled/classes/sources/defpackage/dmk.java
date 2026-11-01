package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dmk {
    private final defpackage.dmp a;
    private final java.lang.Object b = null;

    public dmk(defpackage.dmp dmpVar) {
        this.a = dmpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dmk) {
            defpackage.dmk dmkVar = (defpackage.dmk) obj;
            if (defpackage.aooh.n(this.a, dmkVar.a)) {
                java.lang.Object obj2 = dmkVar.b;
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
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}

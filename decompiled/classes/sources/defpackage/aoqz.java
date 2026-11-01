package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqz {
    public final java.lang.String a;
    private final defpackage.aopq b;

    public aoqz(java.lang.String str, defpackage.aopq aopqVar) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        if (aopqVar == null) {
            defpackage.aooh.i("range");
        }
        this.a = str;
        this.b = aopqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aoqz) {
            defpackage.aoqz aoqzVar = (defpackage.aoqz) obj;
            if (defpackage.aooh.n(this.a, aoqzVar.a) && defpackage.aooh.n(this.b, aoqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}

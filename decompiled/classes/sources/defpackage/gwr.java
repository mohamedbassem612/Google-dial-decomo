package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwr {
    public final java.lang.String a;
    public final java.lang.Long b;

    public gwr(java.lang.String str, java.lang.Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gwr) {
            defpackage.gwr gwrVar = (defpackage.gwr) obj;
            if (defpackage.aooh.n(this.a, gwrVar.a) && defpackage.aooh.n(this.b, gwrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}

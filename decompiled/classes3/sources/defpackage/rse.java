package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rse extends pez {
    public final int a;
    public final java.lang.Object b;

    public rse(int i, java.lang.Object obj) {
        super((short[]) null);
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rse) {
            defpackage.rse rseVar = (defpackage.rse) obj;
            if (this.a == rseVar.a && aooh.n(this.b, rseVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "TextResourceId(textId=" + this.a + ", textArg=" + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgh {
    public final aopu a;
    public final defpackage.tei b;
    public final snl c;

    public tgh(aopu aopuVar, snl snlVar, defpackage.tei teiVar) {
        aooh.f(snlVar, "result");
        aooh.f(teiVar, "query");
        this.a = aopuVar;
        this.c = snlVar;
        this.b = teiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tgh) {
            defpackage.tgh tghVar = (defpackage.tgh) obj;
            if (aooh.n(this.a, tghVar.a) && aooh.n(this.c, tghVar.c) && aooh.n(this.b, tghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DataSourceResultWithType(resultType=" + this.a + ", result=" + this.c + ", query=" + this.b + ')';
    }
}

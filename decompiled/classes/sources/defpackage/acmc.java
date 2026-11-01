package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acmc {
    public final java.lang.Object a;
    public final defpackage.apdi b;

    public acmc(defpackage.apdi apdiVar, java.lang.Object obj) {
        if (apdiVar.a() < 100000000 || apdiVar.a() >= 200000000) {
            throw new java.lang.IllegalArgumentException();
        }
        this.b = apdiVar;
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acmc)) {
            return false;
        }
        defpackage.acmc acmcVar = (defpackage.acmc) obj;
        return this.b.equals(acmcVar.b) && this.a.equals(acmcVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.a});
    }
}

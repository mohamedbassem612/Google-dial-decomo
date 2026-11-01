package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acme {
    public final java.lang.Object a;
    public final defpackage.apdi b;

    public acme(defpackage.apdi apdiVar, java.lang.Object obj) {
        this.b = apdiVar;
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acme)) {
            return false;
        }
        defpackage.acme acmeVar = (defpackage.acme) obj;
        return this.b.equals(acmeVar.b) && this.a.equals(acmeVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.a});
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmb {
    public final java.lang.Object a;
    public final apdi b;

    public acmb(apdi apdiVar, java.lang.Object obj) {
        boolean z = false;
        if (apdiVar.a() >= 200000000 && apdiVar.a() < 300000000) {
            z = true;
        }
        ahvr.bM(z);
        this.b = apdiVar;
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acmb)) {
            return false;
        }
        defpackage.acmb acmbVar = (defpackage.acmb) obj;
        return this.b.equals(acmbVar.b) && this.a.equals(acmbVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.a});
    }
}

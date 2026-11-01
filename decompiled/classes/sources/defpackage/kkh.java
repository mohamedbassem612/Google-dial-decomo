package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kkh {
    public final defpackage.kkd a;
    public final defpackage.kkk b;

    public kkh(defpackage.kkd kkdVar, defpackage.kkk kkkVar) {
        if (kkdVar == null) {
            defpackage.aooh.i("integration");
        }
        if (kkkVar == null) {
            defpackage.aooh.i("state");
        }
        this.a = kkdVar;
        this.b = kkkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kkh) {
            defpackage.kkh kkhVar = (defpackage.kkh) obj;
            if (defpackage.aooh.n(this.a, kkhVar.a) && defpackage.aooh.n(this.b, kkhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "IntegrationWithState(integration=" + this.a + ", state=" + this.b + ')';
    }
}

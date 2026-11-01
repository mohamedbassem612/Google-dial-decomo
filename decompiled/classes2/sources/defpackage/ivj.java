package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivj {
    public final defpackage.ivm a;
    public final java.lang.Object b;

    public ivj(defpackage.ivm ivmVar, java.lang.Object obj) {
        aooh.f(ivmVar, "disclaimerType");
        this.a = ivmVar;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ivj) {
            defpackage.ivj ivjVar = (defpackage.ivj) obj;
            if (this.a == ivjVar.a && aooh.n(this.b, ivjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + aoiw.a(this.b);
    }

    public final java.lang.String toString() {
        return "DisclaimerAudio(disclaimerType=" + this.a + ", rawInjectableAudio=" + aoiw.b(this.b) + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class imb {
    public final ifz a;
    public final defpackage.ing b;

    public imb(ifz ifzVar, defpackage.ing ingVar) {
        aooh.f(ifzVar, "callAudioConfig");
        this.a = ifzVar;
        this.b = ingVar;
    }

    public final defpackage.imb a(java.lang.Long l) {
        defpackage.ing ingVar = this.b;
        if (!(ingVar instanceof defpackage.ine)) {
            throw new java.lang.IllegalStateException("feature already stopped");
        }
        defpackage.inf infVar = new defpackage.inf(((defpackage.ine) ingVar).a, l);
        ifz ifzVar = this.a;
        aooh.f(ifzVar, "callAudioConfig");
        return new defpackage.imb(ifzVar, infVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.imb) {
            defpackage.imb imbVar = (defpackage.imb) obj;
            if (aooh.n(this.a, imbVar.a) && aooh.n(this.b, imbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioPrismSodaFeatureState(callAudioConfig=" + this.a + ", runningState=" + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cpa extends dca {
    private final defpackage.coz a;

    public cpa(defpackage.coz cozVar) {
        this.a = cozVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cpd(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cpd cpdVar = (defpackage.cpd) cmvVar;
        cpdVar.a.d.m(cpdVar);
        cpdVar.a = this.a;
        cpdVar.a.d.n(cpdVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cpa) && aooh.n(this.a, ((defpackage.cpa) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}

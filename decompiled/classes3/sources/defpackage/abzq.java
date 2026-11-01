package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abzq implements anme {
    private final ahzi a;

    public abzq(ahzi ahziVar) {
        this.a = ahziVar;
    }

    public final ajsz b(anpk anpkVar, anmb anmbVar, anmc anmcVar) {
        defpackage.abzp abzpVar;
        if (!((java.lang.Boolean) this.a.eZ()).booleanValue()) {
            return anmcVar.b(anpkVar, anmbVar);
        }
        aenj aenjVar = (aenj) anmbVar.f(defpackage.abzf.a);
        if (aenjVar == null) {
            abzpVar = new defpackage.abzp(new defpackage.aeto(null, "https://" + anmcVar.a() + '/' + anpkVar.b, false, android.os.SystemClock.elapsedRealtime()));
        } else {
            abzpVar = new defpackage.abzp(new defpackage.aeto(anmcVar.a(), aenj.d(aenjVar), true, android.os.SystemClock.elapsedRealtime()));
        }
        return new defpackage.abzn(this, anmcVar.b(anpkVar, anmbVar.h(abzpVar)), abzpVar);
    }
}

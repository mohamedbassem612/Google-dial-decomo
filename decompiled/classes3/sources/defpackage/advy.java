package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advy implements defpackage.advx {
    private static final aiof a = aiof.i("GnpSdk");
    private final aduu b;

    public advy(aduu aduuVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aduuVar, "gnpConfig");
        aooh.f(aoinVar, "clearcutLogger");
        aooh.f(aoinVar2, "logEventFactory");
        this.b = aduuVar;
    }

    @Override // defpackage.advx
    public final boolean a(defpackage.advu advuVar) {
        java.lang.String str;
        java.lang.String str2 = advuVar.a;
        if ((str2 == null || str2.length() == 0) && (advuVar.b == null || (str = advuVar.c) == null || str.length() == 0)) {
            return false;
        }
        java.lang.String str3 = advuVar.e;
        if (str3 == null || str3.length() == 0) {
            return true;
        }
        java.lang.String str4 = this.b.a;
        if (aooh.n(str3, str4)) {
            return true;
        }
        a.b().M("Push message client ID [%s] does not match own client ID [%s]. %s", str3, str4, "Proceeding.");
        return true;
    }
}

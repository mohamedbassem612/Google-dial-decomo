package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acde implements acdf {
    private final acbd a;
    private final android.content.Context b;

    static {
        aiof.i("GnpSdk");
    }

    public acde(acbd acbdVar, android.content.Context context) {
        aooh.f(acbdVar, "promoEvalLogger");
        aooh.f(context, "context");
        this.a = acbdVar;
        this.b = context;
    }

    public final boolean a(defpackage.akis akisVar, defpackage.accs accsVar, java.util.Set set) {
        aooh.f(akisVar, "targetingTerm");
        akgw akgwVarB = akgw.b((akisVar.c == 5 ? (defpackage.akim) akisVar.d : defpackage.akim.a).c);
        if (akgwVarB == null) {
            akgwVarB = akgw.a;
        }
        if (!defpackage.abxl.w(akgwVarB)) {
            this.a.b(accsVar.a, "Filtered as this permission type is not supported on this version.", new java.lang.Object[0]);
            set.add(akvm.k);
            return false;
        }
        if (akgwVarB == akgw.b) {
            android.content.Context context = this.b;
            if (!dwz.b() || context.getApplicationInfo().targetSdkVersion < 33) {
                this.a.b(accsVar.a, "Filtered as this permission type is not supported on apps targeting this version.", new java.lang.Object[0]);
                set.add(akvm.k);
                return false;
            }
        }
        if (akgwVarB == akgw.e) {
            android.content.Context context2 = this.b;
            if (!agab.bA(context2, "android.permission.ACCESS_COARSE_LOCATION") && !agab.bA(context2, "android.permission.ACCESS_FINE_LOCATION")) {
                this.a.b(accsVar.a, "Filtered as user does not have any required location permission.", new java.lang.Object[0]);
                set.add(akvm.m);
                return false;
            }
        }
        java.lang.String strX = defpackage.abxl.x(akgwVarB);
        if (agab.bA(this.b, strX)) {
            this.a.b(accsVar.a, "Filtered as user already has permission.", new java.lang.Object[0]);
            set.add(akvm.l);
            return false;
        }
        if ((akisVar.c == 5 ? (defpackage.akim) akisVar.d : defpackage.akim.a).d > 0) {
            java.lang.Integer num = (java.lang.Integer) accsVar.e.get(strX);
            if ((num != null ? num.intValue() : 0) < (akisVar.c == 5 ? (defpackage.akim) akisVar.d : defpackage.akim.a).d) {
                this.a.b(accsVar.a, "Filtered as the request count lower bound was not reached.", new java.lang.Object[0]);
                set.add(akvm.n);
                return false;
            }
        }
        return true;
    }
}

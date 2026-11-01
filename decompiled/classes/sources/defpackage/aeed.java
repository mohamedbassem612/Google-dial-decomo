package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeed implements defpackage.aedq {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final android.content.Context b;
    private final defpackage.adzq c;

    public aeed(android.content.Context context, defpackage.aduu aduuVar, defpackage.adzq adzqVar, defpackage.aedp aedpVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(adzqVar, "registrationTokenManager");
        defpackage.aooh.f(aedpVar, "selectionTokensHelper");
        this.b = context;
        this.c = adzqVar;
    }

    @Override // defpackage.aedq
    public final akqq a(defpackage.aduy aduyVar) {
        java.lang.Long lValueOf;
        java.lang.String str;
        defpackage.akzx akzxVarM = akqq.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        android.content.Context context = this.b;
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        defpackage.aooh.f(packageName, "value");
        akzxVarM.u();
        akqq akqqVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(packageName);
        akqqVar.b |= 1;
        akqqVar.e = packageName;
        defpackage.xtq xtqVarB = akmr.B(akqp.a.m());
        xtqVarB.aw();
        if (aduyVar != null && (str = aduyVar.i) != null) {
            xtqVarB.av(str);
        }
        ajyi ajyiVarA = akmr.A(akpz.a.m());
        defpackage.akzx akzxVarM2 = akqd.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        java.lang.String packageName2 = context.getApplicationContext().getPackageName();
        defpackage.aooh.e(packageName2, "getPackageName(...)");
        defpackage.aooh.f(packageName2, "value");
        akzxVarM2.u();
        akqd akqdVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(packageName2);
        akqdVar.b |= 8;
        akqdVar.f = packageName2;
        java.lang.Long l = null;
        try {
            java.lang.Object systemService = context.getSystemService("user");
            defpackage.aooh.d(systemService, "null cannot be cast to non-null type android.os.UserManager");
            long serialNumberForUser = ((android.os.UserManager) systemService).getSerialNumberForUser(android.os.Process.myUserHandle());
            lValueOf = serialNumberForUser != -1 ? java.lang.Long.valueOf(serialNumberForUser) : null;
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e)).v("Exception reading getSerialNumberForUser.");
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            akzxVarM2.u();
            akqd akqdVar2 = akzxVarM2.b;
            akqdVar2.b |= 16;
            akqdVar2.g = jLongValue;
        }
        if (angv.a.b().b() || aduyVar == null) {
            java.lang.String strB = this.c.b();
            if (strB != null && strB.length() != 0) {
                akzxVarM2.u();
                akqd akqdVar3 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(strB);
                akqdVar3.b |= 1;
                akqdVar3.c = strB;
            }
            try {
                long jB = defpackage.aaym.b(this.b.getContentResolver(), -1L);
                java.lang.Long lValueOf2 = jB == -1 ? null : java.lang.Long.valueOf(jB);
                if (lValueOf2 == null) {
                    ((defpackage.aiob) a.d()).v("Failed to get android ID.");
                }
                l = lValueOf2;
            } catch (java.lang.SecurityException e2) {
                ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e2)).v("Exception reading GServices key - ANDROID_ID.");
            }
            if (l != null) {
                long jLongValue2 = l.longValue();
                akzxVarM2.u();
                akqd akqdVar4 = akzxVarM2.b;
                akqdVar4.b |= 4;
                akqdVar4.e = jLongValue2;
            }
        }
        akqd akqdVarR = akzxVarM2.r();
        defpackage.aooh.e(akqdVarR, "build(...)");
        ajyiVarA.D(akqdVarR);
        xtqVarB.au(ajyiVarA.C());
        akqp akqpVarAt = xtqVarB.at();
        defpackage.aooh.f(akqpVarAt, "value");
        akzxVarM.u();
        akqq akqqVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akqpVarAt);
        akqqVar2.d = akqpVarAt;
        akqqVar2.c = 1;
        akqq akqqVarR = akzxVarM.r();
        defpackage.aooh.e(akqqVarR, "build(...)");
        return akqqVarR;
    }
}

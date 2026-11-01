package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sdi implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ sdi(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            gin ginVarA = ((gjh) obj).a("SELECT * FROM white_pages_data");
            try {
                int iS = dzk.S(ginVarA, "accountName");
                int iS2 = dzk.S(ginVarA, "accountE164PhoneNumber");
                int iS3 = dzk.S(ginVarA, "verificationStatus");
                int iS4 = dzk.S(ginVarA, "timestamp");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (ginVarA.m()) {
                    java.lang.String strE = ginVarA.e(iS);
                    java.lang.String strE2 = ginVarA.e(iS2);
                    defpackage.scx scxVarL = ttj.L(ginVarA.l(iS3) ? null : ginVarA.e(iS3));
                    if (scxVarL == null) {
                        throw new java.lang.IllegalStateException("Expected NON-NULL 'com.android.dialer.patrick.impl.security.VerificationStatus', but it was NULL.");
                    }
                    j$.time.Instant instantM = ttj.M(ginVarA.l(iS4) ? null : java.lang.Long.valueOf(ginVarA.c(iS4)));
                    if (instantM == null) {
                        throw new java.lang.IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                    }
                    arrayList.add(new defpackage.sdl(strE, strE2, scxVarL, instantM));
                }
                ginVarA.close();
                return arrayList;
            } catch (java.lang.Throwable th) {
                ginVarA.close();
                throw th;
            }
        }
        if (i == 1) {
            java.lang.Throwable th2 = (java.lang.Throwable) obj;
            aooh.f(th2, "it");
            defpackage.sbe.e(th2);
            return aojh.a;
        }
        if (i == 2) {
            defpackage.skp skpVar = (defpackage.skp) obj;
            aooh.f(skpVar, "uiModel");
            akzx akzxVarP = skpVar.p();
            akzxVarP.u();
            defpackage.skp skpVar2 = (defpackage.skp) akzxVarP.b;
            skpVar2.b |= 1;
            skpVar2.c = 1;
            alad aladVarP = akzxVarP.p();
            aooh.e(aladVarP, "build(...)");
            return (defpackage.skp) aladVarP;
        }
        if (i != 3) {
            defpackage.skp skpVar3 = (defpackage.skp) obj;
            aooh.f(skpVar3, "uiModel");
            defpackage.rze rzeVarI = snl.i(skpVar3.p());
            rzeVarI.h(4);
            return rzeVarI.b();
        }
        defpackage.skp skpVar4 = (defpackage.skp) obj;
        aooh.f(skpVar4, "uiModel");
        defpackage.rze rzeVarI2 = snl.i(skpVar4.p());
        akzx akzxVar = (akzx) rzeVarI2.a;
        akzxVar.u();
        defpackage.skp skpVar5 = (defpackage.skp) akzxVar.b;
        skpVar5.f = null;
        skpVar5.b &= -9;
        return rzeVarI2.b();
    }
}

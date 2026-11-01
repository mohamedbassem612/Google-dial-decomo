package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acbw implements defpackage.acbd {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final defpackage.adao b;

    public acbw(defpackage.adao adaoVar, defpackage.aazc aazcVar) {
        if (adaoVar == null) {
            defpackage.aooh.i("evalResultStore");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = adaoVar;
    }

    private final void f(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.String str) {
        akhl akhlVarC = promoContext.c();
        defpackage.aooh.e(akhlVarC, "getPromotion(...)");
        java.lang.String strE = promoContext.e();
        if (defpackage.anfn.c()) {
            defpackage.akzx akzxVarM = acce.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            defpackage.aooh.f(akhlVarC, "value");
            akzxVarM.u();
            acce acceVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(akhlVarC);
            acceVar.c = akhlVarC;
            acceVar.b |= 1;
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            akzxVarM.u();
            acce acceVar2 = akzxVarM.b;
            acceVar2.b |= 4;
            acceVar2.e = epochMilli;
            defpackage.aooh.f(str, "value");
            akzxVarM.u();
            acce acceVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            acceVar3.b |= 8;
            acceVar3.f = str;
            if (strE != null) {
                akzxVarM.u();
                acce acceVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strE);
                acceVar4.b |= 2;
                acceVar4.d = strE;
            }
            defpackage.albh albhVarR = akzxVarM.r();
            defpackage.aooh.e(albhVarR, "build(...)");
            ((defpackage.acgr) this.b.o(strE)).d(java.util.UUID.randomUUID().toString(), (acce) albhVarR);
        }
    }

    @Override // defpackage.acbd
    public final void a(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.String str, java.lang.Object... objArr) {
        defpackage.aooh.f(promoContext, "promoContext");
        java.lang.String strCy = defpackage.agab.cy(str, java.util.Arrays.copyOf(objArr, objArr.length));
        defpackage.aiob aiobVar = (defpackage.aiob) a.c();
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        aiobVar.B("Promo ID [%s]: %s", akhqVar.b, strCy);
        f(promoContext, strCy);
    }

    @Override // defpackage.acbd
    public final void b(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.String str, java.lang.Object... objArr) {
        defpackage.aooh.f(promoContext, "promoContext");
        java.lang.String strCy = defpackage.agab.cy(str, java.util.Arrays.copyOf(objArr, objArr.length));
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        int i = akhqVar.b;
        f(promoContext, strCy);
    }

    @Override // defpackage.acbd
    public final void c(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.String str, java.lang.Object... objArr) {
        defpackage.aooh.f(promoContext, "promoContext");
        java.lang.String strCy = defpackage.agab.cy(str, java.util.Arrays.copyOf(objArr, objArr.length));
        defpackage.aiob aiobVar = (defpackage.aiob) a.d();
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        aiobVar.B("Promo ID [%s]: %s", akhqVar.b, strCy);
        f(promoContext, strCy);
    }

    @Override // defpackage.acbd
    public final void d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.Throwable th, java.lang.Object... objArr) {
        defpackage.aooh.f(promoContext, "promoContext");
        java.lang.String strCy = defpackage.agab.cy("Unexpected exception while rendering promotion.", java.util.Arrays.copyOf(objArr, 0));
        defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) a.c()).k(th);
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        aiobVar.B("Promo ID [%s]: %s", akhqVar.b, strCy);
        f(promoContext, strCy);
    }

    @Override // defpackage.acbd
    public final void e(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, java.lang.Throwable th, java.lang.Object... objArr) {
        defpackage.aooh.f(promoContext, "promoContext");
        java.lang.String strCy = defpackage.agab.cy("getPackageInfo(%s) failed", java.util.Arrays.copyOf(objArr, 1));
        defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) a.d()).k(th);
        akhq akhqVar = promoContext.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        aiobVar.B("Promo ID [%s]: %s", akhqVar.b, strCy);
        f(promoContext, strCy);
    }
}

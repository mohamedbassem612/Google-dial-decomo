package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wce {
    public static final aimz a = aimz.i("com/android/dialer/wear/siesta/impl/SiestaDataSender");
    public final defpackage.wcg b;
    private final ajct c;
    private final tvn d;
    private final defpackage.afpl e;

    public wce(ajct ajctVar, defpackage.afpl afplVar, defpackage.wcg wcgVar, tvn tvnVar) {
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(wcgVar, "siestaDataLoggingCoordinator");
        this.c = ajctVar;
        this.e = afplVar;
        this.b = wcgVar;
        this.d = tvnVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.wcd wcdVar;
        java.lang.String str2;
        java.lang.Object objD;
        if (aolnVar instanceof defpackage.wcd) {
            wcdVar = (defpackage.wcd) aolnVar;
            int i = wcdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcdVar.c = i - Integer.MIN_VALUE;
            } else {
                wcdVar = new defpackage.wcd(this, aolnVar);
            }
        } else {
            wcdVar = new defpackage.wcd(this, aolnVar);
        }
        java.lang.Object objD2 = wcdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wcdVar.c;
        if (i2 == 0) {
            aooc.af(objD2);
            ajcq ajcqVarX = this.e.X();
            wcdVar.d = str;
            wcdVar.c = 1;
            objD2 = aosv.D(ajcqVarX, wcdVar);
            if (objD2 != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 == 1) {
            str = wcdVar.d;
            aooc.af(objD2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD2);
                return objD2;
            }
            str = wcdVar.d;
            aooc.af(objD2);
        }
        str2 = (java.lang.String) aooh.q((j$.util.Optional) objD2);
        a.b().l("com/android/dialer/wear/siesta/impl/SiestaDataSender", "sendDataToDialerWear", 48, "SiestaDataSender.kt").y("is syntheticTetheredPhoneCallId available: %b", java.lang.Boolean.valueOf(str2 != null));
        if (str2 == null) {
            return aojh.a;
        }
        defpackage.zur zurVarL = this.d.l();
        defpackage.ztw ztwVar = defpackage.ztw.d;
        akzx akzxVarM = defpackage.zuj.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.zuj zujVar = (defpackage.zuj) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        zujVar.b |= 2;
        zujVar.c = str2;
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.zuj zujVar2 = (defpackage.zuj) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        zujVar2.b |= 4;
        zujVar2.d = str;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        ahrv ahrvVarH = ahrv.g(zurVarL.b(ztwVar, (defpackage.zuj) aladVarP)).h(new vuj(new tge(this, 16), 15), this.c);
        wcdVar.d = null;
        wcdVar.c = 3;
        objD = aosv.D(ahrvVarH, wcdVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
        ajcq ajcqVarBK = ((defpackage.wcc) aooc.ar(objD2, defpackage.wcc.class)).bK();
        wcdVar.d = str;
        wcdVar.c = 2;
        objD2 = aosv.D(ajcqVarBK, wcdVar);
        if (objD2 != aoluVar) {
            str2 = (java.lang.String) aooh.q((j$.util.Optional) objD2);
            a.b().l("com/android/dialer/wear/siesta/impl/SiestaDataSender", "sendDataToDialerWear", 48, "SiestaDataSender.kt").y("is syntheticTetheredPhoneCallId available: %b", java.lang.Boolean.valueOf(str2 != null));
            if (str2 == null) {
                return aojh.a;
            }
            defpackage.zur zurVarL2 = this.d.l();
            defpackage.ztw ztwVar2 = defpackage.ztw.d;
            akzx akzxVarM2 = defpackage.zuj.a.m();
            aooh.f(akzxVarM2, "builder");
            akzxVarM2.u();
            defpackage.zuj zujVar3 = (defpackage.zuj) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str2);
            zujVar3.b |= 2;
            zujVar3.c = str2;
            aooh.f(str, "value");
            akzxVarM2.u();
            defpackage.zuj zujVar4 = (defpackage.zuj) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            zujVar4.b |= 4;
            zujVar4.d = str;
            alad aladVarP2 = akzxVarM2.p();
            aooh.e(aladVarP2, "build(...)");
            ahrv ahrvVarH2 = ahrv.g(zurVarL2.b(ztwVar2, (defpackage.zuj) aladVarP2)).h(new vuj(new tge(this, 16), 15), this.c);
            wcdVar.d = null;
            wcdVar.c = 3;
            objD = aosv.D(ahrvVarH2, wcdVar);
            if (objD != aoluVar) {
                return objD;
            }
        }
        return aoluVar;
    }
}

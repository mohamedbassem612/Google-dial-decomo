package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lub {
    public static final aimz a = aimz.i("com/android/dialer/contactchecker/remote/ContactCheckerOutOfCallRemote");
    public final aoss b;
    public final aoss c;
    private final zgx d;
    private final defpackage.lum e;
    private final rlv f;
    private final aoin g;
    private final aoin h;
    private final zpm i;

    public lub(aoss aossVar, aoss aossVar2, zgx zgxVar, zpm zpmVar, defpackage.lum lumVar, rlv rlvVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "blockingScope");
        aooh.f(zgxVar, "messageSender");
        aooh.f(zpmVar, "callScopes");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableCallForwardingNumberMismatchMitigation");
        aooh.f(aoinVar2, "disableSenderSpoofAlerts");
        this.b = aossVar;
        this.c = aossVar2;
        this.d = zgxVar;
        this.i = zpmVar;
        this.e = lumVar;
        this.f = rlvVar;
        this.g = aoinVar;
        this.h = aoinVar2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(zdw r10, aoln r11) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lub.a(zdw, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0137 -> B:41:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01b9 -> B:64:0x01bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(zdw r14, aoln r15) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lub.b(zdw, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(zdw zdwVar, defpackage.lui luiVar, aoln aolnVar) {
        defpackage.lua luaVar;
        zgx zgxVar;
        zff zffVar;
        zdv zdvVar;
        zfd zfdVar;
        if (aolnVar instanceof defpackage.lua) {
            luaVar = (defpackage.lua) aolnVar;
            int i = luaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                luaVar.c = i - Integer.MIN_VALUE;
            } else {
                luaVar = new defpackage.lua(this, aolnVar);
            }
        } else {
            luaVar = new defpackage.lua(this, aolnVar);
        }
        defpackage.lua luaVar2 = luaVar;
        java.lang.Object objC = luaVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = luaVar2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                zdv zdvVar2 = luaVar2.g;
                zffVar = luaVar2.f;
                zfdVar = luaVar2.e;
                zgxVar = luaVar2.d;
                aooc.af(objC);
                zdvVar = zdvVar2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aojh.a;
        }
        aooc.af(objC);
        zgxVar = this.d;
        zfd zfdVar2 = zdwVar.b;
        zffVar = zdwVar.c;
        zdv zdvVar3 = zdv.e;
        defpackage.oq oqVarCO = mni.cO(defpackage.ltu.a.m());
        defpackage.oq oqVarCN = mni.cN(defpackage.luj.a.m());
        oqVarCN.n(luiVar);
        oqVarCO.p(oqVarCN.m());
        defpackage.ltu ltuVarO = oqVarCO.o();
        luaVar2.d = zgxVar;
        luaVar2.e = zfdVar2;
        luaVar2.f = zffVar;
        luaVar2.g = zdvVar3;
        luaVar2.c = 1;
        java.lang.Object objI = ltuVarO.i();
        if (objI == aoluVar) {
            return aoluVar;
        }
        zdvVar = zdvVar3;
        objC = objI;
        zfdVar = zfdVar2;
        zff zffVar2 = zffVar;
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(10L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        luaVar2.d = null;
        luaVar2.e = null;
        luaVar2.f = null;
        luaVar2.g = null;
        luaVar2.c = 2;
        objC = zgxVar.c(zfdVar, zffVar2, zdvVar, (byte[]) objC, durationOfSeconds, luaVar2);
        if (objC == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(apqr apqrVar, aoln aolnVar) {
        defpackage.ltx ltxVar;
        if (aolnVar instanceof defpackage.ltx) {
            ltxVar = (defpackage.ltx) aolnVar;
            int i = ltxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltxVar.c = i - Integer.MIN_VALUE;
            } else {
                ltxVar = new defpackage.ltx(this, aolnVar);
            }
        } else {
            ltxVar = new defpackage.ltx(this, aolnVar);
        }
        java.lang.Object objD = ltxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ltxVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarK = this.i.k(apqrVar, defpackage.ltv.class, new defpackage.iry(6));
            aooh.e(ajcqVarK, "fromCallProductionComponent(...)");
            ltxVar.c = 1;
            objD = aosv.D(ajcqVarK, ltxVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(apqr apqrVar, aoln aolnVar) {
        defpackage.lty ltyVar;
        if (aolnVar instanceof defpackage.lty) {
            ltyVar = (defpackage.lty) aolnVar;
            int i = ltyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltyVar.c = i - Integer.MIN_VALUE;
            } else {
                ltyVar = new defpackage.lty(this, aolnVar);
            }
        } else {
            ltyVar = new defpackage.lty(this, aolnVar);
        }
        java.lang.Object objD = ltyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ltyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarK = this.i.k(apqrVar, defpackage.ltv.class, new defpackage.iry(5));
            aooh.e(ajcqVarK, "fromCallProductionComponent(...)");
            ltyVar.c = 1;
            objD = aosv.D(ajcqVarK, ltyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(objD == zmy.b);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahea {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLogger");
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final j$.time.Instant e;
    private final defpackage.aolr f;
    private final defpackage.aoin g;
    private final j$.util.Optional h;
    private final defpackage.apdi i;

    public ahea(defpackage.apdi apdiVar, defpackage.aolr aolrVar, android.content.Context context, defpackage.aazc aazcVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, j$.util.Optional optional) {
        defpackage.aooh.f(apdiVar, "streamz");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aoinVar, "walFileSubdirectoryProvider");
        defpackage.aooh.f(aoinVar2, "walFileDoneSubdirectoryProvider");
        defpackage.aooh.f(aoinVar3, "enableTimedProcessReaperLogging");
        defpackage.aooh.f(optional, "checkboxChecker");
        this.i = apdiVar;
        this.f = aolrVar;
        this.b = context;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.g = aoinVar3;
        this.h = optional;
        j$.time.Instant instantMinusMillis = j$.time.Instant.now().minusMillis(android.os.SystemClock.elapsedRealtime());
        defpackage.aooh.e(instantMinusMillis, "run(...)");
        this.e = instantMinusMillis;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [ahzi, java.lang.Object] */
    public final java.lang.Object a(java.lang.String str, j$.time.Duration duration, java.lang.String str2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ahdw ahdwVar;
        if (aolnVar instanceof ahdw) {
            ahdwVar = (ahdw) aolnVar;
            int i = ahdwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahdwVar.c = i - Integer.MIN_VALUE;
            } else {
                ahdwVar = new ahdw(this, aolnVar);
            }
        } else {
            ahdwVar = new ahdw(this, aolnVar);
        }
        java.lang.Object objC = ahdwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ahdwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            ahdwVar.d = str;
            ahdwVar.e = duration;
            ahdwVar.f = str2;
            ahdwVar.c = 1;
            objC = c(ahdwVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = ahdwVar.f;
            duration = ahdwVar.e;
            str = ahdwVar.d;
            defpackage.aooc.af(objC);
        }
        if (!((java.lang.Boolean) objC).booleanValue()) {
            return defpackage.aojh.a;
        }
        defpackage.apdi apdiVar = this.i;
        android.content.Context context = this.b;
        defpackage.aooh.f(apdiVar, "$this$recordReapSkipped");
        defpackage.aooh.f(duration, "skipTimeSinceUpdate");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(str2, "skipReason");
        double minutes = duration.toMinutes();
        if (str == null) {
            str = "";
        }
        ((defpackage.afim) apdiVar.c.eZ()).b(minutes, context.getPackageName(), str, str2);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, ahbe ahbeVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ahdx ahdxVar;
        if (aolnVar instanceof ahdx) {
            ahdxVar = (ahdx) aolnVar;
            int i = ahdxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahdxVar.c = i - Integer.MIN_VALUE;
            } else {
                ahdxVar = new ahdx(this, aolnVar);
            }
        } else {
            ahdxVar = new ahdx(this, aolnVar);
        }
        java.lang.Object objC = ahdxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ahdxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            ahdxVar.d = str;
            ahdxVar.e = ahbeVar;
            ahdxVar.c = 1;
            objC = c(ahdxVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
            return objC;
        }
        ahbeVar = ahdxVar.e;
        str = ahdxVar.d;
        defpackage.aooc.af(objC);
        if (!((java.lang.Boolean) objC).booleanValue()) {
            return null;
        }
        defpackage.aolr aolrVar = this.f;
        ahdy ahdyVar = new ahdy(this, ahbeVar, str, (defpackage.aoln) null);
        ahdxVar.d = null;
        ahdxVar.e = null;
        ahdxVar.c = 2;
        java.lang.Object objAj = defpackage.aoov.aj(aolrVar, ahdyVar, ahdxVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        ahdz ahdzVar;
        ahid ahidVar;
        if (aolnVar instanceof ahdz) {
            ahdzVar = (ahdz) aolnVar;
            int i = ahdzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahdzVar.c = i - Integer.MIN_VALUE;
            } else {
                ahdzVar = new ahdz(this, aolnVar);
            }
        } else {
            ahdzVar = new ahdz(this, aolnVar);
        }
        java.lang.Object objD = ahdzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ahdzVar.c;
        boolean z = false;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            if (((java.lang.Boolean) this.g.a()).booleanValue() && (ahidVar = (ahid) defpackage.aooh.q(this.h)) != null) {
                defpackage.ajcq ajcqVarA = ahidVar.a();
                ahdzVar.c = 1;
                objD = defpackage.aosv.D(ajcqVarA, ahdzVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objD);
        if (defpackage.aooh.n(objD, java.lang.Boolean.TRUE)) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jph implements zqk {
    private static final aimz a = aimz.i("com/android/dialer/callclassification/logging/impl/CallClassificationDataLogger");
    private final android.content.Context b;
    private final zzd c;
    private final aoss d;
    private final int e;
    private final zzx f;
    private final afpl g;

    public jph(android.content.Context context, zzd zzdVar, aoss aossVar, afpl afplVar, int i, zzx zzxVar) {
        aooh.f(context, "appContext");
        aooh.f(zzdVar, "scoobyClearcutLogger");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.b = context;
        this.c = zzdVar;
        this.d = aossVar;
        this.g = afplVar;
        this.e = 5;
        this.f = zzxVar;
    }

    private static final long k(long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        return timeUnit.toMillis(j / 3600000);
    }

    public final long a(long j) {
        return k(j);
    }

    public final long b(long j) {
        return k(j);
    }

    public final zzd c() {
        return this.c;
    }

    public final zzu d() {
        return abtl.b(this.b, new defpackage.aiyj());
    }

    public final /* synthetic */ ajcq e() {
        return aehj.ch();
    }

    public final ajcq f() {
        return aosv.F(this.d, 0, new defpackage.jlk(this, (aoln) null, 6), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.jpd jpdVar;
        if (aolnVar instanceof defpackage.jpd) {
            jpdVar = (defpackage.jpd) aolnVar;
            int i = jpdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpdVar.c = i - Integer.MIN_VALUE;
            } else {
                jpdVar = new defpackage.jpd(this, aolnVar);
            }
        } else {
            jpdVar = new defpackage.jpd(this, aolnVar);
        }
        java.lang.Object objI = jpdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jpdVar.c;
        if (i2 == 0) {
            aooc.af(objI);
            jpdVar.c = 1;
            objI = i(jpdVar);
            if (objI != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objI);
            return objI;
        }
        aooc.af(objI);
        ajcq ajcqVarU = ((defpackage.jpc) objI).u();
        jpdVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarU, jpdVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bf -> B:31:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(aoln r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jph.h(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.jpf jpfVar;
        if (aolnVar instanceof defpackage.jpf) {
            jpfVar = (defpackage.jpf) aolnVar;
            int i = jpfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpfVar.c = i - Integer.MIN_VALUE;
            } else {
                jpfVar = new defpackage.jpf(this, aolnVar);
            }
        } else {
            jpfVar = new defpackage.jpf(this, aolnVar);
        }
        java.lang.Object objD = jpfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jpfVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.g.X();
            jpfVar.c = 1;
            objD = aosv.D(ajcqVarX, jpfVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.jpc.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.jpg jpgVar;
        if (aolnVar instanceof defpackage.jpg) {
            jpgVar = (defpackage.jpg) aolnVar;
            int i = jpgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpgVar.c = i - Integer.MIN_VALUE;
            } else {
                jpgVar = new defpackage.jpg(this, aolnVar);
            }
        } else {
            jpgVar = new defpackage.jpg(this, aolnVar);
        }
        java.lang.Object objI = jpgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jpgVar.c;
        if (i2 == 0) {
            aooc.af(objI);
            jpgVar.c = 1;
            objI = i(jpgVar);
            if (objI != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objI);
            return objI;
        }
        aooc.af(objI);
        ajcq ajcqVarBy = ((defpackage.jpc) objI).by();
        jpgVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarBy, jpgVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }
}

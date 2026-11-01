package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqu {
    public static final aimz a = aimz.i("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivity");
    public final oko b;
    public final aoss c;
    public final aoss d;
    public final aolr e;
    public final android.telephony.TelephonyCallback f;
    public aoub g;
    public defpackage.zqx h;
    public oko i;
    public boolean j;
    public final defpackage.znn k;
    public final defpackage.zno l;
    public final defpackage.zoi m;
    public final apdp n;
    public final apdp o;
    private final zpz p;
    private final defpackage.afpl q;

    public zqu(oko okoVar, aoss aossVar, aoss aossVar2, aolr aolrVar, defpackage.afpl afplVar, zpz zpzVar) {
        aooh.f(aossVar, "blockingScope");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.b = okoVar;
        this.c = aossVar;
        this.d = aossVar2;
        this.e = aolrVar;
        this.q = afplVar;
        this.p = zpzVar;
        this.f = android.os.Build.VERSION.SDK_INT < 31 ? null : new defpackage.zqq(this, 0);
        a.b().l("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivity", "<init>", 61, "DialingConnectivity.kt").v("init");
        this.n = new apdp();
        this.h = defpackage.zqx.a;
        this.o = new apdp();
        this.k = new defpackage.znn() { // from class: zqn
            @Override // defpackage.znn
            public final ajcq c() {
                defpackage.zqu zquVar = this.a;
                return aosv.F(zquVar.d, 0, new defpackage.zqs(zquVar, (aoln) null, 1, (byte[]) null), 3);
            }
        };
        this.l = new defpackage.otk(this, 9);
        this.m = new jwb(this, 10);
    }

    private final void e(defpackage.zqx zqxVar) {
        a.b().l("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivity", "updateState", 85, "DialingConnectivity.kt").y("Updating state to %s", zqxVar);
        this.h = zqxVar;
        this.p.a(ajcm.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.zqp zqpVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.zqp) {
            zqpVar = (defpackage.zqp) aolnVar;
            int i = zqpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqpVar.c = i - Integer.MIN_VALUE;
            } else {
                zqpVar = new defpackage.zqp(this, aolnVar);
            }
        } else {
            zqpVar = new defpackage.zqp(this, aolnVar);
        }
        java.lang.Object obj = zqpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zqpVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.n;
            zqpVar.d = apdpVar2;
            zqpVar.c = 1;
            if (apdpVar2.b(zqpVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = zqpVar.d;
            aooc.af(obj);
        }
        try {
            aoub aoubVar = this.g;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
                this.g = null;
                e(defpackage.zqx.a);
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.zqr zqrVar;
        if (aolnVar instanceof defpackage.zqr) {
            zqrVar = (defpackage.zqr) aolnVar;
            int i = zqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqrVar.c = i - Integer.MIN_VALUE;
            } else {
                zqrVar = new defpackage.zqr(this, aolnVar);
            }
        } else {
            zqrVar = new defpackage.zqr(this, aolnVar);
        }
        java.lang.Object objD = zqrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zqrVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.q.X();
            zqrVar.c = 1;
            objD = aosv.D(ajcqVarX, zqrVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarQ = ((defpackage.zqo) aooc.ar(objD, defpackage.zqo.class)).q();
        zqrVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarQ, zqrVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objN;
        android.telephony.TelephonyCallback telephonyCallback = this.f;
        if (telephonyCallback != null) {
            a.b().l("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivity", "unregisterTelephonyCallback", 168, "DialingConnectivity.kt").v("Unregistering telephony callback");
            oko okoVar = this.i;
            if (okoVar != null && (objN = okoVar.N(telephonyCallback, aolnVar)) == aolu.a) {
                return objN;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.zqt zqtVar;
        if (aolnVar instanceof defpackage.zqt) {
            zqtVar = (defpackage.zqt) aolnVar;
            int i = zqtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqtVar.c = i - Integer.MIN_VALUE;
            } else {
                zqtVar = new defpackage.zqt(this, aolnVar);
            }
        } else {
            zqtVar = new defpackage.zqt(this, aolnVar);
        }
        java.lang.Object obj = zqtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zqtVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            zqtVar.c = 1;
            if (aosv.j(5000L, zqtVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        e(defpackage.zqx.b);
        return aojh.a;
    }
}

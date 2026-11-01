package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbk {
    public static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/relay/impl/EchoPhoneRelayImpl");
    public final aoin b;
    public final defpackage.wbm c;
    public final defpackage.way d;
    public final aoss e;
    public boolean f;
    public final apdp g;
    public final ahda h;
    public final apni i;
    private final zzx j;

    public wbk(aoin aoinVar, zzx zzxVar, defpackage.wbm wbmVar, apni apniVar, defpackage.way wayVar, aoss aossVar) {
        aooh.f(aoinVar, "enableEchoPhoneRelayAsync");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        this.b = aoinVar;
        this.j = zzxVar;
        this.c = wbmVar;
        this.i = apniVar;
        this.d = wayVar;
        this.e = aossVar;
        this.g = new apdp();
        this.h = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aonj aonjVar, aoln aolnVar) {
        defpackage.wbh wbhVar;
        if (aolnVar instanceof defpackage.wbh) {
            wbhVar = (defpackage.wbh) aolnVar;
            int i = wbhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbhVar.d = i - Integer.MIN_VALUE;
            } else {
                wbhVar = new defpackage.wbh(this, aolnVar);
            }
        } else {
            wbhVar = new defpackage.wbh(this, aolnVar);
        }
        java.lang.Object obj = wbhVar.b;
        aolu aoluVar = aolu.a;
        int i2 = wbhVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    this = wbhVar.e;
                    aonjVar = (aonj) wbhVar.a;
                    aooc.af(obj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (apdp) wbhVar.a;
                    aooc.af(obj);
                }
                this.d();
                return aojh.a;
            }
            aooc.af(obj);
            if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                this.i.i(ahvr.ag(this.e, this.h, new defpackage.wcj(aonjVar, (aoln) null, 1)));
            } else {
                this = this.g;
                wbhVar.a = aonjVar;
                wbhVar.e = this;
                wbhVar.d = 1;
                if (this.b(wbhVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
            wbhVar.a = this;
            wbhVar.e = null;
            wbhVar.d = 2;
            if (aonjVar.a(wbhVar) == aoluVar) {
                return aoluVar;
            }
            this.d();
            return aojh.a;
        } catch (java.lang.Throwable th) {
            this.d();
            throw th;
        }
    }

    public final java.lang.Object b(aoln aolnVar) {
        java.lang.Object objA = a(new defpackage.sbm(this, (aoln) null, 20), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.wbe wbeVar, aoln aolnVar) {
        defpackage.wbj wbjVar;
        java.lang.Object objK;
        defpackage.wbc wbcVar;
        if (aolnVar instanceof defpackage.wbj) {
            wbjVar = (defpackage.wbj) aolnVar;
            int i = wbjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbjVar.d = i - Integer.MIN_VALUE;
            } else {
                wbjVar = new defpackage.wbj(this, aolnVar);
            }
        } else {
            wbjVar = new defpackage.wbj(this, aolnVar);
        }
        java.lang.Object obj = wbjVar.b;
        aolu aoluVar = aolu.a;
        int i2 = wbjVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/wear/echo/impl/relay/impl/EchoPhoneRelayImpl", "relayEchoPhoneEventToListeners", 92, "EchoPhoneRelayImpl.kt").y("Propagating Echo phone event: %s", wbeVar);
            objK = this.j.e().k();
            aooh.e(objK, "iterator(...)");
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objK = wbjVar.a;
            wbeVar = wbjVar.e;
            aooc.af(obj);
        }
        do {
            ailj ailjVar = (ailj) objK;
            if (!ailjVar.hasNext()) {
                return aojh.a;
            }
            wbcVar = (defpackage.wbc) ailjVar.next();
            wbjVar.e = wbeVar;
            wbjVar.a = objK;
            wbjVar.d = 1;
        } while (wbcVar.a(wbeVar, wbjVar) != aoluVar);
        return aoluVar;
    }
}

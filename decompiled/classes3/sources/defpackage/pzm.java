package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public pzm(aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.b = aossVar;
        this.a = new ahda((byte[]) null);
        this.c = new java.util.ArrayList();
    }

    public final void a(char c) {
        if (!aoov.J("0123456789*#", c)) {
            throw new java.lang.IllegalArgumentException("not a playable character");
        }
        ((defpackage.pqm) this.c).q(c);
    }

    public final void b() {
        ((defpackage.pqm) this.c).s();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoss, java.lang.Object] */
    public final java.lang.Object c(char c, j$.time.Duration duration, aoln aolnVar) {
        if (!aoov.J("0123456789*#", c)) {
            throw new java.lang.IllegalArgumentException("not a playable character");
        }
        java.lang.Object objA = ahvr.ag((aoss) this.a, (ahda) this.b, new defpackage.pzl(this, c, duration, null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(android.telecom.Call call) {
        agsm.i(568, ahvr.G(new qat(this, call, 2), (java.util.concurrent.Executor) this.a), "Task for sending IN_CALL_SERVICE_ON_CALL_ADDED_RECEIVED failed.", new java.lang.Object[0]);
        defpackage.rdp rdpVar = (defpackage.rdp) this.b;
        java.lang.String strE = ((zjm) rdpVar.a).e(call);
        java.lang.Object obj = rdpVar.c;
        ((j$.util.concurrent.ConcurrentHashMap) rdpVar.b).put(strE, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [aoss, java.lang.Object] */
    public final java.lang.Object e(defpackage.ampy ampyVar, aoln aolnVar) {
        defpackage.pzh pzhVar;
        if (aolnVar instanceof defpackage.pzh) {
            pzhVar = (defpackage.pzh) aolnVar;
            int i = pzhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzhVar.b = i - Integer.MIN_VALUE;
            } else {
                pzhVar = new defpackage.pzh(this, aolnVar);
            }
        } else {
            pzhVar = new defpackage.pzh(this, aolnVar);
        }
        java.lang.Object obj = pzhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pzhVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag((aoss) this.b, (ahda) this.a, new ofa(this, ampyVar, (aoln) null, 20));
            pzhVar.b = 1;
            if (aosyVarAg.a(pzhVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public pzm(zpz zpzVar, defpackage.pzm pzmVar) {
        this.b = new java.lang.StringBuilder();
        this.c = zpzVar;
        this.a = pzmVar;
    }

    public pzm(ajct ajctVar, gat gatVar, defpackage.rdp rdpVar) {
        this.a = ajctVar;
        this.c = gatVar;
        this.b = rdpVar;
    }

    public pzm(defpackage.pqm pqmVar, aoss aossVar) {
        aooh.f(pqmVar, "callController");
        aooh.f(aossVar, "backgroundScope");
        this.c = pqmVar;
        this.a = aossVar;
        this.b = new ahda((byte[]) null);
    }
}

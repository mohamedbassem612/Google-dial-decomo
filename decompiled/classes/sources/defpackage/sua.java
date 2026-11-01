package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sua implements defpackage.zta {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final java.lang.Object b;

    public sua(defpackage.aazc aazcVar, defpackage.gat gatVar, defpackage.zpm zpmVar, int i) {
        this.$cid = i;
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (gatVar == null) {
            defpackage.aooh.i("placeOutgoingCallInteractionContextRegistry");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.a = gatVar;
        this.b = zpmVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        if (this.$cid != 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            throw new java.lang.UnsupportedOperationException();
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        if (this.$cid == 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            return defpackage.aiql.z(zsz.d);
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        char c = 2;
        int i = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).g;
        if (i != 0) {
            if (i == 1) {
                c = 3;
            } else if (i != 2) {
                c = i != 3 ? (char) 0 : (char) 5;
            } else {
                c = 4;
            }
        }
        return (c == 0 || c != 4) ? defpackage.aiql.z(zsz.b) : defpackage.aiql.z(zsz.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        if (this.$cid != 0) {
            defpackage.aooh.f(zrxVar, "callParameter");
            return defpackage.aosv.F(this.b, 0, new rxk(zrxVar, this, (defpackage.aoln) null, 1), 3);
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        java.lang.Object obj = this.a;
        defpackage.gat gatVar = (defpackage.gat) obj;
        ?? r8 = gatVar.b;
        java.lang.Long lValueOf = java.lang.Long.valueOf(epochMilli);
        defpackage.ajcq ajcqVarJ = r8.containsKey(lValueOf) ? gatVar.j(epochMilli) : defpackage.ajcm.a;
        defpackage.gat gatVar2 = (defpackage.gat) gatVar.c;
        defpackage.ajcu ajcuVar = (defpackage.ajcu) gatVar2.e.a();
        ajcuVar.getClass();
        ?? r13 = gatVar2.c;
        defpackage.ruc rucVar = (defpackage.ruc) gatVar2.b.a();
        rucVar.getClass();
        defpackage.rlv rlvVar = (defpackage.rlv) gatVar2.d.a();
        rlvVar.getClass();
        defpackage.gpd gpdVar = (defpackage.gpd) gatVar2.a.a();
        gpdVar.getClass();
        jxm jxmVar = new jxm(ajcuVar, (defpackage.aoin) r13, rucVar, rlvVar, gpdVar, epochMilli);
        r8.put(lValueOf, jxmVar);
        ioi ioiVar = new ioi(jxmVar, 10);
        java.util.concurrent.Executor executor = jxmVar.f;
        long jLongValue = ((java.lang.Long) gatVar.e.a()).longValue() / 1000;
        lki lkiVar = new lki(obj, epochMilli, 1);
        ?? r2 = gatVar.d;
        defpackage.ajcq ajcqVarD = defpackage.ahvr.D(lkiVar, jLongValue + 10, java.util.concurrent.TimeUnit.SECONDS, r2);
        defpackage.agsm.i(187, ajcqVarD, "Task for automatically removing interaction context failed.", new java.lang.Object[0]);
        defpackage.agsm.i(839, defpackage.ahvr.ak(ajcqVarJ, defpackage.ahvr.E(ioiVar, executor), defpackage.ahvr.E(new jnv(jxmVar, ajcqVarD, 2, (byte[]) null), executor)).o(new jse(4), r2), "PlaceOutgoingCallInteractionContextRegistry#startNewInteraction failed", new java.lang.Object[0]);
        boolean zIsEmpty = ((defpackage.zpm) this.b).a().isEmpty();
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            defpackage.agsm.i(840, gatVar.i(epochMilli, jxn.q), "Emitting event ALREADY_IN_CALL failed.", new java.lang.Object[0]);
        }
        zoe zoeVarCi = defpackage.aehj.ci(zrxVar.L());
        uzx uzxVarCu = defpackage.aehj.cu(zoeVarCi.b().L());
        jhw jhwVarL = hmr.l(uzxVarCu.S().L());
        defpackage.akzx akzxVar = (defpackage.akzx) jhwVarL.a;
        akzxVar.u();
        jxb jxbVar = akzxVar.b;
        jxbVar.c |= 8388608;
        jxbVar.y = epochMilli;
        uzxVarCu.V(jhwVarL.B());
        uzxVarCu.Z();
        uzxVarCu.Y("EXTRA_ALREADY_IN_CALL", z);
        zoeVarCi.d(uzxVarCu.T());
        return defpackage.aiql.z(zoeVarCi.a());
    }

    public sua(defpackage.rsr rsrVar, defpackage.aoss aossVar, int i) {
        this.$cid = i;
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = rsrVar;
        this.b = aossVar;
    }
}

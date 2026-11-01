package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbi implements defpackage.zva {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public qbi(defpackage.qbg qbgVar, defpackage.pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(qbgVar, "callBasicMetricsTracker");
        aooh.f(pqoVar, "callDirection");
        this.a = qbgVar;
        this.b = pqoVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    @Override // defpackage.zva
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.qbh qbhVar;
        defpackage.zuz zuzVar;
        defpackage.paa paaVar;
        defpackage.qkq qkqVar;
        int i = this.$cid;
        defpackage.aayk aaykVar = null;
        if (i == 0) {
            if (aolnVar instanceof defpackage.qbh) {
                qbhVar = (defpackage.qbh) aolnVar;
                int i2 = qbhVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qbhVar.c = i2 - Integer.MIN_VALUE;
                } else {
                    qbhVar = new defpackage.qbh(this, aolnVar);
                }
            } else {
                qbhVar = new defpackage.qbh(this, aolnVar);
            }
            java.lang.Object objD = qbhVar.a;
            aolu aoluVar = aolu.a;
            int i3 = qbhVar.c;
            if (i3 == 0) {
                aooc.af(objD);
                ajcq ajcqVar = ((defpackage.pqo) this.b).b;
                aooh.e(ajcqVar, "getDirection(...)");
                qbhVar.c = 1;
                objD = aosv.D(ajcqVar, qbhVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            if (((defpackage.zmy) objD) == defpackage.zmy.b) {
                defpackage.qbg qbgVar = (defpackage.qbg) this.a;
                if (qbgVar.a.isPresent()) {
                    aaykVar = ((java.lang.Long) qbgVar.b.orElse(0L)).longValue() > 0 ? defpackage.aayk.SUCCESS : defpackage.aayk.ERROR;
                }
            }
            zuzVar = new defpackage.zuz(null, null, null, aaykVar, null, null);
        } else if (i != 1) {
            if (aolnVar instanceof defpackage.qkq) {
                qkqVar = (defpackage.qkq) aolnVar;
                int i4 = qkqVar.b;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    qkqVar.b = i4 - Integer.MIN_VALUE;
                } else {
                    qkqVar = new defpackage.qkq(this, aolnVar);
                }
            } else {
                qkqVar = new defpackage.qkq(this, aolnVar);
            }
            java.lang.Object objD2 = qkqVar.a;
            aolu aoluVar2 = aolu.a;
            int i5 = qkqVar.b;
            if (i5 == 0) {
                aooc.af(objD2);
                ajcq ajcqVar2 = ((defpackage.pqo) this.b).b;
                aooh.e(ajcqVar2, "getDirection(...)");
                qkqVar.b = 1;
                objD2 = aosv.D(ajcqVar2, qkqVar);
                if (objD2 == aoluVar2) {
                    return aoluVar2;
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD2);
            }
            if (((defpackage.zmy) objD2) == defpackage.zmy.a) {
                aaykVar = ((defpackage.qko) this.a).f.get() ? defpackage.aayk.SUCCESS : defpackage.aayk.ERROR;
            }
            zuzVar = new defpackage.zuz(null, null, null, null, aaykVar, null);
        } else {
            if (aolnVar instanceof defpackage.paa) {
                paaVar = (defpackage.paa) aolnVar;
                int i6 = paaVar.b;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    paaVar.b = i6 - Integer.MIN_VALUE;
                } else {
                    paaVar = new defpackage.paa(this, aolnVar);
                }
            } else {
                paaVar = new defpackage.paa(this, aolnVar);
            }
            java.lang.Object objD3 = paaVar.a;
            aolu aoluVar3 = aolu.a;
            int i7 = paaVar.b;
            if (i7 == 0) {
                aooc.af(objD3);
                ajcq ajcqVar3 = ((defpackage.pqo) this.a).b;
                aooh.e(ajcqVar3, "getDirection(...)");
                paaVar.b = 1;
                objD3 = aosv.D(ajcqVar3, paaVar);
                if (objD3 == aoluVar3) {
                    return aoluVar3;
                }
            } else {
                if (i7 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD3);
            }
            if (((defpackage.zmy) objD3) == defpackage.zmy.a && ((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.wjc) this.b).a).get()) {
                aaykVar = defpackage.aayk.SUCCESS;
            }
            zuzVar = new defpackage.zuz(null, null, null, null, null, aaykVar);
        }
        return zuzVar;
    }

    public qbi(defpackage.qko qkoVar, defpackage.pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(qkoVar, "statusBarNotificationController");
        aooh.f(pqoVar, "callDirection");
        this.a = qkoVar;
        this.b = pqoVar;
    }

    public qbi(defpackage.wjc wjcVar, defpackage.pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(wjcVar, "answerController");
        aooh.f(pqoVar, "callDirection");
        this.b = wjcVar;
        this.a = pqoVar;
    }
}

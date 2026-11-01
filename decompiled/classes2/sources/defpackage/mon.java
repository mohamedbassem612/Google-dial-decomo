package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mon implements defpackage.jqh {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public mon(java.lang.String str, whs whsVar, int i) {
        this.$cid = i;
        aooh.f(str, "callId");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        this.b = str;
        this.a = whsVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.jqh
    public final java.lang.Object a(defpackage.aixo aixoVar, aoln aolnVar) {
        defpackage.mom momVar;
        defpackage.aixo aixoVar2;
        defpackage.jih jihVar;
        defpackage.aixo aixoVar3;
        defpackage.aixl aixlVar;
        whn whnVar;
        defpackage.aiys aiysVar;
        int i = this.$cid;
        if (i == 0) {
            if (aolnVar instanceof defpackage.mom) {
                momVar = (defpackage.mom) aolnVar;
                int i2 = momVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    momVar.c = i2 - Integer.MIN_VALUE;
                } else {
                    momVar = new defpackage.mom(this, aolnVar);
                }
            } else {
                momVar = new defpackage.mom(this, aolnVar);
            }
            java.lang.Object objD = momVar.a;
            aolu aoluVar = aolu.a;
            int i3 = momVar.c;
            if (i3 == 0) {
                aooc.af(objD);
                ajcq ajcqVar = ((pqo) this.b).b;
                aooh.e(ajcqVar, "getDirection(...)");
                momVar.d = aixoVar;
                momVar.c = 1;
                objD = aosv.D(ajcqVar, momVar);
                if (objD != aoluVar) {
                }
                return aoluVar;
            }
            if (i3 == 1) {
                aixoVar = momVar.d;
                aooc.af(objD);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aixoVar2 = momVar.d;
                aooc.af(objD);
            }
            uzx uzxVarY = defpackage.airh.y(aixoVar2.p());
            uzxVarY.an((defpackage.aiye) objD);
            return uzxVarY.ah();
            if (objD != zmy.b) {
                java.lang.Object obj = this.a;
                momVar.d = aixoVar;
                momVar.c = 2;
                defpackage.mqt mqtVar = (defpackage.mqt) obj;
                objD = aoov.aj(mqtVar.a, new defpackage.lve(mqtVar, (aoln) null, 19, (char[]) null), momVar);
                if (objD != aoluVar) {
                    aixoVar2 = aixoVar;
                    uzx uzxVarY2 = defpackage.airh.y(aixoVar2.p());
                    uzxVarY2.an((defpackage.aiye) objD);
                    return uzxVarY2.ah();
                }
                return aoluVar;
            }
        } else {
            if (i != 1) {
                if (aolnVar instanceof whn) {
                    whnVar = (whn) aolnVar;
                    int i4 = whnVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        whnVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        whnVar = new whn(this, aolnVar);
                    }
                } else {
                    whnVar = new whn(this, aolnVar);
                }
                java.lang.Object objD2 = whnVar.a;
                aolu aoluVar2 = aolu.a;
                int i5 = whnVar.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        aixoVar = whnVar.c;
                        aooc.af(objD2);
                    } else {
                        if (i5 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aiysVar = whnVar.d;
                        aixoVar = whnVar.c;
                        aooc.af(objD2);
                    }
                    uzx uzxVarY3 = defpackage.airh.y(aixoVar.p());
                    aooh.c(aiysVar);
                    aooh.f(aiysVar, "value");
                    akzx akzxVar = (akzx) uzxVarY3.a;
                    akzxVar.u();
                    defpackage.aixo aixoVar4 = (defpackage.aixo) akzxVar.b;
                    j$.util.Objects.requireNonNull(aiysVar);
                    aixoVar4.B = aiysVar;
                    aixoVar4.b |= 1073741824;
                    return uzxVarY3.ah();
                }
                aooc.af(objD2);
                java.lang.Object obj2 = this.a;
                ajcq ajcqVarG = ahvr.G(new vfm(obj2, this.b, 10, (byte[]) null), ((whs) obj2).c);
                whnVar.c = aixoVar;
                whnVar.b = 1;
                objD2 = aosv.D(ajcqVarG, whnVar);
                if (objD2 == aoluVar2) {
                    return aoluVar2;
                }
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = this.b;
                defpackage.aiys aiysVar2 = (defpackage.aiys) objD2;
                whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "clearScoobyClearcutLogs", 215, "XatuLoggingCoordinatorImpl.java").y("clearing clearcut logs for [%s]", obj4);
                wsk wskVar = ((whs) obj3).f;
                ajcq ajcqVarF = ahvr.F(new whv(wskVar, obj4, 1), (java.util.concurrent.Executor) wskVar.b);
                whnVar.c = aixoVar;
                whnVar.d = aiysVar2;
                whnVar.b = 2;
                if (aosv.D(ajcqVarF, whnVar) == aoluVar2) {
                    return aoluVar2;
                }
                aiysVar = aiysVar2;
                uzx uzxVarY4 = defpackage.airh.y(aixoVar.p());
                aooh.c(aiysVar);
                aooh.f(aiysVar, "value");
                akzx akzxVar2 = (akzx) uzxVarY4.a;
                akzxVar2.u();
                defpackage.aixo aixoVar5 = (defpackage.aixo) akzxVar2.b;
                j$.util.Objects.requireNonNull(aiysVar);
                aixoVar5.B = aiysVar;
                aixoVar5.b |= 1073741824;
                return uzxVarY4.ah();
            }
            if (aolnVar instanceof defpackage.jih) {
                jihVar = (defpackage.jih) aolnVar;
                int i6 = jihVar.b;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    jihVar.b = i6 - Integer.MIN_VALUE;
                } else {
                    jihVar = new defpackage.jih(this, aolnVar);
                }
            } else {
                jihVar = new defpackage.jih(this, aolnVar);
            }
            java.lang.Object objD3 = jihVar.a;
            aolu aoluVar3 = aolu.a;
            int i7 = jihVar.b;
            if (i7 == 0) {
                aooc.af(objD3);
                ajcq ajcqVar2 = ((pqo) this.b).b;
                aooh.e(ajcqVar2, "getDirection(...)");
                jihVar.c = aixoVar;
                jihVar.b = 1;
                objD3 = aosv.D(ajcqVar2, jihVar);
                if (objD3 != aoluVar3) {
                }
                return aoluVar3;
            }
            if (i7 == 1) {
                aixoVar = jihVar.c;
                aooc.af(objD3);
            } else {
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aixo aixoVar6 = jihVar.c;
                aooc.af(objD3);
                aixoVar3 = aixoVar6;
            }
            aixlVar = (defpackage.aixl) objD3;
            if (aixlVar != null) {
                return aixoVar3;
            }
            uzx uzxVarY5 = defpackage.airh.y(aixoVar3.p());
            akzx akzxVar3 = (akzx) uzxVarY5.a;
            akzxVar3.u();
            defpackage.aixo aixoVar7 = (defpackage.aixo) akzxVar3.b;
            j$.util.Objects.requireNonNull(aixlVar);
            aixoVar7.I = aixlVar;
            aixoVar7.c |= 32;
            return uzxVarY5.ah();
            if (objD3 != zmy.b) {
                java.lang.Object obj5 = this.a;
                jihVar.c = aixoVar;
                jihVar.b = 2;
                objD3 = ((defpackage.jik) obj5).a(jihVar);
                if (objD3 != aoluVar3) {
                    aixoVar3 = aixoVar;
                    aixlVar = (defpackage.aixl) objD3;
                    if (aixlVar != null) {
                        return aixoVar3;
                    }
                    uzx uzxVarY6 = defpackage.airh.y(aixoVar3.p());
                    akzx akzxVar4 = (akzx) uzxVarY6.a;
                    akzxVar4.u();
                    defpackage.aixo aixoVar8 = (defpackage.aixo) akzxVar4.b;
                    j$.util.Objects.requireNonNull(aixlVar);
                    aixoVar8.I = aixlVar;
                    aixoVar8.c |= 32;
                    return uzxVarY6.ah();
                }
                return aoluVar3;
            }
        }
        return aixoVar;
    }

    public mon(defpackage.jik jikVar, pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(pqoVar, "direction");
        this.a = jikVar;
        this.b = pqoVar;
    }

    public mon(defpackage.mqt mqtVar, pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(pqoVar, "direction");
        this.a = mqtVar;
        this.b = pqoVar;
    }
}

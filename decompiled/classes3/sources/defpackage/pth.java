package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pth implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ pth(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v8, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = defpackage.pti.b;
            aimz aimzVar = defpackage.qgn.a;
            aimw aimwVarD = aimzVar.d();
            ainp ainpVar = zct.b;
            aimw aimwVarL = aimwVarD.i(ainpVar).l("com/android/dialer/incall/rtt/service/RttSessionController$2", "onRttInitiationFailed", 90, "RttSessionController.java");
            int i3 = this.a;
            aimwVarL.w("RTT initiation failed. reason: %d", i3);
            defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) this.b).a;
            defpackage.qbe qbeVar = qgnVar.m;
            qbeVar.a(qbc.dW);
            if (i3 == 2) {
                qbeVar.a(qbc.dX);
            } else if (i3 == 3) {
                qbeVar.a(qbc.dY);
            } else if (i3 == 4) {
                qbeVar.a(qbc.ea);
            } else if (i3 != 5) {
                a.bI(aimzVar.c().m(aioa.b), "Should not get here", "com/android/dialer/incall/rtt/service/RttSessionController", "logRttInitiationFailureReason", (char) 230, "RttSessionController.java", ainpVar);
            } else {
                qbeVar.a(qbc.dZ);
            }
            return i3 == 5 ? qgnVar.b(2132019951) : qgnVar.b(2132019952);
        }
        if (i == 1) {
            final int i4 = this.a;
            final defpackage.pqm pqmVar = (defpackage.pqm) this.b;
            return dff.m(new dsf() { // from class: pqg
                public final java.lang.Object a(dsd dsdVar) {
                    defpackage.pqm pqmVar2 = pqmVar;
                    agsm.i(498, ahvr.G(new defpackage.ahel(pqmVar2, i4, dsdVar, 1), pqmVar2.c), "Failed to process answer completer.", new java.lang.Object[0]);
                    return "Answer";
                }
            });
        }
        if (i == 2) {
            final int i5 = this.a;
            return ((defpackage.usj) this.b).e.bl(new dxx() { // from class: usi
                public final java.lang.Object a(java.lang.Object obj) {
                    akzx akzxVarP = ((defpackage.usm) obj).p();
                    akzxVarP.u();
                    defpackage.usm usmVar = (defpackage.usm) akzxVarP.b;
                    usmVar.b |= 1;
                    usmVar.c = i5;
                    return (defpackage.usm) akzxVarP.p();
                }
            });
        }
        if (i != 3) {
            if (i == 4) {
                ((vku) this.b).e(this.a, 4, 3);
                return ajcm.a;
            }
            java.lang.Object obj = this.b;
            if (i != 5) {
                agqj agqjVar = (agqj) obj;
                return defpackage.adcs.e(agqjVar.b.c()).g(new lhb(obj, this.a, 9), agqjVar.d);
            }
            final ahbq ahbqVar = (ahbq) obj;
            ?? r0 = ahbqVar.d;
            final int i6 = this.a;
            return ahvr.I(r0.c(), new ajat() { // from class: adbb
                /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
                /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.concurrent.Executor] */
                public final ajcq a(java.lang.Object obj2) {
                    ajcq ajcqVarH;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (defpackage.adac adacVar : (java.util.List) obj2) {
                        defpackage.acwb acwbVar = adacVar.a;
                        defpackage.acvu acvuVar = adacVar.b;
                        akzx akzxVarM = aiwm.a.m();
                        java.lang.String str = acwbVar.c;
                        akzxVarM.u();
                        aiwm aiwmVar = akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        aiwmVar.b |= 1;
                        aiwmVar.c = str;
                        java.lang.String str2 = acwbVar.d;
                        akzxVarM.u();
                        aiwm aiwmVar2 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(str2);
                        aiwmVar2.b |= 4;
                        aiwmVar2.e = str2;
                        int i7 = acvuVar.f;
                        akzxVarM.u();
                        aiwm aiwmVar3 = akzxVarM.b;
                        aiwmVar3.b |= 2;
                        aiwmVar3.d = i7;
                        int size = acvuVar.o.size();
                        akzxVarM.u();
                        aiwm aiwmVar4 = akzxVarM.b;
                        aiwmVar4.b |= 8;
                        aiwmVar4.f = size;
                        java.util.Iterator it = acvuVar.o.iterator();
                        int i8 = 0;
                        while (it.hasNext()) {
                            if (afsq.as((defpackage.acvr) it.next())) {
                                i8++;
                            }
                        }
                        int i9 = i6;
                        akzxVarM.u();
                        aiwm aiwmVar5 = akzxVarM.b;
                        aiwmVar5.b |= 16;
                        aiwmVar5.g = i8;
                        boolean z = !acwbVar.e.isEmpty();
                        akzxVarM.u();
                        aiwm aiwmVar6 = akzxVarM.b;
                        aiwmVar6.b |= 32;
                        aiwmVar6.h = z;
                        long j = acvuVar.s;
                        akzxVarM.u();
                        aiwm aiwmVar7 = akzxVarM.b;
                        aiwmVar7.b |= 64;
                        aiwmVar7.i = j;
                        java.lang.String str3 = acvuVar.t;
                        akzxVarM.u();
                        aiwm aiwmVar8 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(str3);
                        aiwmVar8.b |= 128;
                        aiwmVar8.j = str3;
                        aiwm aiwmVarP = akzxVarM.p();
                        akzx akzxVarM2 = aiwu.a.m();
                        akzxVarM2.u();
                        aiwu aiwuVar = akzxVarM2.b;
                        aiwuVar.b |= 8;
                        aiwuVar.f = i9;
                        defpackage.acvs acvsVar = acvuVar.c;
                        if (acvsVar == null) {
                            acvsVar = defpackage.acvs.a;
                        }
                        if ((acvsVar.b & 2) != 0) {
                            defpackage.acvs acvsVar2 = acvuVar.c;
                            if (acvsVar2 == null) {
                                acvsVar2 = defpackage.acvs.a;
                            }
                            long j2 = acvsVar2.d / 1000;
                            akzxVarM2.u();
                            aiwu aiwuVar2 = akzxVarM2.b;
                            aiwuVar2.b |= 2;
                            aiwuVar2.d = j2;
                        } else {
                            akzxVarM2.u();
                            aiwu aiwuVar3 = akzxVarM2.b;
                            aiwuVar3.b |= 2;
                            aiwuVar3.d = -1L;
                        }
                        ahbq ahbqVar2 = ahbqVar;
                        if (acwbVar.f) {
                            akzxVarM2.u();
                            aiwu aiwuVar4 = akzxVarM2.b;
                            aiwuVar4.c = a.Q(3);
                            aiwuVar4.b |= 1;
                            defpackage.acvs acvsVar3 = acvuVar.c;
                            if (((acvsVar3 == null ? defpackage.acvs.a : acvsVar3).b & 4) != 0) {
                                if (acvsVar3 == null) {
                                    acvsVar3 = defpackage.acvs.a;
                                }
                                long j3 = acvsVar3.e / 1000;
                                akzxVarM2.u();
                                aiwu aiwuVar5 = akzxVarM2.b;
                                aiwuVar5.b |= 4;
                                aiwuVar5.e = j3;
                            } else {
                                akzxVarM2.u();
                                aiwu aiwuVar6 = akzxVarM2.b;
                                aiwuVar6.b |= 4;
                                aiwuVar6.e = -1L;
                            }
                            ajcqVarH = aiql.z(akzxVarM2.p());
                        } else {
                            akzxVarM2.u();
                            aiwu aiwuVar7 = akzxVarM2.b;
                            aiwuVar7.b |= 4;
                            aiwuVar7.e = -1L;
                            ajcqVarH = ahvr.H(((acyu) ahbqVar2.a).h(acvuVar), new defpackage.aczo(akzxVarM2, 5), (java.util.concurrent.Executor) ahbqVar2.c);
                        }
                        arrayList.add(ahvr.H(ajcqVarH, new defpackage.aczo(aiwmVarP, 4), (java.util.concurrent.Executor) ahbqVar2.c));
                    }
                    return aiql.v(arrayList);
                }
            }, (java.util.concurrent.Executor) ahbqVar.c);
        }
        aimw aimwVarL2 = defpackage.veg.a.b().l("com/android/dialer/voicemail/service/impl/scheduler/VvmTaskWorker$VvmTaskWorkerDelegate", "executeVvmJob", 191, "VvmTaskWorker.java");
        int i7 = this.a;
        aimwVarL2.w("Beginning execution of job ID: %d", i7);
        java.lang.Object obj2 = this.b;
        defpackage.veg vegVar = (defpackage.veg) obj2;
        zjv.i(vegVar.e.a(zct.a), mgv.cO, aify.p(gus.au(i7)), (mhc) null, 0, 28);
        java.util.Map map = vegVar.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i7);
        ajcq ajcqVar = (ajcq) map.get(numValueOf);
        if (ajcqVar != null) {
            return ajcqVar;
        }
        aogc aogcVar = vegVar.j;
        ajcq ajcqVarI = ahvr.I(ahvr.H(((afhf) aogcVar.c).c(), new defpackage.tbc(i7, 5), (java.util.concurrent.Executor) aogcVar.b), new defpackage.vct(obj2, 8), ajbm.a);
        map.put(numValueOf, ajcqVarI);
        ajcqVarI.c(new eyd(obj2, i7, 8), vegVar.d);
        return ajcqVarI;
    }
}

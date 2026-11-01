package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jxk implements java.util.concurrent.Callable {
    public final /* synthetic */ defpackage.jxm a;
    public final /* synthetic */ defpackage.jxn b;

    public /* synthetic */ jxk(defpackage.jxm jxmVar, defpackage.jxn jxnVar) {
        this.a = jxmVar;
        this.b = jxnVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        defpackage.jxm jxmVar = this.a;
        java.util.List list = jxmVar.g;
        defpackage.jxn jxnVar = this.b;
        if (!list.contains(jxnVar)) {
            list.add(jxnVar);
            switch (jxnVar.ordinal()) {
                case 0:
                    j$.util.Optional optional = jxmVar.h;
                    defpackage.jrs jrsVar = new defpackage.jrs(jxmVar, 10);
                    if (true == optional.isPresent()) {
                        java.lang.Object obj = optional.get();
                        java.lang.Object obj2 = jrsVar.a;
                        ((defpackage.jxm) obj2).d.p((aeun) obj, ruc.aw);
                    }
                    break;
                case 1:
                    ruc rucVar = jxmVar.d;
                    jxmVar.m = rucVar.a();
                    jxmVar.n = rucVar.a();
                    jxmVar.s = j$.util.Optional.of(jxmVar.b.c(new defpackage.jyr(jxmVar, 1), ((java.lang.Long) jxmVar.c.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
                    break;
                case 2:
                    jxmVar.u = true;
                    jxmVar.o = jxmVar.d.a();
                    j$.util.Optional optional2 = jxmVar.m;
                    defpackage.jrs jrsVar2 = new defpackage.jrs(jxmVar, 8);
                    if (true == optional2.isPresent()) {
                        java.lang.Object obj3 = optional2.get();
                        java.lang.Object obj4 = jrsVar2.a;
                        ((defpackage.jxm) obj4).d.p((aeun) obj3, ruc.aB);
                    }
                    break;
                case 3:
                    if (jxmVar.x) {
                        jxmVar.e.o(rmx.jx);
                    }
                    if (!jxmVar.u) {
                        jxmVar.r = defpackage.jxl.b;
                        jxmVar.e.o(rmx.kV);
                    } else {
                        jxmVar.e.o(rmx.jy);
                        j$.util.Optional optional3 = jxmVar.n;
                        defpackage.jrs jrsVar3 = new defpackage.jrs(jxmVar, 9);
                        if (true == optional3.isPresent()) {
                            java.lang.Object obj5 = optional3.get();
                            java.lang.Object obj6 = jrsVar3.a;
                            ((defpackage.jxm) obj6).d.p((aeun) obj5, ruc.aC);
                        }
                        jxmVar.a();
                    }
                    break;
                case 4:
                    j$.util.Optional optional4 = jxmVar.i;
                    defpackage.jrs jrsVar4 = new defpackage.jrs(jxmVar, 11);
                    if (true == optional4.isPresent()) {
                        java.lang.Object obj7 = optional4.get();
                        java.lang.Object obj8 = jrsVar4.a;
                        ((defpackage.jxm) obj8).d.p((aeun) obj7, ruc.ax);
                    }
                    j$.util.Optional optional5 = jxmVar.o;
                    defpackage.jrs jrsVar5 = new defpackage.jrs(jxmVar, 12);
                    if (true == optional5.isPresent()) {
                        java.lang.Object obj9 = optional5.get();
                        java.lang.Object obj10 = jrsVar5.a;
                        ((defpackage.jxm) obj10).d.p((aeun) obj9, ruc.aD);
                    }
                    break;
                case 5:
                    jxmVar.v = true;
                    jxmVar.e.o(rmx.lc);
                    break;
                case 6:
                    jxmVar.w = true;
                    ruc rucVar2 = jxmVar.d;
                    jxmVar.p = rucVar2.a();
                    jxmVar.q = rucVar2.a();
                    jxmVar.e.o(rmx.jK);
                    break;
                case 7:
                    j$.util.Optional optional6 = jxmVar.j;
                    defpackage.jrs jrsVar6 = new defpackage.jrs(jxmVar, 13);
                    if (true == optional6.isPresent()) {
                        java.lang.Object obj11 = optional6.get();
                        java.lang.Object obj12 = jrsVar6.a;
                        ((defpackage.jxm) obj12).d.p((aeun) obj11, ruc.ay);
                    }
                    try {
                        zhr.c(ruc.ay.a, jxmVar.y);
                    } catch (java.lang.IllegalStateException e) {
                        defpackage.jxm.a.d().i(zct.b).k(e).l("com/android/dialer/calllauncher/interaction/PlaceOutgoingCallInteractionContext", "onInteractionEventOnSequentialExecutor", 246, "PlaceOutgoingCallInteractionContext.java").w("Failed to end trace section for PlaceCallToOutgoingResponseLatency with cookie: %d", jxmVar.y);
                    }
                    break;
                case 8:
                    j$.util.Optional optional7 = jxmVar.k;
                    defpackage.jrs jrsVar7 = new defpackage.jrs(jxmVar, 14);
                    if (true == optional7.isPresent()) {
                        java.lang.Object obj13 = optional7.get();
                        java.lang.Object obj14 = jrsVar7.a;
                        ((defpackage.jxm) obj14).d.p((aeun) obj13, ruc.az);
                    }
                    break;
                case 9:
                    j$.util.Optional optional8 = jxmVar.l;
                    defpackage.jrs jrsVar8 = new defpackage.jrs(jxmVar, 15);
                    if (true == optional8.isPresent()) {
                        java.lang.Object obj15 = optional8.get();
                        java.lang.Object obj16 = jrsVar8.a;
                        ((defpackage.jxm) obj16).d.p((aeun) obj15, ruc.aA);
                    }
                    break;
                case 10:
                    j$.util.Optional optional9 = jxmVar.p;
                    defpackage.jrs jrsVar9 = new defpackage.jrs(jxmVar, 16);
                    if (true == optional9.isPresent()) {
                        java.lang.Object obj17 = optional9.get();
                        java.lang.Object obj18 = jrsVar9.a;
                        ((defpackage.jxm) obj18).d.p((aeun) obj17, ruc.aE);
                    }
                    jxmVar.q = j$.util.Optional.empty();
                    break;
                case 11:
                    jxmVar.r = defpackage.jxl.b;
                    jxmVar.e.o(rmx.kW);
                    break;
                case 12:
                    jxmVar.r = defpackage.jxl.b;
                    jxmVar.e.o(rmx.kX);
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                    if (jxmVar.v && !jxmVar.w) {
                        jxmVar.e.o(rmx.ld);
                    }
                    j$.util.Optional optional10 = jxmVar.q;
                    defpackage.jrs jrsVar10 = new defpackage.jrs(jxmVar, 7);
                    if (true == optional10.isPresent()) {
                        java.lang.Object obj19 = optional10.get();
                        java.lang.Object obj20 = jrsVar10.a;
                        ((defpackage.jxm) obj20).d.p((aeun) obj19, ruc.aF);
                    }
                    jxmVar.p = j$.util.Optional.empty();
                    jxmVar.r = defpackage.jxl.b;
                    jxmVar.e.o(rmx.la);
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                    jxmVar.r = defpackage.jxl.b;
                    jxmVar.e.o(rmx.kY);
                    break;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                    jxmVar.x = true;
                    jxmVar.e.o(rmx.jr);
                    jxmVar.z.i((java.lang.String) null).b(mce.eW);
                    break;
                case 16:
                    jxmVar.r = defpackage.jxl.b;
                    jxmVar.e.o(rmx.kZ);
                    jxmVar.z.i((java.lang.String) null).b(mce.eX);
                    break;
            }
            defpackage.jxl jxlVar = jxmVar.r;
            defpackage.jxl jxlVar2 = defpackage.jxl.b;
            if (jxlVar != jxlVar2 && jxmVar.g.containsAll(aify.s(defpackage.jxn.i, defpackage.jxn.j, defpackage.jxn.h, defpackage.jxn.d))) {
                jxmVar.r = jxlVar2;
                jxmVar.e.o(rmx.lb);
            }
        }
        return jxmVar.r;
    }
}

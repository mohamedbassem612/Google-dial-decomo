package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wvw implements defpackage.wvs {
    final /* synthetic */ defpackage.wvx a;
    public defpackage.xbk b;
    private final java.util.concurrent.Executor c;

    public wvw(defpackage.wvx wvxVar, defpackage.xbk xbkVar) {
        j$.util.Objects.requireNonNull(wvxVar);
        this.a = wvxVar;
        this.c = new ajdc(wvxVar.b);
        this.b = xbkVar;
    }

    @Override // defpackage.wvs
    public final void a(final java.lang.Object obj) {
        if (((java.lang.Boolean) this.a.d.a()).booleanValue() && this.b == null) {
            return;
        }
        agsm.i(1124, ahvr.E(new java.lang.Runnable() { // from class: wvv
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                defpackage.wvo wvoVar;
                int i2;
                defpackage.wvw wvwVar = this.a;
                defpackage.wvx wvxVar = wvwVar.a;
                aoin aoinVar = wvxVar.d;
                final defpackage.xbk xbkVar = wvwVar.b;
                if (((java.lang.Boolean) aoinVar.a()).booleanValue() && xbkVar == null) {
                    return;
                }
                java.lang.Object obj2 = obj;
                defpackage.wvq wvqVar = wvxVar.a;
                akzx akzxVarM = defpackage.wvh.a.m();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVarM.u();
                defpackage.wvh wvhVar = (defpackage.wvh) akzxVarM.b;
                wvhVar.b |= 4;
                wvhVar.e = jElapsedRealtime;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarM.u();
                defpackage.wvh wvhVar2 = (defpackage.wvh) akzxVarM.b;
                wvhVar2.b |= 2;
                wvhVar2.d = epochMilli;
                akzxVarM.u();
                defpackage.wvh wvhVar3 = (defpackage.wvh) akzxVarM.b;
                j$.util.Objects.requireNonNull(obj2);
                defpackage.wwf wwfVar = (defpackage.wwf) obj2;
                wvhVar3.c = wwfVar;
                wvhVar3.b |= 1;
                agsm.i(1120, wvqVar.a(new defpackage.whv(wvqVar, (defpackage.wvh) akzxVarM.p(), 13, null)), "recordModelResult failed", new java.lang.Object[0]);
                int i3 = wwfVar.b;
                if (i3 == 0) {
                    i = 5;
                } else if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 != 3) {
                    i = i3 != 4 ? 0 : 4;
                } else {
                    i = 3;
                }
                if (i == 0) {
                    throw null;
                }
                int i4 = i - 1;
                if (i4 == 0) {
                    akzx akzxVarM2 = defpackage.wvo.a.m();
                    defpackage.wxk wxkVarB = defpackage.wxk.b((wwfVar.b == 1 ? (defpackage.wxh) wwfVar.c : defpackage.wxh.a).c);
                    if (wxkVarB == null) {
                        wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                    }
                    akzx akzxVarM3 = defpackage.wvd.a.m();
                    if (wxkVarB == defpackage.wxk.SILENCE) {
                        defpackage.wwe.a.b().h(20).l("com/android/incallui/atlas/detection/techniques/composite/CompositeEventDetector", "getAtlasEvent", 79, "CompositeEventDetector.java").v("get a silence event from daredevil model event detector.");
                        defpackage.wuz wuzVar = defpackage.wuz.a;
                        akzxVarM3.u();
                        defpackage.wvd wvdVar = (defpackage.wvd) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(wuzVar);
                        wvdVar.c = wuzVar;
                        wvdVar.b = 4;
                    } else if (wxkVarB == defpackage.wxk.MUSIC) {
                        defpackage.wwe.a.b().h(20).l("com/android/incallui/atlas/detection/techniques/composite/CompositeEventDetector", "getAtlasEvent", 83, "CompositeEventDetector.java").v("get a music event from daredevil model event detector.");
                        defpackage.wux wuxVar = defpackage.wux.a;
                        akzxVarM3.u();
                        defpackage.wvd wvdVar2 = (defpackage.wvd) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(wuxVar);
                        wvdVar2.c = wuxVar;
                        wvdVar2.b = 3;
                    }
                    defpackage.wvd wvdVar3 = (defpackage.wvd) akzxVarM3.p();
                    akzxVarM2.u();
                    defpackage.wvo wvoVar2 = (defpackage.wvo) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(wvdVar3);
                    wvoVar2.c = wvdVar3;
                    wvoVar2.b |= 1;
                    wvoVar = (defpackage.wvo) akzxVarM2.p();
                } else if (i4 == 1) {
                    defpackage.wwe.a.b().l("com/android/incallui/atlas/detection/techniques/composite/CompositeEventDetector", "detectEvent", 48, "CompositeEventDetector.java").v("get an atlas event from hold detection model event detector.");
                    defpackage.wwr wwrVar = wwfVar.b == 2 ? (defpackage.wwr) wwfVar.c : defpackage.wwr.a;
                    int i5 = wwrVar.b;
                    if (i5 == 0) {
                        i2 = 8;
                    } else if (i5 == 1) {
                        i2 = 1;
                    } else if (i5 == 2) {
                        i2 = 2;
                    } else if (i5 == 3) {
                        i2 = 3;
                    } else if (i5 == 4) {
                        i2 = 4;
                    } else if (i5 == 7) {
                        i2 = 5;
                    } else if (i5 != 8) {
                        i2 = i5 != 9 ? 0 : 7;
                    } else {
                        i2 = 6;
                    }
                    int i6 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        akzx akzxVarM4 = defpackage.wvo.a.m();
                        akzx akzxVarM5 = defpackage.wvd.a.m();
                        akzx akzxVarM6 = defpackage.wuw.a.m();
                        java.lang.String str = (wwrVar.b == 1 ? (defpackage.wwt) wwrVar.c : defpackage.wwt.a).c;
                        akzxVarM6.u();
                        defpackage.wuw wuwVar = (defpackage.wuw) akzxVarM6.b;
                        j$.util.Objects.requireNonNull(str);
                        wuwVar.b |= 1;
                        wuwVar.c = str;
                        defpackage.wuw wuwVar2 = (defpackage.wuw) akzxVarM6.p();
                        akzxVarM5.u();
                        defpackage.wvd wvdVar4 = (defpackage.wvd) akzxVarM5.b;
                        j$.util.Objects.requireNonNull(wuwVar2);
                        wvdVar4.c = wuwVar2;
                        wvdVar4.b = 1;
                        defpackage.wvd wvdVar5 = (defpackage.wvd) akzxVarM5.p();
                        akzxVarM4.u();
                        defpackage.wvo wvoVar3 = (defpackage.wvo) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(wvdVar5);
                        wvoVar3.c = wvdVar5;
                        wvoVar3.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM4.p();
                    } else if (i6 == 1) {
                        akzx akzxVarM7 = defpackage.wvo.a.m();
                        akzx akzxVarM8 = defpackage.wvd.a.m();
                        defpackage.wuv wuvVar = defpackage.wuv.a;
                        akzxVarM8.u();
                        defpackage.wvd wvdVar6 = (defpackage.wvd) akzxVarM8.b;
                        j$.util.Objects.requireNonNull(wuvVar);
                        wvdVar6.c = wuvVar;
                        wvdVar6.b = 6;
                        akzxVarM7.u();
                        defpackage.wvo wvoVar4 = (defpackage.wvo) akzxVarM7.b;
                        defpackage.wvd wvdVar7 = (defpackage.wvd) akzxVarM8.p();
                        j$.util.Objects.requireNonNull(wvdVar7);
                        wvoVar4.c = wvdVar7;
                        wvoVar4.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM7.p();
                    } else if (i6 == 3) {
                        akzx akzxVarM9 = defpackage.wvo.a.m();
                        akzx akzxVarM10 = defpackage.wvd.a.m();
                        defpackage.wuy wuyVar = defpackage.wuy.a;
                        akzxVarM10.u();
                        defpackage.wvd wvdVar8 = (defpackage.wvd) akzxVarM10.b;
                        j$.util.Objects.requireNonNull(wuyVar);
                        wvdVar8.c = wuyVar;
                        wvdVar8.b = 2;
                        defpackage.wvd wvdVar9 = (defpackage.wvd) akzxVarM10.p();
                        akzxVarM9.u();
                        defpackage.wvo wvoVar5 = (defpackage.wvo) akzxVarM9.b;
                        j$.util.Objects.requireNonNull(wvdVar9);
                        wvoVar5.c = wvdVar9;
                        wvoVar5.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM9.p();
                    } else if (i6 == 4) {
                        akzx akzxVarM11 = defpackage.wvo.a.m();
                        akzx akzxVarM12 = defpackage.wvd.a.m();
                        defpackage.wvb wvbVar = defpackage.wvb.a;
                        akzxVarM12.u();
                        defpackage.wvd wvdVar10 = (defpackage.wvd) akzxVarM12.b;
                        j$.util.Objects.requireNonNull(wvbVar);
                        wvdVar10.c = wvbVar;
                        wvdVar10.b = 7;
                        akzxVarM11.u();
                        defpackage.wvo wvoVar6 = (defpackage.wvo) akzxVarM11.b;
                        defpackage.wvd wvdVar11 = (defpackage.wvd) akzxVarM12.p();
                        j$.util.Objects.requireNonNull(wvdVar11);
                        wvoVar6.c = wvdVar11;
                        wvoVar6.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM11.p();
                    } else if (i6 == 5) {
                        akzx akzxVarM13 = defpackage.wvo.a.m();
                        akzx akzxVarM14 = defpackage.wvd.a.m();
                        defpackage.wut wutVar = defpackage.wut.a;
                        akzxVarM14.u();
                        defpackage.wvd wvdVar12 = (defpackage.wvd) akzxVarM14.b;
                        j$.util.Objects.requireNonNull(wutVar);
                        wvdVar12.c = wutVar;
                        wvdVar12.b = 8;
                        akzxVarM13.u();
                        defpackage.wvo wvoVar7 = (defpackage.wvo) akzxVarM13.b;
                        defpackage.wvd wvdVar13 = (defpackage.wvd) akzxVarM14.p();
                        j$.util.Objects.requireNonNull(wvdVar13);
                        wvoVar7.c = wvdVar13;
                        wvoVar7.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM13.p();
                    } else if (i6 != 6) {
                        wvoVar = defpackage.wvo.a;
                    } else {
                        akzx akzxVarM15 = defpackage.wvo.a.m();
                        akzx akzxVarM16 = defpackage.wvd.a.m();
                        defpackage.wuu wuuVar = defpackage.wuu.a;
                        akzxVarM16.u();
                        defpackage.wvd wvdVar14 = (defpackage.wvd) akzxVarM16.b;
                        j$.util.Objects.requireNonNull(wuuVar);
                        wvdVar14.c = wuuVar;
                        wvdVar14.b = 9;
                        akzxVarM15.u();
                        defpackage.wvo wvoVar8 = (defpackage.wvo) akzxVarM15.b;
                        defpackage.wvd wvdVar15 = (defpackage.wvd) akzxVarM16.p();
                        j$.util.Objects.requireNonNull(wvdVar15);
                        wvoVar8.c = wvdVar15;
                        wvoVar8.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM15.p();
                    }
                } else if (i4 == 2) {
                    defpackage.wwe.a.b().l("com/android/incallui/atlas/detection/techniques/composite/CompositeEventDetector", "detectEvent", 53, "CompositeEventDetector.java").v("get an atlas event from asr model event detector.");
                    if ((wwfVar.b == 3 ? (defpackage.wwa) wwfVar.c : defpackage.wwa.a).c == 5) {
                        akzx akzxVarM17 = defpackage.wvo.a.m();
                        akzx akzxVarM18 = defpackage.wvd.a.m();
                        akzx akzxVarM19 = defpackage.wva.a.m();
                        defpackage.wwa wwaVar = wwfVar.b == 3 ? (defpackage.wwa) wwfVar.c : defpackage.wwa.a;
                        java.lang.String str2 = (wwaVar.c == 5 ? (defpackage.wvz) wwaVar.d : defpackage.wvz.a).c;
                        akzxVarM19.u();
                        defpackage.wva wvaVar = (defpackage.wva) akzxVarM19.b;
                        j$.util.Objects.requireNonNull(str2);
                        wvaVar.b |= 1;
                        wvaVar.c = str2;
                        defpackage.wva wvaVar2 = (defpackage.wva) akzxVarM19.p();
                        akzxVarM18.u();
                        defpackage.wvd wvdVar16 = (defpackage.wvd) akzxVarM18.b;
                        j$.util.Objects.requireNonNull(wvaVar2);
                        wvdVar16.c = wvaVar2;
                        wvdVar16.b = 5;
                        akzxVarM17.u();
                        defpackage.wvo wvoVar9 = (defpackage.wvo) akzxVarM17.b;
                        defpackage.wvd wvdVar17 = (defpackage.wvd) akzxVarM18.p();
                        j$.util.Objects.requireNonNull(wvdVar17);
                        wvoVar9.c = wvdVar17;
                        wvoVar9.b |= 1;
                        wvoVar = (defpackage.wvo) akzxVarM17.p();
                    } else {
                        wvoVar = defpackage.wvo.a;
                    }
                } else if (i4 != 3) {
                    wvoVar = defpackage.wvo.a;
                } else {
                    akzx akzxVarM20 = defpackage.wvo.a.m();
                    akzx akzxVarM21 = defpackage.wvd.a.m();
                    defpackage.wut wutVar2 = defpackage.wut.a;
                    akzxVarM21.u();
                    defpackage.wvd wvdVar18 = (defpackage.wvd) akzxVarM21.b;
                    j$.util.Objects.requireNonNull(wutVar2);
                    wvdVar18.c = wutVar2;
                    wvdVar18.b = 8;
                    defpackage.wvd wvdVar19 = (defpackage.wvd) akzxVarM21.p();
                    akzxVarM20.u();
                    defpackage.wvo wvoVar10 = (defpackage.wvo) akzxVarM20.b;
                    j$.util.Objects.requireNonNull(wvdVar19);
                    wvoVar10.c = wvdVar19;
                    wvoVar10.b |= 1;
                    wvoVar = (defpackage.wvo) akzxVarM20.p();
                }
                if (xbkVar != null) {
                    final defpackage.wvd wvdVar20 = wvoVar.c;
                    if (wvdVar20 == null) {
                        wvdVar20 = defpackage.wvd.a;
                    }
                    agsm.i(1157, xbkVar.t.g(ahqx.i(new java.util.concurrent.Callable() { // from class: xbi
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code restructure failed: missing block: B:51:0x03bb, code lost:
                        
                            if (r2.equals("atlas_delayed_user_message") != false) goto L52;
                         */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instruction units count: 1078
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.xbi.call():java.lang.Object");
                        }
                    }), xbkVar.j), "failed to handle AtlasEvent", new java.lang.Object[0]);
                }
            }
        }, this.c), "failed emitting result", new java.lang.Object[0]);
    }
}

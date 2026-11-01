package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gra implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gra(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [gvp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v87, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v43, types: [android.content.ServiceConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        gxl gxlVar;
        java.lang.Runnable runnable;
        int i = 8;
        int i2 = 5;
        int i3 = 3;
        long j = 250;
        byte[] bArr = null;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                ((defpackage.hiv) this.a).a.accept(this.b);
                return;
            case 1:
                java.lang.String str = eum.a;
                ((defpackage.exy) ((defpackage.kvt) this.a).a).a.B.i((defpackage.exa) this.b);
                return;
            case 2:
                java.lang.String str2 = gtr.a;
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((gtg) it.next()).a((gxd) this.b, false);
                }
                return;
            case 3:
                java.lang.Object obj = this.b;
                synchronized (((gtr) obj).l) {
                    arrayList = new java.util.ArrayList(((gtr) obj).j);
                    break;
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((gtf) arrayList.get(i5)).a((gxd) this.a, false);
                }
                return;
            case 4:
                java.lang.Object obj2 = this.b;
                gvl gvlVar = (gvl) obj2;
                java.util.Map map = gvlVar.g;
                java.lang.Object obj3 = this.a;
                if (map.containsKey(obj3)) {
                    java.lang.String str3 = ((gxd) obj3).a;
                    gsh.a().c(gvl.a, a.bk(str3, "Delaying workSpec ", " because its running as an FGS"));
                    androidx.work.impl.WorkDatabase workDatabase = gvlVar.e;
                    gxl gxlVarC = workDatabase.D().c(str3);
                    if (gxlVarC != null && gxlVarC.c == gsw.b) {
                        gwy gwyVarA = workDatabase.A().a(gus.u(gxlVarC));
                        if (gwyVarA != null) {
                            gvk gvkVar = gvlVar.d;
                            int i6 = gwyVarA.c;
                            try {
                                ((gvl) obj2).i(gxlVarC, i6, gvkVar.a(gxlVarC, i6, gvl.c));
                                break;
                            } catch (java.lang.Exception e) {
                                java.lang.String strValueOf = java.lang.String.valueOf(str3);
                                gsh.a();
                                android.util.Log.e(gvl.a, "Unable to delay work ".concat(strValueOf), e);
                            }
                            ((gvl) this.b).f.b(gvl.b, this);
                            return;
                        }
                    }
                    map.remove(obj3);
                    return;
                }
                return;
            case 5:
                java.util.Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ((defpackage.hyx) it2.next()).a(((gwf) this.b).d);
                }
                return;
            case 6:
                gtr gtrVar = ((defpackage.gwl) this.b).b.g;
                java.lang.Object obj4 = gtrVar.l;
                java.lang.Object obj5 = this.a;
                synchronized (obj4) {
                    gve gveVarB = gtrVar.b((java.lang.String) obj5);
                    gxlVar = gveVarB != null ? gveVarB.a : null;
                }
                if (gxlVar == null || !gxlVar.b()) {
                    return;
                }
                ?? r0 = this.b;
                synchronized (((defpackage.gwl) r0).c) {
                    ((defpackage.gwl) r0).f.put(gus.u(gxlVar), gxlVar);
                    ((defpackage.gwl) r0).g.put(gus.u(gxlVar), gvs.a(((defpackage.gwl) r0).j, gxlVar, (aosp) ((defpackage.gwl) r0).i.b, (gvp) r0));
                    break;
                }
                return;
            case 7:
                java.lang.String string = ((java.util.UUID) this.a).toString();
                aooh.e(string, "toString(...)");
                gus.f((guq) this.b, string);
                return;
            case 8:
                ?? r1 = this.a;
                int size2 = r1.size();
                int i7 = 0;
                while (true) {
                    java.lang.Object obj6 = this.b;
                    if (i7 >= size2) {
                        ((java.util.ArrayList) r1).clear();
                        ((defpackage.hrs) obj6).d.remove(r1);
                        return;
                    }
                    defpackage.hrr hrrVar = (defpackage.hrr) r1.get(i7);
                    java.lang.Object obj7 = hrrVar.e;
                    int i8 = hrrVar.a;
                    int i9 = hrrVar.b;
                    int i10 = hrrVar.c;
                    int i11 = hrrVar.d;
                    defpackage.hrs hrsVar = (defpackage.hrs) obj6;
                    ld ldVar = (ld) obj7;
                    android.view.ViewPropertyAnimator viewPropertyAnimatorD = hrsVar.b.d(ldVar, i8, i9, i10, i11);
                    hrsVar.g.add(obj7);
                    android.view.ViewPropertyAnimator duration = viewPropertyAnimatorD.setDuration(250L);
                    ems emsVar = hrsVar.a;
                    defpackage.hrv hrvVar = new defpackage.hrv();
                    hrvVar.d(new defpackage.fch(i2));
                    hrvVar.b(new defpackage.rh(obj6, obj7, 4, null));
                    hrvVar.c(new defpackage.hrn(hrsVar, viewPropertyAnimatorD, ldVar, i4));
                    duration.setListener(new defpackage.hry(emsVar, hrvVar.a())).start();
                    i7++;
                    i2 = 5;
                }
                break;
            case 9:
                ?? r2 = this.a;
                int size3 = r2.size();
                while (true) {
                    java.lang.Object obj8 = this.b;
                    if (i4 >= size3) {
                        ((java.util.ArrayList) r2).clear();
                        ((defpackage.hrs) obj8).e.remove(r2);
                        return;
                    }
                    defpackage.hrp hrpVar = (defpackage.hrp) r2.get(i4);
                    final ld ldVar2 = hrpVar.a;
                    final ?? r11 = ldVar2 == null ? bArr : ldVar2.a;
                    ld ldVar3 = hrpVar.b;
                    java.lang.Object obj9 = ldVar3 != null ? ldVar3.a : bArr;
                    if (r11 != 0) {
                        final defpackage.hrs hrsVar2 = (defpackage.hrs) obj8;
                        final android.view.ViewPropertyAnimator viewPropertyAnimatorC = hrsVar2.b.c(ldVar2);
                        viewPropertyAnimatorC.setDuration(j);
                        hrsVar2.k.add(ldVar2);
                        viewPropertyAnimatorC.translationX(hrpVar.e - hrpVar.c);
                        viewPropertyAnimatorC.translationY(hrpVar.f - hrpVar.d);
                        ems emsVar2 = hrsVar2.a;
                        defpackage.hrv hrvVar2 = new defpackage.hrv();
                        hrvVar2.d(new defpackage.fch(6));
                        hrvVar2.c(new defpackage.hru() { // from class: hro
                            @Override // defpackage.hru
                            public final void a(boolean z) {
                                viewPropertyAnimatorC.setListener(null);
                                android.view.View view = r11;
                                view.setTranslationX(0.0f);
                                view.setTranslationY(0.0f);
                                defpackage.hrs hrsVar3 = hrsVar2;
                                defpackage.hrq hrqVar = hrsVar3.b;
                                ld ldVar4 = ldVar2;
                                hrqVar.k(ldVar4);
                                hrsVar3.l(ldVar4);
                                hrsVar3.k.remove(ldVar4);
                                hrsVar3.a();
                            }
                        });
                        viewPropertyAnimatorC.setListener(new defpackage.hry(emsVar2, hrvVar2.a())).start();
                    }
                    if (obj9 != null && ldVar3 != null) {
                        defpackage.hrs hrsVar3 = (defpackage.hrs) obj8;
                        defpackage.hrq hrqVar = hrsVar3.b;
                        java.util.ArrayList arrayList2 = hrsVar3.k;
                        android.view.ViewPropertyAnimator viewPropertyAnimatorB = hrqVar.b(ldVar3);
                        arrayList2.add(ldVar3);
                        viewPropertyAnimatorB.translationX(0.0f).translationY(0.0f);
                        viewPropertyAnimatorB.setDuration(250L);
                        ems emsVar3 = hrsVar3.a;
                        defpackage.hrv hrvVar3 = new defpackage.hrv();
                        hrvVar3.d(new defpackage.fch(7));
                        hrvVar3.c(new defpackage.hrn(hrsVar3, viewPropertyAnimatorB, ldVar3, 2));
                        viewPropertyAnimatorB.setListener(new defpackage.hry(emsVar3, hrvVar3.a())).start();
                    }
                    i4++;
                    j = 250;
                    bArr = null;
                }
                break;
            case 10:
                ?? r3 = this.a;
                int size4 = r3.size();
                while (true) {
                    java.lang.Object obj10 = this.b;
                    if (i4 >= size4) {
                        ((java.util.ArrayList) r3).clear();
                        ((defpackage.hrs) obj10).c.remove(r3);
                        return;
                    }
                    ld ldVar4 = (ld) r3.get(i4);
                    defpackage.hrs hrsVar4 = (defpackage.hrs) obj10;
                    android.view.ViewPropertyAnimator viewPropertyAnimatorA = hrsVar4.b.a(ldVar4);
                    hrsVar4.f.add(ldVar4);
                    android.view.ViewPropertyAnimator duration2 = viewPropertyAnimatorA.setDuration(120L);
                    ems emsVar4 = hrsVar4.a;
                    defpackage.hrv hrvVar4 = new defpackage.hrv();
                    hrvVar4.d(new defpackage.fch(i));
                    hrvVar4.b(new defpackage.rh(obj10, ldVar4, i2, bArr));
                    hrvVar4.c(new defpackage.hrn(hrsVar4, viewPropertyAnimatorA, ldVar4, i3));
                    duration2.setListener(new defpackage.hry(emsVar4, hrvVar4.a())).start();
                    i4++;
                }
                break;
            case 11:
                akzx akzxVarM = defpackage.aauv.a.m();
                int iOrdinal = ((defpackage.hux) this.b).ordinal();
                if (iOrdinal == 1) {
                    akzxVarM.u();
                    defpackage.aauv aauvVar = (defpackage.aauv) akzxVarM.b;
                    aauvVar.c = 1;
                    aauvVar.b |= 1;
                } else if (iOrdinal == 2) {
                    akzxVarM.u();
                    defpackage.aauv aauvVar2 = (defpackage.aauv) akzxVarM.b;
                    aauvVar2.c = 2;
                    aauvVar2.b |= 1;
                } else if (iOrdinal == 3) {
                    akzxVarM.u();
                    defpackage.aauv aauvVar3 = (defpackage.aauv) akzxVarM.b;
                    aauvVar3.c = 3;
                    aauvVar3.b |= 1;
                }
                alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli());
                akzm akzmVar = defpackage.hvo.a;
                aldi.g(alcfVarE);
                aldf.g(akzmVar);
                long jD = a.d(alcfVarE.b, akzmVar.b);
                long j2 = ((long) alcfVarE.c) + ((long) akzmVar.c);
                int i12 = (int) j2;
                if (j2 != i12) {
                    throw new java.lang.ArithmeticException();
                }
                java.lang.Object obj11 = this.a;
                alcf alcfVarF = aldi.f(jD, i12);
                aauw aauwVar = (aauw) ((defpackage.hvo) obj11).b.a();
                akzx akzxVarM2 = defpackage.aaut.a.m();
                akzxVarM2.u();
                defpackage.aaut aautVar = (defpackage.aaut) akzxVarM2.b;
                defpackage.aauv aauvVar4 = (defpackage.aauv) akzxVarM.p();
                j$.util.Objects.requireNonNull(aauvVar4);
                aautVar.d = aauvVar4;
                aautVar.b |= 8;
                akzx akzxVarM3 = defpackage.aauu.a.m();
                akzxVarM3.u();
                defpackage.aauu aauuVar = (defpackage.aauu) akzxVarM3.b;
                j$.util.Objects.requireNonNull(alcfVarF);
                aauuVar.c = alcfVarF;
                aauuVar.b |= 1;
                defpackage.aauu aauuVar2 = (defpackage.aauu) akzxVarM3.p();
                akzxVarM2.u();
                defpackage.aaut aautVar2 = (defpackage.aaut) akzxVarM2.b;
                j$.util.Objects.requireNonNull(aauuVar2);
                aautVar2.c = aauuVar2;
                aautVar2.b |= 1;
                aauwVar.a((defpackage.aaut) akzxVarM2.p());
                return;
            case 12:
                java.lang.Object obj12 = this.b;
                ahoq ahoqVarW = ahvr.W(86, "AudioControllerSelector_handleNewAudioMode");
                try {
                    lpb.b();
                    defpackage.hwy hwyVar = (defpackage.hwy) ((defpackage.hyv) obj12).f.orElse((java.lang.Object) null);
                    defpackage.hwy hwyVar2 = ((defpackage.hzc) this.a).b;
                    if (hwyVar == null) {
                        ((defpackage.hyv) obj12).c(hwyVar2);
                    } else if (hwyVar.equals(hwyVar2)) {
                        defpackage.hyv.a.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "handleNewAudioMode", 124, "AudioControllerSelector.java").v("no change in audio mode");
                    } else {
                        java.util.Map map2 = ((defpackage.hyv) obj12).c;
                        defpackage.hzi hziVar = (defpackage.hzi) map2.get(hwyVar);
                        defpackage.hzn hznVarC = hziVar.c().c();
                        defpackage.hzq hzqVarD = hziVar.c().d();
                        boolean zB = hznVarC.b();
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zB);
                        boolean zF = hzqVarD.f();
                        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(zF);
                        ajcq ajcqVarE = hzqVarD.e(false);
                        defpackage.jya jyaVar = new defpackage.jya(1);
                        ajcu ajcuVar = ((defpackage.hyv) obj12).e;
                        ahvr.J(ajcqVarE, jyaVar, ajcuVar);
                        ahvr.J(hznVarC.a(false), new defpackage.jya(1), ajcuVar);
                        ahvr.J(hziVar.d(), new defpackage.jya(1), ajcuVar);
                        ((defpackage.hyv) obj12).c(hwyVar2);
                        defpackage.hzi hziVar2 = (defpackage.hzi) map2.get(hwyVar2);
                        aimz aimzVar = defpackage.hyv.a;
                        aimzVar.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "handleNewAudioMode", 152, "AudioControllerSelector.java").y("restoring downlink muted to %b", boolValueOf);
                        defpackage.hzn hznVarC2 = hziVar2.c().c();
                        boolValueOf.getClass();
                        ahvr.J(hznVarC2.a(zB), new defpackage.jya(1), ajcuVar);
                        aimzVar.b().l("com/android/dialer/audio/impl/AudioControllerSelector", "handleNewAudioMode", 160, "AudioControllerSelector.java").y("restoring uplink muted to %b", boolValueOf2);
                        defpackage.hzq hzqVarD2 = hziVar2.c().d();
                        boolValueOf2.getClass();
                        ahvr.J(hzqVarD2.e(zF), new defpackage.jya(1), ajcuVar);
                    }
                    ahoqVarW.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aify aifyVarN = aify.n(((defpackage.hyw) this.b).a.f(this.a));
                int size5 = aifyVarN.size();
                while (i4 < size5) {
                    ((defpackage.hzb) aifyVarN.get(i4)).d(defpackage.hxb.b);
                    i4++;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.util.HashSet<defpackage.hzh> hashSet = new java.util.HashSet();
                defpackage.hyy hyyVar = (defpackage.hyy) this.b;
                java.util.Map map3 = hyyVar.e;
                java.util.Iterator it3 = map3.entrySet().iterator();
                while (true) {
                    java.lang.Object obj13 = this.a;
                    if (!it3.hasNext()) {
                        for (defpackage.hzh hzhVar : hashSet) {
                            ahvr.bM(map3.get(hzhVar) == obj13);
                            map3.remove(hzhVar);
                            defpackage.hyw hywVar = (defpackage.hyw) hyyVar.b.get(hzhVar);
                            if (hywVar.e()) {
                                defpackage.hyy.a.b().l("com/android/dialer/audio/impl/AudioSourceSelector", "handleExternalAudioSourceDeactivated", 293, "AudioSourceSelector.java").y("reactivating internal source: %s", hzhVar);
                                hyyVar.a(hzhVar);
                            } else {
                                hywVar.c(j$.util.Optional.empty());
                            }
                        }
                        return;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
                    defpackage.hzh hzhVar2 = (defpackage.hzh) entry.getKey();
                    if (((defpackage.hzl) entry.getValue()) != obj13) {
                        a.bt(defpackage.hyy.a.d(), "not deactivating active AudioSourceType: %s, source does not match deactivated ExternalAudioSource", hzhVar2, "com/android/dialer/audio/impl/AudioSourceSelector", "getMatchingAudioSourceTypes", (char) 267, "AudioSourceSelector.java", zct.b);
                    } else {
                        hashSet.add(hzhVar2);
                    }
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hyy hyyVar2 = (defpackage.hyy) this.b;
                java.util.Map map4 = hyyVar2.e;
                java.util.Iterator it4 = map4.values().iterator();
                while (it4.hasNext()) {
                    ((defpackage.hzl) it4.next()).b();
                }
                defpackage.hzh[] hzhVarArrValues = defpackage.hzh.values();
                int length = hzhVarArrValues.length;
                while (i4 < length) {
                    java.lang.Object obj14 = this.a;
                    defpackage.hzh hzhVar3 = hzhVarArrValues[i4];
                    defpackage.hyw hywVar2 = (defpackage.hyw) hyyVar2.b.get(hzhVar3);
                    map4.put(hzhVar3, obj14);
                    hywVar2.c(j$.util.Optional.of(((defpackage.hze) obj14).a()));
                    i4++;
                }
                return;
            case 16:
                ((defpackage.hyw) this.b).b((defpackage.hzb) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.iao) this.a).b.unbindService(this.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj15 = this.a;
                java.lang.Object obj16 = this.b;
                try {
                    aa$.ExternalSyntheticApiModelOutline1.m(((defpackage.ian) obj16).a, obj15);
                    if (runnable != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    defpackage.ian ianVar = (defpackage.ian) obj16;
                    if (ianVar.b != null) {
                        ianVar.b.run();
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.ibd ibdVar = (defpackage.ibd) this.a;
                j$.util.Optional optional = (j$.util.Optional) ibdVar.i.get();
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj17 = this.b;
                if (zIsPresent) {
                    ((dsd) obj17).b(j$.util.Optional.of((defpackage.iax) optional.orElseThrow(new defpackage.iaz(0))));
                    return;
                }
                defpackage.ibc ibcVar = ibdVar.h;
                defpackage.lop lopVar = new defpackage.lop(ibdVar, (dsd) obj17);
                defpackage.ibd.a.b().l("com/android/dialer/audio/impl/callaudiomanager/CallAudioManagerImpl$CallAudioFutureCallbacks", "addCallAudioChangeListener", 219, "CallAudioManagerImpl.java").v("adding new callAudioChangeListener");
                ibcVar.a.add(lopVar);
                return;
            default:
                java.lang.String str4 = ((defpackage.jab) this.a).a;
                android.widget.TextView textView = (android.widget.TextView) this.b;
                textView.setText(str4);
                textView.animate().alpha(1.0f).setDuration(250L).start();
                return;
        }
    }

    public /* synthetic */ gra(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public gra(java.lang.Object obj, java.lang.Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }
}

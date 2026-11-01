package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class khx implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ khx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v65, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v75, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v79, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v88, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v91, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v95, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = 1;
        defpackage.ltc ltcVarK = null;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((kib) this.a).c.c((gjh) obj, (java.lang.Iterable) this.b));
            case 1:
                gin ginVarA = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA);
                    if (ginVarA.m()) {
                        ltcVarK = kib.k(ginVarA);
                        break;
                    }
                    return ltcVarK;
                } finally {
                    ginVarA.close();
                }
            case 2:
                gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA2.m()) {
                        arrayList.add(kib.k(ginVarA2));
                    }
                    ginVarA2.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA2.close();
                    throw th;
                }
            case 3:
                gin ginVarA3 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA3);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA3.m()) {
                        arrayList2.add(kib.k(ginVarA3));
                    }
                    ginVarA3.close();
                    return arrayList2;
                } catch (java.lang.Throwable th2) {
                    ginVarA3.close();
                    throw th2;
                }
            case 4:
                return java.lang.Integer.valueOf(((kib) this.a).b.c((gjh) obj, (java.lang.Iterable) this.b));
            case 5:
                return aazc.g((abwx) this.a, (java.lang.String) this.b, (aoln) obj);
            case 6:
                android.view.View view = (android.view.View) obj;
                aooh.f(view, "view");
                defpackage.kjd kjdVar = (defpackage.kjd) this.b;
                rsr rsrVar = kjdVar.i;
                kiu kiuVar = (kiu) this.a;
                mmy mmyVarO = rsrVar.O(kiuVar);
                if (defpackage.hgt.u(mmyVarO)) {
                    java.lang.String str = mmyVarO.f;
                    aooh.e(str, "getAudioRecordingFilePath(...)");
                    kjdVar.b.o(str.length() == 0 ? rmx.kp : rmx.kq);
                    android.content.Context context = view.getContext();
                    aooh.e(context, "getContext(...)");
                    if (((wsc) aooh.q(kjdVar.c)) != null) {
                        vqf vqfVarBy = wsc.by(utu.a.m());
                        vqfVarBy.z(kiuVar.e);
                        vqfVarBy.C(4);
                        java.lang.String strD = defpackage.kon.d(context, kiuVar);
                        aooh.e(strD, "getUniqueCallId(...)");
                        vqfVarBy.B(strD);
                        abwd abwdVarP = kjdVar.f.a(kiuVar, 1).p();
                        aooh.e(abwdVarP, "build(...)");
                        vqfVarBy.A(abwdVarP);
                        wsc.bf(context, vqfVarBy.x());
                    }
                } else {
                    defpackage.kir kirVar = kiuVar.D;
                    if (kirVar == null) {
                        kirVar = defpackage.kir.a;
                    }
                    java.lang.String str2 = kirVar.d;
                    aooh.e(str2, "getAudioRecordingFilePath(...)");
                    kjdVar.b.n(str2.length() == 0 ? rmw.jZ : rmw.ka);
                    java.lang.String strValueOf = "";
                    if (((java.lang.Boolean) kjdVar.d.a()).booleanValue()) {
                        defpackage.kis kisVar = kiuVar.u;
                        if (kisVar == null) {
                            kisVar = defpackage.kis.a;
                        }
                        if (kisVar.d.size() != 0) {
                            defpackage.kis kisVar2 = kiuVar.u;
                            if (kisVar2 == null) {
                                kisVar2 = defpackage.kis.a;
                            }
                            strValueOf = java.lang.String.valueOf(kisVar2.d.get(0));
                        }
                    } else {
                        defpackage.kis kisVar3 = kiuVar.u;
                        if (kisVar3 == null) {
                            kisVar3 = defpackage.kis.a;
                        }
                        if (kisVar3.c.size() != 0) {
                            defpackage.kis kisVar4 = kiuVar.u;
                            if (kisVar4 == null) {
                                kisVar4 = defpackage.kis.a;
                            }
                            strValueOf = (java.lang.String) kisVar4.c.get(0);
                        }
                    }
                    android.content.Context context2 = view.getContext();
                    java.lang.String string = kjdVar.g.d(kiuVar, true).toString();
                    abwd abwdVarP2 = kjdVar.f.a(kiuVar, 1).p();
                    defpackage.kir kirVar2 = kiuVar.D;
                    if (kirVar2 == null) {
                        kirVar2 = defpackage.kir.a;
                    }
                    java.lang.String str3 = kirVar2.d;
                    aooh.e(str3, "getAudioRecordingFilePath(...)");
                    android.content.Intent intentW = com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.w(context2, strValueOf, string, abwdVarP2, str3.length() > 0);
                    android.content.Context context3 = view.getContext();
                    aooh.e(context3, "getContext(...)");
                    ahqx.l(context3, intentW);
                }
                return aojh.a;
            case 7:
                java.lang.Object obj2 = this.a;
                ahpz ahpzVar = ((defpackage.kxr) obj2).i;
                java.lang.Object obj3 = this.b;
                ahok ahokVarF = ahpzVar.f(230, "CallRecorder.onMediaPlayerComplete");
                try {
                    ((defpackage.oii) obj3).j(null);
                    defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "onCallRecordingComplete", 600, "CallRecorder.java").v("set state: idle (mediaplayer complete)");
                    ((defpackage.kxr) obj2).k.set(defpackage.kxq.a);
                    rai raiVar = ((defpackage.kxr) obj2).u;
                    if (raiVar != null) {
                        raiVar.f();
                    }
                    aojh aojhVar = aojh.a;
                    ahokVarF.close();
                    return aojhVar;
                } catch (java.lang.Throwable th3) {
                    try {
                        ahokVarF.close();
                        break;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 8:
                gin ginVarA4 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    for (java.lang.String str4 : this.b) {
                        if (str4 == null) {
                            ginVarA4.i(i);
                        } else {
                            ginVarA4.j(i, str4);
                        }
                        i++;
                    }
                    ginVarA4.m();
                    return null;
                } finally {
                    ginVarA4.close();
                }
            case 9:
                ((lku) this.b).a.e((gjh) obj, this.a);
                return null;
            case 10:
                ((lku) this.b).b.d((gjh) obj, this.a);
                return null;
            case 11:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.j(diqVar, (java.lang.String) this.a);
                java.lang.Object obj4 = this.b;
                if (obj4 != null) {
                    dfb.q(diqVar, (java.lang.String) obj4);
                }
                return aojh.a;
            case 12:
                gin ginVarA5 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA5);
                    if (ginVarA5.m()) {
                        ltcVarK = defpackage.ltb.k(ginVarA5);
                        break;
                    }
                    return ltcVarK;
                } finally {
                    ginVarA5.close();
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Integer.valueOf(((defpackage.ltb) this.a).b.c((gjh) obj, (java.lang.Iterable) this.b));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Integer.valueOf(((defpackage.ltb) this.a).c.c((gjh) obj, (java.lang.Iterable) this.b));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return aazc.g((abwx) this.a, (java.lang.String) this.b, (aoln) obj);
            case 16:
                gin ginVarA6 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA6);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (ginVarA6.m()) {
                        arrayList3.add(defpackage.ltb.k(ginVarA6));
                    }
                    ginVarA6.close();
                    return arrayList3;
                } catch (java.lang.Throwable th5) {
                    ginVarA6.close();
                    throw th5;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.ltb) this.a).a.c((gjh) obj, (java.util.Collection) this.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                gin ginVarA7 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA7);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (ginVarA7.m()) {
                        arrayList4.add(defpackage.ltb.k(ginVarA7));
                    }
                    ginVarA7.close();
                    return arrayList4;
                } catch (java.lang.Throwable th6) {
                    ginVarA7.close();
                    throw th6;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return aazc.g((abwx) this.a, (java.lang.String) this.b, (aoln) obj);
            default:
                gin ginVarA8 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA8);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    while (ginVarA8.m()) {
                        arrayList5.add(defpackage.lti.k(ginVarA8));
                    }
                    ginVarA8.close();
                    return arrayList5;
                } catch (java.lang.Throwable th7) {
                    ginVarA8.close();
                    throw th7;
                }
        }
    }

    public /* synthetic */ khx(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

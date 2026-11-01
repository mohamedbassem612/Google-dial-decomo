package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jui implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public jui(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v125, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v79, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [albh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final /* synthetic */ ahtm a(ahth ahthVar) {
        int i = 8;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                defpackage.juh.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer", "onNegativeButtonClicked", 116, "CallerIdFeedbackDialogFragmentPeer.java").v("Inserting bad caller ID feedback in the database.");
                defpackage.juh juhVar = (defpackage.juh) this.a;
                defpackage.jrz jrzVar = juhVar.e;
                defpackage.hkd hkdVar = jrzVar.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                java.lang.String str = hkdVar.c;
                defpackage.kiw kiwVar = jrzVar.d;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                defpackage.hwv hwvVar = juhVar.f;
                agsm agsmVar = juhVar.c;
                defpackage.jhw jhwVar = juhVar.h;
                java.lang.String str2 = kiwVar.c;
                akzx akzxVarM = jsm.a.m();
                long j = jrzVar.e;
                akzxVarM.u();
                jsm jsmVar = akzxVarM.b;
                jsmVar.b |= 1;
                jsmVar.c = j;
                ahrv ahrvVarI = ahrv.g(((jsk) hwvVar.b).b(str, str2, akzxVarM.p())).i(new defpackage.idd(hwvVar, jrzVar, 10, bArr), (java.util.concurrent.Executor) hwvVar.d);
                agsmVar.k(ahrvVarI);
                jhwVar.D(ahrvVarI);
                defpackage.jug jugVar = juhVar.d;
                jugVar.f();
                juhVar.a(2132017903);
                akzx akzxVarP = jrzVar.p();
                akzxVarP.u();
                defpackage.jrz jrzVar2 = (defpackage.jrz) akzxVarP.b;
                jrzVar2.f = 4;
                jrzVar2.b |= 8;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarP.u();
                defpackage.jrz jrzVar3 = (defpackage.jrz) akzxVarP.b;
                jrzVar3.b |= 4;
                jrzVar3.e = epochMilli;
                defpackage.juk.aU((defpackage.jrz) akzxVarP.p()).r(jugVar.G().a(), "follow-up ID feedback");
                return ahtm.a;
            case 1:
                defpackage.jub.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdCrowdsourcingOptInDialogFragmentPeer", "onPositiveButtonClicked", 85, "CallerIdCrowdsourcingOptInDialogFragmentPeer.java").v("Saving positive CallerIdBusiness feedback.");
                defpackage.jub jubVar = (defpackage.jub) this.a;
                jubVar.e.o(rmx.fv);
                defpackage.jrz jrzVar4 = jubVar.b;
                defpackage.jyn jynVar = jubVar.f;
                ajcq ajcqVarI = ahrv.g(jynVar.c(jrzVar4, true)).i(new defpackage.idd(jynVar, jrzVar4, i, bArr), (java.util.concurrent.Executor) jynVar.b);
                jubVar.d.k(ajcqVarI);
                jubVar.h.D(ajcqVarI);
                jubVar.a();
                defpackage.juk.aU(jrzVar4).r(jubVar.c.J(), "caller_id_suggestion_dialog");
                return ahtm.a;
            case 2:
                defpackage.juh.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer", "onNeutralButtonClicked", 137, "CallerIdFeedbackDialogFragmentPeer.java").v("Cancel button clicked.");
                defpackage.jug jugVar2 = ((defpackage.juh) this.a).d;
                if (jugVar2.G() instanceof com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity) {
                    defpackage.jue.a(jugVar2.G(), 0);
                }
                return ahtm.a;
            case 3:
                defpackage.juh.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer", "onPositiveButtonClicked", 93, "CallerIdFeedbackDialogFragmentPeer.java").v("Inserting good caller ID feedback in the database.");
                akzx akzxVarM2 = soz.a.m();
                defpackage.juh juhVar2 = (defpackage.juh) this.a;
                defpackage.jrz jrzVar5 = juhVar2.e;
                defpackage.kiw kiwVar2 = jrzVar5.d;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                defpackage.hwv hwvVar2 = juhVar2.f;
                java.lang.String str3 = kiwVar2.c;
                akzxVarM2.u();
                soz sozVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar.b |= 1;
                sozVar.c = str3;
                soz sozVarP = akzxVarM2.p();
                defpackage.hkd hkdVar2 = jrzVar5.c;
                if (hkdVar2 == null) {
                    hkdVar2 = defpackage.hkd.a;
                }
                java.lang.Object obj = hwvVar2.b;
                agsm agsmVar2 = juhVar2.c;
                defpackage.jhw jhwVar2 = juhVar2.h;
                java.lang.String str4 = hkdVar2.c;
                akzx akzxVarM3 = jsm.a.m();
                long j2 = jrzVar5.e;
                akzxVarM3.u();
                jsm jsmVar2 = akzxVarM3.b;
                jsmVar2.b |= 1;
                jsmVar2.c = j2;
                ahrv ahrvVarI2 = ahrv.g(((jsk) obj).c(str4, sozVarP, akzxVarM3.p())).i(new defpackage.idd(hwvVar2, jrzVar5, 11, bArr), (java.util.concurrent.Executor) hwvVar2.d);
                agsmVar2.k(ahrvVarI2);
                jhwVar2.D(ahrvVarI2);
                defpackage.jug jugVar3 = juhVar2.d;
                if (jugVar3.G() instanceof com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity) {
                    com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity callerIdFeedbackDialogActivityG = jugVar3.G();
                    java.lang.String string = jugVar3.dX().getString(2132017904);
                    aooh.f(callerIdFeedbackDialogActivityG, "<this>");
                    defpackage.hmr.j(callerIdFeedbackDialogActivityG, -1, string, null);
                } else {
                    jugVar3.f();
                    juhVar2.a(2132017904);
                }
                return ahtm.a;
            case 4:
                defpackage.jum.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdSuggestionDialogFragmentPeer", "onNegativeButtonClicked", 167, "CallerIdSuggestionDialogFragmentPeer.java").v("cancel");
                defpackage.jum jumVar = (defpackage.jum) this.a;
                jumVar.f.o(rmx.fr);
                defpackage.juk jukVar = jumVar.b;
                if (jukVar.G() instanceof com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity) {
                    defpackage.jue.a(jukVar.G(), -1);
                } else {
                    jukVar.f();
                }
                return ahtm.a;
            case 5:
                aimz aimzVar = defpackage.jum.a;
                aimzVar.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdSuggestionDialogFragmentPeer", "onPositiveButtonClicked", 138, "CallerIdSuggestionDialogFragmentPeer.java").v("submit caller ID suggestion");
                defpackage.jum jumVar2 = (defpackage.jum) this.a;
                jumVar2.f.o(rmx.fq);
                defpackage.juk jukVar2 = jumVar2.b;
                java.lang.String string2 = jukVar2.c().findViewById(2131429147).getText().toString();
                akzx akzxVarM4 = soz.a.m();
                akzxVarM4.u();
                soz sozVar2 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(string2);
                sozVar2.b |= 1;
                sozVar2.c = string2;
                soz sozVarP2 = akzxVarM4.p();
                defpackage.jrz jrzVar6 = jumVar2.d;
                defpackage.hkd hkdVar3 = jrzVar6.c;
                if (hkdVar3 == null) {
                    hkdVar3 = defpackage.hkd.a;
                }
                defpackage.jyn jynVar2 = jumVar2.g;
                agsm agsmVar3 = jumVar2.c;
                defpackage.jhw jhwVar3 = jumVar2.i;
                java.lang.String str5 = hkdVar3.c;
                akzx akzxVarM5 = jsm.a.m();
                long j3 = jrzVar6.e;
                akzxVarM5.u();
                jsm jsmVar3 = akzxVarM5.b;
                jsmVar3.b |= 1;
                jsmVar3.c = j3;
                ahrv ahrvVarI3 = ahrv.g(((jsk) jynVar2.d).c(str5, sozVarP2, akzxVarM5.p())).i(new defpackage.juo(jynVar2, jrzVar6, string2, 0), (java.util.concurrent.Executor) jynVar2.b);
                agsmVar3.k(ahrvVarI3);
                jhwVar3.D(ahrvVarI3);
                if (jukVar2.G() instanceof com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity) {
                    defpackage.hmr.j(jukVar2.G(), -1, jukVar2.dX().getString(2132020315), string2);
                } else {
                    jukVar2.f();
                    android.view.View viewFindViewById = jukVar2.G().findViewById(jrzVar6.k);
                    if (viewFindViewById == null) {
                        a.bI(aimzVar.d(), "null parent view", "com/android/dialer/calleridfeedback/impl/ui/CallerIdSuggestionDialogFragmentPeer", "showSnackBar", (char) 194, "CallerIdSuggestionDialogFragmentPeer.java", zct.b);
                    } else {
                        agby.o(viewFindViewById, 2132020315, -1).h();
                    }
                }
                return ahtm.a;
            case 6:
                defpackage.juq.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerTagFeedbackDialogFragmentPeer", "onNegativeButtonClicked", 121, "CallerTagFeedbackDialogFragmentPeer.java").v("Inserting bad caller tag feedback in the database.");
                defpackage.juq juqVar = (defpackage.juq) this.a;
                defpackage.jrz jrzVar7 = juqVar.d;
                defpackage.hkd hkdVar4 = jrzVar7.c;
                if (hkdVar4 == null) {
                    hkdVar4 = defpackage.hkd.a;
                }
                java.lang.String str6 = hkdVar4.c;
                defpackage.kiw kiwVar3 = jrzVar7.d;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                zag zagVar = kiwVar3.u;
                if (zagVar == null) {
                    zagVar = zag.a;
                }
                zai zaiVar = zagVar.c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                defpackage.hwv hwvVar3 = juqVar.f;
                agsm agsmVar4 = juqVar.b;
                defpackage.jhw jhwVar4 = juqVar.h;
                java.lang.String str7 = zaiVar.b;
                akzx akzxVarM6 = jsm.a.m();
                long j4 = jrzVar7.e;
                akzxVarM6.u();
                jsm jsmVar4 = akzxVarM6.b;
                jsmVar4.b |= 1;
                jsmVar4.c = j4;
                jsm jsmVarP = akzxVarM6.p();
                jsk jskVar = (jsk) hwvVar3.b;
                ahrv ahrvVarI4 = ahrv.g(ahrv.g(jskVar.a(str6)).i(new defpackage.jsc(jskVar, (java.lang.Object) str7, str6, jsmVarP, 2), jskVar.b)).i(new defpackage.idd(hwvVar3, jrzVar7, 13, bArr), (java.util.concurrent.Executor) hwvVar3.d);
                agsmVar4.k(ahrvVarI4);
                jhwVar4.D(ahrvVarI4);
                defpackage.jup jupVar = juqVar.c;
                jupVar.f();
                juqVar.a(2132017924);
                if (((java.lang.Long) juqVar.e.a()).longValue() != 0) {
                    akzx akzxVarP2 = jrzVar7.p();
                    akzxVarP2.u();
                    defpackage.jrz jrzVar8 = (defpackage.jrz) akzxVarP2.b;
                    jrzVar8.f = 5;
                    jrzVar8.b |= 8;
                    long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                    akzxVarP2.u();
                    defpackage.jrz jrzVar9 = (defpackage.jrz) akzxVarP2.b;
                    jrzVar9.b |= 4;
                    jrzVar9.e = epochMilli2;
                    defpackage.jvf.aU((defpackage.jrz) akzxVarP2.p()).r(jupVar.G().a(), "follow-up feedback");
                }
                return ahtm.a;
            case 7:
                defpackage.juq.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerTagFeedbackDialogFragmentPeer", "onPositiveButtonClicked", 108, "CallerTagFeedbackDialogFragmentPeer.java").v("Inserting good caller tag feedback in the database.");
                defpackage.juq juqVar2 = (defpackage.juq) this.a;
                defpackage.jrz jrzVar10 = juqVar2.d;
                defpackage.hkd hkdVar5 = jrzVar10.c;
                if (hkdVar5 == null) {
                    hkdVar5 = defpackage.hkd.a;
                }
                java.lang.String str8 = hkdVar5.c;
                defpackage.kiw kiwVar4 = jrzVar10.d;
                if (kiwVar4 == null) {
                    kiwVar4 = defpackage.kiw.a;
                }
                akzx akzxVarM7 = zhj.a.m();
                zag zagVar2 = kiwVar4.u;
                if (zagVar2 == null) {
                    zagVar2 = zag.a;
                }
                defpackage.hwv hwvVar4 = juqVar2.f;
                agsm agsmVar5 = juqVar2.b;
                defpackage.jhw jhwVar5 = juqVar2.h;
                akzxVarM7.u();
                zhj zhjVar = akzxVarM7.b;
                j$.util.Objects.requireNonNull(zagVar2);
                zhjVar.g = zagVar2;
                zhjVar.b |= 16;
                zhj zhjVarP = akzxVarM7.p();
                akzx akzxVarM8 = jsm.a.m();
                long j5 = jrzVar10.e;
                akzxVarM8.u();
                jsm jsmVar5 = akzxVarM8.b;
                jsmVar5.b |= 1;
                jsmVar5.c = j5;
                ahrv ahrvVarI5 = ahrv.g(((jsk) hwvVar4.b).d(str8, zhjVarP, akzxVarM8.p())).i(new defpackage.idd(hwvVar4, jrzVar10, 12, bArr), (java.util.concurrent.Executor) hwvVar4.d);
                agsmVar5.k(ahrvVarI5);
                jhwVar5.D(ahrvVarI5);
                juqVar2.c.f();
                juqVar2.a(2132017925);
                return ahtm.a;
            case 8:
                defpackage.kga kgaVar = (defpackage.kga) ahthVar;
                defpackage.klo kloVar = (defpackage.klo) this.a;
                j$.util.Optional optionalG = kloVar.J.g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((defpackage.kgp) optionalG.get()).a());
                }
                defpackage.kgo kgoVar = (defpackage.kgo) j$.util.Objects.requireNonNull((defpackage.kgo) optionalG.orElse((java.lang.Object) null));
                kgc kgcVar = kgaVar.a;
                agtj agtjVar = kloVar.j;
                aooh.f(kgcVar, "key");
                agtjVar.i(zoe.N(aosv.F((aoss) kgoVar.b, 0, new defpackage.jpj(kgoVar, kgcVar, (aoln) null, 17), 3)), kloVar.t);
                switch (kgcVar.ordinal()) {
                    case 0:
                        kloVar.g.o(rmx.sv);
                        break;
                    case 1:
                        kloVar.g.o(rmx.st);
                        kloVar.L.i((java.lang.String) null).b(mce.dm);
                        break;
                    case 2:
                        kloVar.g.o(rmx.sw);
                        break;
                    case 3:
                        kloVar.g.o(rmx.sx);
                        break;
                    case 4:
                        kloVar.g.o(rmx.su);
                        kloVar.L.i((java.lang.String) null).b(mce.dn);
                        break;
                    case 5:
                        kloVar.g.o(rmx.sy);
                        break;
                    case 6:
                        kloVar.g.o(rmx.sz);
                        break;
                }
                return ahtm.a;
            case 9:
                ((defpackage.klo) this.a).e(((defpackage.klq) ahthVar).a);
                return ahtm.a;
            case 10:
                kuk kukVar = (kuk) ahthVar;
                long j6 = kukVar.b;
                java.lang.String str9 = kukVar.a;
                defpackage.klo kloVar2 = (defpackage.klo) this.a;
                kloVar2.j.i(zoe.N(kloVar2.P.X(j6, str9)), kloVar2.s);
                return ahtm.a;
            case 11:
                kiu kiuVar = ((map) ahthVar).a;
                defpackage.klo kloVar3 = (defpackage.klo) this.a;
                kloVar3.n.g(kloVar3.m.m(kloVar3.f.H(), kiuVar, kloVar3.y), 5L, java.util.concurrent.TimeUnit.SECONDS);
                return ahtm.a;
            case 12:
                aooh.f((ahtd) ahthVar, "event");
                ((defpackage.klt) this.a).c.o(rmx.os);
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.klt kltVar = (defpackage.klt) this.a;
                if (((java.lang.Boolean) kltVar.f.a()).booleanValue()) {
                    ((defpackage.jyb) kltVar.e).a((defpackage.kmc) kltVar.d);
                } else {
                    android.content.Intent intent = new android.content.Intent("action_delete_call_log_item_requested");
                    akmr.t(intent, "delete_calls_context", (albh) kltVar.d);
                    epq.a((android.content.Context) kltVar.b).d(intent);
                }
                kltVar.c.o(rmx.or);
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.knq knqVar = (defpackage.knq) this.a;
                knqVar.g.i((java.lang.String) null).b(mce.di);
                if (((java.lang.Boolean) knqVar.f.a()).booleanValue()) {
                    knqVar.e.a(knqVar.d);
                } else {
                    android.content.Intent intent2 = new android.content.Intent("action_delete_call_log_item_requested");
                    akmr.t(intent2, "delete_calls_context", knqVar.d);
                    epq.a(knqVar.b.G()).d(intent2);
                }
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.String strA = ((defpackage.ktr) ahthVar).a();
                defpackage.kth kthVar = (defpackage.kth) this.a;
                if (kthVar.c.getString(2132018698).equals(strA)) {
                    kthVar.b("");
                } else {
                    kthVar.b(strA);
                }
                return ahtm.a;
            case 16:
                defpackage.kth kthVar2 = (defpackage.kth) this.a;
                ((defpackage.al) kthVar2.c.a().e("call_issues_chooser")).f();
                kthVar2.d();
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.kts ktsVar = (defpackage.kts) this.a;
                ahvr.h(new defpackage.ktg(ktsVar.b[ktsVar.c]), ktsVar.e);
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.kvs kvsVar = (defpackage.kvs) ((defpackage.kvt) this.a).b;
                java.lang.String str10 = kvsVar.c;
                aooh.e(str10, "getCallRecordingFilePath(...)");
                return new ahtm(new kuk(str10, kvsVar.d));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.kwh) this.a).b.setResult(-1, new android.content.Intent().putExtra("call_recording_deleted_key", true));
                return ahtm.a;
            default:
                ((defpackage.kwh) this.a).b.finish();
                return ahtm.a;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jpi implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jpi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                java.util.Set set = defpackage.jpk.a;
                aooh.f(str, "it");
                ((uzx) this.a).aq(str);
                return aojh.a;
            case 1:
                java.lang.String str2 = (java.lang.String) obj;
                java.util.Set set2 = defpackage.jpk.a;
                aooh.f(str2, "it");
                ((uzx) this.a).au(str2);
                return aojh.a;
            case 2:
                defpackage.aixm aixmVar = (defpackage.aixm) obj;
                java.util.Set set3 = defpackage.jpk.a;
                aooh.f(aixmVar, "it");
                aooh.f(aixmVar, "value");
                akzx akzxVar = (akzx) ((uzx) this.a).a;
                akzxVar.u();
                defpackage.aixo aixoVar = (defpackage.aixo) akzxVar.b;
                defpackage.aixo aixoVar2 = defpackage.aixo.a;
                aixoVar.p = aixmVar.f;
                aixoVar.b |= 16384;
                return aojh.a;
            case 3:
                spa spaVar = (spa) obj;
                aooh.f(spaVar, "feedback");
                akzx akzxVarP = spaVar.p();
                akzxVarP.u();
                spa spaVar2 = akzxVarP.b;
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                spaVar2.d = obj2;
                spaVar2.c = 4;
                spa spaVarP = akzxVarP.p();
                aooh.e(spaVarP, "build(...)");
                return spaVarP;
            case 4:
                spa spaVar3 = (spa) obj;
                aooh.f(spaVar3, "feedback");
                sox soxVar = spaVar3.c == 1 ? (sox) spaVar3.d : sox.a;
                java.lang.Object obj3 = this.a;
                akzx akzxVarP2 = soxVar.p();
                akzxVarP2.N((java.lang.String) obj3);
                sox soxVarP = akzxVarP2.p();
                aooh.e(soxVarP, "build(...)");
                sox soxVar2 = soxVarP;
                akzx akzxVarP3 = spaVar3.p();
                akzxVarP3.u();
                spa spaVar4 = akzxVarP3.b;
                j$.util.Objects.requireNonNull(soxVar2);
                spaVar4.d = soxVar2;
                spaVar4.c = 1;
                spa spaVarP2 = akzxVarP3.p();
                aooh.e(spaVarP2, "build(...)");
                return spaVarP2;
            case 5:
                cxi cxiVar = (cxi) obj;
                aooh.f(cxiVar, "coordinates");
                this.a.a(new dpp(cxiVar.h()));
                return aojh.a;
            case 6:
                this.a.b(new dpp(((dpp) obj).a));
                return aojh.a;
            case 7:
                return a.K((java.lang.String) this.a, (diq) obj);
            case 8:
                com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView = (com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) obj;
                aooh.f(dropdownMenuView, "view");
                dropdownMenuView.y().b((defpackage.klb) this.a);
                return aojh.a;
            case 9:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                ailj ailjVarK = ((aihd) ((jzu) this.a).a.a).k();
                aooh.e(ailjVarK, "iterator(...)");
                while (ailjVarK.hasNext()) {
                    ((kau) ailjVarK.next()).b(l);
                }
                return aojh.a;
            case 10:
                return a.J((java.lang.String) this.a, (diq) obj);
            case 11:
                mnp mnpVar = (mnp) obj;
                aooh.f(mnpVar, "dobby");
                java.lang.String str3 = ((mmy) this.a).c;
                aooh.e(str3, "getTranscriptSnippet(...)");
                return mnpVar.b(str3);
            case 12:
                defpackage.kdy kdyVar = (defpackage.kdy) obj;
                aooh.f(kdyVar, "it");
                return java.lang.Boolean.valueOf(defpackage.hgt.s(kdyVar, this.a));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.due dueVar = (defpackage.due) obj;
                android.view.animation.Interpolator interpolator = defpackage.kla.a;
                aooh.f(dueVar, "$this$withConstraintSet");
                defpackage.kkx kkxVar = (defpackage.kkx) this.a;
                dueVar.e(kkxVar.e.a, 3, kkxVar.a.a, 4);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj4 = this.a;
                android.view.animation.Interpolator interpolator2 = defpackage.kla.a;
                return defpackage.hgu.F((defpackage.kkx) obj4, (defpackage.due) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj5 = this.a;
                android.view.animation.Interpolator interpolator3 = defpackage.kla.a;
                return defpackage.hgu.F((defpackage.kkx) obj5, (defpackage.due) obj);
            case 16:
                defpackage.due dueVar2 = (defpackage.due) obj;
                android.view.animation.Interpolator interpolator4 = defpackage.kla.a;
                aooh.f(dueVar2, "$this$withConstraintSet");
                defpackage.kkx kkxVar2 = (defpackage.kkx) this.a;
                dueVar2.e(kkxVar2.e.a, 3, kkxVar2.a.a, 4);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((kh) this.a).f(((java.lang.Integer) obj).intValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long jLongValue = ((java.lang.Long) obj).longValue();
                int i = defpackage.kqs.a;
                return ((j$.time.LocalDate) this.a).plusDays(jLongValue);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f((android.content.Context) obj, "it");
                return this.a;
            default:
                defpackage.kxr kxrVar = (defpackage.kxr) this.a;
                if (kxrVar.e()) {
                    defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "playAudio", 526, "CallRecorder.java").v("set state: idle (mediaplayer complete)");
                    kxrVar.k.set(defpackage.kxq.a);
                    if (((java.lang.Boolean) kxrVar.m.a()).booleanValue()) {
                        kxrVar.o.a(ajcm.a);
                    }
                } else {
                    defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "playAudio", 532, "CallRecorder.java").v("mediaplayer complete after remote audio, won't change state");
                }
                return aojh.a;
        }
    }
}

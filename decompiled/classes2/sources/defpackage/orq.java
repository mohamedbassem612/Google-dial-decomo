package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class orq implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ orq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 17;
        switch (this.$cid) {
            case 0:
                ((android.content.res.Configuration) this.a).setLocale((java.util.Locale) obj);
                break;
            case 1:
                this.a.a(obj);
                break;
            case 2:
                if (((osn) obj).a) {
                    ((osx) ((defpackage.iyh) this.a).a).b.H().finish();
                }
                break;
            case 3:
                ((android.content.Intent) this.a).putExtra("InCallActivity.callId", (java.lang.String) obj);
                break;
            case 4:
                ((android.content.Intent) this.a).putExtra("InCallActivity.callee_id", ((abvz) obj).i());
                break;
            case 5:
                ((android.content.Intent) this.a).putExtra("InCallActivity.outgoing_call_request_id", (java.lang.Long) obj);
                break;
            case 6:
                qay qayVar = (qay) obj;
                aimw aimwVarL = oti.a.b().l("com/android/dialer/incall/activity/lockholder/CallScopeLockHolder", "releaseInCallUiLock", 112, "CallScopeLockHolder.java");
                oti otiVar = (oti) this.a;
                aimwVarL.I("releasing InCallUiLock  %s for %s", qayVar, otiVar.e);
                qayVar.a();
                if (!j$.util.Collection.-EL.stream(otiVar.b.c.keySet()).anyMatch(new defpackage.jty(otiVar.d(), 17))) {
                    otiVar.d.b(mce.V);
                } else {
                    otiVar.d.a(mcd.av);
                }
                break;
            case 7:
                otj.a.b().l("com/android/dialer/incall/activity/lockholder/OnBindUiLockHolder", "releaseInCallUiLock", 76, "OnBindUiLockHolder.java").v("releasing InCallUiLock");
                ((otj) this.a).c.o(rmx.jL);
                ((qay) obj).a();
                break;
            case 8:
                ((otq) ((defpackage.les) this.a).a).b.q((aeun) obj, ruc.g, rub.d);
                break;
            case 9:
                otm otmVar = new otm();
                otmVar.a = j$.util.Optional.of((aeun) obj);
                ((otq) ((defpackage.les) this.a).a).g = otmVar.a();
                break;
            case 10:
                ((rai) obj).a((android.content.Intent) this.a);
                break;
            case 11:
                ((defpackage.her) obj).W((android.content.Intent) this.a);
                break;
            case 12:
                java.lang.Object obj2 = this.a;
                otz otzVar = (otz) obj2;
                otzVar.C.aF(otzVar.b.findViewById(2131428387), new defpackage.lge(obj2, (java.lang.Long) obj, 15));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                abvz abvzVar = (abvz) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                qai qaiVar = akzxVar.b;
                qai qaiVar2 = qai.a;
                j$.util.Objects.requireNonNull(abvzVar);
                qaiVar.c = abvzVar;
                qaiVar.b |= 1;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                zai zaiVar = ((ovf) obj).a;
                ovi oviVar = ((ovk) this.a).b;
                ((android.widget.TextView) ((aw) oviVar).Q.findViewById(2131427465)).setText(afsq.cr(oviVar.z().getString(2132017326, zaiVar.d)));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ahvr.i(pez.am((own) obj), ((oyc) this.a).c);
                break;
            case 16:
                j$.util.Optional optional = ((own) obj).c;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj3 = this.a;
                if (!zIsPresent) {
                    oyc oycVar = (oyc) obj3;
                    oycVar.c().animate().alpha(0.0f).setListener(defpackage.hrz.a(oycVar.d, new oxr(obj3, 6)));
                } else {
                    oyc oycVar2 = (oyc) obj3;
                    oycVar2.c().setText((java.lang.CharSequence) optional.orElseThrow());
                    oycVar2.c().setVisibility(0);
                    oycVar2.b().setVisibility(8);
                    oycVar2.c().animate().alpha(1.0f);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((android.widget.TextView) obj).setText(true == ((own) this.a).m ? 2132017681 : 2132017680);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optionalD = ((oyc) this.a).d();
                defpackage.orq orqVar = new defpackage.orq((own) obj, i);
                if (true == optionalD.isPresent()) {
                    ((android.widget.TextView) optionalD.get()).setText(true == ((own) orqVar.a).m ? 2132017681 : 2132017680);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ahvr.i(pez.al((own) obj), ((oyc) this.a).c);
                break;
            default:
                ((android.widget.ImageView) this.a).setImageDrawable(((own) obj).e);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

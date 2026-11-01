package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jrs implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jrs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v62, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.jrw jrwVar = (defpackage.jrw) this.a;
                jrwVar.i.h(jrwVar.k);
                break;
            case 1:
                ahqx.l(((defpackage.jrw) this.a).g.G(), ((met) obj).a());
                break;
            case 2:
                ((defpackage.ds) this.a).findViewById(2131427900).getViewTreeObserver().addOnPreDrawListener((defpackage.jvi) obj);
                break;
            case 3:
                long jLongValue = ((java.lang.Long) obj).longValue();
                java.lang.Object obj2 = this.a;
                agsm.i(184, ((jxe) obj2).n.i(jLongValue, defpackage.jxn.b), "Emitting event INVOKING_TELECOM_MANAGER_PLACE_CALL failed.", new java.lang.Object[0]);
                break;
            case 4:
                long jLongValue2 = ((java.lang.Long) obj).longValue();
                java.lang.Object obj3 = this.a;
                jxe jxeVar = (jxe) obj3;
                rsr rsrVar = jxeVar.p;
                ahrv ahrvVarG = ahrv.g(aosv.F((aoss) rsrVar.a, 0, new defpackage.atg(rsrVar, jLongValue2, (aoln) null, 9), 3));
                defpackage.jss jssVar = new defpackage.jss(obj3, 11);
                ajcu ajcuVar = jxeVar.j;
                ahrvVarG.h(jssVar, ajcuVar).k(new defpackage.kxu(jxeVar, 1), ajcuVar);
                break;
            case 5:
                long jLongValue3 = ((java.lang.Long) obj).longValue();
                java.lang.Object obj4 = this.a;
                agsm.i(185, ((jxe) obj4).n.i(jLongValue3, defpackage.jxn.m), "Emitting event WPS_WARNING_DIALOG_SHOWN failed.", new java.lang.Object[0]);
                break;
            case 6:
                long jLongValue4 = ((java.lang.Long) obj).longValue();
                java.lang.Object obj5 = this.a;
                agsm.i(183, ((jxe) obj5).n.i(jLongValue4, defpackage.jxn.o), "Emitting event MISSING_CALL_PHONE_PERMISSION failed.", new java.lang.Object[0]);
                break;
            case 7:
                java.lang.Object obj6 = this.a;
                aenj aenjVar = ruc.aF;
                ((defpackage.jxm) obj6).d.p((aeun) obj, aenjVar);
                break;
            case 8:
                java.lang.Object obj7 = this.a;
                aenj aenjVar2 = ruc.aB;
                ((defpackage.jxm) obj7).d.p((aeun) obj, aenjVar2);
                break;
            case 9:
                java.lang.Object obj8 = this.a;
                aenj aenjVar3 = ruc.aC;
                ((defpackage.jxm) obj8).d.p((aeun) obj, aenjVar3);
                break;
            case 10:
                java.lang.Object obj9 = this.a;
                aenj aenjVar4 = ruc.aw;
                ((defpackage.jxm) obj9).d.p((aeun) obj, aenjVar4);
                break;
            case 11:
                java.lang.Object obj10 = this.a;
                aenj aenjVar5 = ruc.ax;
                ((defpackage.jxm) obj10).d.p((aeun) obj, aenjVar5);
                break;
            case 12:
                java.lang.Object obj11 = this.a;
                aenj aenjVar6 = ruc.aD;
                ((defpackage.jxm) obj11).d.p((aeun) obj, aenjVar6);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj12 = this.a;
                aenj aenjVar7 = ruc.ay;
                ((defpackage.jxm) obj12).d.p((aeun) obj, aenjVar7);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj13 = this.a;
                aenj aenjVar8 = ruc.az;
                ((defpackage.jxm) obj13).d.p((aeun) obj, aenjVar8);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj14 = this.a;
                aenj aenjVar9 = ruc.aA;
                ((defpackage.jxm) obj14).d.p((aeun) obj, aenjVar9);
                break;
            case 16:
                java.lang.Object obj15 = this.a;
                aenj aenjVar10 = ruc.aE;
                ((defpackage.jxm) obj15).d.p((aeun) obj, aenjVar10);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj16 = this.a;
                aenj aenjVar11 = ruc.E;
                rub rubVar = rub.c;
                ((jyy) obj16).d.q((aeun) obj, aenjVar11, rubVar);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj17 = this.a;
                aenj aenjVar12 = ruc.D;
                rub rubVar2 = rub.c;
                ((jyy) obj17).d.q((aeun) obj, aenjVar12, rubVar2);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.a.a(obj);
                break;
            default:
                ((android.widget.TextView) this.a).setTag(2131428318, (java.lang.String) obj);
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

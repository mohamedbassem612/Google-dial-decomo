package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kwv implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kwv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.lgp lgpVar;
        int iAN;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                amoz amozVar = akzxVar.b;
                amoz amozVar2 = amoz.a;
                j$.util.Objects.requireNonNull(str);
                amozVar.b |= 4;
                amozVar.f = str;
                return;
            case 1:
                defpackage.hgu.u((android.content.Context) this.a).sJ().bm((rmu) obj);
                return;
            case 2:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                amoz amozVar3 = akzxVar2.b;
                amoz amozVar4 = amoz.a;
                amozVar3.b |= 1;
                amozVar3.d = iIntValue;
                return;
            case 3:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                amoz amozVar5 = akzxVar3.b;
                amoz amozVar6 = amoz.a;
                amozVar5.b |= 2;
                amozVar5.e = iIntValue2;
                return;
            case 4:
                aimz aimzVar = lbl.a;
                ((android.content.ContentValues) this.a).put("call_recording_extras", ((defpackage.kuj) obj).i());
                return;
            case 5:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.kir kirVar = (defpackage.kir) akzxVar4.b;
                defpackage.kir kirVar2 = defpackage.kir.a;
                j$.util.Objects.requireNonNull(str2);
                kirVar.b |= 4;
                kirVar.e = str2;
                return;
            case 6:
                defpackage.lkb lkbVar = (defpackage.lkb) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                defpackage.lcm lcmVar = (defpackage.lcm) akzxVar5.b;
                defpackage.lcm lcmVar2 = defpackage.lcm.a;
                j$.util.Objects.requireNonNull(lkbVar);
                lcmVar.e = lkbVar;
                lcmVar.b |= 4;
                return;
            case 7:
                defpackage.lcr lcrVar = (defpackage.lcr) obj;
                aigf aigfVar = defpackage.lcq.a;
                akzx akzxVarM = ahwg.a.m();
                java.lang.String str3 = lcrVar.a;
                akzxVarM.u();
                ahwg ahwgVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                ahwgVar.b |= 1;
                ahwgVar.c = str3;
                akzc akzcVar = lcrVar.b;
                akzxVarM.u();
                ahwg ahwgVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akzcVar);
                ahwgVar2.b |= 2;
                ahwgVar2.d = akzcVar;
                ((akzx) this.a).at(akzxVarM.p());
                return;
            case 8:
                java.lang.String str4 = (java.lang.String) obj;
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                defpackage.lkb lkbVar2 = (defpackage.lkb) akzxVar6.b;
                defpackage.lkb lkbVar3 = defpackage.lkb.a;
                j$.util.Objects.requireNonNull(str4);
                lkbVar2.b |= 4;
                lkbVar2.e = str4;
                return;
            case 9:
                int iAd = a.ad(((android.telecom.DisconnectCause) obj).getCode());
                akzx akzxVar7 = (akzx) this.a;
                akzxVar7.u();
                defpackage.lkd lkdVar = (defpackage.lkd) akzxVar7.b;
                defpackage.lkd lkdVar2 = defpackage.lkd.a;
                if (iAd == 0) {
                    throw null;
                }
                lkdVar.d = iAd - 1;
                lkdVar.b |= 2;
                return;
            case 10:
                aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.lgp) obj).b).filter(new defpackage.jvr(19)).collect(aido.a);
                akzx akzxVarM2 = defpackage.lgp.a.m();
                if (aifyVar.isEmpty()) {
                    lgpVar = (defpackage.lgp) akzxVarM2.p();
                } else {
                    defpackage.lgo lgoVar = (defpackage.lgo) aifyVar.get(0);
                    if (aifyVar.size() == 1) {
                        akzxVarM2.I(lgoVar);
                        lgpVar = (defpackage.lgp) akzxVarM2.p();
                    } else {
                        for (int i = 1; i < aifyVar.size(); i++) {
                            defpackage.lgo lgoVar2 = (defpackage.lgo) aifyVar.get(i);
                            int iAN2 = a.aN(lgoVar.g);
                            if (iAN2 == 0 || iAN2 != 2 || (iAN = a.aN(lgoVar2.g)) == 0 || iAN != 2) {
                                akzxVarM2.I(lgoVar);
                                lgoVar = lgoVar2;
                            } else {
                                java.lang.String str5 = lgoVar.e + java.lang.System.getProperty("line.separator") + lgoVar2.e;
                                akzx akzxVarP = lgoVar.p();
                                akzxVarP.u();
                                defpackage.lgo lgoVar3 = (defpackage.lgo) akzxVarP.b;
                                j$.util.Objects.requireNonNull(str5);
                                lgoVar3.b |= 4;
                                lgoVar3.e = str5;
                                int iAN3 = a.aN(lgoVar2.f);
                                if (iAN3 == 0) {
                                    iAN3 = 1;
                                }
                                akzxVarP.u();
                                defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarP.b;
                                lgoVar4.f = iAN3 - 1;
                                lgoVar4.b |= 8;
                                boolean z = lgoVar2.k;
                                akzxVarP.u();
                                defpackage.lgo lgoVar5 = (defpackage.lgo) akzxVarP.b;
                                lgoVar5.b |= 256;
                                lgoVar5.k = z;
                                lgoVar = (defpackage.lgo) akzxVarP.p();
                            }
                        }
                        akzxVarM2.I(lgoVar);
                        lgpVar = (defpackage.lgp) akzxVarM2.p();
                    }
                }
                akzx akzxVar8 = (akzx) this.a;
                akzxVar8.u();
                defpackage.lex lexVar = (defpackage.lex) akzxVar8.b;
                defpackage.lex lexVar2 = defpackage.lex.a;
                j$.util.Objects.requireNonNull(lgpVar);
                lexVar.e = lgpVar;
                lexVar.b |= 4;
                return;
            case 11:
                aimz aimzVar2 = defpackage.lgi.a;
                ((szt) obj).a((defpackage.lgp) this.a);
                return;
            case 12:
                ((vwb) obj).b();
                defpackage.ldn ldnVar = ((defpackage.lgv) this.a).r;
                agsm.i(286, ahvr.E(new defpackage.ldf(ldnVar, 3), ldnVar.g), "failed to log stop recording time", new java.lang.Object[0]);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.lgz) this.a).i = ((defpackage.lhd) obj).a;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.lhh) this.a).a((defpackage.liq) obj);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aimz aimzVar3 = ljb.a;
                ((android.content.Intent) this.a).putExtra("android.speech.extra.LANGUAGE", (java.lang.String) obj);
                return;
            case 16:
                java.lang.String str6 = (java.lang.String) obj;
                akzx akzxVarM3 = defpackage.ljz.a.m();
                akzxVarM3.u();
                defpackage.ljz ljzVar = (defpackage.ljz) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str6);
                ljzVar.b |= 1;
                ljzVar.c = str6;
                akzx akzxVar9 = (akzx) this.a;
                akzxVar9.u();
                defpackage.ljx ljxVar = (defpackage.ljx) akzxVar9.b;
                defpackage.ljz ljzVar2 = (defpackage.ljz) akzxVarM3.p();
                defpackage.ljx ljxVar2 = defpackage.ljx.a;
                j$.util.Objects.requireNonNull(ljzVar2);
                ljxVar.d = ljzVar2;
                ljxVar.b |= 2;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aify aifyVarN = aify.n(((defpackage.lex) obj).f);
                defpackage.lmb lmbVar = ((defpackage.lmk) this.a).e;
                ahvr.cj(lmbVar.g, "expected non null suggestions");
                lmbVar.g = aifyVarN;
                lmbVar.f(lmbVar.a() - 1);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                boolean z2 = ((defpackage.lex) obj).h;
                java.lang.Object obj2 = this.a;
                if (!z2) {
                    defpackage.lmk lmkVar = (defpackage.lmk) obj2;
                    defpackage.lmc lmcVar = lmkVar.b;
                    android.view.View viewFindViewById = ((aw) lmcVar).Q.findViewById(2131428426);
                    viewFindViewById.setClickable(false);
                    viewFindViewById.setAlpha(0.5f);
                    android.view.View viewFindViewById2 = ((aw) lmcVar).Q.findViewById(2131428120);
                    viewFindViewById2.setClickable(false);
                    viewFindViewById2.setAlpha(0.5f);
                    android.view.View viewFindViewById3 = ((aw) lmcVar).Q.findViewById(2131429000);
                    viewFindViewById3.setClickable(false);
                    viewFindViewById3.setAlpha(0.5f);
                    lmkVar.c.o(rmx.bu);
                    return;
                }
                defpackage.lmk lmkVar2 = (defpackage.lmk) obj2;
                lmkVar2.c.o(rmx.bt);
                defpackage.lmc lmcVar2 = lmkVar2.b;
                android.view.View viewFindViewById4 = ((aw) lmcVar2).Q.findViewById(2131428426);
                viewFindViewById4.setClickable(true);
                viewFindViewById4.setAlpha(1.0f);
                android.view.View viewFindViewById5 = ((aw) lmcVar2).Q.findViewById(2131428120);
                viewFindViewById5.setClickable(true);
                viewFindViewById5.setAlpha(1.0f);
                if (((java.lang.Boolean) lmkVar2.f.a()).booleanValue()) {
                    android.view.View viewFindViewById6 = ((aw) lmcVar2).Q.findViewById(2131429000);
                    viewFindViewById6.setVisibility(0);
                    viewFindViewById6.setClickable(true);
                    viewFindViewById6.setAlpha(1.0f);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((aw) ((defpackage.lmk) this.a).b).Q.findViewById(2131427826).setVisibility(true == ((defpackage.lex) obj).g ? 0 : 8);
                return;
            default:
                defpackage.ldn ldnVar2 = ((defpackage.lev) obj).g.f;
                agsm.i(269, ahvr.E(new defpackage.jnv(ldnVar2, ((defpackage.lgk) this.a).h, 14, bArr), ldnVar2.g), "failed to log metrics for presented chip", new java.lang.Object[0]);
                return;
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

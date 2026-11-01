package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jcj implements defpackage.geh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jcj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v79, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [ajct, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.geh
    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        owy owyVar;
        ajcq ajcqVarP;
        ajcq ajcqVarG;
        ajcq ajcqVarH;
        ajcq ajcqVarF;
        int i = 3;
        switch (this.$cid) {
            case 0:
                defpackage.jcp jcpVar = (defpackage.jcp) this.a;
                if (jcpVar.n) {
                    afsn afsnVar = new afsn(jcpVar.e.H(), 2132084998);
                    afsnVar.q(2131231487);
                    afsnVar.x(2132017518);
                    afsnVar.r(2132017517);
                    afsnVar.p(false);
                    afsnVar.w(2132017516, new rjt(1));
                    afsnVar.create().show();
                    return false;
                }
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                defpackage.jbn jbnVar = ((java.lang.Boolean) obj).booleanValue() ? defpackage.jbn.ENROLLMENT_STATUS_OPTED_IN : defpackage.jbn.ENROLLMENT_STATUS_OPTED_OUT;
                defpackage.jcp.a.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer", "configureFeatureSwitchPreference$<anonymous>", 331, "BeeslySettingsFragmentPeer.kt").y("new Beesly enrollment status: %s", jbnVar.name());
                agtj agtjVar = jcpVar.g;
                defpackage.jbv jbvVar = jcpVar.f;
                ajcq ajcqVarF2 = aosv.F(jbvVar.b, 0, new defpackage.jcu(jbvVar, jbnVar, (aoln) null, 1), 3);
                int iOrdinal = jbnVar.ordinal();
                if (iOrdinal == 1) {
                    jbvVar.f.o(rmx.wE);
                } else if (iOrdinal != 2) {
                    defpackage.jbv.a.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettingsDataService", "setBeeslyEnrollment", 102, "BeeslySettingsDataService.kt").v("Unexpected Soda state");
                } else {
                    jbvVar.f.o(rmx.wD);
                }
                jbvVar.m.s(ajcqVarF2, defpackage.jcc.a);
                agtjVar.i(zoe.N(ajcqVarF2), jcpVar.p);
                break;
            case 1:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.hus) this.a).d.n(rmw.fR);
                }
                break;
            case 2:
                defpackage.kwx kwxVar = (defpackage.kwx) j$.util.Optional.ofNullable(defpackage.kwx.b(java.lang.Integer.parseInt((java.lang.String) obj))).orElse(defpackage.kwx.UNSPECIFIED);
                int iOrdinal2 = kwxVar.ordinal();
                java.lang.Object obj2 = this.a;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    defpackage.kzs kzsVar = (defpackage.kzs) obj2;
                    kzsVar.h.i(zoe.N(kzsVar.f.b(kwxVar)), kzsVar.v);
                    kzsVar.i.o(rmx.fF);
                    return false;
                }
                defpackage.kzs kzsVar2 = (defpackage.kzs) obj2;
                agtj agtjVar2 = kzsVar2.h;
                defpackage.kvb kvbVar = kzsVar2.g;
                agtjVar2.j(new zoe(kvbVar.b.c(kvbVar.a(kwxVar))), new zoe(java.lang.Integer.valueOf(kwxVar.f)), kzsVar2.u);
                return false;
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj3 = this.a;
                if (!zBooleanValue) {
                    ((defpackage.kzs) obj3).e(false);
                    return false;
                }
                defpackage.lag lagVar = new defpackage.lag();
                amxr.g(lagVar);
                lagVar.r(((defpackage.kzs) obj3).e.I(), "record_for_non_contacts_dialog");
                return false;
            case 4:
                aooh.f(obj, "newValue");
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.mmq mmqVar = (defpackage.mmq) this.a;
                defpackage.mml mmlVar = mmqVar.g;
                mmqVar.i.i(zoe.N(aosv.F(mmlVar.b, 0, new defpackage.jbu(mmlVar, zBooleanValue2, (aoln) null, 3), 3)), mmqVar.k);
                return false;
            case 5:
                aooh.f(obj, "newValue");
                defpackage.oiz.a.b().l("com/android/dialer/expresso/settings/ui/ExpressoSettingsFragmentPeer", "onIsExpressoEnabledSwitchPreferenceChange", 159, "ExpressoSettingsFragmentPeer.kt").y("newValue = %s", obj);
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.oiz oizVar = (defpackage.oiz) this.a;
                defpackage.jiv jivVar = oizVar.j;
                ajcq ajcqVarF3 = aosv.F((aoss) jivVar.a, 0, new defpackage.jbu(jivVar, zBooleanValue3, (aoln) null, 8), 3);
                ((aogc) jivVar.b).s(ajcqVarF3, defpackage.oiw.a);
                oizVar.f.i(zoe.N(ajcqVarF3), oizVar.h);
                break;
            case 6:
                aooh.f(obj, "newValue");
                defpackage.oiz.a.b().l("com/android/dialer/expresso/settings/ui/ExpressoSettingsFragmentPeer", "onIsRingingEnabledSwitchPreferenceChange", 168, "ExpressoSettingsFragmentPeer.kt").y("newValue = %s", obj);
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.oiz oizVar2 = (defpackage.oiz) this.a;
                defpackage.jiv jivVar2 = oizVar2.j;
                ajcq ajcqVarF4 = aosv.F((aoss) jivVar2.a, 0, new defpackage.jbu(jivVar2, zBooleanValue4, (aoln) null, 9, (byte[]) null), 3);
                ((aogc) jivVar2.b).s(ajcqVarF4, defpackage.oiw.a);
                oizVar2.f.i(zoe.N(ajcqVarF4), oizVar2.h);
                break;
            case 7:
                aooh.f(obj, "newValue");
                java.lang.String str = (java.lang.String) obj;
                oxi.a.b().l("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer", "configureAnswerMethodPreference$<anonymous>", 159, "AnswerMethodSettingsFragmentPeer.kt").y("onPreferenceChanged: %s", str);
                oxi oxiVar = (oxi) this.a;
                if (aooh.n(str, oxiVar.c())) {
                    owyVar = owy.c;
                } else {
                    if (!aooh.n(str, oxiVar.b())) {
                        throw new java.lang.IllegalStateException("Value should be tap or swipe!");
                    }
                    owyVar = owy.b;
                }
                defpackage.krv krvVar = oxiVar.k;
                aoov.an((aoss) krvVar.b, (aolr) null, 0, new defpackage.ohh(krvVar, owyVar, (aoln) null, 10), 3);
                break;
            case 8:
                ((tax) this.a).c(obj);
                return false;
            case 9:
                java.lang.Object obj4 = this.a;
                tax taxVar = (tax) obj4;
                defpackage.lpa lpaVar = taxVar.q;
                defpackage.ook ookVar = new defpackage.ook(((java.lang.Boolean) obj).booleanValue(), 4);
                gou gouVar = taxVar.B;
                lpaVar.b(taxVar.g, ((kaw) gouVar.d).p(((aogc) gouVar.c).bl(ookVar)), new defpackage.oom(obj4, obj, i), new taw(obj4, 3));
                return false;
            case 10:
                boolean zBooleanValue5 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.String str2 = java.lang.String.format("%s=%s;", "HACSetting", true != zBooleanValue5 ? "OFF" : "ON");
                tdd tddVar = ((tdh) this.a).e;
                tddVar.i.setParameters(str2);
                taq taqVar = tddVar.m;
                tddVar.o.s(taqVar.a.eU(ahqx.i(new defpackage.lqh(taqVar, zBooleanValue5 ? 1 : 0, 4))), tdd.b);
                break;
            case 11:
                ((tdh) this.a).e.a(java.lang.Integer.parseInt((java.lang.String) obj));
                break;
            case 12:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                trt trtVar = ((java.lang.Boolean) obj).booleanValue() ? trt.b : trt.c;
                java.lang.Object obj5 = this.a;
                tsq.a.b().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "createFeatureSwitchPreference$<anonymous>", 260, "SharpieSettingsFragmentPeer.kt").y("new sharpie enrollment status: %s", trtVar.toString());
                tsq tsqVar = (tsq) obj5;
                tsqVar.f.i(zoe.N(tsqVar.e.a(trtVar)), tsqVar.l);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ubh.a.b().l("com/android/dialer/sonic/impl/settings/SonicSettingsFragmentPeer", "onIsSonicEnabledSwitchPreferenceChange", 139, "SonicSettingsFragmentPeer.java").y("newValue = %s", obj);
                boolean zBooleanValue6 = ((java.lang.Boolean) obj).booleanValue();
                ubh ubhVar = (ubh) this.a;
                uss ussVar = ubhVar.j;
                uav uavVar = (uav) ussVar.a;
                if (uavVar.b.m()) {
                    uav.a.d().g(10, java.util.concurrent.TimeUnit.MINUTES).m(aioa.b).l("com/android/dialer/sonic/impl/settings/SonicSettings", "setIsSonicTurnedOn", 58, "SonicSettings.java").v("setIsSonicTurnedOn called in direct boot mode");
                    ajcqVarP = uav.a();
                } else {
                    ajcqVarP = uavVar.c.p(uavVar.d.bl(new defpackage.ook(zBooleanValue6, 5)));
                }
                agtj agtjVar3 = ubhVar.f;
                qfm qfmVar = new qfm(ussVar, zBooleanValue6, 2);
                ?? r1 = ussVar.e;
                ajcq ajcqVarH2 = ahvr.H(ajcqVarP, qfmVar, (java.util.concurrent.Executor) r1);
                ((aogc) ussVar.c).s(ajcqVarH2, ubd.a);
                agtjVar3.i(zoe.N(ahvr.I(ajcqVarH2, new tct(ussVar, 17), (java.util.concurrent.Executor) r1)), ubhVar.i);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue7 = bool.booleanValue();
                java.lang.Object obj6 = this.a;
                if (zBooleanValue7) {
                    ((vpc) obj6).s.n(rmw.bY);
                } else {
                    ((vpc) obj6).s.n(rmw.bZ);
                }
                vpc vpcVar = (vpc) obj6;
                vrp vrpVar = vpcVar.t;
                android.telecom.PhoneAccountHandle phoneAccountHandle = vpcVar.f;
                boolean zBooleanValue8 = bool.booleanValue();
                ajcq ajcqVarH3 = ahvr.H(vrpVar.m.x(vrpVar.b, phoneAccountHandle, zBooleanValue8), new vrm(vrpVar, zBooleanValue8, phoneAccountHandle, 0), vrpVar.c);
                vpcVar.u.i(zoe.N(ajcqVarH3), vpcVar.c);
                vpcVar.A.s(ajcqVarH3, new agxj("voicemail_settings_store_data_source_key"));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                boolean zBooleanValue9 = bool2.booleanValue();
                java.lang.Object obj7 = this.a;
                if (zBooleanValue9) {
                    ((vpc) obj7).s.n(rmw.ca);
                } else {
                    ((vpc) obj7).s.n(rmw.cb);
                }
                vpc vpcVar2 = (vpc) obj7;
                vrp vrpVar2 = vpcVar2.t;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = vpcVar2.f;
                boolean zBooleanValue10 = bool2.booleanValue();
                android.content.Context context = vrpVar2.b;
                aooh.f(context, "context");
                aooh.f(phoneAccountHandle2, "phoneAccountHandle");
                gat gatVar = vrpVar2.m;
                ajcq ajcqVarF5 = aosv.F((aoss) gatVar.d, 0, new defpackage.bus(gatVar, context, phoneAccountHandle2, zBooleanValue10, (aoln) null, 3), 3);
                vpcVar2.u.i(zoe.N(ajcqVarF5), vpcVar2.c);
                vpcVar2.A.s(ajcqVarF5, new agxj("voicemail_settings_store_data_source_key"));
                break;
            case 16:
                boolean zBooleanValue11 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj8 = this.a;
                if (!zBooleanValue11) {
                    vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "showDisableConfirmationDialogCompat", 743, "VoicemailSettingsFragmentPeer.java").v("showDisableConfirmation Tiktok Dialog called");
                    vny vnyVar = new vny();
                    amxr.g(vnyVar);
                    vnyVar.r(((vpc) obj8).r.I(), "DisableConfirmationDialogFragment");
                    return false;
                }
                ((vpc) obj8).b(true);
                break;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                boolean zBooleanValue12 = bool3.booleanValue();
                java.lang.Object obj9 = this.a;
                if (zBooleanValue12) {
                    ((vpc) obj9).s.o(rmx.gc);
                } else {
                    ((vpc) obj9).s.o(rmx.gd);
                }
                vpc vpcVar3 = (vpc) obj9;
                vrp vrpVar3 = vpcVar3.t;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = vpcVar3.f;
                boolean zBooleanValue13 = bool3.booleanValue();
                vth.a.b().l("com/android/dialer/voicemail/settings/storage/VoicemailSettingsStore", "setAutoDownloadOverCellularEnabled", 172, "VoicemailSettingsStore.java").y("set auto download over cellular to: %b", bool3);
                vth vthVar = vrpVar3.f;
                ajcq ajcqVarA = vthVar.e.a(new qfm(phoneAccountHandle3, zBooleanValue13, 5), vthVar.d);
                vpcVar3.u.i(zoe.N(ajcqVarA), vpcVar3.c);
                vpcVar3.A.s(ajcqVarA, new agxj("voicemail_settings_store_data_source_key"));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                wqh.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onIsEnabledSwitchPreferenceChange", 314, "XatuSettingsFragmentPeer.java").y("newValue = %s", obj);
                boolean zBooleanValue14 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj10 = this.a;
                if (zBooleanValue14) {
                    wql wqlVar = ((wqh) obj10).h;
                    ajcqVarG = wqlVar.e.g(wpu.b);
                    ajcq ajcqVarA2 = wqlVar.d.a();
                    aogc aogcVar = wqlVar.j;
                    agxj agxjVar = wqa.a;
                    aogcVar.s(ajcqVarG, agxjVar);
                    aogcVar.t(ahvr.ak(new ajcq[]{ajcqVarG, ajcqVarA2}).o(new vnc(3), wqlVar.g), agxjVar);
                    agsm.i(1105, ajcqVarA2, "failed to download necessary models", new java.lang.Object[0]);
                    wqlVar.f.o(rmx.nN);
                } else {
                    wql wqlVar2 = ((wqh) obj10).h;
                    ajcqVarG = wqlVar2.e.g(wpu.c);
                    wqlVar2.j.s(ajcqVarG, wqa.a);
                    wqlVar2.f.o(rmx.nM);
                }
                wqh wqhVar = (wqh) obj10;
                wqhVar.i.i(zoe.N(ajcqVarG), wqhVar.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                wqh.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onIsEnabledShowAheadSwitchPreferenceChange", 325, "XatuSettingsFragmentPeer.java").y("show ahead switch newValue = %s", obj);
                boolean zBooleanValue15 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj11 = this.a;
                if (zBooleanValue15) {
                    wql wqlVar3 = ((wqh) obj11).h;
                    ajcqVarH = wqlVar3.e.h(wpw.c);
                    wqlVar3.j.s(ajcqVarH, wqa.a);
                } else {
                    wql wqlVar4 = ((wqh) obj11).h;
                    ajcqVarH = wqlVar4.e.h(wpw.d);
                    wqlVar4.j.s(ajcqVarH, wqa.a);
                }
                wqh wqhVar2 = (wqh) obj11;
                wqhVar2.i.i(zoe.N(ajcqVarH), wqhVar2.c);
                break;
            default:
                wqh.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onIsEnabledAutomaticDisplaySwitchPreferenceChange", 338, "XatuSettingsFragmentPeer.java").y("automatic display switch newValue = %s", obj);
                boolean zBooleanValue16 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj12 = this.a;
                if (zBooleanValue16) {
                    wql wqlVar5 = ((wqh) obj12).h;
                    ajcqVarF = wqlVar5.e.f(wpt.b);
                    wqlVar5.j.s(ahrv.g(ajcqVarF).i(new wkv(wqlVar5, 10), wqlVar5.g), wqa.a);
                    wqlVar5.f.o(rmx.nP);
                } else {
                    wql wqlVar6 = ((wqh) obj12).h;
                    ajcqVarF = wqlVar6.e.f(wpt.c);
                    wqlVar6.j.s(ajcqVarF, wqa.a);
                    wqlVar6.f.o(rmx.nO);
                }
                wqh wqhVar3 = (wqh) obj12;
                wqhVar3.i.i(zoe.N(ajcqVarF), wqhVar3.d);
                break;
        }
        return true;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mtr implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mtr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v36, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.String str;
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        switch (i) {
            case 0:
                defpackage.krt.aU().r(defpackage.zb.i((android.view.View) this.a).J(), "FermatSummaryDisclaimerBottomSheetFragment");
                return aojh.a;
            case 1:
                ((defpackage.mli) this.a).D.bm(rmu.U);
                return null;
            case 2:
                defpackage.mup mupVar = (defpackage.mup) this.a;
                mupVar.b.o(rmx.kP);
                ryg rygVarAU = pez.aU(rvq.a.m());
                ryg rygVarAS = pez.aS(rvo.a.m());
                rygVarAS.k(rvc.B);
                rygVarAU.o(rygVarAS.i());
                android.content.Intent intentAddFlags = mupVar.c.aL(rygVarAU.n()).addFlags(268435456);
                aooh.e(intentAddFlags, "addFlags(...)");
                ahqx.l(mupVar.a, intentAddFlags);
                return aojh.a;
            case 3:
                defpackage.mvd mvdVar = (defpackage.mvd) this.a;
                mvdVar.c.o(rmx.kL);
                aoov.an(mvdVar.b, (aolr) null, 0, new defpackage.muz(mvdVar, (aoln) null, 2), 3);
                return aojh.a;
            case 4:
                defpackage.mvf mvfVar = (defpackage.mvf) this.a;
                mvfVar.c.o(rmx.kN);
                aoov.an(mvfVar.b, (aolr) null, 0, new defpackage.muz(mvfVar, (aoln) null, 3), 3);
                return aojh.a;
            case 5:
                ((defpackage.mvj) this.a).a.o(rmx.kR);
                return aojh.a;
            case 6:
                defpackage.mzx mzxVar = (defpackage.mzx) this.a;
                aoov.an(mzxVar.d, (aolr) null, 0, new defpackage.muz(mzxVar, (aoln) null, 12), 3);
                return aojh.a;
            case 7:
                java.lang.Long l = (java.lang.Long) aooh.q((j$.util.Optional) this.a);
                return java.lang.Long.valueOf(l != null ? j$.time.Instant.now().toEpochMilli() - l.longValue() : 0L);
            case 8:
                com.google.android.gms.googlehelp.InProductHelp inProductHelp = new com.google.android.gms.googlehelp.InProductHelp(new com.google.android.gms.googlehelp.GoogleHelp("call_screen"), (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null);
                inProductHelp.c = "https://support.google.com/phoneapp?p=call_screen";
                afpl afplVar = new afpl(((defpackage.npr) this.a).b.G());
                if (android.text.TextUtils.isEmpty(inProductHelp.c)) {
                    throw new java.lang.IllegalArgumentException("The content URL must be non-empty.");
                }
                int iL = afplVar.L();
                if (iL == 0) {
                    ((aams) afplVar.a.eZ()).b(inProductHelp);
                } else {
                    afplVar.M(iL, inProductHelp.a);
                }
                return aojh.a;
            case 9:
                defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "openGoogleTermsOfService", 606, "DobbySettingsMainFragmentPeer.kt").v("open google terms of service link");
                defpackage.npg npgVar = ((defpackage.npr) this.a).b;
                java.lang.String strY = npgVar.Y(2132018369);
                aooh.e(strY, "getString(...)");
                android.net.Uri uri = android.net.Uri.parse(strY);
                aooh.e(uri, "parse(...)");
                afsq.G(npgVar, new android.content.Intent("android.intent.action.VIEW", uri));
                return aojh.a;
            case 10:
                ((defpackage.npr) this.a).a(defpackage.noi.PROTECTION_LEVEL_MAXIMUM);
                return aojh.a;
            case 11:
                ((defpackage.npr) this.a).a(defpackage.noi.PROTECTION_LEVEL_MEDIUM);
                return aojh.a;
            case 12:
                ((defpackage.npr) this.a).a(defpackage.noi.PROTECTION_LEVEL_BASIC);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.oby obyVar = (defpackage.oby) this.a;
                defpackage.obf obfVar = obyVar.o;
                if (obfVar == null || (str = obfVar.g) == null) {
                    j$.util.Optional optionalH = obyVar.s.h();
                    defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.mws(15), 8);
                    if (true == optionalH.isPresent()) {
                        optionalH = j$.util.Optional.ofNullable(a.l((aonj) nzuVar.a, optionalH.get()));
                    }
                    aooh.e(optionalH, "map(...)");
                    str = (java.lang.String) aooh.q(optionalH);
                }
                obyVar.u.i(str).b(mce.aF);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.ohv) this.a).c(new defpackage.oif(defpackage.oeu.URGENT));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.oji ojiVar = (defpackage.oji) this.a;
                yse yseVarD = ojiVar.d();
                rai raiVar = ojiVar.f;
                aooh.f(raiVar, "assistedFactory");
                aooh.f(yseVarD, "aiCoreFeature");
                return new defpackage.oje(raiVar, yseVarD).a(defpackage.ojf.class);
            case 16:
                ouc.a.b().l("com/android/dialer/incall/activity/uilauncher/impl/DialerInCallUILauncherImpl", "launchInCallActivity$<anonymous>", 27, "DialerInCallUILauncherImpl.kt").v("Launching InCallActivity (primary surface is PHONE)");
                otd otdVar = new otd(false, false, false, false, false, (qit) null, (abvz) null, (java.lang.String) null, (java.lang.Long) null, 511);
                ouc oucVar = (ouc) this.a;
                ahqx.l(oucVar.b, oucVar.c.bk(otdVar));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.abgx) this.a).j.a(fValueOf, fValueOf);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.abgx) this.a).j.a(fValueOf, fValueOf);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((pbp) this.a).c().b(mce.aF);
                return aojh.a;
            default:
                ((pbp) this.a).M.bm(rmu.F);
                return aojh.a;
        }
    }
}

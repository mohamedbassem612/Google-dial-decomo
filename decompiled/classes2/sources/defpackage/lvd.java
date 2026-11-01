package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lvd implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lvd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [aoin, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = 6;
        int i2 = 0;
        defpackage.lkq lkqVar = null;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj2 = this.a;
                rus rusVar = new rus();
                rusVar.d(ruz.b);
                rusVar.c(rvc.F);
                rusVar.e(new rva(2132018145));
                rusVar.b(((defpackage.lvf) obj2).b.getDrawable(2131231513));
                return j$.util.Optional.of(rusVar.a());
            case 1:
                gin ginVarA = ((gjh) obj).a("SELECT * FROM transcript WHERE id = ?");
                java.lang.Object obj3 = this.a;
                try {
                    if (obj3 == null) {
                        ginVarA.i(1);
                    } else {
                        ginVarA.j(1, (java.lang.String) obj3);
                    }
                    int iS = dzk.S(ginVarA, "id");
                    int iS2 = dzk.S(ginVarA, "conversation");
                    int iS3 = dzk.S(ginVarA, "audioRecordingFilePath");
                    int iS4 = dzk.S(ginVarA, "isRated");
                    int iS5 = dzk.S(ginVarA, "revelioCallType");
                    int iS6 = dzk.S(ginVarA, "lastModifiedMillis");
                    int iS7 = dzk.S(ginVarA, "callScreenFeedbackData");
                    if (ginVarA.m()) {
                        defpackage.lkq lkqVar2 = new defpackage.lkq();
                        lkqVar2.a(ginVarA.l(iS) ? null : ginVarA.e(iS));
                        lkqVar2.b = mni.cI(ginVarA.l(iS2) ? null : ginVarA.n(iS2));
                        lkqVar2.c = ginVarA.l(iS3) ? null : ginVarA.e(iS3);
                        lkqVar2.d = ((int) ginVarA.c(iS4)) != 0;
                        lkqVar2.b(mni.cG(ginVarA.l(iS5) ? null : java.lang.Integer.valueOf((int) ginVarA.c(iS5))));
                        lkqVar2.f = ginVarA.c(iS6);
                        lkqVar2.g = mni.cK(ginVarA.l(iS7) ? null : ginVarA.n(iS7));
                        lkqVar = lkqVar2;
                    }
                    ginVarA.close();
                    return lkqVar;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case 2:
                apqr apqrVar = (apqr) obj;
                aooh.f(apqrVar, "primaryCallScope");
                ((gpd) ((pgi) this.a).a).i((java.lang.String) apqrVar.b).b(mce.hA);
                return aojh.a;
            case 3:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                this.a.a(num);
                return aojh.a;
            case 4:
                return a.J((java.lang.String) this.a, (diq) obj);
            case 5:
                agwt agwtVar = (agwm) obj;
                defpackage.mjr mjrVar = agwtVar instanceof agwt ? (defpackage.mjr) agwtVar.a : null;
                defpackage.mli mliVar = (defpackage.mli) this.a;
                mliVar.u = mjrVar;
                if (mjrVar != null) {
                    mliVar.g(mjrVar, mliVar.g.aH() ? mjrVar.c : mjrVar.b);
                    return null;
                }
                j$.util.Optional optional = mliVar.t;
                if (true != optional.isPresent()) {
                    return null;
                }
                ((androidx.compose.ui.platform.ComposeView) optional.get()).setVisibility(8);
                return null;
            case 6:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                defpackage.mli mliVar2 = (defpackage.mli) this.a;
                mliVar2.q.o(rmx.zO);
                num2.intValue();
                mliVar2.r.a.o.e(num2);
                return null;
            case 7:
                agwm agwmVar = (agwm) obj;
                aooh.f(agwmVar, "it");
                this.a.a(agwmVar);
                return aojh.a;
            case 8:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case 9:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case 10:
                afpl afplVar = (afpl) obj;
                aooh.f(afplVar, "$this$withColor");
                afplVar.C((java.lang.String) this.a);
                afplVar.C(" ");
                return aojh.a;
            case 11:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.dvc dvcVar = (defpackage.dvc) obj;
                aooh.f(dvcVar, "wearableExtender");
                dvcVar.b((defpackage.dva) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.dvc dvcVar2 = (defpackage.dvc) obj;
                aooh.f(dvcVar2, "wearableExtender");
                dvcVar2.b((defpackage.dva) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                apqr apqrVar2 = (apqr) obj;
                aooh.f(apqrVar2, "primaryCallScope");
                rdp rdpVar = (rdp) this.a;
                defpackage.msi msiVar = new defpackage.msi(apqrVar2, rdpVar, (aoln) null, 14);
                boolean zBooleanValue = ((java.lang.Boolean) rdpVar.d.a()).booleanValue();
                ?? r0 = rdpVar.c;
                if (zBooleanValue) {
                    aoov.an((aoss) r0, (aolr) null, 0, new defpackage.itj((aonn) msiVar, (aoln) null, 7, (short[]) null), 3);
                } else {
                    aimz aimzVar = zih.a;
                    aoov.al((aoss) r0, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, (aonn) msiVar, 6, (char[]) null));
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                afpl afplVar2 = (afpl) obj;
                aooh.f(afplVar2, "$this$builder");
                java.lang.Object obj4 = this.a;
                afplVar2.C(java.lang.String.valueOf(((defpackage.mzx) obj4).b.getString(2132018474)).concat(" "));
                afplVar2.D("learn more", new defpackage.mtr(obj4, i), new defpackage.lvd(obj4, 16));
                return aojh.a;
            case 16:
                afpl afplVar3 = (afpl) obj;
                aooh.f(afplVar3, "$this$withClickable");
                java.lang.String string = ((defpackage.mzx) this.a).b.getString(2132018781);
                aooh.e(string, "getString(...)");
                afplVar3.C(string);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                afpl afplVar4 = (afpl) obj;
                aooh.f(afplVar4, "$this$builder");
                java.lang.Object obj5 = this.a;
                afplVar4.C(java.lang.String.valueOf(((defpackage.npr) obj5).c.getString(2132018398)).concat(" "));
                afplVar4.D("google terms of service", new defpackage.mtr(obj5, 9), new defpackage.npi(obj5, i2));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "createSettingsItemList$<anonymous>", 373, "DobbySettingsMainFragmentPeer.kt").y("ai generated replies switch changed to %b", bool);
                defpackage.npr nprVar = (defpackage.npr) this.a;
                defpackage.npe npeVar = nprVar.e;
                defpackage.jbu jbuVar = new defpackage.jbu(npeVar, zBooleanValue2, (aoln) null, 5);
                aoss aossVar = npeVar.b;
                aoov.an(aossVar, (aolr) null, 0, jbuVar, 3);
                npeVar.f.o(zBooleanValue2 ? rmx.kD : rmx.kE);
                defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveEnableAiReplies", 221, "DobbySettingsService.kt").y("updating enable ai generated replies to %s", bool);
                defpackage.nof nofVar = zBooleanValue2 ? defpackage.nof.CONSENT_USER_OPTED_IN : defpackage.nof.CONSENT_USER_OPTED_OUT;
                agtj agtjVar = nprVar.i;
                ajcq ajcqVarF = aosv.F(aossVar, 0, new defpackage.nea(npeVar, nofVar, (aoln) null, 19), 3);
                npeVar.p.s(ajcqVarF, defpackage.not.a);
                agtjVar.i(zoe.N(ajcqVarF), nprVar.s);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                boolean zBooleanValue3 = bool2.booleanValue();
                defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveShouldSaveCallAudio", 240, "DobbySettingsService.kt").y("updating save call audio to %s", bool2);
                defpackage.npr nprVar2 = (defpackage.npr) this.a;
                defpackage.npe npeVar2 = nprVar2.e;
                ajcq ajcqVarF2 = aosv.F(npeVar2.b, 0, new defpackage.jbu(npeVar2, zBooleanValue3, (aoln) null, 7, (char[]) null), 3);
                npeVar2.p.s(ajcqVarF2, defpackage.not.a);
                nprVar2.i.i(zoe.N(ajcqVarF2), nprVar2.t);
                return aojh.a;
            default:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                boolean zBooleanValue4 = bool3.booleanValue();
                defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveShouldDeleteOldRecordingsAndTranscripts", 255, "DobbySettingsService.kt").y("updating should delete old recordings to %s", bool3);
                defpackage.npr nprVar3 = (defpackage.npr) this.a;
                defpackage.npe npeVar3 = nprVar3.e;
                ajcq ajcqVarF3 = aosv.F(npeVar3.b, 0, new defpackage.jbu(npeVar3, zBooleanValue4, (aoln) null, 6, (byte[]) null), 3);
                npeVar3.p.s(ajcqVarF3, defpackage.not.a);
                nprVar3.i.i(zoe.N(ajcqVarF3), nprVar3.u);
                return aojh.a;
        }
    }
}

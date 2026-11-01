package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class onp implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ onp(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r7v19, types: [aiii, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return (aify) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new defpackage.old(9)).collect(aido.a);
            case 1:
                otm otmVar = new otm((char[]) null);
                otmVar.a = "is_incoming";
                otmVar.f(java.lang.Boolean.toString(((zmy) obj).equals(zmy.a)));
                return otmVar.e();
            case 2:
                return java.lang.Long.valueOf(((ont) obj).c);
            case 3:
                aimz aimzVar = onw.a;
                akzx akzxVarM = spi.a.m();
                java.util.Collection collectionK = ((aiii) obj).k();
                akzxVarM.u();
                spi spiVar = akzxVarM.b;
                alat alatVar = spiVar.b;
                if (!alatVar.c()) {
                    spiVar.b = alad.J(alatVar);
                }
                akyl.i(collectionK, spiVar.b);
                return akzxVarM.p();
            case 4:
                boolean zEquals = java.lang.Boolean.TRUE.equals((java.lang.Boolean) obj);
                defpackage.oof.a.b().l("com/android/dialer/fliptosilence/impl/FlipToSilenceModule", "provideFlipToSilenceEnabledState", 84, "FlipToSilenceModule.java").y("Added growthkit STATE_FLIP_TO_SILENCE_ENABLED=%s", java.lang.Boolean.valueOf(zEquals));
                return abxl.L("STATE_FLIP_TO_SILENCE_ENABLED", zEquals ? 1 : 0);
            case 5:
                boolean zEquals2 = java.lang.Boolean.TRUE.equals((java.lang.Boolean) obj);
                defpackage.oof.a.b().l("com/android/dialer/fliptosilence/impl/FlipToSilenceModule", "provideFlipToShushEnabledState", 103, "FlipToSilenceModule.java").y("Added growthkit STATE_FLIP_TO_SHUSH_ENABLED=%s", java.lang.Boolean.valueOf(zEquals2));
                return abxl.L("STATE_FLIP_TO_SHUSH_ENABLED", zEquals2 ? 1 : 0);
            case 6:
                return java.lang.Boolean.valueOf(((defpackage.ooj) obj).b);
            case 7:
                alic alicVar = (alic) obj;
                if (alicVar.a != 401) {
                    throw new defpackage.ork(1);
                }
                ?? r7 = alicVar.c;
                if (r7.s(ajzj.a("www-authenticate"))) {
                    return (java.lang.String) r7.f(ajzj.a("www-authenticate")).get(0);
                }
                throw new defpackage.ork(2);
            case 8:
                return java.lang.Long.valueOf(((defpackage.orz) obj).c);
            case 9:
                return java.lang.Boolean.valueOf(((defpackage.hkw) obj).equals(defpackage.hkw.BUBBLE));
            case 10:
                return java.lang.Boolean.valueOf(!((java.lang.Integer) obj).equals(1839));
            case 11:
                ovb.a.b().l("com/android/dialer/incall/answer/answeredcall/AnsweredCallState", "markAsAnswered", 109, "AnsweredCallState.java").v("Error getting telephony info for disabling preemptive call");
                return java.lang.Boolean.TRUE;
            case 12:
                return spn.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.hkd) obj).c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return 0;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return spn.a;
            case 16:
                return 0;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return j$.util.Optional.of((defpackage.hkd) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.Boolean.valueOf(ahvr.r((java.lang.CharSequence) ((j$.util.Optional) obj).orElse(""), "IN"));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aihd aihdVar = (aihd) obj;
                pon.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/contactgrid/dataservice/ContactGridProducerModule", "produceContactGridChip", 221, "ContactGridProducerModule.java").y("chipCandidates: %s", aihdVar);
                return j$.util.Collection.-EL.stream(aihdVar).max(j$.util.Comparator.-CC.comparingInt(new defpackage.fiy(14)));
            default:
                aihd aihdVar2 = (aihd) obj;
                pon.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/contactgrid/dataservice/ContactGridProducerModule", "produceIndicatorList", 204, "ContactGridProducerModule.java").y("indicatorCandidates: %s", aihdVar2);
                return aify.x(j$.util.Comparator.-CC.comparingInt(new defpackage.fiy(15)), aihdVar2).a();
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kwz implements ahyc {
    private final /* synthetic */ int $cid;

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                akzx akzxVarP = ((kwy) obj).p();
                akzxVarP.u();
                kwy kwyVar = akzxVarP.b;
                kwyVar.b |= 8;
                kwyVar.f = true;
                return akzxVarP.p();
            case 1:
                return java.lang.Boolean.valueOf(((kwy) obj).g);
            case 2:
                defpackage.kwx kwxVarB = defpackage.kwx.b(((kwy) obj).d);
                if (kwxVarB == null) {
                    kwxVarB = defpackage.kwx.UNSPECIFIED;
                }
                return kwxVarB == defpackage.kwx.UNSPECIFIED ? defpackage.kwx.NEVER : kwxVarB;
            case 3:
                return java.lang.Boolean.valueOf(((kwy) obj).c);
            case 4:
                kwy kwyVar2 = (kwy) obj;
                if ((kwyVar2.b & 2) != 0) {
                    return kwyVar2;
                }
                akzx akzxVarP2 = kwyVar2.p();
                defpackage.kwx kwxVar = defpackage.kwx.NEVER;
                akzxVarP2.u();
                kwy kwyVar3 = akzxVarP2.b;
                kwyVar3.d = kwxVar.f;
                kwyVar3.b |= 2;
                return akzxVarP2.p();
            case 5:
                akzx akzxVarP3 = ((kwy) obj).p();
                akzxVarP3.u();
                kwy kwyVar4 = akzxVarP3.b;
                kwyVar4.b |= 4;
                kwyVar4.e = true;
                return akzxVarP3.p();
            case 6:
                return java.lang.Boolean.valueOf(((kwy) obj).f);
            case 7:
                return aihd.o(((kwy) obj).h);
            case 8:
                return java.lang.Boolean.valueOf(((kwy) obj).e);
            case 9:
                int i = ((android.os.Bundle) obj).getInt("android.telecom.extra.CALL_NETWORK_TYPE", 0);
                switch (i) {
                    case 1:
                        return "GPRS";
                    case 2:
                        return "EDGE";
                    case 3:
                        return "UMTS";
                    case 4:
                        return "CDMA";
                    case 5:
                        return "EVDO_0";
                    case 6:
                        return "EVDO_A";
                    case 7:
                        return "1xRTT";
                    case 8:
                        return "HSDPA";
                    case 9:
                        return "HSUPA";
                    case 10:
                        return "HSPA";
                    case 11:
                        return "IDEN";
                    case 12:
                        return "EVDO_B";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        return "LTE";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        return "EHRPD";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        return "HSPAP";
                    case 16:
                        return "GSM";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return "TD_SCDMA";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return "IWLAN";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    default:
                        defpackage.kxj.a.d().i(zct.b).l("com/android/dialer/callrecording/impl/psd/CallNetworkPsdIntegration", "telephonyNetworkTypeToString", 124, "CallNetworkPsdIntegration.java").w("unexpected network type %d", i);
                        return "UNKNOWN";
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                        return "NR";
                }
            case 10:
                otm otmVar = new otm((char[]) null);
                otmVar.a = "call_network";
                otmVar.f((java.lang.String) obj);
                return otmVar.e();
            case 11:
                otm otmVar2 = new otm((char[]) null);
                otmVar2.a = "carrier_name";
                otmVar2.f((java.lang.String) ((j$.util.Optional) obj).orElse(""));
                return otmVar2.e();
            case 12:
                hgb.f(defpackage.kxr.a.c(), obj, "failed to save the recording", "com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", (char) 294, "CallRecorder.java", zct.b);
                return j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return (defpackage.kxv) aooc.ar((defpackage.hkl) obj, defpackage.kxv.class);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return (defpackage.hxe) obj;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                akzx akzxVarM = png.a.m();
                pnf pnfVar = pnf.b;
                akzxVarM.u();
                akzxVarM.b.e = pnfVar.a();
                akzxVarM.u();
                png pngVar = akzxVarM.b;
                pngVar.c = 2;
                pngVar.d = 2131230957;
                akzxVarM.u();
                png pngVar2 = akzxVarM.b;
                pngVar2.b |= 1;
                pngVar2.f = 2131230964;
                akzxVarM.u();
                png pngVar3 = akzxVarM.b;
                pngVar3.b |= 2;
                pngVar3.g = 2132017762;
                return j$.util.Optional.of(akzxVarM.p());
            case 16:
                return java.lang.Integer.valueOf(defpackage.hhe.R(((java.io.File) obj).length()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Integer.valueOf(defpackage.hhe.R(((java.io.File) obj).length()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.lao laoVar = (defpackage.lao) obj;
                java.lang.CharSequence[] charSequenceArr = {laoVar.d, laoVar.g};
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(charSequenceArr[0]);
                sb.append((java.lang.CharSequence) ",");
                sb.append(charSequenceArr[1]);
                return sb.toString();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aimz aimzVar = lbl.a;
                return java.lang.Integer.valueOf((int) j$.util.Collection.-EL.stream(((aigf) obj).e()).filter(new defpackage.jvr(13)).count());
            default:
                return java.lang.Boolean.valueOf(((defpackage.lbm) obj).c);
        }
    }
}

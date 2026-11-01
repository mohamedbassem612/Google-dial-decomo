package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jvq implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jvq(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                acui acuiVar = (acui) obj;
                return (acuiVar == null || acuiVar.h.isEmpty()) ? aikj.b : (aigf) j$.util.Collection.-EL.stream(acuiVar.h).collect(aido.b(new defpackage.etw(10), new defpackage.etw(9)));
            case 1:
                defpackage.jvm jvmVar = (defpackage.jvm) obj;
                if (defpackage.jvm.a.equals(jvmVar)) {
                    return agxh.a;
                }
                return j$.time.Instant.now().toEpochMilli() - jvmVar.c < aldf.a(defpackage.jve.a) ? agxh.a(jvmVar, j$.time.Instant.ofEpochMilli(jvmVar.c)) : agxh.b(jvmVar);
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable((aigf) j$.util.Collection.-EL.stream(((aigf) optional.get()).e()).filter(new defpackage.jvr(3)).collect(aido.b(new defpackage.etw(15), new defpackage.etw(16)))) : optional;
            case 3:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2 != null && optional2.isPresent()) {
                    return j$.util.Optional.of((aigf) j$.util.Collection.-EL.stream(((zah) optional2.orElseThrow()).b).collect(aido.b(new defpackage.etw(13), new defpackage.etw(14))));
                }
                a.bI(jvv.a.d(), "No LocalizedTagsConfig present", "com/android/dialer/callertags/impl/CallerTagsImpl", "<init>", 'M', "CallerTagsImpl.java", zct.b);
                return j$.util.Optional.empty();
            case 4:
                return aify.n(((aigf) ((j$.util.Optional) obj).orElse(aikj.b)).c());
            case 5:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return true == optional3.isPresent() ? j$.util.Optional.ofNullable((aigf) j$.util.Collection.-EL.stream(((aigf) optional3.get()).e()).filter(new defpackage.jvr(4)).collect(aido.b(new defpackage.etw(15), new defpackage.etw(16)))) : optional3;
            case 6:
                return null;
            case 7:
                defpackage.kde kdeVarA = defpackage.kdf.a();
                kdeVarA.d((j$.util.Optional) obj);
                kdeVarA.e(tcp.e);
                kdeVarA.f(aikj.b);
                return kdeVarA.a();
            case 8:
                return j$.util.Optional.of((aify) obj);
            case 9:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((srn) optionalOfNullable.get()).b);
                }
                return (spn) optionalOfNullable.orElse(spn.a);
            case 10:
                return kjv.b;
            case 11:
                return new gsf();
            case 12:
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return (aify) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).map(new defpackage.kle(4)).collect(aido.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return (aihd) j$.util.Collection.-EL.stream(((aigf) obj).e()).filter(new defpackage.jvr(12)).map(new defpackage.kle(6)).collect(aido.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                kwy kwyVar = (kwy) obj;
                akzx akzxVarM = defpackage.kzh.a.m();
                boolean z = kwyVar.c;
                akzxVarM.u();
                defpackage.kzh kzhVar = (defpackage.kzh) akzxVarM.b;
                kzhVar.b |= 1;
                kzhVar.c = z;
                defpackage.kwx kwxVarB = defpackage.kwx.b(kwyVar.d);
                if (kwxVarB == null) {
                    kwxVarB = defpackage.kwx.UNSPECIFIED;
                }
                akzxVarM.u();
                defpackage.kzh kzhVar2 = (defpackage.kzh) akzxVarM.b;
                kzhVar2.d = kwxVarB.f;
                kzhVar2.b |= 2;
                int size = kwyVar.h.size();
                akzxVarM.u();
                defpackage.kzh kzhVar3 = (defpackage.kzh) akzxVarM.b;
                kzhVar3.b |= 8;
                kzhVar3.f = size;
                boolean z2 = kwyVar.g;
                akzxVarM.u();
                defpackage.kzh kzhVar4 = (defpackage.kzh) akzxVarM.b;
                kzhVar4.b |= 4;
                kzhVar4.e = z2;
                return (defpackage.kzh) akzxVarM.p();
            case 16:
                return new gsf();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.hkd) obj).c;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new gsf();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                hgb.f(defpackage.kww.a.d(), obj, "returning potentially incomplete metrics", "com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "getMetricsForCall", 'm', "CallRecordingLogger.java", zct.b);
                return null;
            default:
                defpackage.kun kunVarB = defpackage.kun.b(((kwy) obj).i);
                return kunVarB == null ? defpackage.kun.CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED : kunVarB;
        }
    }
}

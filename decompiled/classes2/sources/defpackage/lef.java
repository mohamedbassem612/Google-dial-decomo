package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lef implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ lef(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        final int i = 1;
        switch (this.$cid) {
            case 0:
                return j$.util.Optional.of(new java.io.File(((defpackage.idv) obj).c));
            case 1:
                long j = defpackage.lee.a;
                alcf alcfVar = ((defpackage.led) obj).c;
                return alcfVar == null ? alcf.a : alcfVar;
            case 2:
                hgb.f(defpackage.lei.a.c(), obj, "failed to save the recording", "com/android/dialer/callscreen/impl/recording/impl/CallRecorderImpl", "recordCall", (char) 144, "CallRecorderImpl.java", zct.b);
                return j$.util.Optional.empty();
            case 3:
                return (defpackage.hzb) ((j$.util.Optional) obj).orElseThrow(new defpackage.iaz(11));
            case 4:
                return (defpackage.leu) aooc.ar((defpackage.hkl) obj, defpackage.leu.class);
            case 5:
                return ((defpackage.lgj) obj) == defpackage.lgj.b ? j$.util.Optional.of(new qqa(1)) : j$.util.Optional.empty();
            case 6:
                return ((defpackage.lgj) obj) != defpackage.lgj.b ? j$.util.Optional.empty() : j$.util.Optional.of(pzp.f);
            case 7:
                return ((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.of(new qiu() { // from class: oai
                    public final java.lang.String a() {
                        int i2 = i;
                        if (i2 == 0) {
                            return "emergency call";
                        }
                        if (i2 != 1) {
                            return i2 != 2 ? "atlas" : "tidepods video upgrade request";
                        }
                        return "call screen";
                    }
                }) : j$.util.Optional.empty();
            case 8:
                return java.lang.Boolean.valueOf(((defpackage.adnj) obj).g());
            case 9:
                return (adnm) ((j$.util.Optional) obj).orElseThrow(new defpackage.iaz(13));
            case 10:
                return ((defpackage.adnj) obj) instanceof defpackage.ljk ? ypm.c : ypm.b;
            case 11:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return !optional.isPresent() ? j$.util.Optional.empty() : ((defpackage.lhd) optional.orElseThrow()).g;
            case 12:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return java.lang.Boolean.FALSE;
                }
                int i2 = ((defpackage.lhd) optional2.orElseThrow()).h;
                boolean z = i2 == 2;
                if (i2 != 0) {
                    return java.lang.Boolean.valueOf(z);
                }
                throw null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.String str = (java.lang.String) obj;
                if (str == null) {
                    return "";
                }
                if (ahvr.r("en-US-Wavenet-F", str)) {
                    return "cloud-en-US-Wavenet-F";
                }
                if (ahvr.r("en-US-Wavenet-D", str)) {
                    return "cloud-en-US-Wavenet-D";
                }
                if (ahvr.r("ja-JP-Wavenet-D", str)) {
                    return "cloud-ja-JP-Wavenet-D";
                }
                return ahvr.r("ja-JP-Wavenet-B", str) ? "cloud-ja-JP-Wavenet-B" : str;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return true == optional3.isPresent() ? j$.util.Optional.ofNullable(((defpackage.llx) optional3.get()).a()) : optional3;
            case 16:
                defpackage.lii liiVar = (defpackage.lii) obj;
                if (liiVar == null || defpackage.lii.a.equals(liiVar)) {
                    return agxh.a;
                }
                alcf alcfVar2 = liiVar.d;
                if (alcfVar2 == null) {
                    alcfVar2 = alcf.a;
                }
                long jB = aldi.b(alcfVar2);
                if ((liiVar.b & 2) != 0) {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    alcf alcfVar3 = liiVar.d;
                    if (alcfVar3 == null) {
                        alcfVar3 = alcf.a;
                    }
                    if (epochMilli - aldi.b(alcfVar3) < aldf.a(defpackage.lil.a)) {
                        defpackage.lim limVar = liiVar.c;
                        if (limVar == null) {
                            limVar = defpackage.lim.a;
                        }
                        return agxh.a(limVar, j$.time.Instant.ofEpochMilli(jB));
                    }
                }
                defpackage.lim limVar2 = liiVar.c;
                if (limVar2 == null) {
                    limVar2 = defpackage.lim.a;
                }
                return agxh.b(limVar2);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                twf twfVar = (twf) obj;
                akzm akzmVar = defpackage.lil.a;
                return java.lang.Boolean.valueOf(twfVar.equals(twf.b) || twfVar.equals(twf.c));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                akzm akzmVar2 = defpackage.lil.a;
                return true == optional4.isPresent() ? j$.util.Optional.ofNullable(((defpackage.llx) optional4.get()).a()) : optional4;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                akzm akzmVar3 = defpackage.lil.a;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.lih) optionalOfNullable.get()).b.size()));
                }
                return (java.lang.Integer) optionalOfNullable.orElse(0);
            default:
                return ((defpackage.lhr) obj).a;
        }
    }
}

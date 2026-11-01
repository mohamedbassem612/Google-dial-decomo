package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wcp {
    private static final aimz a = aimz.i("com/android/dialer/wear/simulatedringing/relay/impl/SimulatedRingingPhoneEventToDfpConverter");

    public final defpackage.zki a(defpackage.wcn wcnVar) {
        int i;
        defpackage.wcm wcmVarB;
        defpackage.wcm wcmVarB2;
        aooh.f(wcnVar, "event");
        int i2 = wcnVar.b;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = i2 != 2 ? 0 : 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 1) {
            return null;
        }
        aimz aimzVar = a;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/wear/simulatedringing/relay/impl/SimulatedRingingPhoneEventToDfpConverter", "convertEvent", 32, "SimulatedRingingPhoneEventToDfpConverter.kt");
        if (wcnVar.b == 2) {
            wcmVarB = defpackage.wcm.b(((java.lang.Integer) wcnVar.c).intValue());
            if (wcmVarB == null) {
                wcmVarB = defpackage.wcm.UNRECOGNIZED;
            }
        } else {
            wcmVarB = defpackage.wcm.SIMULATED_RINGING_ACTION_STATE_EVENT_UNSPECIFIED;
        }
        aimwVarL.y("Handling ACTION_STATE_EVENT: %s", new aepg(wcmVarB));
        if (wcnVar.b == 2) {
            wcmVarB2 = defpackage.wcm.b(((java.lang.Integer) wcnVar.c).intValue());
            if (wcmVarB2 == null) {
                wcmVarB2 = defpackage.wcm.UNRECOGNIZED;
            }
        } else {
            wcmVarB2 = defpackage.wcm.SIMULATED_RINGING_ACTION_STATE_EVENT_UNSPECIFIED;
        }
        defpackage.zld zldVar = wcmVarB2.ordinal() != 1 ? null : defpackage.zld.SIMULATED_RINGING_ACTION_SILENCE;
        if (zldVar == null) {
            return null;
        }
        aimzVar.b().l("com/android/dialer/wear/simulatedringing/relay/impl/SimulatedRingingPhoneEventToDfpConverter", "convertEvent$<anonymous>", 43, "SimulatedRingingPhoneEventToDfpConverter.kt").y("Converting to DFP action: %s", new aepg(zldVar));
        defpackage.zoe zoeVarCo = aehj.co(defpackage.zki.a.m());
        zoeVarCo.k();
        defpackage.zoe zoeVarCn = aehj.cn(defpackage.zkh.a.m());
        akzx akzxVarM = defpackage.zle.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.zle zleVar = (defpackage.zle) akzxVarM.b;
        zleVar.c = zldVar.a();
        zleVar.b |= 1;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.zle zleVar2 = (defpackage.zle) aladVarP;
        aooh.f(zleVar2, "value");
        akzx akzxVar = (akzx) zoeVarCn.a;
        akzxVar.u();
        defpackage.zkh zkhVar = (defpackage.zkh) akzxVar.b;
        j$.util.Objects.requireNonNull(zleVar2);
        zkhVar.c = zleVar2;
        zkhVar.b = 12;
        zoeVarCo.j(zoeVarCn.h());
        return zoeVarCo.i();
    }
}

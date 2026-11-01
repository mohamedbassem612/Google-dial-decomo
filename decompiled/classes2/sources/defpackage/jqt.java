package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqt implements kif {
    private static final defpackage.kie a;
    private final defpackage.jqr b;
    private final moe c;

    static {
        defpackage.jhw jhwVarF = defpackage.hgt.F(defpackage.kie.a.m());
        jhwVarF.u(2131231941);
        jhwVarF.v(3);
        jhwVarF.t(2132017205);
        a = jhwVarF.s();
    }

    public jqt(moe moeVar, defpackage.jqr jqrVar) {
        aooh.f(moeVar, "stirShakenCallLogDataIntegration");
        aooh.f(jqrVar, "stirShakenCallDetailsDataIntegration");
        this.c = moeVar;
        this.b = jqrVar;
    }

    private static final boolean c(ucu ucuVar) {
        udj udjVarB = udj.b(ucuVar.d);
        if (udjVarB == null) {
            udjVarB = udj.a;
        }
        return udjVarB == udj.c;
    }

    public final defpackage.kie a(kiu kiuVar) {
        ztf ztfVarB;
        aooh.f(kiuVar, "row");
        defpackage.jqp jqpVar = (defpackage.jqp) defpackage.hgt.w(kiuVar, this.c);
        if (jqpVar != null) {
            ztfVarB = ztf.b(jqpVar.c);
            if (ztfVarB == null) {
                ztfVarB = ztf.d;
            }
        } else {
            ztfVarB = null;
        }
        if (ztfVarB != ztf.b) {
            return null;
        }
        ucu ucuVar = kiuVar.w;
        if (ucuVar == null) {
            ucuVar = ucu.a;
        }
        aooh.e(ucuVar, "getCallSpamStatus(...)");
        if (c(ucuVar)) {
            return null;
        }
        return a;
    }

    public final defpackage.kie b(defpackage.kip kipVar) {
        ztf ztfVarB;
        aooh.f(kipVar, "row");
        defpackage.jqp jqpVar = (defpackage.jqp) mni.by(kipVar, this.b);
        if (jqpVar != null) {
            ztfVarB = ztf.b(jqpVar.c);
            if (ztfVarB == null) {
                ztfVarB = ztf.d;
            }
        } else {
            ztfVarB = null;
        }
        if (ztfVarB != ztf.b) {
            return null;
        }
        ucu ucuVar = kipVar.r;
        if (ucuVar == null) {
            ucuVar = ucu.a;
        }
        aooh.e(ucuVar, "getSpamStatus(...)");
        if (c(ucuVar)) {
            return null;
        }
        return a;
    }
}

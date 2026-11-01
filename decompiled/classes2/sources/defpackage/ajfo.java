package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ajfo implements ajmn {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a(aiql aiqlVar) throws java.security.GeneralSecurityException {
        switch (this.$cid) {
            case 0:
                ajgr ajgrVar = (ajgr) aiqlVar;
                return defpackage.ajic.e() ? defpackage.ajic.c(ajgrVar) : defpackage.ajil.f(ajgrVar);
            case 1:
                return defpackage.ajrs.c((ajgd) aiqlVar);
            case 2:
                return defpackage.ajsd.c((ajfx) aiqlVar);
            case 3:
                ajhr ajhrVar = (ajhr) aiqlVar;
                return defpackage.ajic.e() ? defpackage.ajil.e(ajhrVar) : defpackage.ajil.g(ajhrVar);
            case 4:
                return defpackage.ajil.d((ajhn) aiqlVar);
            case 5:
                return defpackage.ajrw.c((ajgi) aiqlVar);
            case 6:
                ajgn ajgnVar = (ajgn) aiqlVar;
                if (ajsz.u(1)) {
                    return defpackage.ajip.c(ajgnVar);
                }
                throw new java.security.GeneralSecurityException("Cannot use AesGcmSiv in FIPS mode");
            case 7:
                return defpackage.ajrz.b((ajjk) aiqlVar);
            case 8:
                return defpackage.ajsa.a((ajjl) aiqlVar);
            case 9:
                return defpackage.ajko.b((ajjs) aiqlVar);
            case 10:
                return defpackage.ajku.a((ajju) aiqlVar);
            case 11:
                ajjl ajjlVarB = defpackage.ajjy.b((ajlx) aiqlVar);
                if (ajjlVarB instanceof ajjl) {
                    return defpackage.ajsa.a(ajjlVarB);
                }
                if (ajjlVarB instanceof ajju) {
                    return defpackage.ajku.a((ajju) ajjlVarB);
                }
                throw new java.security.GeneralSecurityException("Unknown key class: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjlVarB.getClass()))));
            case 12:
                ajjk ajjkVarB = defpackage.ajjy.b((ajlx) aiqlVar);
                if (ajjkVarB instanceof ajjk) {
                    return defpackage.ajrz.b(ajjkVarB);
                }
                if (ajjkVarB instanceof ajjs) {
                    return defpackage.ajko.b((ajjs) ajjkVarB);
                }
                throw new java.security.GeneralSecurityException("Unknown key class: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjkVarB.getClass()))));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.ajro((defpackage.ajqo) aiqlVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.ajrv((defpackage.ajqt) aiqlVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.ajrv((defpackage.ajqt) aiqlVar);
            case 16:
                return new defpackage.ajro((defpackage.ajqo) aiqlVar);
            default:
                akxm akxmVarAq = ((ajlx) aiqlVar).aq(defpackage.ajfk.a);
                return (defpackage.ajfl) ajlr.a.a((java.lang.String) akxmVarAq.b, defpackage.ajfl.class).c((akzc) akxmVarAq.d);
        }
    }
}

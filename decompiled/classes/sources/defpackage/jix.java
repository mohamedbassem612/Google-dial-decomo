package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jix implements defpackage.zta {
    private final defpackage.rlv a;
    private final defpackage.ssq b;

    public jix(defpackage.rlv rlvVar, defpackage.ssq ssqVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (ssqVar == null) {
            defpackage.aooh.i("phoneNumberHelper");
        }
        this.a = rlvVar;
        this.b = ssqVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        zse zseVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).q;
        if (zseVar == null) {
            zseVar = zse.a;
        }
        java.lang.String str = zseVar.c;
        defpackage.aooh.e(str, "getCountryIso(...)");
        java.lang.String strG = this.b.g(android.net.Uri.parse(zrxVar.e).getSchemeSpecificPart(), str);
        abvz abvzVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).o;
        if (abvzVar == null) {
            abvzVar = abvz.a;
        }
        java.lang.String str2 = abvzVar.c;
        if (true != defpackage.aoov.H(str2)) {
            strG = str2;
        }
        this.a.o(defpackage.rmx.WARN_FOR_OUTGOING_CALLS_TO_BLOCKED_NUMBERS_SHOW_DIALOG);
        defpackage.akzx akzxVarM = jit.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        jit jitVar = akzxVarM.b;
        if (strG == null) {
            strG = "";
        }
        j$.util.Objects.requireNonNull(strG);
        jitVar.b |= 1;
        jitVar.c = strG;
        defpackage.aooh.f(zrxVar, "value");
        akzxVarM.u();
        jit jitVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(zrxVar);
        jitVar2.d = zrxVar;
        jitVar2.b |= 2;
        jit jitVarR = akzxVarM.r();
        defpackage.aooh.e(jitVarR, "build(...)");
        jiu jiuVar = new jiu();
        defpackage.amxr.g(jiuVar);
        defpackage.ahgl.b(jiuVar, jitVarR);
        return jiuVar;
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return ((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).b & 8192) != 0 ? defpackage.aiql.z(zsz.c) : defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return defpackage.aiql.z(zrxVar);
    }
}

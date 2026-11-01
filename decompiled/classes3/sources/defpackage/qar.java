package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qar {
    public static final aimz a = aimz.i("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer");
    public final defpackage.qai b;
    public final defpackage.qah c;
    public final defpackage.qal d;
    public final rlv e;
    public final defpackage.agzc f;
    public final odo g;
    public final java.util.Map h;
    public final tec i;
    public j$.util.Optional j = j$.util.Optional.empty();
    public j$.util.Optional k = j$.util.Optional.empty();
    public j$.util.Optional l = j$.util.Optional.empty();
    public final na m = new defpackage.qan(this);
    final odm n = new defpackage.qao(this);
    public final zpm o;
    public final defpackage.rdp p;
    public final gat q;
    public final gpd r;
    public final her s;
    public final defpackage.afpl t;
    public final aogc u;

    public qar(defpackage.qai qaiVar, defpackage.qah qahVar, defpackage.afpl afplVar, zpm zpmVar, aogc aogcVar, her herVar, defpackage.rdp rdpVar, defpackage.qal qalVar, rlv rlvVar, gat gatVar, gpd gpdVar, defpackage.agzc agzcVar, odo odoVar, java.util.Map map, tec tecVar) {
        this.b = qaiVar;
        this.c = qahVar;
        this.t = afplVar;
        this.o = zpmVar;
        this.u = aogcVar;
        this.s = herVar;
        this.p = rdpVar;
        this.d = qalVar;
        this.e = rlvVar;
        this.q = gatVar;
        this.r = gpdVar;
        this.f = agzcVar;
        this.g = odoVar;
        this.h = map;
        this.i = tecVar;
    }

    public static boolean a(defpackage.pzp pzpVar) {
        return pzpVar == defpackage.pzp.ANSWER_SCREEN || pzpVar == defpackage.pzp.VIDEO_ANSWER_SCREEN;
    }
}

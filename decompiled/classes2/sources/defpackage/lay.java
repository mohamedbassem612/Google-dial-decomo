package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lay {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer");
    public final da b;
    public final defpackage.laq c;
    public final defpackage.kwc d;
    public final ahpz e;
    public final rlv f;
    public final agtj g;
    public final aoin h;
    public ahak i;
    public agby j;
    public final ahao k = new defpackage.lar(this);
    public final agye l = new defpackage.las(this);
    public final agtk m = new defpackage.lat(this);
    final agtk n = new defpackage.lau(this);
    public final agtk o = new defpackage.lav(this);
    public final ops p;
    public final whl q;
    public final ajwr r;
    public final ajwr s;
    public final uzx t;

    public lay(az azVar, defpackage.laq laqVar, defpackage.kwc kwcVar, ahpz ahpzVar, rlv rlvVar, agtj agtjVar, ajwr ajwrVar, ops opsVar, ajwr ajwrVar2, whl whlVar, uzx uzxVar, aoin aoinVar) {
        this.b = (da) azVar;
        this.c = laqVar;
        this.d = kwcVar;
        this.f = rlvVar;
        this.e = ahpzVar;
        this.g = agtjVar;
        this.s = ajwrVar;
        this.p = opsVar;
        this.r = ajwrVar2;
        this.q = whlVar;
        this.t = uzxVar;
        this.h = aoinVar;
    }

    public final android.widget.Switch a() {
        return (android.widget.Switch) ((aw) this.c).Q.findViewById(2131428920);
    }

    public final android.widget.TextView b() {
        return (android.widget.TextView) ((aw) this.c).Q.findViewById(2131428909);
    }

    public final void c(boolean z) {
        defpackage.kwc kwcVar = this.d;
        ahrv ahrvVarI = ahrv.g(kwcVar.m.aY(z)).i(new defpackage.kvd(kwcVar, 19), kwcVar.e);
        kwcVar.k.s(ahrvVarI, defpackage.kzj.a);
        this.g.j(zoe.N(ahrvVarI), new zoe(java.lang.Boolean.valueOf(z)), this.m);
    }
}

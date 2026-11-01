package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbk {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener");
    public final defpackage.wxm b;
    public final android.content.Context c;
    public final defpackage.xbp d;
    public final defpackage.xbf e;
    public final defpackage.xbs f;
    public final defpackage.xbe g;
    public final defpackage.xcn h;
    public final defpackage.xdh i;
    public final ajcu j;
    public final long k;
    public final aoin l;
    public final wzd m;
    public final zpm s;
    private final ipc v;
    public final defpackage.zni n = new leq(this, 11);
    public final ahda t = new ahda();
    public final ahda u = new ahda();
    public defpackage.wvd o = defpackage.wvd.a;
    public j$.util.Optional p = j$.util.Optional.empty();
    public j$.util.Optional q = j$.util.Optional.empty();
    public boolean r = false;

    public xbk(android.content.Context context, long j, aoin aoinVar, ajcu ajcuVar, defpackage.wxm wxmVar, zpm zpmVar, defpackage.xbp xbpVar, defpackage.xbf xbfVar, defpackage.xbs xbsVar, defpackage.xbe xbeVar, defpackage.xcn xcnVar, defpackage.xdh xdhVar, ipc ipcVar, wzd wzdVar) {
        this.c = context;
        this.k = j;
        this.l = aoinVar;
        this.j = ajcuVar;
        this.b = wxmVar;
        this.s = zpmVar;
        this.d = xbpVar;
        this.e = xbfVar;
        this.f = xbsVar;
        this.g = xbeVar;
        this.h = xcnVar;
        this.i = xdhVar;
        this.v = ipcVar;
        this.m = wzdVar;
    }

    public final ajcq a() {
        return this.t.h(new defpackage.viv(this, 16), this.j);
    }

    public final void b() {
        akzx akzxVarM = defpackage.wya.a.m();
        akzx akzxVarM2 = defpackage.wxs.a.m();
        akzxVarM2.u();
        defpackage.wxs wxsVar = (defpackage.wxs) akzxVarM2.b;
        wxsVar.c = 0;
        wxsVar.b |= 1;
        akzxVarM.u();
        defpackage.wya wyaVar = (defpackage.wya) akzxVarM.b;
        defpackage.wxs wxsVar2 = (defpackage.wxs) akzxVarM2.p();
        j$.util.Objects.requireNonNull(wxsVar2);
        wyaVar.d = wxsVar2;
        wyaVar.c = 8;
        akzxVarM.u();
        defpackage.wya wyaVar2 = (defpackage.wya) akzxVarM.b;
        wyaVar2.b |= 1;
        wyaVar2.e = this.k;
        ahrv ahrvVarG = ahrv.g(this.i.b((defpackage.wya) akzxVarM.p()));
        defpackage.wyv wyvVar = new defpackage.wyv(this, 16);
        ajcu ajcuVar = this.j;
        agsm.i(1158, ahrvVarG.i(wyvVar, ajcuVar).h(new defpackage.xbh(this, 5), ajcuVar), "failed to handle GENERIC_ERROR", new java.lang.Object[0]);
    }

    public final void c() {
        defpackage.otc otcVarAo = pez.ao();
        otcVarAo.e(false);
        otcVarAo.d(false);
        otcVarAo.b(true);
        ahqx.l(this.c, this.v.bk(otcVarAo.a()));
    }
}

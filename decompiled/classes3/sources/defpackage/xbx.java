package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbx {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader");
    public final defpackage.wxm b;
    public final inv c;
    public final ajct d;
    public final ajct e;
    public final aoin f;
    public final aoin g;
    public final java.util.Set h;
    public final long i;
    public final idh n;
    public final ajwr o = new ajwr();
    public final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    public j$.util.Optional k = j$.util.Optional.empty();
    public j$.util.Optional l = j$.util.Optional.empty();
    public j$.util.Optional m = j$.util.Optional.empty();

    public xbx(aoin aoinVar, aoin aoinVar2, ajct ajctVar, ajct ajctVar2, defpackage.wxm wxmVar, inv invVar, idh idhVar, java.util.Set set, long j) {
        this.d = ajctVar;
        this.e = ajctVar2;
        this.b = wxmVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.c = invVar;
        this.n = idhVar;
        this.h = set;
        this.i = j;
    }

    public final ajcq a() {
        ahrv ahrvVarG = ahrv.g(this.n.d());
        defpackage.xbv xbvVar = new defpackage.xbv(this, 1);
        ajbm ajbmVar = ajbm.a;
        return ahrv.g(ahrvVarG.i(xbvVar, ajbmVar).h(new defpackage.wzj(18), ajbmVar)).h(new defpackage.xbh(this, 7), ajbmVar);
    }

    public final ajcq b() {
        return this.o.e(ahqx.b(new xbw(this, 0)), this.e);
    }
}

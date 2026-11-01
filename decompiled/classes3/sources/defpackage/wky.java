package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wky {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/XatuController");
    public final aazc A;
    public final zzx C;
    public final defpackage.abtr D;
    public final defpackage.ahdv E;
    public final heq F;
    public final ipc G;
    private final aoin H;
    private final defpackage.afpl J;
    public final zmq b;
    public final zms c;
    public final defpackage.wkh d;
    public final defpackage.wit e;
    public final defpackage.wla f;
    public final ajcu g;
    public final rlv h;
    public final ruc i;
    public final long j;
    public final aoin k;
    public final aoin l;
    public final java.lang.String m;
    public final wqr n;
    public final defpackage.whs o;
    public final defpackage.wjo p;
    public final defpackage.wll q;
    public final defpackage.wpx r;
    public final defpackage.wjb s;
    public final defpackage.pqm z;
    public final zog t = new les(this, 16);
    public final defpackage.zno u = new defpackage.otk(this, 8);
    public final defpackage.zni v = new leq(this, 10);
    public final defpackage.znl w = new kxs(this, 3);
    public final defpackage.znw x = new defpackage.tno(this, 2);
    public final ahda B = new ahda();
    private ajcq I = ajcm.a;
    public int y = -1;

    public wky(zmq zmqVar, zms zmsVar, defpackage.wkh wkhVar, defpackage.pqm pqmVar, long j, java.lang.String str, aazc aazcVar, ipc ipcVar, heq heqVar, defpackage.wit witVar, defpackage.wla wlaVar, defpackage.afpl afplVar, ajcu ajcuVar, rlv rlvVar, ruc rucVar, zzx zzxVar, defpackage.ahdv ahdvVar, wqr wqrVar, defpackage.wjo wjoVar, defpackage.abtr abtrVar, defpackage.whs whsVar, defpackage.wll wllVar, defpackage.wpx wpxVar, defpackage.wjb wjbVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        this.b = zmqVar;
        this.c = zmsVar;
        this.C = zzxVar;
        this.d = wkhVar;
        this.z = pqmVar;
        this.j = j;
        this.m = str;
        this.A = aazcVar;
        this.l = aoinVar3;
        this.G = ipcVar;
        this.F = heqVar;
        this.e = witVar;
        this.f = wlaVar;
        this.J = afplVar;
        this.H = aoinVar2;
        this.g = ajcuVar;
        this.h = rlvVar;
        this.i = rucVar;
        this.p = wjoVar;
        this.n = wqrVar;
        this.E = ahdvVar;
        this.k = aoinVar;
        this.o = whsVar;
        this.q = wllVar;
        this.r = wpxVar;
        this.D = abtrVar;
        this.s = wjbVar;
    }

    public final defpackage.wkw a() {
        return (defpackage.wkw) aooc.ar(this.J.Y(), defpackage.wkw.class);
    }

    public final ajcq b() {
        return this.B.h(new defpackage.viv(this, 6), this.g);
    }

    public final ajcq c() {
        return this.B.h(new defpackage.viv(this, 5), this.g);
    }

    public final ajcq d(defpackage.wkx wkxVar) {
        return this.B.h(new defpackage.vfm(this, wkxVar, 14), this.g);
    }

    public final void e(boolean z) {
        if (!z) {
            this.I.cancel(false);
            return;
        }
        ajcs ajcsVarC = this.g.c(ahqx.i(new defpackage.vug(this, 7)), ((java.lang.Long) this.H.a()).longValue(), java.util.concurrent.TimeUnit.SECONDS);
        this.I = ajcsVarC;
        agsm.i(1069, ajcsVarC, "dialpadOpenForExtendedPeriodFuture failed", new java.lang.Object[0]);
    }
}

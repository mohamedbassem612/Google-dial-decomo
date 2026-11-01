package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgn {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/service/RttSessionController");
    public final android.content.Context b;
    public final zmq c;
    public final ajct d;
    public final aoin e;
    public final aoin h;
    public final defpackage.qbe m;
    public final defpackage.pqm n;
    private final ajct r;
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();
    public final defpackage.zob i = new defpackage.qgj(this, 0);
    public final defpackage.rai q = new defpackage.rai(this, (byte[]) null, (byte[]) null);
    public final defpackage.rai p = new defpackage.rai(this, (byte[]) null);
    public final defpackage.zoc j = new defpackage.qgl(this, 0);
    public final defpackage.rai o = new defpackage.rai(this);
    public final defpackage.znv k = new ooa(this, 6);
    public final defpackage.zno l = new defpackage.otk(this, 4);

    public qgn(android.content.Context context, zmq zmqVar, ajct ajctVar, ajct ajctVar2, aoin aoinVar, defpackage.qbe qbeVar, defpackage.pqm pqmVar, aoin aoinVar2) {
        this.b = context;
        this.c = zmqVar;
        this.d = ajctVar;
        this.r = ajctVar2;
        this.e = aoinVar;
        this.m = qbeVar;
        this.n = pqmVar;
        this.h = aoinVar2;
    }

    public final ajcq a(qbc qbcVar) {
        return ahvr.H(((defpackage.qgm) aooc.ar(((defpackage.afpl) this.e.a()).Y(), defpackage.qgm.class)).aM(), new oqe(this, qbcVar, 13, (byte[]) null), this.d);
    }

    public final ajcq b(int i) {
        return this.r.eU(ahqx.i(new lqh(this, i, 3)));
    }
}

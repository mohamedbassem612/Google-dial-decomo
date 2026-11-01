package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qeg {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector");
    public final long b;
    public final ajct c;
    public final ajct d;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final defpackage.zni h = new leq(this, 6);
    public final defpackage.zob i;
    public final defpackage.zoc j;
    private final zrw k;
    private final ibd l;
    private final zpz m;

    public qeg(aoin aoinVar, ibd ibdVar, zpz zpzVar, ajct ajctVar, ajct ajctVar2, zrw zrwVar) {
        int i = 1;
        this.i = new defpackage.qgj(this, i);
        this.j = new defpackage.qgl(this, i);
        this.b = ((java.lang.Long) aoinVar.a()).longValue();
        this.l = ibdVar;
        this.m = zpzVar;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.k = zrwVar;
        a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "<init>", 92, "AudioDetector.java").v("audio detector initialized");
    }

    public final ajcq a() {
        return ahrv.g(this.l.a(1000L)).i(new ocj(this, 18), this.d);
    }

    public final void b(boolean z) {
        if (this.e.compareAndSet(!z, z)) {
            this.m.a(ajcm.a);
        }
    }

    public final ajcq c(iax iaxVar) {
        ahrv ahrvVarG = ahrv.g(this.k.c());
        ocj ocjVar = new ocj(iaxVar, 17);
        ajct ajctVar = this.d;
        return ahrvVarG.i(ocjVar, ajctVar).i(new defpackage.phd(this, iaxVar, 2, null), ajctVar);
    }
}

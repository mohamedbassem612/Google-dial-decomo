package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzj implements android.hardware.display.DisplayManager.DisplayListener {
    public final aoss a;
    public final agth b;
    public final aoir c;
    public long d;
    public final defpackage.zni e;
    public final defpackage.znl f;
    public final zzx g;
    public final tkl h;
    private java.lang.Long i;
    private final ahda j;
    private final apni k;

    public pzj(aoss aossVar, agth agthVar, apni apniVar, aazc aazcVar, tkl tklVar, zzx zzxVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agthVar, "lightweightHandler");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aazcVar, "clock");
        this.a = aossVar;
        this.b = agthVar;
        this.k = apniVar;
        this.h = tklVar;
        this.g = zzxVar;
        this.c = aooc.ag(new defpackage.pqf(this, 2));
        this.j = new ahda((byte[]) null);
        this.e = new leq(this, 5);
        this.f = new kxs(this, 2);
    }

    public final void a() {
        java.lang.Long l = this.i;
        if (l != null) {
            this.d += j$.time.Instant.now().minusMillis(l.longValue()).toEpochMilli();
        }
    }

    public final void b() {
        this.i = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
    }

    public final boolean c() {
        return this.h.j(0) != 1;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        boolean zC = c();
        if (i == 0) {
            if (zC) {
                b();
            } else if (this.i != null) {
                a();
            }
            this.k.i(ahvr.ag(this.a, this.j, new defpackage.abgo(this, zC, (aoln) null, 1)));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}

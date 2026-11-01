package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzg {
    public static final aimz a = aimz.i("com/android/dialer/incall/disclaimer/controller/internal/AudioCaptureDisclaimerController");
    public final aoss b;
    public final ajcu c;
    public int d;
    public aoiu e;
    public ajcq f;
    public final defpackage.znp g;
    public int h;
    public final defpackage.pzm i;
    public final aazc j;
    public final zzx k;
    public final zzx l;
    public final ahda m;
    private final hxv n;

    public pzg(hxv hxvVar, aoss aossVar, aazc aazcVar, ajcu ajcuVar, zzx zzxVar, defpackage.pzm pzmVar, zzx zzxVar2) {
        aooh.f(hxvVar, "audioInjector");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aazcVar, "clock");
        aooh.f(ajcuVar, "backgroundScheduledExecutorService");
        aooh.f(pzmVar, "disclaimerControllerCallEventClearcutLogger");
        this.n = hxvVar;
        this.b = aossVar;
        this.j = aazcVar;
        this.c = ajcuVar;
        this.k = zzxVar;
        this.i = pzmVar;
        this.l = zzxVar2;
        this.h = 1;
        this.m = new ahda((byte[]) null);
        this.g = new ler(this, 6);
    }

    public final java.lang.Object a(aonn aonnVar, aoln aolnVar) {
        return aosv.m(new pzf(this, aonnVar, (aoln) null, 0), aolnVar);
    }

    public final void b() {
        ajcq ajcqVar = this.f;
        if (ajcqVar != null) {
            ajcqVar.cancel(false);
        }
        this.f = null;
    }

    public final java.lang.Object c(defpackage.pyy pyyVar, aoln aolnVar) {
        int i = pyyVar.c;
        hxv hxvVar = this.n;
        hxw hxwVar = pyyVar.a;
        java.lang.Object objF = hxvVar.f(hxwVar, hxwVar, aolnVar);
        return objF != aolu.a ? (hxf) objF : objF;
    }
}

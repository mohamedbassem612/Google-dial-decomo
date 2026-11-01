package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jxm {
    public static final aimz a = aimz.i("com/android/dialer/calllauncher/interaction/PlaceOutgoingCallInteractionContext");
    public final ajcu b;
    public final aoin c;
    public final ruc d;
    public final rlv e;
    public final java.util.concurrent.Executor f;
    public final java.util.List g = new java.util.ArrayList();
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();
    public j$.util.Optional k = j$.util.Optional.empty();
    public j$.util.Optional l = j$.util.Optional.empty();
    public j$.util.Optional m = j$.util.Optional.empty();
    public j$.util.Optional n = j$.util.Optional.empty();
    public j$.util.Optional o = j$.util.Optional.empty();
    public j$.util.Optional p = j$.util.Optional.empty();
    public j$.util.Optional q = j$.util.Optional.empty();
    public defpackage.jxl r = defpackage.jxl.a;
    public j$.util.Optional s = j$.util.Optional.empty();
    public j$.util.Optional t = j$.util.Optional.empty();
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final int y;
    public final gpd z;

    public jxm(ajcu ajcuVar, aoin aoinVar, ruc rucVar, rlv rlvVar, gpd gpdVar, long j) {
        this.f = new ajdc(ajcuVar);
        this.b = ajcuVar;
        this.c = aoinVar;
        this.d = rucVar;
        this.e = rlvVar;
        this.z = gpdVar;
        this.y = (int) j;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ajcq, java.lang.Object] */
    public final void a() {
        j$.util.Optional optional = this.s;
        if (true == optional.isPresent()) {
            optional.get().cancel(false);
        }
    }
}

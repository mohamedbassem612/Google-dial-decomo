package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibf implements defpackage.hxf {
    private final ajcq a;

    public ibf(ajcq ajcqVar) {
        this.a = ajcqVar;
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        return ahvr.I(this.a, new defpackage.ibe(2), ajbm.a);
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        return ahvr.I(this.a, new defpackage.ibe(0), ajbm.a);
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return ahvr.I(this.a, new defpackage.ibe(1), ajbm.a);
    }

    @Override // defpackage.hxf
    public final void d() {
        agsm.i(100, ahrv.g(this.a).h(new defpackage.exn(11), ajbm.a), "playback cancellation failed", new java.lang.Object[0]);
    }
}

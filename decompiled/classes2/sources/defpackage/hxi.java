package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxi implements defpackage.hxf {
    public final defpackage.hxf a;
    public final defpackage.hxf b;
    final /* synthetic */ defpackage.hxv c;
    private final /* synthetic */ defpackage.hxg d;

    public hxi(defpackage.hxv hxvVar, defpackage.hxf hxfVar, defpackage.hxf hxfVar2) {
        aooh.f(hxfVar, "localPlaybackSession");
        aooh.f(hxfVar2, "remotePlaybackSession");
        this.c = hxvVar;
        this.d = new defpackage.hxg(hxvVar, ajsz.bb(new defpackage.hxf[]{hxfVar, hxfVar2}));
        this.a = hxfVar;
        this.b = hxfVar2;
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        return this.d.a();
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        return this.d.b();
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return this.d.c();
    }

    @Override // defpackage.hxf
    public final void d() {
        this.d.d();
    }
}

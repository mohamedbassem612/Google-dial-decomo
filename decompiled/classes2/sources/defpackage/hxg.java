package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxg implements defpackage.hxf {
    public final java.util.List a;
    final /* synthetic */ defpackage.hxv b;

    public hxg(defpackage.hxv hxvVar, java.util.List list) {
        aooh.f(list, "playbackSessions");
        this.b = hxvVar;
        this.a = list;
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        return aosv.F(this.b.c, 0, new defpackage.dqx(this, (aoln) null, 10), 3);
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        defpackage.hxv hxvVar = this.b;
        return aosv.F(hxvVar.c, 0, new defpackage.blj(this, hxvVar, (aoln) null, 9), 3);
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return aosv.F(this.b.c, 0, new defpackage.dqx(this, (aoln) null, 11, (byte[]) null), 3);
    }

    @Override // defpackage.hxf
    public final void d() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.hxf) it.next()).d();
        }
    }
}

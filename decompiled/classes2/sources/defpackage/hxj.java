package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxj implements defpackage.hxf {
    public final aonj a;
    public dsd c;
    final /* synthetic */ defpackage.hxv d;
    private final ahda e = new ahda((byte[]) null);
    public final ajcq b = dff.m(new defpackage.hyd(this, 1));

    public hxj(defpackage.hxv hxvVar, aonj aonjVar) {
        this.d = hxvVar;
        this.a = aonjVar;
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        return aosv.F(this.d.c, 0, new defpackage.hnt(this, (aoln) null, 13), 3);
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        return aosv.F(this.d.c, 0, new defpackage.hnt(this, (aoln) null, 14, (byte[]) null), 3);
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return aosv.F(this.d.c, 0, new defpackage.hnt(this, (aoln) null, 15, (char[]) null), 3);
    }

    @Override // defpackage.hxf
    public final void d() {
        defpackage.hxv hxvVar = this.d;
        hxvVar.m.i(ahvr.ag(hxvVar.c, this.e, new defpackage.fyn(this, hxvVar, (aoln) null, 6)));
    }

    public final java.lang.Object e(aoln aolnVar) {
        return ahvr.ag(this.d.c, this.e, new defpackage.hnt(this, (aoln) null, 16, (short[]) null)).a(aolnVar);
    }
}

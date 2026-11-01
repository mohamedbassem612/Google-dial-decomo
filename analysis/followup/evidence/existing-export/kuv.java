package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kuv implements defpackage.kuo {
    public final defpackage.kuu a;
    public final rlv b;
    private final aoss c;

    public kuv(aoss aossVar, defpackage.kuu kuuVar, rlv rlvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.c = aossVar;
        this.a = kuuVar;
        this.b = rlvVar;
    }

    @Override // defpackage.kuo
    public final ajcq a() {
        return aosv.F(this.c, 0, new defpackage.ksy(this, (aoln) null, 6), 3);
    }

    @Override // defpackage.kuo
    public final ajcq b() {
        return aosv.F(this.c, 0, new defpackage.ksy(this, (aoln) null, 7, (byte[]) null), 3);
    }
}

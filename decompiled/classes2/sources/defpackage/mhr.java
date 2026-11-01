package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mhr implements defpackage.mhp {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final aoss c;

    public mhr(android.content.Context context, aazc aazcVar, zzx zzxVar, aoss aossVar, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(aossVar, "lightweightScope");
        this.a = context;
        this.b = zzxVar;
        this.c = aossVar;
    }

    @Override // defpackage.mhp
    public final ajcq a(defpackage.mfu mfuVar) {
        if (this.$cid != 0) {
            return mfuVar.a ? aiql.z(new defpackage.mhk()) : aosv.F(this.c, 0, new defpackage.mhq(this, (aoln) null, 0, (byte[]) null), 3);
        }
        return aosv.F(this.c, 0, new defpackage.mhq(this, (aoln) null, 2), 3);
    }

    public mhr(android.telecom.TelecomManager telecomManager, oko okoVar, aoss aossVar, int i) {
        this.$cid = i;
        aooh.f(telecomManager, "telecomManager");
        aooh.f(aossVar, "blockingScope");
        this.a = telecomManager;
        this.b = okoVar;
        this.c = aossVar;
    }
}

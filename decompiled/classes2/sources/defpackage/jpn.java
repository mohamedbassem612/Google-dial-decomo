package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpn extends amzm {
    private final amyz b;
    private final amzg c;

    public jpn(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpn.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aoss aossVar = (aoss) obj;
        java.util.Set set = defpackage.jpk.a;
        amyz amyzVar = this.b;
        aooh.f(amyzVar, "sharedPreferences");
        aooh.f(aossVar, "backgroundScope");
        return aosv.F(aossVar, 0, new defpackage.icr((aoin) amyzVar, (aoln) null, 20), 3);
    }

    protected final ajcq c() {
        return this.c.d();
    }
}

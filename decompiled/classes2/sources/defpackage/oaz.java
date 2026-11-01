package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oaz extends amzm {
    private final amzg b;

    public oaz(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.oaz.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.obd obdVar = (defpackage.obd) obj;
        aooh.f(obdVar, "emergencyVoiceController");
        return aiql.z(java.lang.Boolean.valueOf(obdVar.f.get()));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

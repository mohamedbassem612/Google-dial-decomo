package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wml extends amzm {
    private final amzg b;

    public wml(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wml.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        return aiql.z(j$.util.Collection.-EL.stream((aihd) obj).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(10))));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

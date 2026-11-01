package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pao extends amzm {
    private final amzg b;

    public pao(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pao.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        return aiql.z(j$.util.Collection.-EL.stream((aihd) obj).min(j$.util.Comparator.-CC.comparingInt(new fiy(8))));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

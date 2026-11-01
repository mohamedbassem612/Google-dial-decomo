package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbo extends amzm {
    private final amzg b;

    public rbo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        if (aihdVar.size() <= 1) {
            return aiql.z(j$.util.Collection.-EL.stream(aihdVar).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(0))));
        }
        throw new java.lang.AssertionError("More than one dialog exist at the same time: ".concat(java.lang.String.valueOf((java.lang.String) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.rat(1)).collect(j$.util.stream.Collectors.joining(", ")))));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

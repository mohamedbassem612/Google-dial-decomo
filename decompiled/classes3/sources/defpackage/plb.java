package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class plb extends amzm {
    private final amzg b;
    private final amzg c;

    public plb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.plb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalMin = j$.util.Collection.-EL.stream((aihd) list.get(0)).filter(new jty((defpackage.plq) list.get(1), 14)).min(j$.util.Comparator.-CC.comparingInt(new fiy(10)));
        if (true == optionalMin.isPresent()) {
            optionalMin = j$.util.Optional.ofNullable(((defpackage.plp) optionalMin.get()).d);
        }
        return aiql.z(optionalMin);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

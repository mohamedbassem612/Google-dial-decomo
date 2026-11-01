package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oni extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public oni(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.oni.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        defpackage.idc idcVar = new defpackage.idc((java.lang.CharSequence) list.get(1), (j$.util.Optional) list.get(2), 6, null);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            java.lang.Object obj3 = idcVar.b;
            java.lang.Object obj4 = idcVar.a;
            qig qigVar = new qig();
            qigVar.c(qio.g);
            qigVar.e(j$.util.Optional.of(obj3));
            qigVar.d((j$.util.Optional) obj4);
            qigVar.b((java.lang.CharSequence) obj2);
            optionalOfNullable = j$.util.Optional.ofNullable(qigVar.a());
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

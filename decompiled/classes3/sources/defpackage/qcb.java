package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qcb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qcb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qcb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        defpackage.zmz zmzVar = (defpackage.zmz) list.get(2);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        if (zmzVar == defpackage.zmz.b || zBooleanValue2) {
            optionalEmpty = j$.util.Optional.empty();
        } else {
            j$.util.Optional.empty();
            dxt dxtVarA = dxt.a();
            j$.util.Objects.requireNonNull(dxtVarA);
            defpackage.pnh pnhVar = new defpackage.pnh(dxtVarA, 16);
            if (true == optionalOfNullable.isPresent()) {
                java.lang.Object obj2 = optionalOfNullable.get();
                optionalOfNullable = j$.util.Optional.ofNullable(((dxt) pnhVar.a).b((java.lang.String) obj2));
            }
            if (optionalOfNullable == null) {
                throw new java.lang.NullPointerException("Null displayName");
            }
            optionalEmpty = j$.util.Optional.of(new defpackage.qca(optionalOfNullable, zBooleanValue));
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qqf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qqf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(0);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        if (((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.pgi) list.get(3)).a).get()) {
            optionalOf = (zpoVar == defpackage.zpo.e || zBooleanValue) ? j$.util.Optional.of(new defpackage.qqe(abwdVar)) : j$.util.Optional.empty();
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

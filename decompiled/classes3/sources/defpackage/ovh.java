package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ovh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.ovh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        jvt jvtVar = (jvt) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        j$.util.Objects.requireNonNull(jvtVar);
        return aiql.z(defpackage.uyg.L(new nfp(jvtVar, 10), new omj(optional, 11), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

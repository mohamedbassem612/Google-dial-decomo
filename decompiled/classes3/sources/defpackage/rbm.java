package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbm extends amzm {
    private final amzg b;
    private final amzg c;

    public rbm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        defpackage.qkv qkvVar = new defpackage.qkv((zzx) list.get(1), 11);
        if (true == optionalOfNullable.isPresent()) {
            defpackage.quo quoVar = (defpackage.quo) optionalOfNullable.get();
            aoin aoinVar = (aoin) ((zzx) qkvVar.a).k().get(quoVar);
            ahvr.cl(aoinVar, "no CenterFragmentProvider for %s", quoVar.name());
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.quq) aoinVar.a()).c());
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

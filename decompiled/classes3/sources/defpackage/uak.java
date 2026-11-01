package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uak extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uak(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uak.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalEmpty = (j$.util.Optional) list.get(0);
        defpackage.tzv tzvVar = (defpackage.tzv) list.get(1);
        odp odpVar = (odp) list.get(2);
        j$.util.Optional optional = tzvVar.i;
        if (optional.isPresent() && optionalEmpty.isPresent() && !optional.equals(optionalEmpty)) {
            odpVar.a(new java.lang.IllegalStateException("sonic audio and animation players have different playing SonicKey"));
            optionalEmpty = j$.util.Optional.empty();
        } else if (optional.isPresent()) {
            optionalEmpty = optional;
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

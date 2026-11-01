package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgy extends amzm {
    private final amzg b;
    private final amzg c;

    public rgy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.rgy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        defpackage.qkv qkvVar = new defpackage.qkv(str, 17);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            java.lang.Object obj3 = qkvVar.a;
            defpackage.rgp rgpVar = (defpackage.rgp) obj2;
            if (obj3 == null) {
                throw new java.lang.NullPointerException("Null callId");
            }
            optionalOfNullable = j$.util.Optional.ofNullable(new defpackage.rgw((java.lang.String) obj3, rgpVar));
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

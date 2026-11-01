package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqz extends amzm {
    private final amzg b;
    private final amzg c;

    public pqz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pqz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        long jLongValue = ((java.lang.Long) list.get(0)).longValue();
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        defpackage.pqu pquVar = new defpackage.pqu(jLongValue, 0);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Long.valueOf(((java.lang.Long) obj2).longValue() - pquVar.a));
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

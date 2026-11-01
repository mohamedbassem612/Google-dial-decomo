package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pjp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        idc idcVar = new idc((j$.util.Optional) list.get(2), context, 8, (byte[]) null);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            java.lang.Object objOfNullable = idcVar.b;
            java.lang.String str = (java.lang.String) obj2;
            idc idcVar2 = new idc(idcVar.a, str, 7);
            j$.util.Optional optional = (j$.util.Optional) objOfNullable;
            if (true == optional.isPresent()) {
                java.lang.Object obj3 = optional.get();
                objOfNullable = j$.util.Optional.ofNullable(((android.content.Context) idcVar2.a).getString(2132017942, (java.lang.String) obj3, idcVar2.b));
            }
            optionalOfNullable = j$.util.Optional.ofNullable((java.lang.String) ((j$.util.Optional) objOfNullable).orElse(str));
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

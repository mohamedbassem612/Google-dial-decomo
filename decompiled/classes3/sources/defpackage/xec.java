package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xec extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public xec(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.xec.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        long jLongValue = ((java.lang.Long) list.get(0)).longValue();
        defpackage.wxm wxmVar = (defpackage.wxm) list.get(1);
        wyc wycVar = (wyc) list.get(2);
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        j$.util.Objects.requireNonNull(wycVar);
        return aiql.z(new defpackage.uyg((defpackage.zka) new defpackage.tok(wycVar, 15), (ajas) new defpackage.xdy(optional, wxmVar, jLongValue, 0)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

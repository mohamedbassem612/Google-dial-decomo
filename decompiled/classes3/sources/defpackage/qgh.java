package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public qgh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qgh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        android.net.Uri uri = (android.net.Uri) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        j$.util.Optional.empty();
        if (uri == null) {
            throw new java.lang.NullPointerException("Null numberUri");
        }
        if (optional != null) {
            return aiql.z(new defpackage.qga(zBooleanValue, uri, optional));
        }
        throw new java.lang.NullPointerException("Null phoneAccountHandle");
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

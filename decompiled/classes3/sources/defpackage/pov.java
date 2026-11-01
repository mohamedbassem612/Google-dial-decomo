package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pov extends amzm {
    private final amzg b;
    private final amzg c;

    public pov(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pov.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        java.lang.String string = optional.isPresent() ? context.getString(2132018102, optional.orElseThrow()) : null;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(string);
        if (true == zIsEmpty) {
            string = null;
        }
        return aiql.z(new defpackage.poi(1 != (((zIsEmpty ? 1 : 0) ^ 65534) & 1) ? string : null));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

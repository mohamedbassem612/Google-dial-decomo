package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvm extends amzm {
    private final amzg b;
    private final amzg c;

    public hvm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.hvm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String string;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        aooh.f(context, "appContext");
        aooh.f(optional, "locationWithAddress");
        if (optional.isPresent()) {
            string = context.getString(2132018517);
            aooh.e(string, "getString(...)");
        } else {
            string = context.getString(2132018518);
            aooh.e(string, "getString(...)");
        }
        return aiql.z(string);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

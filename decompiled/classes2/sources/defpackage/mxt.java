package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxt extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public mxt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.mxt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        final int i;
        int i2;
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        rsr rsrVar = (rsr) list.get(2);
        qke qkeVar = (qke) list.get(3);
        zna znaVar = (zna) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(optional, "displayNumber");
        aooh.f(rsrVar, "phoneNumberDisplayUtil");
        aooh.f(qkeVar, "callStatusTextGenerator");
        aooh.f(znaVar, "callPresentation");
        j$.util.Optional optionalQ = rsrVar.q(znaVar);
        aooh.e(optionalQ, "getNameForCallPresentation(...)");
        final java.lang.String str = (java.lang.String) aooh.q(optionalQ);
        if (str == null) {
            str = (java.lang.String) aooh.p(optional, context.getString(2132020653));
            i = 2132019110;
            i2 = 2132019111;
        } else {
            i = 2132019109;
            i2 = 2132019116;
        }
        java.lang.String strC = qkeVar.c(new java.util.function.Supplier() { // from class: mwl
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return context.getString(i, str);
            }
        }, new syi(context, i2, str, 1));
        aooh.e(strC, "getCallStatusTextFromResources(...)");
        return aiql.z(strC);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

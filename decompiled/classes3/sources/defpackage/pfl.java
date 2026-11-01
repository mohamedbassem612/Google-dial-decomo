package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pfl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pfl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.List list2 = (java.util.List) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) list.get(3);
        defpackage.wdi wdiVar = new defpackage.wdi();
        wdiVar.b(java.util.Collections.EMPTY_LIST);
        wdiVar.e = drawable;
        wdiVar.a = urg.c(context, 2130969072);
        wdiVar.c = (byte) (wdiVar.c | 1);
        android.graphics.drawable.Icon iconCreateWithResource = android.graphics.drawable.Icon.createWithResource(context, 2131231097);
        if (iconCreateWithResource == null) {
            throw new java.lang.NullPointerException("Null primaryIcon");
        }
        wdiVar.d = iconCreateWithResource;
        wdiVar.b = iIntValue;
        wdiVar.c = (byte) (wdiVar.c | 2);
        wdiVar.b(list2);
        return aiql.z(wdiVar.a());
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

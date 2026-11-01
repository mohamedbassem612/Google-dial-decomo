package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ppj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.ppj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        java.lang.String str = (java.lang.String) optional.orElse("");
        android.text.SpannableString spannableString = new android.text.SpannableString(context.getString(2132018109, str));
        hvp hvpVar = new hvp(spannableString, str, 14, (byte[]) null);
        if (true == optional2.isPresent()) {
            java.lang.Object obj2 = optional2.get();
            pez.Y((android.text.SpannableString) hvpVar.b, (java.lang.String) hvpVar.a, ((java.lang.Integer) obj2).intValue());
        }
        return aiql.z(j$.util.Optional.of(spannableString));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

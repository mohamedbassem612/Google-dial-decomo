package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppi extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;
    private final amzg m;
    private final amzg n;

    public ppi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13) {
        super(amyzVar2, new defpackage.amzw(defpackage.ppi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(2);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(4);
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(5)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(7);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(8)).booleanValue();
        j$.util.Optional optional4 = (j$.util.Optional) list.get(9);
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(10)).booleanValue();
        j$.util.Optional optional5 = (j$.util.Optional) list.get(11);
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(12)).booleanValue();
        if (zBooleanValue) {
            optionalOf = j$.util.Optional.of(charSequence);
        } else if (zBooleanValue4) {
            optionalOf = j$.util.Optional.of(context.getString(2132018108));
        } else if (zBooleanValue2 && optional.isPresent()) {
            optionalOf = j$.util.Optional.of((java.lang.CharSequence) optional.orElseThrow());
        } else if (zBooleanValue3 && optional5.isPresent() && zBooleanValue6) {
            android.text.SpannableString spannableString = new android.text.SpannableString(context.getString(2132021044, optional5.orElseThrow()));
            if (optional3.isPresent()) {
                pez.Y(spannableString, (java.lang.String) optional5.orElseThrow(), ((java.lang.Integer) optional3.orElseThrow()).intValue());
            }
            optionalOf = j$.util.Optional.of(spannableString);
        } else if (zBooleanValue3 && optional2.isPresent()) {
            optionalOf = j$.util.Optional.of(pez.X((java.lang.String) optional2.orElseThrow(), optional3, zBooleanValue6));
        } else if (!optional2.isPresent() || optional4.isPresent()) {
            optionalOf = zBooleanValue5 ? j$.util.Optional.of(context.getString(2132018119)) : j$.util.Optional.empty();
        } else {
            optionalOf = j$.util.Optional.of(pez.W(context, 2132018115, (java.lang.String) optional2.orElseThrow(), optional3));
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.n;
        amzg amzgVar2 = this.m;
        amzg amzgVar3 = this.l;
        amzg amzgVar4 = this.k;
        amzg amzgVar5 = this.j;
        amzg amzgVar6 = this.i;
        amzg amzgVar7 = this.h;
        amzg amzgVar8 = this.g;
        amzg amzgVar9 = this.f;
        amzg amzgVar10 = this.e;
        amzg amzgVar11 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

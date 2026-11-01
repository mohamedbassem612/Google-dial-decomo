package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pgo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(context, "appContext");
        her herVarCm = pez.cm(defpackage.qtw.a.m());
        herVarCm.P(defpackage.qug.BUTTON_MUTE);
        java.lang.String string = context.getString(2132019071);
        aooh.e(string, "getString(...)");
        herVarCm.U(string);
        herVarCm.R(zBooleanValue2 ? 2131231257 : 2131231974);
        java.lang.String string2 = context.getString(2132019071);
        aooh.e(string2, "getString(...)");
        herVarCm.Q(string2);
        herVarCm.S(zBooleanValue2);
        herVarCm.T(zBooleanValue);
        return aiql.z(herVarCm.O());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

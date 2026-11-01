package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oar extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public oar(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new amzw(defpackage.oar.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        ((java.lang.Boolean) list.get(0)).booleanValue();
        ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        android.content.Context context = (android.content.Context) list.get(3);
        java.lang.String str = (java.lang.String) list.get(4);
        java.lang.String str2 = (java.lang.String) list.get(5);
        int iIntValue = ((java.lang.Integer) list.get(6)).intValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(8)).booleanValue();
        aooh.f(context, "appContext");
        aooh.f(str, "audioRouteLabel");
        aooh.f(str2, "audioRouteDescription");
        pgg pggVar = pgg.a;
        oyx oyxVarT = pez.t(pggVar.m());
        oyxVarT.o("AUDIO_ROUTE");
        oyxVarT.p(iIntValue);
        oyxVarT.s(str);
        aooh.f(str2, "value");
        akzx akzxVar = (akzx) oyxVarT.a;
        akzxVar.u();
        pgg pggVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(str2);
        pggVar2.b |= 8;
        pggVar2.f = str2;
        oyxVarT.q(zBooleanValue2);
        oyxVarT.r(zBooleanValue3);
        oyx oyxVarT2 = pez.t(pggVar.m());
        oyxVarT2.o("DIALPAD");
        oyxVarT2.p(2131231950);
        java.lang.String string = context.getString(2132019065);
        aooh.e(string, "getString(...)");
        oyxVarT2.s(string);
        oyxVarT2.q(zBooleanValue);
        oyxVarT2.r(zBooleanValue3);
        return aiql.z(ajsz.bb(new pgg[]{oyxVarT.n(), oyxVarT2.n()}));
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

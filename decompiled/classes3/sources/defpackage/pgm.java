package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public pgm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        java.lang.String str2 = (java.lang.String) list.get(1);
        int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        aooh.f(str, "audioRouteLabel");
        aooh.f(str2, "audioRouteDescription");
        her herVarCm = pez.cm(defpackage.qtw.a.m());
        herVarCm.P(defpackage.qug.BUTTON_AUDIO_ROUTE);
        herVarCm.U(str);
        herVarCm.Q(str2);
        herVarCm.R(iIntValue);
        herVarCm.S(zBooleanValue);
        herVarCm.T(true);
        akzx akzxVar = (akzx) herVarCm.a;
        akzxVar.u();
        defpackage.qtw qtwVar = (defpackage.qtw) akzxVar.b;
        qtwVar.b |= 64;
        qtwVar.i = zBooleanValue2;
        akzxVar.u();
        defpackage.qtw qtwVar2 = (defpackage.qtw) akzxVar.b;
        qtwVar2.b |= 256;
        qtwVar2.j = !zBooleanValue2;
        return aiql.z(herVarCm.O());
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

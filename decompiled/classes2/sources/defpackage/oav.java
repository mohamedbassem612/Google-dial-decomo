package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oav extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public oav(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.oav.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.obh obhVarAj;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        tcp tcpVar = (tcp) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        java.lang.String str = (java.lang.String) list.get(3);
        aooh.f(context, "appContext");
        aooh.f(tcpVar, "rttConfiguration");
        aooh.f(str, "chatWithEmergencyServicesText");
        if (tcpVar == tcp.d || zBooleanValue) {
            defpackage.heq heqVarAQ = pez.aQ(defpackage.obh.a.m());
            java.lang.String string = context.getString(2132018529);
            aooh.e(string, "getString(...)");
            heqVarAQ.al(string);
            heqVarAQ.ak(2131231991);
            obhVarAj = heqVarAQ.aj();
        } else {
            defpackage.heq heqVarAQ2 = pez.aQ(defpackage.obh.a.m());
            heqVarAQ2.al(str);
            heqVarAQ2.ak(2131231435);
            obhVarAj = heqVarAQ2.aj();
        }
        return aiql.z(obhVarAj);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

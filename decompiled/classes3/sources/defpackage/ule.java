package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ule extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public ule(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.ule.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        java.lang.String str = (java.lang.String) list.get(2);
        long jLongValue = ((java.lang.Long) list.get(3)).longValue();
        defpackage.uje ujeVar = (defpackage.uje) list.get(4);
        aooh.f(context, "appContext");
        aooh.f(optional, "rawNumber");
        aooh.f(str, "uniqueCallId");
        aooh.f(ujeVar, "notificationNumber");
        defpackage.vqu vquVarBP = wsc.bP(defpackage.uku.a.m());
        java.lang.String str2 = (java.lang.String) aooh.p(optional, "");
        aooh.f(str2, "value");
        akzx akzxVar = (akzx) vquVarBP.a;
        akzxVar.u();
        defpackage.uku ukuVar = (defpackage.uku) akzxVar.b;
        j$.util.Objects.requireNonNull(str2);
        ukuVar.c = str2;
        aooh.f(ujeVar, "value");
        akzxVar.u();
        defpackage.uku ukuVar2 = (defpackage.uku) akzxVar.b;
        j$.util.Objects.requireNonNull(ujeVar);
        ukuVar2.d = ujeVar;
        ukuVar2.b |= 1;
        aooh.f(str, "value");
        akzxVar.u();
        defpackage.uku ukuVar3 = (defpackage.uku) akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        ukuVar3.e = str;
        akzxVar.u();
        ((defpackage.uku) akzxVar.b).f = jLongValue;
        java.lang.String strA = rlt.a(context, (android.telecom.PhoneAccountHandle) null);
        aooh.e(strA, "getCurrentCountryIso(...)");
        aooh.f(strA, "value");
        akzxVar.u();
        defpackage.uku ukuVar4 = (defpackage.uku) akzxVar.b;
        j$.util.Objects.requireNonNull(strA);
        ukuVar4.i = strA;
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        akzxVar.u();
        defpackage.uku ukuVar5 = (defpackage.uku) akzxVar.b;
        java.lang.String strConcat = "SpamCall_".concat(strValueOf);
        j$.util.Objects.requireNonNull(strConcat);
        ukuVar5.g = strConcat;
        akzxVar.u();
        ((defpackage.uku) akzxVar.b).h = 1;
        return aiql.z(vquVarBP.S());
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

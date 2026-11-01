package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wlx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public wlx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.wlx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(5)).booleanValue();
        defpackage.pgg pggVar = defpackage.pgg.a;
        akzx akzxVarM = pggVar.m();
        akzxVarM.u();
        defpackage.pgg pggVar2 = (defpackage.pgg) akzxVarM.b;
        j$.util.Objects.requireNonNull("AUDIO_ROUTE");
        pggVar2.b |= 1;
        pggVar2.c = "AUDIO_ROUTE";
        akzxVarM.u();
        defpackage.pgg pggVar3 = (defpackage.pgg) akzxVarM.b;
        pggVar3.b |= 2;
        pggVar3.d = iIntValue;
        akzxVarM.u();
        defpackage.pgg pggVar4 = (defpackage.pgg) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        pggVar4.b |= 4;
        pggVar4.e = str;
        akzxVarM.u();
        defpackage.pgg pggVar5 = (defpackage.pgg) akzxVarM.b;
        pggVar5.b |= 32;
        pggVar5.h = zBooleanValue;
        akzxVarM.u();
        defpackage.pgg pggVar6 = (defpackage.pgg) akzxVarM.b;
        pggVar6.b |= 16;
        pggVar6.g = true;
        defpackage.pgg pggVar7 = (defpackage.pgg) akzxVarM.p();
        akzx akzxVarM2 = pggVar.m();
        akzxVarM2.u();
        defpackage.pgg pggVar8 = (defpackage.pgg) akzxVarM2.b;
        j$.util.Objects.requireNonNull("MUTE");
        pggVar8.b |= 1;
        pggVar8.c = "MUTE";
        java.lang.String string = context.getString(2132019071);
        akzxVarM2.u();
        defpackage.pgg pggVar9 = (defpackage.pgg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string);
        pggVar9.b |= 4;
        pggVar9.e = string;
        akzxVarM2.u();
        defpackage.pgg pggVar10 = (defpackage.pgg) akzxVarM2.b;
        pggVar10.b |= 2;
        pggVar10.d = 2131231973;
        java.lang.String string2 = zBooleanValue3 ? context.getString(2132019052) : context.getString(2132019059);
        akzxVarM2.u();
        defpackage.pgg pggVar11 = (defpackage.pgg) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string2);
        pggVar11.b |= 8;
        pggVar11.f = string2;
        akzxVarM2.u();
        defpackage.pgg pggVar12 = (defpackage.pgg) akzxVarM2.b;
        pggVar12.b |= 32;
        pggVar12.h = zBooleanValue3;
        akzxVarM2.u();
        defpackage.pgg pggVar13 = (defpackage.pgg) akzxVarM2.b;
        pggVar13.b |= 16;
        pggVar13.g = zBooleanValue2;
        return aiql.z(aify.q(pggVar7, (defpackage.pgg) akzxVarM2.p()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wlo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public wlo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.wlo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        int iIntValue = ((java.lang.Integer) list.get(1)).intValue();
        java.lang.String str2 = (java.lang.String) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        akzx akzxVarM = defpackage.wkf.a.m();
        akzxVarM.u();
        defpackage.wkf wkfVar = (defpackage.wkf) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        wkfVar.b |= 1;
        wkfVar.c = str;
        akzxVarM.u();
        defpackage.wkf wkfVar2 = (defpackage.wkf) akzxVarM.b;
        wkfVar2.b |= 2;
        wkfVar2.d = iIntValue;
        akzxVarM.u();
        defpackage.wkf wkfVar3 = (defpackage.wkf) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        wkfVar3.b |= 4;
        wkfVar3.e = str2;
        akzxVarM.u();
        defpackage.wkf wkfVar4 = (defpackage.wkf) akzxVarM.b;
        wkfVar4.b |= 8;
        wkfVar4.f = zBooleanValue;
        akzxVarM.u();
        defpackage.wkf wkfVar5 = (defpackage.wkf) akzxVarM.b;
        wkfVar5.b |= 16;
        wkfVar5.g = zBooleanValue2;
        return aiql.z((defpackage.wkf) akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyt extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uyt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uyt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.uyy uyyVar;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.uyp uypVar = (defpackage.uyp) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        akzx akzxVarM = defpackage.uyy.a.m();
        akzxVarM.u();
        defpackage.uyy uyyVar2 = (defpackage.uyy) akzxVarM.b;
        j$.util.Objects.requireNonNull("");
        uyyVar2.b |= 1;
        uyyVar2.c = "";
        akzxVarM.u();
        defpackage.uyy uyyVar3 = (defpackage.uyy) akzxVarM.b;
        j$.util.Objects.requireNonNull("");
        uyyVar3.b |= 2;
        uyyVar3.d = "";
        if (zBooleanValue) {
            int iOrdinal = uypVar.ordinal();
            if (iOrdinal == 1) {
                java.lang.String string = context.getString(2132020790);
                akzxVarM.u();
                defpackage.uyy uyyVar4 = (defpackage.uyy) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                uyyVar4.b |= 1;
                uyyVar4.c = string;
                java.lang.String string2 = context.getString(2132020789);
                akzxVarM.u();
                defpackage.uyy uyyVar5 = (defpackage.uyy) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                uyyVar5.b |= 2;
                uyyVar5.d = string2;
                uyyVar = (defpackage.uyy) akzxVarM.p();
            } else if (iOrdinal != 3) {
                uyyVar = (defpackage.uyy) akzxVarM.p();
            } else {
                java.lang.String string3 = context.getString(2132020786);
                akzxVarM.u();
                defpackage.uyy uyyVar6 = (defpackage.uyy) akzxVarM.b;
                j$.util.Objects.requireNonNull(string3);
                uyyVar6.b |= 1;
                uyyVar6.c = string3;
                java.lang.String string4 = context.getString(2132020785);
                akzxVarM.u();
                defpackage.uyy uyyVar7 = (defpackage.uyy) akzxVarM.b;
                j$.util.Objects.requireNonNull(string4);
                uyyVar7.b |= 2;
                uyyVar7.d = string4;
                uyyVar = (defpackage.uyy) akzxVarM.p();
            }
        } else {
            uyyVar = (defpackage.uyy) akzxVarM.p();
        }
        return aiql.z(uyyVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

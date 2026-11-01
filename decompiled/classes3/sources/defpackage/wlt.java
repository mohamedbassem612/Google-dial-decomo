package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wlt extends amzm {
    private final amzg b;
    private final amzg c;

    public wlt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wlt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        int i = zBooleanValue ? 2132021066 : 2132021065;
        akzx akzxVarM = defpackage.wnb.a.m();
        java.lang.String string = context.getString(i);
        akzxVarM.u();
        defpackage.wnb wnbVar = (defpackage.wnb) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        wnbVar.b |= 1;
        wnbVar.c = string;
        akzxVarM.u();
        defpackage.wnb wnbVar2 = (defpackage.wnb) akzxVarM.b;
        j$.util.Objects.requireNonNull("#");
        wnbVar2.b |= 8;
        wnbVar2.f = "#";
        int i2 = true != zBooleanValue ? 2 : 4;
        akzxVarM.u();
        defpackage.wnb wnbVar3 = (defpackage.wnb) akzxVarM.b;
        wnbVar3.e = i2 - 1;
        wnbVar3.b |= 4;
        akzx akzxVarM2 = defpackage.wna.a.m();
        akzxVarM2.u();
        defpackage.wna wnaVar = (defpackage.wna) akzxVarM2.b;
        wnaVar.b |= 4;
        wnaVar.e = true;
        akzxVarM2.u();
        defpackage.wna wnaVar2 = (defpackage.wna) akzxVarM2.b;
        wnaVar2.b |= 2;
        wnaVar2.d = true;
        defpackage.wna wnaVar3 = (defpackage.wna) akzxVarM2.p();
        akzxVarM.u();
        defpackage.wnb wnbVar4 = (defpackage.wnb) akzxVarM.b;
        j$.util.Objects.requireNonNull(wnaVar3);
        wnbVar4.h = wnaVar3;
        wnbVar4.b |= 16;
        return aiql.z((defpackage.wnb) akzxVarM.p());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

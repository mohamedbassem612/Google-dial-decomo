package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyb extends amzm {
    private final amzg b;
    private final amzg c;

    public pyb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pyb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        defpackage.pzm pzmVar = (defpackage.pzm) list.get(1);
        akzx akzxVarM = defpackage.pyc.a.m();
        akzxVarM.u();
        defpackage.pyc pycVar = (defpackage.pyc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        pycVar.b |= 1;
        pycVar.c = str;
        java.lang.String string = ((java.lang.StringBuilder) pzmVar.b).toString();
        akzxVarM.u();
        defpackage.pyc pycVar2 = (defpackage.pyc) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        pycVar2.b |= 2;
        pycVar2.d = string;
        return aiql.z(j$.util.Optional.of((defpackage.pyc) akzxVarM.p()));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

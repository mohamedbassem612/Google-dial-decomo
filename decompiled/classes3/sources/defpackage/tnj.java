package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public tnj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        android.content.Context context = (android.content.Context) list.get(0);
        defpackage.zlr zlrVar = (defpackage.zlr) list.get(1);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(2);
        aooh.f(context, "appContext");
        aooh.f(zlrVar, "sharpieState");
        aooh.f(zpoVar, "callState");
        defpackage.tth tthVarB = defpackage.tth.b(zlrVar.m().c);
        if (tthVarB == null) {
            tthVarB = defpackage.tth.UNRECOGNIZED;
        }
        defpackage.quf qufVarS = null;
        if (zpoVar == defpackage.zpo.f && defpackage.tna.c.contains(tthVarB)) {
            hgw hgwVarCl = pez.cl(defpackage.quf.a.m());
            hgwVarCl.T(defpackage.qug.BUTTON_SHARPIE);
            hgwVarCl.W(2131231601);
            java.lang.String string = context.getString(2132019101);
            aooh.e(string, "getString(...)");
            hgwVarCl.Y(string);
            java.lang.String string2 = context.getString(2132019100);
            aooh.e(string2, "getString(...)");
            hgwVarCl.V(string2);
            hgwVarCl.X(defpackage.tna.b.contains(tthVarB));
            boolean zContains = defpackage.toj.b.contains(tthVarB);
            akzx akzxVar = (akzx) hgwVarCl.a;
            akzxVar.u();
            defpackage.quf qufVar = (defpackage.quf) akzxVar.b;
            qufVar.b |= 32;
            qufVar.j = zContains;
            hgwVarCl.U(defpackage.que.CALL_ASSIST);
            qufVarS = hgwVarCl.S();
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qufVarS);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmd extends amzm {
    private final amzg b;
    private final amzg c;

    public pmd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pmd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        if (((java.lang.Boolean) list.get(1)).booleanValue()) {
            akzx akzxVarM = defpackage.quf.a.m();
            defpackage.qug qugVar = defpackage.qug.BUTTON_CALL_TRANSFER_CONSULTATIVE;
            akzxVarM.u();
            defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
            qufVar.e = qugVar.H;
            qufVar.b |= 1;
            java.lang.String string = context.getString(2132019064);
            akzxVarM.u();
            defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            qufVar2.b |= 4;
            qufVar2.g = string;
            akzxVarM.u();
            defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
            qufVar3.c = 2;
            qufVar3.d = 2131231545;
            java.lang.String string2 = context.getString(2132019064);
            akzxVarM.u();
            defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            qufVar4.b |= 8;
            qufVar4.h = string2;
            defpackage.que queVar = defpackage.que.MORE;
            akzxVarM.u();
            defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
            qufVar5.l = queVar.g;
            qufVar5.b |= 512;
            akzxVarM.u();
            defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
            qufVar6.b |= 16;
            qufVar6.i = true;
            optionalEmpty = j$.util.Optional.of((defpackage.quf) akzxVarM.p());
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

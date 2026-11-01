package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public xdj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        idc idcVar = new idc((android.content.Context) list.get(1), (defpackage.zpo) list.get(2), 20);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            java.lang.Object obj3 = idcVar.a;
            java.lang.Object obj4 = idcVar.b;
            akzx akzxVarM = defpackage.quf.a.m();
            defpackage.qug qugVar = defpackage.qug.BUTTON_ATLAS;
            akzxVarM.u();
            defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
            qufVar.e = qugVar.H;
            qufVar.b |= 1;
            akzxVarM.u();
            defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
            qufVar2.c = 2;
            qufVar2.d = 2131231550;
            android.content.Context context = (android.content.Context) obj3;
            java.lang.String string = context.getString(2132017425);
            akzxVarM.u();
            defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            qufVar3.b |= 4;
            qufVar3.g = string;
            java.lang.String string2 = context.getString(2132017424);
            akzxVarM.u();
            defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            qufVar4.b |= 8;
            qufVar4.h = string2;
            defpackage.zpo zpoVar = defpackage.zpo.f;
            akzxVarM.u();
            defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
            qufVar5.b |= 16;
            qufVar5.i = obj4 == zpoVar;
            defpackage.que queVar = defpackage.que.CALL_ASSIST;
            akzxVarM.u();
            defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
            qufVar6.l = queVar.g;
            qufVar6.b |= 512;
            optionalOfNullable = j$.util.Optional.ofNullable((defpackage.quf) akzxVarM.p());
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

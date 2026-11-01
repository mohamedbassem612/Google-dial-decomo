package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbv extends amzm {
    private final amzg b;

    public qbv(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbv.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        jxb jxbVar = (jxb) obj;
        akzx akzxVarM = defpackage.amqz.a.m();
        int i = jxbVar.e;
        akzxVarM.u();
        defpackage.amqz amqzVar = (defpackage.amqz) akzxVarM.b;
        amqzVar.b |= 1;
        amqzVar.c = i;
        int i2 = jxbVar.f;
        akzxVarM.u();
        defpackage.amqz amqzVar2 = (defpackage.amqz) akzxVarM.b;
        amqzVar2.b |= 8;
        amqzVar2.e = i2;
        long j = jxbVar.m;
        akzxVarM.u();
        defpackage.amqz amqzVar3 = (defpackage.amqz) akzxVarM.b;
        amqzVar3.b |= 4;
        amqzVar3.d = j;
        return aiql.z((defpackage.amqz) akzxVarM.p());
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

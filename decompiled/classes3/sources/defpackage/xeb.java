package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xeb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public xeb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.xeb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.wgz wgzVar = (defpackage.wgz) list.get(1);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(2);
        if (optional.isPresent()) {
            akzx akzxVarM = defpackage.whf.a.m();
            akzxVarM.u();
            defpackage.whf whfVar = (defpackage.whf) akzxVarM.b;
            j$.util.Objects.requireNonNull(wgzVar);
            whfVar.c = wgzVar;
            whfVar.b |= 1;
            akzxVarM.u();
            defpackage.whf whfVar2 = (defpackage.whf) akzxVarM.b;
            whfVar2.b |= 2;
            whfVar2.d = 2131231550;
            akzxVarM.u();
            defpackage.whf whfVar3 = (defpackage.whf) akzxVarM.b;
            whfVar3.b |= 4;
            whfVar3.e = 2132017372;
            akzxVarM.u();
            defpackage.whf whfVar4 = (defpackage.whf) akzxVarM.b;
            whfVar4.b |= 8;
            whfVar4.f = 2132017371;
            akzxVarM.u();
            defpackage.whf whfVar5 = (defpackage.whf) akzxVarM.b;
            whfVar5.b |= 16;
            whfVar5.g = true;
            boolean zEquals = zpoVar.equals(defpackage.zpo.f);
            akzxVarM.u();
            defpackage.whf whfVar6 = (defpackage.whf) akzxVarM.b;
            whfVar6.b |= 32;
            whfVar6.h = zEquals;
            optionalOf = j$.util.Optional.of((defpackage.whf) akzxVarM.p());
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

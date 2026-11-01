package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class stl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public stl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.stl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        long jLongValue = ((java.lang.Long) list.get(1)).longValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        akzx akzxVarM = ste.a.m();
        alcf alcfVarE = aldi.e(jLongValue);
        akzxVarM.u();
        ste steVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarE);
        steVar.c = alcfVarE;
        steVar.b |= 1;
        defpackage.rhb rhbVar = new defpackage.rhb(akzxVarM, 14);
        if (true == optional2.isPresent()) {
            java.lang.Object obj2 = optional2.get();
            java.lang.Object obj3 = rhbVar.a;
            alcf alcfVarE2 = aldi.e(((java.lang.Long) obj2).longValue());
            akzx akzxVar = (akzx) obj3;
            akzxVar.u();
            ste steVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(alcfVarE2);
            steVar2.d = alcfVarE2;
            steVar2.b |= 2;
        }
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.rhb rhbVar2 = new defpackage.rhb(akzxVarM, 15);
        if (true == optional.isPresent()) {
            java.lang.String str = (java.lang.String) optional.get();
            akzx akzxVar2 = (akzx) rhbVar2.a;
            akzxVar2.u();
            ste steVar3 = akzxVar2.b;
            j$.util.Objects.requireNonNull(str);
            steVar3.b |= 4;
            steVar3.e = str;
        }
        akzxVarM.u();
        ste steVar4 = akzxVarM.b;
        steVar4.b |= 128;
        steVar4.f = false;
        return aiql.z(akzxVarM.p());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}

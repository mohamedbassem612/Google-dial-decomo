package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agri implements defpackage.aeko {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agri(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [agrg, java.lang.Object] */
    @Override // defpackage.aeko
    public final ajcq a(ahyn ahynVar) {
        defpackage.agon agonVar;
        byte[] bArr = null;
        if (this.$cid != 0) {
            defpackage.rza rzaVar = (defpackage.rza) ((defpackage.aprf) this.a).a;
            rzaVar.n.o(rmx.yX);
            defpackage.agon agonVar2 = (defpackage.agon) ahynVar.e();
            agoq agoqVar = agonVar2 != null ? agonVar2.b : null;
            if (agoqVar == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            agtj agtjVar = rzaVar.e;
            defpackage.rxz rxzVar = rzaVar.i;
            agtjVar.i(new defpackage.zoe((java.lang.Object) aosv.F(rxzVar.b, 0, new defpackage.rir(rxzVar, agoqVar, (aoln) null, 3), 3)), rzaVar.p);
            return aiql.z(java.lang.Boolean.TRUE);
        }
        boolean zF = ahynVar.f();
        java.lang.Object obj = this.a;
        if (zF) {
            agonVar = (defpackage.agon) ahynVar.b();
        } else {
            agonVar = ((defpackage.agro) obj).o;
            ahvr.ci(agonVar);
        }
        defpackage.agro agroVar = (defpackage.agro) obj;
        ahvr.bY(agroVar.n.f());
        ahvr.bY(((aigf) agroVar.n.b()).containsKey(agonVar));
        if (((aigf) agroVar.n.b()).get(agonVar) == defpackage.agqw.b) {
            ahyn ahynVar2 = agroVar.j;
            ahvr.bY(ahynVar2.f());
            ahynVar2.b().a().r(agroVar.f.I(), "$tiktok$account_ineligible_dialog");
            return aiql.z(java.lang.Boolean.FALSE);
        }
        com.google.apps.tiktok.account.AccountId accountId = agonVar.a;
        agoq agoqVar2 = agonVar.b;
        new defpackage.agrs(agoqVar2.c, agoqVar2.g, agoqVar2.j);
        agroVar.g.j(defpackage.zoe.N(ajan.g(ajcm.a, ahqx.c(new defpackage.adot(obj, accountId, 18, bArr)), agroVar.m)), new defpackage.zoe(accountId), agroVar.b);
        return aiql.z(java.lang.Boolean.TRUE);
    }
}

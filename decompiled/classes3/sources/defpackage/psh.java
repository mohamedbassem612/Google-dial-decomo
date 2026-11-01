package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public psh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.psh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Object objPutIfAbsent;
        java.util.List list = (java.util.List) obj;
        oko okoVar = (oko) list.get(0);
        lnr lnrVar = (lnr) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        defpackage.ulw ulwVar = (defpackage.ulw) list.get(3);
        aoss aossVar = okoVar.d;
        defpackage.zpe zpeVar = defpackage.zpe.a;
        java.lang.Object obj2 = null;
        ajcq ajcqVarH = ahvr.H(aosv.F(aossVar, 0, new ogf(okoVar, (aoln) null, 12, (byte[]) null), 3), new defpackage.phr(lnrVar, 4), ajctVar);
        java.lang.Object obj3 = java.lang.Boolean.FALSE;
        ?? r2 = ulwVar.a;
        java.lang.Object zpdVar = r2.get(zpeVar);
        if (zpdVar == null && (objPutIfAbsent = r2.putIfAbsent(zpeVar, (zpdVar = new defpackage.zpd(ulwVar, new defpackage.wbi(ajcqVarH, (aoln) null, 11))))) != null) {
            zpdVar = objPutIfAbsent;
        }
        defpackage.zpd zpdVar2 = (defpackage.zpd) zpdVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = zpdVar2.b;
        if (atomicReference.get() != null) {
            obj2 = atomicReference.get();
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference2 = zpdVar2.c;
            aimz aimzVar = zih.a;
            defpackage.ulw ulwVar2 = zpdVar2.d;
            anty.aq(atomicReference2, aoov.al((aoss) ulwVar2.c, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, zpdVar2, ulwVar2, 14)));
        }
        if (obj2 != null) {
            obj3 = obj2;
        }
        return aiql.z((java.lang.Boolean) obj3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}

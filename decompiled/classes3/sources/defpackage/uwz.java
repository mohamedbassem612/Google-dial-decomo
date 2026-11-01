package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uwz implements aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public uwz(aoop aoopVar, defpackage.uxc uxcVar, defpackage.uxa uxaVar, int i) {
        this.$cid = i;
        this.a = aoopVar;
        this.b = uxcVar;
        this.c = uxaVar;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, xlw] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v26, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.afcs afcsVar = (defpackage.afcs) obj;
            if (a.aQ(afcsVar.b) == 3) {
                aoop aoopVar = (aoop) this.a;
                if (!aoopVar.a) {
                    aoopVar.a = true;
                    ((defpackage.uxc) this.b).h.o(rmx.zB);
                    defpackage.uwy uwyVar = ((defpackage.uxa) this.c).a;
                    if (uwyVar != null) {
                        uwyVar.a();
                    }
                }
                defpackage.uwy uwyVar2 = ((defpackage.uxa) this.c).a;
                if (uwyVar2 != null) {
                    uwyVar2.c((afcsVar.b == 2 ? (defpackage.afcr) afcsVar.c : defpackage.afcr.a).b);
                }
            }
            return aojh.a;
        }
        if (i != 1) {
            defpackage.xhn xhnVar = (defpackage.xhn) obj;
            defpackage.xox.b("OTMServiceBinder", "metadataChanges#Observed task(" + this.b + ") metadata update: " + xhnVar);
            this.a.b(((defpackage.xlh) this.c).c(xhnVar.toPersistableBundle()));
            return aojh.a;
        }
        avi aviVar = (avj) obj;
        if (aviVar instanceof avh) {
            this.b.add(aviVar);
        } else if (aviVar instanceof avi) {
            this.b.remove(aviVar.a);
        } else if (aviVar instanceof avd) {
            this.b.add(aviVar);
        } else if (aviVar instanceof ave) {
            this.b.remove(((ave) aviVar).a);
        } else if (aviVar instanceof avl) {
            this.b.add(aviVar);
        } else if (aviVar instanceof avm) {
            this.b.remove(((avm) aviVar).a);
        } else if (aviVar instanceof avk) {
            this.b.remove(((avk) aviVar).a);
        }
        aoov.an((aoss) this.a, (aolr) null, 0, new bnl((bpq) this.c, (avj) ajsz.bJ((java.util.List) this.b), (aoln) null, 5), 3);
        return aojh.a;
    }

    public uwz(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}

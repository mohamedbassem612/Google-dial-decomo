package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ito extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(bfp bfpVar, cxi cxiVar, aomy aomyVar, aomy aomyVar2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = bfpVar;
        this.c = cxiVar;
        this.d = aomyVar;
        this.b = aomyVar2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.itc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aomy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            aooc.af(obj);
            defpackage.itc itcVar = (defpackage.itc) this.a;
            java.lang.Object obj2 = this.e;
            java.lang.Object obj3 = this.d;
            return defpackage.itc.a(itcVar, null, (java.lang.String) this.b, (java.lang.Long) this.c, null, (java.lang.String) obj3, (java.lang.Long) obj2, null, null, null, 15975);
        }
        aoss aossVar = (aoss) this.a;
        aooc.af(obj);
        ?? r4 = this.d;
        ?? r3 = this.c;
        bfp bfpVar = (bfp) this.e;
        aoov.an(aossVar, (aolr) null, 0, new defpackage.amh(bfpVar, (cxi) r3, (aomy) r4, (aoln) null, 12), 3);
        return aoov.an(aossVar, (aolr) null, 0, new defpackage.amg(bfpVar, (aomy) this.b, (aoln) null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aomy, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.ito itoVar = new defpackage.ito((bfp) this.e, (cxi) this.c, (aomy) this.d, (aomy) this.b, aolnVar, 1);
            itoVar.a = obj;
            return itoVar;
        }
        java.lang.Object obj2 = this.b;
        java.lang.Object obj3 = this.c;
        java.lang.String str = (java.lang.String) this.d;
        java.lang.String str2 = (java.lang.String) obj2;
        defpackage.ito itoVar2 = new defpackage.ito(str2, (java.lang.Long) obj3, str, (java.lang.Long) this.e, aolnVar, 0);
        itoVar2.a = obj;
        return itoVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Long l2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = l2;
    }
}

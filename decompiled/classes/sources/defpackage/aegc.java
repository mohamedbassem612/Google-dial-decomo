package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aegc extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegc(defpackage.adai adaiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = adaiVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.aegc) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 1) {
            return ((defpackage.aegc) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.aegc) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r4 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (defpackage.aoov.aE(r4, r3) != r0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r4v15, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.$cid
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L1d
            aolu r0 = defpackage.aolu.a
            int r2 = r3.a
            defpackage.aooc.af(r4)
            if (r2 != 0) goto L1a
            java.lang.Object r4 = r3.b
            r3.a = r1
            java.lang.Object r3 = defpackage.aoov.aE(r4, r3)
            if (r3 == r0) goto L58
        L1a:
            aojh r4 = defpackage.aojh.a
            goto L59
        L1d:
            aolu r0 = defpackage.aolu.a
            int r2 = r3.a
            defpackage.aooc.af(r4)
            if (r2 != 0) goto L32
            java.lang.Object r4 = r3.b
            r3.a = r1
            adao r4 = (defpackage.adao) r4
            java.lang.Object r4 = r4.j(r3)
            if (r4 == r0) goto L58
        L32:
            aegw r4 = (defpackage.aegw) r4
            boolean r3 = r4.e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            goto L59
        L3b:
            aolu r0 = defpackage.aolu.a
            int r2 = r3.a
            defpackage.aooc.af(r4)
            if (r2 != 0) goto L59
            java.lang.Object r4 = r3.b
            r3.a = r1
            akti r1 = defpackage.akti.COLLABORATOR_API_CALL
            adai r4 = (defpackage.adai) r4
            java.lang.Object r4 = r4.a
            aegm r4 = (defpackage.aegm) r4
            aegg r4 = r4.a
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L59
        L58:
            r4 = r0
        L59:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegc.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.aegc((defpackage.aoxh) this.b, aolnVar, 2) : new defpackage.aegc((defpackage.adao) this.b, aolnVar, 1);
        }
        return new defpackage.aegc((defpackage.adai) this.b, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegc(defpackage.adao adaoVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = adaoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegc(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoxhVar;
    }
}

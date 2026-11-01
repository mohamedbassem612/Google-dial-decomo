package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hbx extends aomh implements aonn {
    int a;
    final /* synthetic */ aoub b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ defpackage.hcb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbx(aoub aoubVar, int i, int i2, defpackage.hcb hcbVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aoubVar;
        this.c = i;
        this.d = i2;
        this.e = hcbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            aolu r0 = aolu.a
            int r1 = r4.a
            aooc.af(r5)
            if (r1 != 0) goto L35
        L9:
            r5 = 1
            r4.a = r5
            hcb r5 = r4.e
            int r1 = r4.c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L21
            fxs r1 = new fxs
            r2 = 14
            r1.<init>(r5, r2)
            java.lang.Object r5 = defpackage.wt.a(r1, r4)
            goto L33
        L21:
            bxc r2 = new bxc
            r3 = 4
            r2.<init>(r5, r1, r3)
            aolr r5 = r4.u()
            cci r5 = cdh.d(r5)
            java.lang.Object r5 = r5.a(r2, r4)
        L33:
            if (r5 == r0) goto L3f
        L35:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L9
            aojh r0 = aojh.a
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbx.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hbx(this.b, this.c, this.d, this.e, aolnVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxu extends aomg implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ aoss c;
    final /* synthetic */ defpackage.bwj d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxu(aoss aossVar, defpackage.bwj bwjVar, aoln aolnVar) {
        super(aolnVar);
        this.c = aossVar;
        this.d = bwjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0024 -> B:9:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x005c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.e
            cwc r0 = (cwc) r0
            aolu r1 = aolu.a
            int r2 = r8.b
            if (r2 == 0) goto L10
            java.lang.Object r2 = r8.a
            aooc.af(r9)
            goto L27
        L10:
            aooc.af(r9)
            cvg r9 = defpackage.cvg.b
            r2 = r9
        L16:
            r8.e = r0
            r8.a = r2
            r9 = 1
            r8.b = r9
            r9 = r2
            cvg r9 = (defpackage.cvg) r9
            java.lang.Object r9 = r0.r(r9, r8)
            if (r9 != r1) goto L27
            return r1
        L27:
            cvf r9 = (cvf) r9
            java.util.List r3 = r9.a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            cvm r3 = (defpackage.cvm) r3
            int r3 = r3.i
            r5 = 2
            boolean r3 = a.x(r3, r5)
            if (r3 == 0) goto L16
            int r9 = r9.e
            r3 = 4
            boolean r3 = a.x(r9, r3)
            if (r3 == 0) goto L55
            aoss r9 = r8.c
            bwj r3 = r8.d
            bgx r5 = new bgx
            r6 = 19
            r7 = 0
            r5.<init>(r3, r7, r6, r7)
            r3 = 3
            aoov.an(r9, r7, r4, r5, r3)
            goto L16
        L55:
            r3 = 5
            boolean r9 = a.x(r9, r3)
            if (r9 == 0) goto L16
            bwj r9 = r8.d
            boolean r3 = r9.a
            if (r3 != 0) goto L16
            r9.b()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxu.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bxu bxuVar = new defpackage.bxu(this.c, this.d, aolnVar);
        bxuVar.e = obj;
        return bxuVar;
    }
}

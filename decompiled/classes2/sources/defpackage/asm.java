package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class asm extends aomg implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ aomy c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asm(aomy aomyVar, aoln aolnVar) {
        super(aolnVar);
        this.c = aomyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:12:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0026 -> B:12:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            aoqn r0 = (aoqn) r0
            aolu r1 = aolu.a
            int r2 = r3.b
            if (r2 == 0) goto L10
            java.lang.Object r2 = r3.a
            aooc.af(r4)
            goto L2a
        L10:
            aooc.af(r4)
        L13:
            aomy r4 = r3.c
            java.lang.Object r2 = r4.a()
            if (r2 == 0) goto L29
            r3.d = r0
            r3.a = r2
            r4 = 1
            r3.b = r4
            java.lang.Object r4 = r0.a(r2, r3)
            if (r4 != r1) goto L2a
            goto L2e
        L29:
            r2 = 0
        L2a:
            if (r2 != 0) goto L13
            aojh r1 = aojh.a
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asm.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.asm asmVar = new defpackage.asm(this.c, aolnVar);
        asmVar.d = obj;
        return asmVar;
    }
}

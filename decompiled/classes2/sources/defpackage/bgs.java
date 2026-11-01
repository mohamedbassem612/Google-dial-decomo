package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgs extends aomg implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.bgw c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgs(defpackage.bgw bgwVar, aoln aolnVar) {
        super(aolnVar);
        this.c = bgwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:12:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d
            cwc r0 = (cwc) r0
            aolu r1 = aolu.a
            int r2 = r11.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 == r4) goto L14
            java.lang.Object r2 = r11.a
            aooc.af(r12)
            goto L3e
        L14:
            aooc.af(r12)
            goto L26
        L18:
            aooc.af(r12)
            r11.d = r0
            r11.b = r4
            r12 = 0
            java.lang.Object r12 = defpackage.atv.d(r0, r12, r11, r3)
            if (r12 == r1) goto L68
        L26:
            bgw r2 = r11.c
            cvm r12 = (defpackage.cvm) r12
            long r4 = r12.c
            r2.f()
            r2 = r12
        L30:
            r11.d = r0
            r11.a = r2
            r11.b = r3
            cvg r12 = defpackage.cvg.b
            java.lang.Object r12 = r0.r(r12, r11)
            if (r12 == r1) goto L68
        L3e:
            cvf r12 = (cvf) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L47:
            if (r5 >= r4) goto L61
            java.lang.Object r6 = r12.get(r5)
            cvm r6 = (defpackage.cvm) r6
            long r7 = r6.a
            r9 = r2
            cvm r9 = (defpackage.cvm) r9
            long r9 = r9.a
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L5e
            boolean r6 = r6.d
            if (r6 != 0) goto L30
        L5e:
            int r5 = r5 + 1
            goto L47
        L61:
            bgw r11 = r11.c
            r11.e()
            aojh r1 = aojh.a
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgs.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bgs bgsVar = new defpackage.bgs(this.c, aolnVar);
        bgsVar.d = obj;
        return bgsVar;
    }
}

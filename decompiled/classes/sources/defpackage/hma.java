package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class hma extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.hmd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hma(defpackage.hmd hmdVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.f = hmdVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.hma) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004a -> B:11:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            aolu r0 = defpackage.aolu.a
            int r1 = r10.e
            if (r1 == 0) goto L12
            java.lang.Object r1 = r10.d
            java.lang.Object r2 = r10.c
            java.lang.Object r3 = r10.b
            java.lang.Object r4 = r10.a
            defpackage.aooc.af(r11)
            goto L4d
        L12:
            defpackage.aooc.af(r11)
            hmd r11 = r10.f
            java.util.List r1 = defpackage.hmd.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = r11
            r3 = r2
            r2 = r1
        L25:
            boolean r11 = r2.hasNext()
            r1 = 1
            if (r11 == 0) goto L59
            java.lang.Object r11 = r2.next()
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            aimz r6 = defpackage.hmd.a
            r6 = r4
            hmd r6 = (defpackage.hmd) r6
            zrw r6 = r6.f
            r10.a = r4
            r10.b = r3
            r10.c = r2
            r10.d = r11
            r10.e = r1
            java.lang.Object r1 = r6.r(r5, r10)
            if (r1 == r0) goto L90
            r9 = r1
            r1 = r11
            r11 = r9
        L4d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L25
            r3.add(r1)
            goto L25
        L59:
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L8c
            aimz r10 = defpackage.hmd.a
            ainm r10 = r10.b()
            aimw r10 = (defpackage.aimw) r10
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            ainm r10 = r10.g(r1, r11)
            r11 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = "DialerCarAppServiceStateUpdater.kt"
            java.lang.String r1 = "com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater"
            java.lang.String r2 = "hasRequiredPermissions$<anonymous>"
            ainm r10 = r10.l(r1, r2, r11, r0)
            aimw r10 = (defpackage.aimw) r10
            r7 = 0
            r8 = 62
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            java.lang.String r11 = defpackage.ajsz.cr(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "Missing permissions for Dialer on Android Auto: %s"
            r10.y(r0, r11)
            r1 = 0
        L8c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hma.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.hma(this.f, aolnVar);
    }
}

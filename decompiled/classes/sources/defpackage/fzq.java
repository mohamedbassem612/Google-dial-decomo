package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzq extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzq(defpackage.aonn aonnVar, defpackage.dsd dsdVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonnVar;
        this.d = dsdVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.fzq) c(obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.fzq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 2) {
            return ((defpackage.fzq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.fzq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r7.a(r0, r4, r6) != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r7.a(r4, r0, r6) == r3) goto L34;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aowu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aonn, java.lang.Object] */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.$cid
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L89
            if (r0 == r2) goto L6b
            java.lang.Object r3 = r6.b
            r4 = 2
            if (r0 == r4) goto L43
            aoss r3 = (defpackage.aoss) r3
            aolu r0 = defpackage.aolu.a
            int r4 = r6.a
            if (r4 == 0) goto L19
            defpackage.aooc.af(r7)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            goto L28
        L19:
            defpackage.aooc.af(r7)
            java.lang.Object r7 = r6.c     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            r6.b = r1     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            r6.a = r2     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            java.lang.Object r7 = r7.a(r3, r6)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            if (r7 == r0) goto La6
        L28:
            java.lang.Object r0 = r6.d     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            dsd r0 = (defpackage.dsd) r0     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            r0.b(r7)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L39
            goto L40
        L30:
            r7 = move-exception
            java.lang.Object r6 = r6.d
            dsd r6 = (defpackage.dsd) r6
            r6.d(r7)
            goto L40
        L39:
            java.lang.Object r6 = r6.d
            dsd r6 = (defpackage.dsd) r6
            r6.c()
        L40:
            aojh r0 = defpackage.aojh.a
            goto La6
        L43:
            aoss r3 = (defpackage.aoss) r3
            aolu r0 = defpackage.aolu.a
            int r4 = r6.a
            defpackage.aooc.af(r7)
            if (r4 != 0) goto L68
            java.lang.Object r7 = r6.c
            aoxd r4 = new aoxd
            r4.<init>(r7, r2)
            java.lang.Object r7 = r6.d
            gbh r5 = new gbh
            gbl r7 = (defpackage.gbl) r7
            r5.<init>(r7, r3)
            r6.b = r1
            r6.a = r2
            java.lang.Object r6 = r4.fM(r5, r6)
            if (r6 == r0) goto La6
        L68:
            aojh r0 = defpackage.aojh.a
            goto La6
        L6b:
            java.lang.Object r0 = r6.b
            aoss r0 = (defpackage.aoss) r0
            aolu r3 = defpackage.aolu.a
            int r4 = r6.a
            defpackage.aooc.af(r7)
            if (r4 != 0) goto L86
            java.lang.Object r7 = r6.c
            java.lang.Object r4 = r6.d
            r6.b = r1
            r6.a = r2
            java.lang.Object r6 = r7.a(r0, r4, r6)
            if (r6 == r3) goto La2
        L86:
            aojh r0 = defpackage.aojh.a
            goto La6
        L89:
            java.lang.Object r0 = r6.b
            aolu r3 = defpackage.aolu.a
            int r4 = r6.a
            defpackage.aooc.af(r7)
            if (r4 != 0) goto La4
            java.lang.Object r7 = r6.c
            java.lang.Object r4 = r6.d
            r6.b = r1
            r6.a = r2
            java.lang.Object r6 = r7.a(r4, r0, r6)
            if (r6 != r3) goto La4
        La2:
            r0 = r3
            goto La6
        La4:
            aojh r0 = defpackage.aojh.a
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzq.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [cci, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.fzq fzqVar = new defpackage.fzq((defpackage.aono) this.c, (defpackage.fzc) this.d, aolnVar, 0);
            fzqVar.b = obj;
            return fzqVar;
        }
        if (i == 1) {
            defpackage.fzq fzqVar2 = new defpackage.fzq((defpackage.aono) this.c, (defpackage.cci) this.d, aolnVar, 1);
            fzqVar2.b = obj;
            return fzqVar2;
        }
        if (i != 2) {
            defpackage.fzq fzqVar3 = new defpackage.fzq((defpackage.aonn) this.c, (defpackage.dsd) this.d, aolnVar, 3);
            fzqVar3.b = obj;
            return fzqVar3;
        }
        defpackage.fzq fzqVar4 = new defpackage.fzq((defpackage.aowi) this.c, (defpackage.gbl) this.d, aolnVar, 2);
        fzqVar4.b = obj;
        return fzqVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzq(defpackage.aono aonoVar, defpackage.cci cciVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonoVar;
        this.d = cciVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzq(defpackage.aono aonoVar, defpackage.fzc fzcVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonoVar;
        this.d = fzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzq(defpackage.aowi aowiVar, defpackage.gbl gblVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aowiVar;
        this.d = gblVar;
    }
}

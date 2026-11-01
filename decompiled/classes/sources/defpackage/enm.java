package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class enm extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ defpackage.aonn b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enm(defpackage.eei eeiVar, defpackage.aonn aonnVar, defpackage.gjy gjyVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = eeiVar;
        this.b = aonnVar;
        this.c = gjyVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.enm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.enm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if (defpackage.aoov.aj(r11, r4, r10) == r0) goto L30;
     */
    /* JADX WARN: Type inference failed for: r1v13, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aowi, java.lang.Object] */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.$cid
            java.lang.Object r1 = r10.e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8e
            aoss r1 = (defpackage.aoss) r1
            aolu r0 = defpackage.aolu.a
            int r4 = r10.a
            defpackage.aooc.af(r11)
            if (r4 != 0) goto Lc3
            aosi r6 = new aosi
            r6.<init>(r3)
            java.lang.Object r11 = r10.d
            aonn r5 = r10.b
            java.lang.Object r4 = r10.c
            eei r11 = (defpackage.eei) r11
            ipc r7 = r11.h
            efd r7 = r7.X()
            boolean r8 = r7 instanceof defpackage.ecr
            if (r8 == 0) goto L34
            eev r8 = new eev
            ecr r7 = (defpackage.ecr) r7
            int r7 = r7.c
            r8.<init>(r7)
            r7 = r8
        L34:
            r8 = r4
            gat r4 = new gat
            aolr r1 = r1.c()
            r9 = r8
            gjy r9 = (defpackage.gjy) r9
            r8 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            kgl r11 = r11.g
            java.lang.Object r1 = r11.a
            java.lang.Object r1 = r1.b(r4)
            boolean r4 = r1 instanceof defpackage.aowk
            if (r4 == 0) goto L5d
            java.lang.Throwable r10 = defpackage.aowm.b(r1)
            if (r10 != 0) goto L5c
            aowp r10 = new aowp
            java.lang.String r11 = "Channel was closed normally"
            r10.<init>(r11)
            throw r10
        L5c:
            throw r10
        L5d:
            boolean r1 = r1 instanceof defpackage.aowl
            if (r1 != 0) goto L86
            java.lang.Object r1 = r11.b
            kaw r1 = (defpackage.kaw) r1
            java.lang.Object r1 = r1.a
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.getAndIncrement()
            if (r1 != 0) goto L7b
            java.lang.Object r1 = r11.c
            rot r4 = new rot
            r4.<init>(r11, r3, r2)
            r11 = 3
            r5 = 0
            defpackage.aoov.an(r1, r3, r5, r4, r11)
        L7b:
            r10.e = r3
            r10.a = r2
            java.lang.Object r11 = r6.fI(r10)
            if (r11 != r0) goto Lc3
            goto Lbf
        L86:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        L8e:
            r7 = r1
            aoss r7 = (defpackage.aoss) r7
            aolu r0 = defpackage.aolu.a
            int r1 = r10.a
            defpackage.aooc.af(r11)
            if (r1 != 0) goto Lc1
            aosp r11 = defpackage.aoth.a
            aoup r11 = defpackage.apcg.a
            aoup r11 = r11.j()
            java.lang.Object r1 = r10.c
            java.lang.Object r4 = r10.d
            aonn r8 = r10.b
            r5 = r4
            enl r4 = new enl
            r6 = r5
            emq r6 = (defpackage.emq) r6
            r5 = r1
            ems r5 = (defpackage.ems) r5
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.e = r3
            r10.a = r2
            java.lang.Object r10 = defpackage.aoov.aj(r11, r4, r10)
            if (r10 != r0) goto Lc1
        Lbf:
            r11 = r0
            goto Lc3
        Lc1:
            aojh r11 = defpackage.aojh.a
        Lc3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.enm enmVar = new defpackage.enm((defpackage.eei) this.d, this.b, (defpackage.gjy) this.c, aolnVar, 1);
            enmVar.e = obj;
            return enmVar;
        }
        java.lang.Object obj2 = this.c;
        defpackage.ems emsVar = (defpackage.ems) obj2;
        defpackage.enm enmVar2 = new defpackage.enm(emsVar, (defpackage.emq) this.d, this.b, aolnVar, 0);
        enmVar2.e = obj;
        return enmVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enm(defpackage.ems emsVar, defpackage.emq emqVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = emsVar;
        this.d = emqVar;
        this.b = aonnVar;
    }
}

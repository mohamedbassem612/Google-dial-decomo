package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abiw extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiw(aomy aomyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aomyVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((cdi) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.yqt) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2.a(r8, r7) != r0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r2v11, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aomy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.$cid
            r1 = 1
            if (r0 == 0) goto L82
            if (r0 == r1) goto L21
            aolu r0 = aolu.a
            int r2 = r7.a
            aooc.af(r8)
            if (r2 != 0) goto L1e
            java.lang.Object r8 = r7.c
            aoss r8 = (aoss) r8
            java.lang.Object r2 = r7.b
            r7.a = r1
            java.lang.Object r7 = r2.a(r8, r7)
            if (r7 == r0) goto Lad
        L1e:
            aojh r8 = aojh.a
            return r8
        L21:
            aolu r0 = aolu.a
            int r2 = r7.a
            aooc.af(r8)
            if (r2 != 0) goto Lae
            java.lang.Object r8 = r7.c
            yqt r8 = (defpackage.yqt) r8
            java.lang.Object r2 = r7.b
            yqw r3 = defpackage.yqw.a
            akzx r3 = r3.m()
            java.lang.String r4 = "builder"
            aooh.f(r3, r4)
            alct r4 = new alct
            alad r5 = r3.b
            yqw r5 = (defpackage.yqw) r5
            alat r5 = r5.b
            java.util.List r5 = j$.util.DesugarCollections.unmodifiableList(r5)
            java.lang.String r6 = "getCapabilitiesList(...)"
            aooh.e(r5, r6)
            r4.<init>(r5)
            r3.u()
            alad r4 = r3.b
            yqw r4 = (defpackage.yqw) r4
            alat r5 = r4.b
            boolean r6 = r5.c()
            if (r6 != 0) goto L64
            alat r5 = alad.J(r5)
            r4.b = r5
        L64:
            alat r4 = r4.b
            akyl.i(r2, r4)
            alad r2 = r3.p()
            java.lang.String r3 = "build(...)"
            aooh.e(r2, r3)
            yqw r2 = (defpackage.yqw) r2
            r7.a = r1
            anph r1 = new anph
            r1.<init>()
            java.lang.Object r8 = r8.c(r2, r1, r7)
            if (r8 != r0) goto Lae
            goto Lad
        L82:
            aolu r0 = aolu.a
            int r2 = r7.a
            if (r2 == 0) goto L90
            java.lang.Object r2 = r7.c
            cdi r2 = (cdi) r2
            aooc.af(r8)
            goto L98
        L90:
            aooc.af(r8)
            java.lang.Object r8 = r7.c
            r2 = r8
            cdi r2 = (cdi) r2
        L98:
            java.lang.Object r8 = r7.b
            java.lang.Object r8 = r8.a()
            r2.b(r8)
            r7.c = r2
            r7.a = r1
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = aosv.j(r3, r7)
            if (r8 != r0) goto L98
        Lad:
            r8 = r0
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abiw.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aonn, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.abiw abiwVar = new defpackage.abiw((aomy) this.b, aolnVar, 0);
            abiwVar.c = obj;
            return abiwVar;
        }
        if (i != 1) {
            defpackage.abiw abiwVar2 = new defpackage.abiw((aonn) this.b, aolnVar, 2);
            abiwVar2.c = obj;
            return abiwVar2;
        }
        defpackage.abiw abiwVar3 = new defpackage.abiw((java.util.List) this.b, aolnVar, 1);
        abiwVar3.c = obj;
        return abiwVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiw(aonn aonnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiw(java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = list;
    }
}

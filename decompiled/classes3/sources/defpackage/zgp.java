package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgp extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgp(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.yqt) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r5.a(r2, r4) != r0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.$cid
            r1 = 1
            if (r0 == 0) goto L1f
            aolu r0 = aolu.a
            int r2 = r4.a
            aooc.af(r5)
            if (r2 != 0) goto L1c
            java.lang.Object r5 = r4.b
            aoxi r5 = (aoxi) r5
            une r2 = defpackage.une.a
            r4.a = r1
            java.lang.Object r4 = r5.a(r2, r4)
            if (r4 == r0) goto L4f
        L1c:
            aojh r5 = aojh.a
            goto L50
        L1f:
            aolu r0 = aolu.a
            int r2 = r4.a
            aooc.af(r5)
            if (r2 != 0) goto L50
            java.lang.Object r5 = r4.b
            yqt r5 = (defpackage.yqt) r5
            yqz r2 = defpackage.yqz.a
            akzx r2 = r2.m()
            java.lang.String r3 = "builder"
            aooh.f(r2, r3)
            alad r2 = r2.p()
            java.lang.String r3 = "build(...)"
            aooh.e(r2, r3)
            yqz r2 = (defpackage.yqz) r2
            r4.a = r1
            anph r1 = new anph
            r1.<init>()
            java.lang.Object r5 = r5.d(r2, r1, r4)
            if (r5 != r0) goto L50
        L4f:
            r5 = r0
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgp.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.zgp zgpVar = new defpackage.zgp(aolnVar, 1, null);
            zgpVar.b = obj;
            return zgpVar;
        }
        defpackage.zgp zgpVar2 = new defpackage.zgp(aolnVar, 0);
        zgpVar2.b = obj;
        return zgpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgp(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}

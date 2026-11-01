package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjg extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjg(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return new defpackage.agjg((aoln) obj2, 1, null).b(aojh.a);
        }
        return new defpackage.agjg((aoln) obj2, 0).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (aosv.i(r17) != r1) goto L8;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.AutoCloseable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) throws aoiq {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjg.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.agjg(aolnVar, 1, null) : new defpackage.agjg(aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjg(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}

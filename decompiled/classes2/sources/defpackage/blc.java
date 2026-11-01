package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blc extends aomg implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blc(aonj aonjVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf A[LOOP:0: B:26:0x00c1->B:30:0x00cf, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r9 != r2) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aonn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blc.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonn, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.blc blcVar = new defpackage.blc((aonj) this.b, aolnVar, 0);
            blcVar.c = obj;
            return blcVar;
        }
        if (i != 1) {
            defpackage.blc blcVar2 = new defpackage.blc((aonn) this.b, aolnVar, 2);
            blcVar2.c = obj;
            return blcVar2;
        }
        defpackage.blc blcVar3 = new defpackage.blc(this.b, aolnVar, 1, null);
        blcVar3.c = obj;
        return blcVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blc(aonj aonjVar, aoln aolnVar, int i, byte[] bArr) {
        super(aolnVar);
        this.$cid = i;
        this.b = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blc(aonn aonnVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = aonnVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aub extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(aoot aootVar, ark arkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aootVar;
        this.c = arkVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((apnt) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aonj) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((gha) obj, (aoln) obj2).b(aojh.a);
        }
        return c((rai) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (r13 != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        if (r13 != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        if (r13 == r3) goto L83;
     */
    /* JADX WARN: Type inference failed for: r13v54, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [aonp, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:49:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014e -> B:70:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0153 -> B:72:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01a6 -> B:84:0x01aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aub.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aub aubVar;
        int i = this.$cid;
        if (i == 0) {
            defpackage.aub aubVar2 = new defpackage.aub((defpackage.aud) this.c, (aoot) this.d, aolnVar, 0);
            aubVar2.e = obj;
            return aubVar2;
        }
        if (i == 1) {
            aubVar = new defpackage.aub((aoot) this.d, (ark) this.c, aolnVar, 1);
            aubVar.e = obj;
        } else {
            if (i != 2) {
                defpackage.aub aubVar3 = new defpackage.aub((gfy) this.c, aolnVar, (aonj) this.d, 3);
                aubVar3.e = obj;
                return aubVar3;
            }
            aubVar = new defpackage.aub((aoot) this.d, (defpackage.aul) this.c, aolnVar, 2);
            aubVar.e = obj;
        }
        return aubVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(aoot aootVar, defpackage.aul aulVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aootVar;
        this.c = aulVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(defpackage.aud audVar, aoot aootVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = audVar;
        this.d = aootVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(gfy gfyVar, aoln aolnVar, aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = gfyVar;
        this.d = aonjVar;
    }
}

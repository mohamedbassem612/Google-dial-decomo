package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eea extends defpackage.aomh implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(defpackage.aonn aonnVar, defpackage.ecr ecrVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = aonnVar;
        this.c = ecrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aonn, java.lang.Object] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.eea((defpackage.aonn) this.b, (defpackage.ecr) this.c, (defpackage.aoln) obj, 0).b(defpackage.aojh.a);
        }
        if (i == 1) {
            java.lang.Object obj2 = this.b;
            return new defpackage.eea((defpackage.eez) obj2, (defpackage.eei) this.c, (defpackage.aoln) obj, 1).b(defpackage.aojh.a);
        }
        if (i == 2) {
            java.lang.Object obj3 = this.c;
            return new defpackage.eea((defpackage.eei) obj3, (defpackage.aonn) this.b, (defpackage.aoln) obj, 2).b(defpackage.aojh.a);
        }
        if (i != 3) {
            java.lang.Object obj4 = this.c;
            return new defpackage.eea((defpackage.gfy) obj4, (defpackage.aonj) this.b, (defpackage.aoln) obj, 4).b(defpackage.aojh.a);
        }
        java.lang.Object obj5 = this.b;
        return new defpackage.eea((defpackage.gcf) obj5, (defpackage.kgl) this.c, (defpackage.aoln) obj, 3).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r4.fM(r5, r11) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (r12 != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r12 != r0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ecx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [gdp, java.lang.Object] */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eea.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(defpackage.eei eeiVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = eeiVar;
        this.b = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(defpackage.eez eezVar, defpackage.eei eeiVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = eezVar;
        this.c = eeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(defpackage.gcf gcfVar, defpackage.kgl kglVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = gcfVar;
        this.c = kglVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eea(defpackage.gfy gfyVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = gfyVar;
        this.b = aonjVar;
    }
}

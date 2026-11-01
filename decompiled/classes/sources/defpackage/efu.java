package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efu extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aoln aolnVar, defpackage.aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.efu) c((defpackage.efx) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                return ((defpackage.efu) c((defpackage.eda) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.efu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.efu) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.efu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.efu) c((defpackage.ggv) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.efu) c((defpackage.aows) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.efu) c((defpackage.aows) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.efu) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.efu) c(obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (((defpackage.aozw) r1).g(r6, r5) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (((defpackage.aozv) r1).b(r6, r5) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r1.fM(r3, r5) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (defpackage.aosv.m(r4, r5) != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    
        if (r6.a(r0, r5) != r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        if (r4.e(r6, r0, r5) != r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        if (r6 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        if (r1.a(r6, r5) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efu.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.efu efuVar = new defpackage.efu((defpackage.aonn) this.c, aolnVar, 0);
                efuVar.b = obj;
                return efuVar;
            case 1:
                defpackage.efu efuVar2 = new defpackage.efu((java.util.List) this.c, aolnVar, 1);
                efuVar2.b = obj;
                return efuVar2;
            case 2:
                defpackage.efu efuVar3 = new defpackage.efu((defpackage.aonn) this.c, aolnVar, 2, (byte[]) null);
                efuVar3.b = obj;
                return efuVar3;
            case 3:
                defpackage.efu efuVar4 = new defpackage.efu((defpackage.aonn) this.c, aolnVar, 3, (char[]) null);
                efuVar4.b = obj;
                return efuVar4;
            case 4:
                defpackage.efu efuVar5 = new defpackage.efu((defpackage.aonj) this.c, aolnVar, 4);
                efuVar5.b = obj;
                return efuVar5;
            case 5:
                defpackage.efu efuVar6 = new defpackage.efu(aolnVar, (defpackage.aonj) this.c, 5);
                efuVar6.b = obj;
                return efuVar6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.efu efuVar7 = new defpackage.efu((defpackage.aoxh) this.c, aolnVar, 6);
                efuVar7.b = obj;
                return efuVar7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.efu efuVar8 = new defpackage.efu((defpackage.aozv) this.c, aolnVar, 7);
                efuVar8.b = obj;
                return efuVar8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.efu efuVar9 = new defpackage.efu((defpackage.aozw) this.c, aolnVar, 8);
                efuVar9.b = obj;
                return efuVar9;
            default:
                defpackage.efu efuVar10 = new defpackage.efu((defpackage.aoxi) this.c, aolnVar, 9);
                efuVar10.b = obj;
                return efuVar10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aonj aonjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aoxh aoxhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aoxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aoxiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aozv aozvVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aozvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.aozw aozwVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aozwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(java.util.List list, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = list;
    }
}

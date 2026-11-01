package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bec implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bec(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [bed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [dcv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v40, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bdy, java.lang.Object] */
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
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return this.b.a(new defpackage.bee((defpackage.aogc) this.a, (defpackage.czo) obj), ((defpackage.dpd) obj2).a);
            case 1:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.Object obj3 = this.a;
                    defpackage.aogc aogcVar = (defpackage.aogc) this.b;
                    ?? A = aogcVar.a.a();
                    defpackage.bdw bdwVar = (defpackage.bdw) obj3;
                    int iA = bdwVar.c;
                    if ((iA >= A.b() || !defpackage.aooh.n(A.d(iA), bdwVar.a)) && (iA = A.a(bdwVar.a)) != -1) {
                        bdwVar.c = iA;
                    }
                    int i = iA;
                    if (i != -1) {
                        cavVar.u(-1664741271);
                        defpackage.den.aF(A, aogcVar.b, i, bdwVar.a, cavVar, 0);
                        cavVar.o();
                    } else {
                        cavVar.u(-1664505826);
                        cavVar.o();
                    }
                    java.lang.Object obj4 = bdwVar.a;
                    boolean zD = cavVar.D(obj3);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == defpackage.cau.a) {
                        objG = new defpackage.afz(obj3, 13);
                        cavVar.w(objG);
                    }
                    defpackage.cbp.c(obj4, (defpackage.aonj) objG, cavVar);
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    this.b.a(this.a, cavVar2, 0);
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 3:
                return defpackage.den.ao(this.a, this.b, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 4:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue3 & 3;
                int i3 = iIntValue3 & 1;
                defpackage.cbd cbdVar = defpackage.bqx.a;
                if (cavVar3.H(i2 != 2, i3)) {
                    defpackage.bsj.a(defpackage.cfo.j(-241536773, new defpackage.bec(this.a, this.b, 5, null), cavVar3), cavVar3, 6);
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i4 = iIntValue4 & 3;
                int i5 = iIntValue4 & 1;
                defpackage.cbd cbdVar2 = defpackage.bqx.a;
                if (cavVar4.H(i4 != 2, i5)) {
                    defpackage.bvt.a(((defpackage.bwo) this.a).j, this.b, cavVar4, 0);
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                int iIntValue5 = ((java.lang.Integer) obj).intValue();
                defpackage.dij dijVar = (defpackage.dij) obj2;
                if (!((defpackage.acq) ((defpackage.nf) this.b).b).a(dijVar.c)) {
                    defpackage.cnn cnnVar = (defpackage.cnn) this.a;
                    cnnVar.m(iIntValue5, dijVar);
                    cnnVar.k();
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cqf cqfVar = (defpackage.cqf) obj;
                defpackage.cso csoVar = (defpackage.cso) obj2;
                java.lang.Object obj5 = this.a;
                defpackage.dck dckVar = (defpackage.dck) obj5;
                if (dckVar.w.am()) {
                    ?? r10 = this.b;
                    dckVar.J = cqfVar;
                    dckVar.I = csoVar;
                    dckVar.ai().a.c(obj5, defpackage.dck.s, r10);
                    dckVar.K = false;
                } else {
                    dckVar.K = true;
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cav cavVar5 = (defpackage.cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    defpackage.dfo.a(this.a, this.b, cavVar5, 8);
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar6 = (defpackage.cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                int i6 = iIntValue7 & 3;
                if (cavVar6.H(i6 != 2, iIntValue7 & 1)) {
                    defpackage.den.ac(new defpackage.cdj[]{defpackage.bmi.a.b(defpackage.acqb.a), defpackage.bmf.a.b(this.a), defpackage.bos.a.b(java.lang.Boolean.FALSE)}, this.b, cavVar6, 0);
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ bec(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}

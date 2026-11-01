package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oc implements defpackage.cbm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public oc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [emw, java.lang.Object] */
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
    @Override // defpackage.cbm
    public final void a() {
        switch (this.$cid) {
            case 0:
                ((defpackage.vx) this.a).e((of) this.b);
                break;
            case 1:
                ((defpackage.vx) this.a).e((of) this.b);
                break;
            case 2:
                ((ajw) this.a).a.m(this.b);
                break;
            case 3:
                ((defpackage.alg) this.b).d.remove(this.a);
                break;
            case 4:
                alb albVarB = ((ett) this.b).b();
                if (albVarB != null) {
                    ((defpackage.alg) this.a).o(albVarB.a);
                }
                break;
            case 5:
                ((defpackage.alg) this.a).o((ale) this.b);
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((baa) this.a).a((android.view.View) this.b);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((bgy) this.b).c.remove(this.a);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj = this.b;
                bmb bmbVar = (bmb) this.a;
                if (bmbVar.b == obj) {
                    bmbVar.b = null;
                    bmbVar.b((bko) null);
                }
                break;
            case 9:
                ((fvs) this.a).f.d(this.b);
                break;
            case 10:
                java.util.Iterator it = hgu.ac((defpackage.cer) this.b).iterator();
                while (it.hasNext()) {
                    ((fwz) this.a).h((fvs) it.next());
                }
                break;
            default:
                ((defpackage.ems) this.b).d(this.a);
                break;
        }
    }

    public oc(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

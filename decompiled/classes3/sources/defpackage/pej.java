package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pej extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.util.Map d;
    final /* synthetic */ defpackage.pdw e;
    final /* synthetic */ j$.util.Optional f;
    final /* synthetic */ zzx g;
    final /* synthetic */ defpackage.yzr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pej(java.util.Map map, defpackage.pdw pdwVar, j$.util.Optional optional, defpackage.yzr yzrVar, zzx zzxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = map;
        this.e = pdwVar;
        this.f = optional;
        this.h = yzrVar;
        this.g = zzxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:25:0x006e->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.pdv pdvVar;
        java.lang.String str;
        java.lang.Object objG;
        java.lang.Object obj2;
        java.util.Iterator it;
        defpackage.pdu pduVarC;
        java.lang.Object obj3 = aolu.a;
        int i = this.c;
        java.lang.String str2 = null;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.b;
                java.lang.Object obj4 = this.a;
                aooc.af(obj);
                pdvVar = obj4;
            } else {
                aooc.af(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                if (pdvVar != 0 && (pduVarC = pez.c(pdvVar)) != null) {
                    str2 = pduVarC.f;
                }
                aihd aihdVarE = this.g.e();
                aooh.e(aihdVarE, "get(...)");
                it = aihdVarE.iterator();
                while (it.hasNext()) {
                    ((defpackage.pdz) it.next()).a(str2, (java.lang.String) obj2);
                }
            }
            return j$.util.Optional.ofNullable(pdvVar);
        }
        aooc.af(obj);
        defpackage.pdy pdyVar = (defpackage.pdy) this.d.get(this.e);
        if (pdyVar != null) {
            this.c = 1;
            obj = pdyVar.a(this);
            if (obj == obj3) {
                return obj3;
            }
        } else {
            pdvVar = 0;
        }
        str = (java.lang.String) aooh.q(this.f);
        if (str != null) {
            defpackage.yzr yzrVar = this.h;
            this.a = pdvVar;
            this.b = str;
            this.c = 2;
            objG = yzrVar.g(pdvVar, this);
            if (objG != obj3) {
                return obj3;
            }
            obj2 = str;
            obj = objG;
            pdvVar = pdvVar;
            if (((java.lang.Boolean) obj).booleanValue()) {
                if (pdvVar != 0) {
                    str2 = pduVarC.f;
                }
                aihd aihdVarE2 = this.g.e();
                aooh.e(aihdVarE2, "get(...)");
                it = aihdVarE2.iterator();
                while (it.hasNext()) {
                    ((defpackage.pdz) it.next()).a(str2, (java.lang.String) obj2);
                }
            }
        }
        return j$.util.Optional.ofNullable(pdvVar);
        pdvVar = (defpackage.pdv) obj;
        str = (java.lang.String) aooh.q(this.f);
        if (str != null) {
            defpackage.yzr yzrVar2 = this.h;
            this.a = pdvVar;
            this.b = str;
            this.c = 2;
            objG = yzrVar2.g(pdvVar, this);
            if (objG != obj3) {
                return obj3;
            }
            obj2 = str;
            obj = objG;
            pdvVar = pdvVar;
            if (((java.lang.Boolean) obj).booleanValue()) {
                if (pdvVar != 0) {
                    str2 = pduVarC.f;
                }
                aihd aihdVarE3 = this.g.e();
                aooh.e(aihdVarE3, "get(...)");
                it = aihdVarE3.iterator();
                while (it.hasNext()) {
                    ((defpackage.pdz) it.next()).a(str2, (java.lang.String) obj2);
                }
            }
        }
        return j$.util.Optional.ofNullable(pdvVar);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.pej(this.d, this.e, this.f, this.h, this.g, aolnVar);
    }
}

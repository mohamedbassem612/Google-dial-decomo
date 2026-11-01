package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eor implements defpackage.eoe {
    private final defpackage.enr[] a;

    public eor(defpackage.enr... enrVarArr) {
        if (enrVarArr == null) {
            defpackage.aooh.i("initializers");
        }
        this.a = enrVarArr;
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa a(java.lang.Class cls) {
        return defpackage.enn.d(cls);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [aonj, java.lang.Object] */
    @Override // defpackage.eoe
    public final defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        defpackage.eoa eoaVar;
        defpackage.enr enrVar;
        ?? r5;
        if (cls == null) {
            defpackage.aooh.i("modelClass");
            defpackage.aooh.i("<this>");
        }
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        defpackage.aooa aooaVar = new defpackage.aooa(cls);
        defpackage.enr[] enrVarArr = this.a;
        defpackage.enr[] enrVarArr2 = (defpackage.enr[]) java.util.Arrays.copyOf(enrVarArr, enrVarArr.length);
        if (enrVarArr2 == null) {
            defpackage.aooh.i("initializers");
        }
        int length = enrVarArr2.length;
        int i = 0;
        while (true) {
            eoaVar = null;
            if (i >= length) {
                enrVar = null;
                break;
            }
            enrVar = enrVarArr2[i];
            if (defpackage.aooh.n(enrVar.a, aooaVar)) {
                break;
            }
            i++;
        }
        if (enrVar != null && (r5 = enrVar.b) != 0) {
            eoaVar = (defpackage.eoa) r5.a(eoqVar);
        }
        if (eoaVar != null) {
            return eoaVar;
        }
        throw new java.lang.IllegalArgumentException("No initializer set for given class ".concat(java.lang.String.valueOf(aooaVar.b())));
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa c(defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
        if (cls == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return b(cls, eoqVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bp implements defpackage.eoe {
    @Override // defpackage.eoe
    public final defpackage.eoa a(java.lang.Class cls) {
        return new defpackage.bq(true);
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        return defpackage.enn.e(this, cls);
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa c(defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
        if (cls == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return defpackage.enn.e(this, cls);
    }
}

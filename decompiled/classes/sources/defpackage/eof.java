package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class eof implements defpackage.eoe {
    public static defpackage.eof c;
    public static final defpackage.eop d = defpackage.eog.a;

    @Override // defpackage.eoe
    public defpackage.eoa a(java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("modelClass");
        }
        return defpackage.dzl.l(cls);
    }

    @Override // defpackage.eoe
    public defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        if (cls == null) {
            defpackage.aooh.i("modelClass");
        }
        return a(cls);
    }

    @Override // defpackage.eoe
    public final defpackage.eoa c(defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
        if (cls == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return b(cls, eoqVar);
    }
}

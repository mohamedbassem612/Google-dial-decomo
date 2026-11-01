package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxg implements defpackage.eoe {
    public static final defpackage.eop a = new defpackage.amyi();
    private final java.util.Map b;
    private final defpackage.eoe c;
    private final defpackage.eoe d;

    public amxg(java.util.Map map, defpackage.eoe eoeVar, defpackage.hjo hjoVar) {
        this.b = map;
        this.c = eoeVar;
        this.d = new defpackage.amxk(this, hjoVar, 1);
    }

    @Override // defpackage.eoe
    public final defpackage.eoa a(java.lang.Class cls) {
        return this.b.containsKey(cls) ? defpackage.enn.d(cls) : this.c.a(cls);
    }

    @Override // defpackage.eoe
    public final defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, eoqVar) : this.c.b(cls, eoqVar);
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

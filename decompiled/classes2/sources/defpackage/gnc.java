package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gnc extends defpackage.gnb {
    private final aopu a;
    private final aopu b;
    private final aonn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnc(aopu aopuVar, aopu aopuVar2, aonn aonnVar) {
        super(new aooa(android.util.Pair.class));
        aopu[] aopuVarArr = aoou.a;
        this.a = aopuVar;
        this.b = aopuVar2;
        this.c = aonnVar;
    }

    @Override // defpackage.gnb
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Pair pair = (android.util.Pair) obj2;
        aooh.f(obj, "obj");
        aooh.f(pair, "parameter");
        java.lang.Object obj3 = pair.first;
        aodc.o(this.a, obj3);
        java.lang.Object obj4 = pair.second;
        aodc.o(this.b, obj4);
        return ((java.lang.Boolean) this.c.a(obj3, obj4)).booleanValue();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c.toString();
    }
}

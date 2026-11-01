package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gnd extends defpackage.gnb {
    private final aonj a;

    public gnd(aopu aopuVar, aonj aonjVar) {
        super(aopuVar);
        this.a = aonjVar;
    }

    @Override // defpackage.gnb
    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        aooh.f(obj, "obj");
        aooh.f(obj2, "parameter");
        return ((java.lang.Boolean) this.a.a(obj2)).booleanValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}

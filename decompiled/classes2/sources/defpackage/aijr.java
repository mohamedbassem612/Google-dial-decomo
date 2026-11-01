package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aijr extends ailc {
    final /* synthetic */ aida a;

    public aijr(aida aidaVar) {
        j$.util.Objects.requireNonNull(aidaVar);
        this.a = aidaVar;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aijp)) {
            return false;
        }
        defpackage.aijp aijpVar = (defpackage.aijp) obj;
        return aijpVar.a() > 0 && this.a.b(aijpVar.a) == aijpVar.a();
    }

    public final java.util.Iterator iterator() {
        return this.a.f();
    }

    public final boolean remove(java.lang.Object obj) {
        if (obj instanceof defpackage.aijp) {
            defpackage.aijp aijpVar = (defpackage.aijp) obj;
            java.lang.Object obj2 = aijpVar.a;
            int iA = aijpVar.a();
            if (iA != 0) {
                return this.a.h(obj2, iA);
            }
        }
        return false;
    }

    public final int size() {
        return this.a.c();
    }
}

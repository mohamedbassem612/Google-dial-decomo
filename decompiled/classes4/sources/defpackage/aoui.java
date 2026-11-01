package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoui extends aoue {
    final /* synthetic */ aoul a;
    private final apdm b;

    public aoui(aoul aoulVar, apdm apdmVar) {
        this.a = aoulVar;
        this.b = apdmVar;
    }

    public final void a(java.lang.Throwable th) {
        aoul aoulVar = this.a;
        java.lang.Object objE = aoulVar.E();
        if (!(objE instanceof aosk)) {
            objE = aoum.b(objE);
        }
        this.b.g(aoulVar, objE);
    }

    public final boolean b() {
        return false;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class exf implements defpackage.fio {
    final /* synthetic */ defpackage.exh a;
    private final java.util.HashMap b;
    private final defpackage.fag c;

    public exf(defpackage.exh exhVar, defpackage.fag fagVar) {
        j$.util.Objects.requireNonNull(exhVar);
        this.a = exhVar;
        this.b = new java.util.HashMap();
        this.c = fagVar;
    }

    private final void e(amwp amwpVar) {
        defpackage.fag fagVar = (defpackage.fag) this.b.remove(amwpVar);
        ahvr.ci(fagVar);
        defpackage.exg exgVar = (defpackage.exg) this.a.h.get(fagVar);
        if (exgVar != null) {
            exgVar.b();
        }
    }

    @Override // defpackage.fio
    public final synchronized void a() {
        this.a.b.a();
    }

    @Override // defpackage.fio
    public final synchronized void b(defpackage.fgq fgqVar) {
        this.a.b.b(fgqVar);
        while (fgqVar != null) {
            e(fgqVar.e());
            fgqVar = fgqVar.c();
        }
    }

    @Override // defpackage.fio
    public final synchronized amwp c() {
        amwp amwpVarC;
        defpackage.exh exhVar = this.a;
        defpackage.fiq fiqVar = exhVar.b;
        java.util.HashMap map = this.b;
        amwpVarC = fiqVar.c();
        defpackage.fag fagVar = this.c;
        map.put(amwpVarC, fagVar);
        defpackage.exg exgVar = (defpackage.exg) exhVar.h.get(fagVar);
        if (exgVar != null) {
            exgVar.c();
        }
        return amwpVarC;
    }

    @Override // defpackage.fio
    public final synchronized void d(amwp amwpVar) {
        this.a.b.d(amwpVar);
        e(amwpVar);
    }
}

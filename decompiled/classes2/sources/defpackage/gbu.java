package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gbu implements aonj {
    final /* synthetic */ defpackage.gbv a;
    private boolean b = true;

    public gbu(defpackage.gbv gbvVar) {
        this.a = gbvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        aonj aonjVar;
        fzd fzdVar = (fzd) obj;
        aooh.f(fzdVar, "loadStates");
        if (this.b) {
            this.b = false;
        } else if (fzdVar.d.b instanceof fzz) {
            defpackage.gbv gbvVar = this.a;
            defpackage.gbv.x(gbvVar);
            defpackage.fyr fyrVar = gbvVar.a;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = fyrVar.j;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (aonjVar = (aonj) fyrVar.i.get()) != null) {
                ((gdx) fyrVar.e.l.a).b(aonjVar);
            }
        }
        return aojh.a;
    }
}

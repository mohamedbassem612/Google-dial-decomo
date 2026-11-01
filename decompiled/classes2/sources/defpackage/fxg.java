package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.fwm(a = "dialog")
public final class fxg extends defpackage.fwn {
    @Override // defpackage.fwn
    public final /* bridge */ /* synthetic */ defpackage.fwc a() {
        return new defpackage.fxf(this, new defpackage.drh(null), defpackage.fwv.a);
    }

    public final aozh d() {
        return f().d;
    }

    @Override // defpackage.fwn
    public final void e(java.util.List list, defpackage.fwj fwjVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f().f((defpackage.fvs) it.next());
        }
    }

    @Override // defpackage.fwn
    public final void g(defpackage.fvs fvsVar, boolean z) {
        f().e(fvsVar, z);
        int iBy = ajsz.by((java.lang.Iterable) f().e.c(), fvsVar);
        int i = 0;
        for (java.lang.Object obj : (java.lang.Iterable) f().e.c()) {
            int i2 = i + 1;
            if (i < 0) {
                ajsz.bh();
            }
            defpackage.fvs fvsVar2 = (defpackage.fvs) obj;
            if (i > iBy) {
                h(fvsVar2);
            }
            i = i2;
        }
    }

    public final void h(defpackage.fvs fvsVar) {
        f().c(fvsVar);
    }
}

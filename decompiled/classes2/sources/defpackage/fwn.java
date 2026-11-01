package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class fwn {
    public defpackage.fwp a;
    public boolean b;

    public abstract defpackage.fwc a();

    public boolean b() {
        return true;
    }

    public void e(java.util.List list, defpackage.fwj fwjVar) {
        aooh.f(list, "entries");
        aoqh aoqhVar = new aoqh(aooc.m(new aoqt(ajsz.ch(list), new dih(this, 17), 2)));
        while (aoqhVar.hasNext()) {
            f().f((defpackage.fvs) aoqhVar.next());
        }
    }

    public final defpackage.fwp f() {
        defpackage.fwp fwpVar = this.a;
        if (fwpVar != null) {
            return fwpVar;
        }
        throw new java.lang.IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(defpackage.fvs fvsVar, boolean z) {
        aooh.f(fvsVar, "popUpTo");
        java.util.List list = (java.util.List) f().d.c();
        if (!list.contains(fvsVar)) {
            throw new java.lang.IllegalStateException(a.bi(list, fvsVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        defpackage.fvs fvsVar2 = null;
        while (b()) {
            fvsVar2 = (defpackage.fvs) listIterator.previous();
            if (aooh.n(fvsVar2, fvsVar)) {
                break;
            }
        }
        if (fvsVar2 != null) {
            f().d(fvsVar2, z);
        }
    }

    public defpackage.fwc c(defpackage.fwc fwcVar) {
        return fwcVar;
    }
}

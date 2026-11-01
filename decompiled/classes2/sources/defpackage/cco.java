package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cco extends cee {
    public final adw a;
    private final java.util.List b;
    private final adw c;
    private final apnt d;

    public cco() {
        long[] jArr = adx.a;
        this.a = new adw(6);
        this.b = new java.util.ArrayList();
        this.c = new adw(6);
        this.d = cfd.V(new brg(this, 6));
    }

    public final aonj a(aowv aowvVar) {
        adw adwVar = this.c;
        aonj aonjVar = (aonj) adwVar.a(aowvVar);
        if (aonjVar != null) {
            return aonjVar;
        }
        bly blyVar = new bly(this, aowvVar, 15);
        adwVar.h(aowvVar, blyVar);
        return blyVar;
    }

    public final void b(aowv aowvVar) {
        this.b.add(new defpackage.ccm(aowvVar));
    }

    public final void c() {
        java.util.List list;
        synchronized (((cee) this).f) {
            list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.ccn ccnVar = (defpackage.ccn) list.get(i);
                if (ccnVar instanceof defpackage.ccl) {
                    defpackage.ccl cclVar = (defpackage.ccl) ccnVar;
                    cfg.a(this.a, cclVar.a, cclVar.b);
                } else {
                    if (!(ccnVar instanceof defpackage.ccm)) {
                        throw new aois();
                    }
                    cfg.b(this.a, ((defpackage.ccm) ccnVar).a);
                }
            }
        }
        list.clear();
    }

    public final void d() {
        this.d.u();
        this.b.clear();
        this.c.k();
        synchronized (((cee) this).f) {
            this.a.k();
        }
    }

    public final void e(aowv aowvVar) {
        this.c.i(aowvVar);
        b(aowvVar);
        c();
    }

    public final void f(aowv aowvVar, java.lang.Object obj) {
        this.b.add(new defpackage.ccl(obj, aowvVar));
    }
}

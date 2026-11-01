package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hax implements defpackage.hag, defpackage.hay {
    public final boolean a;
    public final defpackage.hbd b;
    public final defpackage.hbd c;
    public final defpackage.hbd d;
    public final int e;
    private final java.util.List f = new java.util.ArrayList();

    public hax(defpackage.hef hefVar, defpackage.hed hedVar) {
        this.a = hedVar.d;
        this.e = hedVar.e;
        defpackage.hbd hbdVarA = hedVar.a.a();
        this.b = hbdVarA;
        defpackage.hbd hbdVarA2 = hedVar.b.a();
        this.c = hbdVarA2;
        defpackage.hbd hbdVarA3 = hedVar.c.a();
        this.d = hbdVarA3;
        hefVar.i(hbdVarA);
        hefVar.i(hbdVarA2);
        hefVar.i(hbdVarA3);
        hbdVarA.h(this);
        hbdVarA2.h(this);
        hbdVarA3.h(this);
    }

    final void a(defpackage.hay hayVar) {
        this.f.add(hayVar);
    }

    @Override // defpackage.hay
    public final void d() {
        int i = 0;
        while (true) {
            java.util.List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.hay) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        throw null;
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
    }
}

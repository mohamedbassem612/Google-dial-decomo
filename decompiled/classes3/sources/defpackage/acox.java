package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acox implements defpackage.acmx {
    public final defpackage.acmd a;
    private defpackage.acmd c;
    private java.util.List d;
    private final defpackage.vaa f;
    private boolean e = false;
    public int b = 1;

    public acox(defpackage.acmd acmdVar) {
        this.a = acmdVar;
        this.f = acmdVar.d;
    }

    private final void a(defpackage.acmd acmdVar) {
        defpackage.acmx acmxVar = acmdVar.a;
        if (this.e) {
            ahvr.bM(acmxVar.l());
            acmxVar.h();
        }
        acmxVar.e();
    }

    @Override // defpackage.acmx
    public final /* synthetic */ java.lang.Object c() {
        return this.c;
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void d(java.lang.Object obj) {
        if (this.d == null) {
            this.d = new java.util.ArrayList();
        }
        defpackage.acmx acmxVar = ((defpackage.acmd) obj).a;
        acmxVar.j(this.a);
        ahvr.bM(this.d.add(obj));
        if (this.e) {
            acmxVar.g();
        }
    }

    @Override // defpackage.acmx
    public final void e() {
        ahvr.cc(this.c != null, "No parent override to unset: %s", this.a);
        this.c = null;
    }

    @Override // defpackage.acmx
    public final void f() {
        java.util.List list = this.d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                a((defpackage.acmd) it.next());
            }
            this.d.clear();
            this.d = null;
        }
        defpackage.acmd acmdVar = this.c;
        if (acmdVar != null) {
            acmdVar.a.i(this.a);
        }
    }

    @Override // defpackage.acmx
    public final void g() {
        ahvr.bY(!this.e);
        this.e = true;
        this.f.G(this.a);
        java.util.List list = this.d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.acmd) it.next()).a.g();
            }
        }
    }

    @Override // defpackage.acmx
    public final void h() {
        ahvr.bY(this.e);
        this.e = false;
        java.util.List list = this.d;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.acmd) arrayList.get(i)).a.h();
            }
        }
        this.f.H(this.a);
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void i(java.lang.Object obj) {
        ahvr.bM(this.d.remove(obj));
        a((defpackage.acmd) obj);
    }

    @Override // defpackage.acmx
    public final /* bridge */ /* synthetic */ void j(java.lang.Object obj) {
        ahvr.ci(obj);
        ahvr.cc(this.c == null, "Already has a parent override: %s", this.a);
        this.c = (defpackage.acmd) obj;
    }

    @Override // defpackage.acmx
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.acmx
    public final boolean m() {
        return this.c == null;
    }

    @Override // defpackage.acmx
    public final int p() {
        return this.b;
    }

    @Override // defpackage.acmx
    public final void q(defpackage.akgh akghVar) {
        java.util.List list = this.d;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                akghVar.f((defpackage.acmd) this.d.get(size));
            }
        }
    }
}

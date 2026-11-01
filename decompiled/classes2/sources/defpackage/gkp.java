package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gkp implements defpackage.gkw {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.util.ArrayList b;

    public gkp(android.view.View view, java.util.ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.gkw
    public final void b(gkz gkzVar) {
        throw null;
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void e(gkz gkzVar) {
        gkzVar.I(this);
        this.a.setVisibility(8);
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.gkw
    public final void f() {
        throw null;
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void g(gkz gkzVar) {
        gkzVar.I(this);
        gkzVar.D(this);
    }

    @Override // defpackage.gkw
    public final void c() {
    }

    @Override // defpackage.gkw
    public final void d() {
    }

    @Override // defpackage.gkw
    public final void a(gkz gkzVar) {
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class go implements defpackage.dzz {
    int a;
    final /* synthetic */ defpackage.gp b;
    private boolean c = false;

    protected go(defpackage.gp gpVar) {
        this.b = gpVar;
    }

    @Override // defpackage.dzz
    public final void a() {
        if (this.c) {
            return;
        }
        defpackage.gp gpVar = this.b;
        gpVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.dzz
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.dzz
    public final void c() {
        this.c = true;
    }

    public final void d(defpackage.ni niVar, int i) {
        this.b.f = niVar;
        this.a = i;
    }
}

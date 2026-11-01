package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lx extends defpackage.eaa {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.ly b;
    private boolean c = false;

    public lx(defpackage.ly lyVar, int i) {
        this.a = i;
        this.b = lyVar;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void a() {
        if (this.c) {
            return;
        }
        defpackage.ly lyVar = this.b;
        lyVar.a.setVisibility(this.a);
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void c() {
        this.c = true;
    }
}

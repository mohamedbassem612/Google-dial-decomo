package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ff extends defpackage.eaa {
    final /* synthetic */ defpackage.fg a;
    private boolean b = false;
    private int c = 0;

    public ff(defpackage.fg fgVar) {
        this.a = fgVar;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        defpackage.fg fgVar = this.a;
        if (i == fgVar.a.size()) {
            defpackage.dzz dzzVar = fgVar.b;
            if (dzzVar != null) {
                dzzVar.a();
            }
            this.c = 0;
            this.b = false;
            fgVar.c = false;
        }
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.dzz dzzVar = this.a.b;
        if (dzzVar != null) {
            dzzVar.b();
        }
    }
}

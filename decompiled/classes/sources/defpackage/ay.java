package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ay extends defpackage.bd implements defpackage.dvz, defpackage.dwa, defpackage.dvs, defpackage.dvt, defpackage.eoi, defpackage.nh, defpackage.oo, defpackage.gii, defpackage.br, defpackage.dys {
    final /* synthetic */ defpackage.az a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(defpackage.az azVar) {
        super(azVar, azVar, new android.os.Handler());
        this.a = azVar;
    }

    @Override // defpackage.emx
    public final defpackage.ems P() {
        return this.a.a;
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        return this.a.S();
    }

    @Override // defpackage.bd, defpackage.bb
    public final android.view.View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        return this.a.aT();
    }

    @Override // defpackage.bd, defpackage.bb
    public final boolean b() {
        android.view.Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.oo
    public final defpackage.on d() {
        return this.a.g;
    }

    @Override // defpackage.dvz
    public final void e(defpackage.dxw dxwVar) {
        this.a.e(dxwVar);
    }

    @Override // defpackage.nh
    public final defpackage.nf fc() {
        return this.a.fc();
    }

    @Override // defpackage.dvz
    public final void fg(defpackage.dxw dxwVar) {
        this.a.fg(dxwVar);
    }

    @Override // defpackage.br
    public final void g() {
    }
}

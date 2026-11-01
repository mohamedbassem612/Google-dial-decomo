package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class end extends defpackage.ene implements defpackage.emv {
    final defpackage.emx a;
    final /* synthetic */ defpackage.enf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public end(defpackage.enf enfVar, defpackage.emx emxVar, defpackage.enh enhVar) {
        super(enfVar, enhVar);
        this.b = enfVar;
        this.a = emxVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        defpackage.emx emxVar2 = this.a;
        defpackage.emq emqVarA = emxVar2.P().a();
        if (emqVarA == defpackage.emq.a) {
            this.b.j(this.c);
            return;
        }
        defpackage.emq emqVar = null;
        while (emqVar != emqVarA) {
            d(dD());
            emqVar = emqVarA;
            emqVarA = emxVar2.P().a();
        }
    }

    @Override // defpackage.ene
    public final void b() {
        this.a.P().d(this);
    }

    @Override // defpackage.ene
    public final boolean c(defpackage.emx emxVar) {
        return this.a == emxVar;
    }

    @Override // defpackage.ene
    public final boolean dD() {
        return this.a.P().a().a(defpackage.emq.d);
    }
}

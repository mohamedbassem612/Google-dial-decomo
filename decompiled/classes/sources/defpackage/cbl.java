package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbl implements defpackage.cdv {
    private final defpackage.aonj a;
    private defpackage.cbm b;

    public cbl(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.cdv
    public final void i() {
        defpackage.cbm cbmVar = this.b;
        if (cbmVar != null) {
            cbmVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.cdv
    public final void j() {
        this.b = (defpackage.cbm) this.a.a(defpackage.cbp.a);
    }

    @Override // defpackage.cdv
    public final void h() {
    }
}

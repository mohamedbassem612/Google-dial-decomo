package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class lkz extends defpackage.ghg {
    public lkz() {
        super(5, 6);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s BLOB", "Transcript", "callScreenFeedbackData"));
    }
}

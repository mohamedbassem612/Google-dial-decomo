package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class lkx extends defpackage.ghg {
    public lkx() {
        super(3, 4);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s TEXT", "Transcript", "audioRecordingFilePath"));
    }
}

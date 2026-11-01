package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class lky extends defpackage.ghg {
    public lky() {
        super(4, 5);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s INTEGER NOT NULL DEFAULT 0", "Transcript", "lastModifiedMillis"));
    }
}

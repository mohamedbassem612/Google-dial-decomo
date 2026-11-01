package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iul extends defpackage.ghg {
    public iul() {
        super(2, 3);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "ALTER TABLE `beesly_data` ADD COLUMN `transcriptionText` TEXT DEFAULT NULL");
        defpackage.dzk.M(gjhVar, "ALTER TABLE `beesly_data` ADD COLUMN `transcriptionCreationTimestampMs` INTEGER DEFAULT NULL");
    }
}

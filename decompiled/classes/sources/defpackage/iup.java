package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iup extends defpackage.ghg {
    public iup() {
        super(6, 7);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "ALTER TABLE `beesly_data` ADD COLUMN `is_eligible_for_survey` INTEGER NOT NULL DEFAULT 1");
    }
}

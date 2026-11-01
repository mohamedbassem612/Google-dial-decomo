package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxn extends defpackage.ghg {
    public nxn() {
        super(1, 2);
    }

    @Override // defpackage.ghg
    public final void b(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.dzk.M(gjhVar, "ALTER TABLE `meet_reachability_data` ADD COLUMN `last_queried` INTEGER NOT NULL DEFAULT 0");
    }
}

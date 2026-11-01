package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aecs extends ghg {
    public aecs() {
        super(2, 3);
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "ALTER TABLE `threads` ADD COLUMN `send_timestamp_usec` INTEGER NOT NULL DEFAULT 0");
        dzk.M(gjhVar, "ALTER TABLE `threads` ADD COLUMN `notification_type` TEXT DEFAULT NULL");
    }
}

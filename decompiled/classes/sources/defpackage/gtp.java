package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtp extends defpackage.ghg {
    public static final defpackage.gtp c = new defpackage.gtp();

    private gtp() {
        super(7, 8);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

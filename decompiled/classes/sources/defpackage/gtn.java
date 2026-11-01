package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtn extends defpackage.ghg {
    public static final defpackage.gtn c = new defpackage.gtn();

    private gtn() {
        super(4, 5);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gipVar.j("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

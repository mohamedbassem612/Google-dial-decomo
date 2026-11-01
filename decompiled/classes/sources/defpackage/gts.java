package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gts extends defpackage.ghg {
    private final android.content.Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gts(android.content.Context context, int i, int i2) {
        super(i, i2);
        if (context == null) {
            defpackage.aooh.i("mContext");
        }
        this.c = context;
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        if (this.b >= 10) {
            gipVar.p(new java.lang.Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}

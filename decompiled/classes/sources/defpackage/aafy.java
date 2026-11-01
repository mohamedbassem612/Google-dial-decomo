package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aafy extends defpackage.aaga {
    public final int a;
    public final android.os.Bundle b;
    final int c;
    final /* synthetic */ defpackage.aagf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafy(defpackage.aagf aagfVar, int i, android.os.Bundle bundle, int i2) {
        super(aagfVar, java.lang.Boolean.TRUE);
        j$.util.Objects.requireNonNull(aagfVar);
        this.d = aagfVar;
        this.a = i;
        this.b = bundle;
        this.c = i2;
    }

    protected abstract void a(com.google.android.gms.common.ConnectionResult connectionResult);

    protected abstract boolean b();

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    @Override // defpackage.aaga
    protected final /* synthetic */ void c() {
        java.lang.String strY;
        int i = this.a;
        if (i == 0) {
            if (b()) {
                return;
            }
            this.d.J(1, null, this.c);
            a(new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null, null));
            return;
        }
        defpackage.aagf aagfVar = this.d;
        aagfVar.J(1, null, this.c);
        android.os.Bundle bundle = this.b;
        android.app.PendingIntent pendingIntent = bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null;
        if (i == 1) {
            strY = aagfVar.y();
            defpackage.aais.am("Must not be called on the main application thread");
            if (strY != null) {
                int i2 = defpackage.aaby.c;
            }
        } else if (i == 21) {
            i = 21;
            strY = aagfVar.y();
            defpackage.aais.am("Must not be called on the main application thread");
            if (strY != null) {
                int i3 = defpackage.aaby.c;
            }
        }
        a(new com.google.android.gms.common.ConnectionResult(1, i, pendingIntent, null, null, null));
    }
}

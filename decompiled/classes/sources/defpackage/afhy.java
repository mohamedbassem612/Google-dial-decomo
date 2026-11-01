package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhy extends defpackage.afia implements android.os.CancellationSignal.OnCancelListener {
    private final android.os.CancellationSignal b;

    public afhy(defpackage.afhz afhzVar) {
        super(afhzVar);
        this.b = new android.os.CancellationSignal();
    }

    @Override // defpackage.ajac, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.afia
    protected final void d(defpackage.afhz afhzVar) {
        try {
            android.os.CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            android.database.Cursor cursorA = afhzVar.a(cancellationSignal);
            try {
                if (!isCancelled() && cursorA != null) {
                    cursorA.getCount();
                }
                if (o(cursorA)) {
                }
            } catch (java.lang.Throwable th) {
                try {
                    p(th);
                } finally {
                    if (!o(cursorA)) {
                        defpackage.agab.am(cursorA);
                    }
                }
            }
        } catch (android.os.OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}

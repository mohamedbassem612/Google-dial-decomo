package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aaee extends defpackage.aaey implements android.content.DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final java.util.concurrent.atomic.AtomicReference b;
    public final android.os.Handler c;
    protected final aabx d;

    public aaee(defpackage.aaez aaezVar, aabx aabxVar) {
        super(aaezVar);
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.c = new aanh(android.os.Looper.getMainLooper());
        this.d = aabxVar;
    }

    private static final int k(defpackage.amwp amwpVar) {
        if (amwpVar == null) {
            return -1;
        }
        return amwpVar.a;
    }

    public final void a(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.aaey
    public final void c(int i, int i2, android.content.Intent intent) {
        defpackage.amwp amwpVar = (defpackage.amwp) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iK = this.d.k(l());
                if (iK == 0) {
                    b();
                    return;
                } else {
                    if (amwpVar == null) {
                        return;
                    }
                    if (((com.google.android.gms.common.ConnectionResult) amwpVar.b).c == 18 && iK == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (amwpVar != null) {
                a(new com.google.android.gms.common.ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, (android.app.PendingIntent) null, ((com.google.android.gms.common.ConnectionResult) amwpVar.b).toString(), (java.lang.Integer) null, (android.os.Bundle) null), k(amwpVar));
                return;
            }
            return;
        }
        if (amwpVar != null) {
            a((com.google.android.gms.common.ConnectionResult) amwpVar.b, amwpVar.a);
        }
    }

    @Override // defpackage.aaey
    public final void d(android.os.Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new defpackage.amwp(new com.google.android.gms.common.ConnectionResult(1, bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution"), (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(com.google.android.gms.common.ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.aaey
    public final void g(android.os.Bundle bundle) {
        defpackage.amwp amwpVar = (defpackage.amwp) this.b.get();
        if (amwpVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", amwpVar.a);
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) amwpVar.b;
            bundle.putInt("failed_status", connectionResult.c);
            bundle.putParcelable("failed_resolution", connectionResult.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        a(new com.google.android.gms.common.ConnectionResult(1, 13, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null), k((defpackage.amwp) this.b.get()));
    }
}

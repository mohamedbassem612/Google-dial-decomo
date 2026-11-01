package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aatb {
    protected final defpackage.aata a;
    protected final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final java.lang.String b = "com.google.android.dialer";

    public aatb(defpackage.aata aataVar) {
        this.a = aataVar;
    }

    protected java.lang.String a() {
        throw null;
    }

    protected boolean b(com.google.android.gms.phenotype.Configurations configurations) {
        throw null;
    }

    protected final com.google.android.gms.phenotype.Configurations c(java.lang.String str) {
        try {
            return (com.google.android.gms.phenotype.Configurations) defpackage.aazc.u(this.a.d("com.google.android.dialer", "", str), 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            android.util.Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for com.google.android.dialer failed", e);
            return null;
        }
    }

    public final boolean d(int i) {
        if (i <= 0) {
            android.util.Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for ".concat(this.b));
            return false;
        }
        boolean z = this.c.get() && i > 1;
        java.lang.String str = this.b;
        com.google.android.gms.phenotype.Configurations configurationsC = c(a());
        if (configurationsC == null) {
            if (z) {
                return d(i - 1);
            }
            return false;
        }
        if (!b(configurationsC)) {
            return false;
        }
        java.lang.String str2 = configurationsC.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                defpackage.aazc.u(this.a.b(str2), 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                defpackage.aewg aewgVar = (defpackage.aewg) defpackage.aewg.a.get(defpackage.aewo.a(str));
                if (aewgVar != null) {
                    aewgVar.b();
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                android.util.Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.b + " failed, retrying", e);
                return d(i - 1);
            }
        }
        return true;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrm extends defpackage.anrt {
    final /* synthetic */ defpackage.ahzi a;
    final /* synthetic */ android.content.pm.PackageManager b;
    final /* synthetic */ defpackage.aihd c;
    final /* synthetic */ java.util.concurrent.Executor d;

    public anrm(defpackage.ahzi ahziVar, android.content.pm.PackageManager packageManager, defpackage.aihd aihdVar, java.util.concurrent.Executor executor) {
        this.a = ahziVar;
        this.b = packageManager;
        this.c = aihdVar;
        this.d = executor;
    }

    @Override // defpackage.anrt
    @java.lang.Deprecated
    public final defpackage.anqw a(int i) {
        try {
            return (defpackage.anqw) ((defpackage.ajac) b(i)).s();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            return defpackage.anqw.c.e(e);
        } catch (java.util.concurrent.CancellationException e2) {
            return defpackage.anqw.c.e(e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            return defpackage.anqw.d(e3);
        }
    }

    public final defpackage.ajcq b(int i) {
        return defpackage.aiql.D(new nzd(this.a, this.b, this.c, i, 3), this.d);
    }

    public anrm() {
        throw null;
    }
}

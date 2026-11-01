package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class agwz extends android.database.ContentObserver {
    private final defpackage.ahpz a;
    private final java.lang.String b;
    private final java.util.concurrent.Executor c;

    protected agwz(defpackage.ahpz ahpzVar, java.lang.String str, java.util.concurrent.Executor executor) {
        super(null);
        this.a = ahpzVar;
        this.b = str;
        this.c = executor;
    }

    private final void b(boolean z, android.net.Uri uri) {
        this.c.execute(defpackage.ahqx.h(new rrq(this, z, uri, 5)));
    }

    public abstract void a(boolean z, android.net.Uri uri);

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (defpackage.ahns.q()) {
            b(z, null);
            return;
        }
        defpackage.ahok ahokVarG = this.a.g(1326, this.b);
        try {
            b(z, null);
            ahokVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        if (defpackage.ahns.q()) {
            b(z, uri);
            return;
        }
        defpackage.ahok ahokVarG = this.a.g(1327, this.b);
        try {
            b(z, uri);
            ahokVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

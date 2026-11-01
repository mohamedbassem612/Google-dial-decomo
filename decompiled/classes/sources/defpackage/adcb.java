package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcb implements defpackage.affy, defpackage.adte {
    private final java.util.HashMap a = new java.util.HashMap();

    public adcb(java.util.concurrent.Executor executor) {
        new defpackage.ajdc(executor);
    }

    @Override // defpackage.affy
    public final affx a(android.net.Uri uri) {
        return b(uri);
    }

    @Override // defpackage.affy
    public final affx b(android.net.Uri uri) {
        synchronized (defpackage.adcb.class) {
            java.util.HashMap map = this.a;
            if (map.get(uri) == null) {
                return null;
            }
            return (affx) map.get(uri);
        }
    }

    @Override // defpackage.adte
    public final void e() {
        synchronized (defpackage.adcb.class) {
            java.util.Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    @Override // defpackage.adte
    public final void c() {
    }

    @Override // defpackage.adte
    public final void d() {
    }

    @Override // defpackage.affy
    public final void f() {
    }
}

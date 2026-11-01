package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewl implements defpackage.evr {
    public long a;
    public android.net.Uri b = android.net.Uri.EMPTY;
    public java.util.Map c = java.util.Collections.EMPTY_MAP;
    private final defpackage.evr d;

    public ewl(defpackage.evr evrVar) {
        this.d = evrVar;
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) {
        int iA = this.d.a(bArr, i, i2);
        if (iA != -1) {
            this.a += (long) iA;
        }
        return iA;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) {
        this.b = evvVar.a;
        this.c = java.util.Collections.EMPTY_MAP;
        try {
            return this.d.b(evvVar);
        } finally {
            android.net.Uri uriC = c();
            if (uriC != null) {
                this.b = uriC;
            }
            this.c = e();
        }
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        return this.d.c();
    }

    @Override // defpackage.evr
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.evr
    public final java.util.Map e() {
        return this.d.e();
    }

    @Override // defpackage.evr
    public final void f(defpackage.ewm ewmVar) {
        ahvr.ci(ewmVar);
        this.d.f(ewmVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evu {
    public android.net.Uri a;
    public int b;
    public byte[] c;
    public java.util.Map d;
    public long e;
    public int f;

    public evu(defpackage.evv evvVar) {
        this.a = evvVar.a;
        this.b = evvVar.b;
        this.c = evvVar.c;
        this.d = evvVar.d;
        this.e = evvVar.e;
        this.f = evvVar.g;
    }

    public final defpackage.evv a() {
        ahvr.cj(this.a, "The uri must be set.");
        return new defpackage.evv(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(java.lang.String str) {
        this.a = android.net.Uri.parse(str);
    }

    public evu() {
        this.b = 1;
        this.d = java.util.Collections.EMPTY_MAP;
    }
}

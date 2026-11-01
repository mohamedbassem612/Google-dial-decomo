package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adch implements defpackage.affy {
    public final android.content.Context a;
    public final java.lang.Object b;
    public final java.util.HashMap c;
    public final java.util.HashMap d;
    public final defpackage.abrz e;

    public adch(android.content.Context context) {
        defpackage.abrz abrzVar = new defpackage.abrz();
        this.b = new java.lang.Object();
        this.c = new java.util.HashMap();
        this.d = new java.util.HashMap();
        this.a = context;
        this.e = abrzVar;
    }

    @Override // defpackage.affy
    public final affx a(android.net.Uri uri) {
        return b(uri);
    }

    @Override // defpackage.affy
    public final affx b(android.net.Uri uri) {
        affx affxVar;
        synchronized (this.b) {
            affxVar = (affx) this.d.get(uri);
        }
        return affxVar;
    }

    @Override // defpackage.affy
    public final void f() {
    }
}

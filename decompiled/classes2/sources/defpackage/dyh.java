package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dyh implements defpackage.dyg {
    final android.content.ClipData a;
    final int b;
    int c;
    android.net.Uri d;
    android.os.Bundle e;

    public dyh(android.content.ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.dyg
    public final defpackage.dyl a() {
        return new defpackage.dyl(new defpackage.dyk(this));
    }

    @Override // defpackage.dyg
    public final void b(android.os.Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.dyg
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.dyg
    public final void d(android.net.Uri uri) {
        this.d = uri;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxo {
    public final android.net.Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final java.lang.String e;
    public final int f;

    public dxo(java.lang.String str, java.lang.String str2) {
        this.a = new android.net.Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public final boolean a() {
        return j$.util.Objects.equals(this.a.getScheme(), "systemfont");
    }

    public dxo(android.net.Uri uri, int i, int i2, boolean z, java.lang.String str, int i3) {
        dzk.x(uri);
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = i3;
    }
}

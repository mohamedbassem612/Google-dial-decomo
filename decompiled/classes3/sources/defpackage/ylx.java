package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ylx {
    public aify a;
    public float b;
    public int c;
    public aify d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public android.os.Bundle i;
    public int j;
    public com.google.android.apps.aicore.aidl.UserProperties k;
    public float l;
    public com.google.android.apps.aicore.aidl.ResponseSchema m;
    public com.google.android.apps.aicore.aidl.FunctionTools n;
    public short o;

    public final void a(int i) {
        this.j = i;
        this.o = (short) (this.o | 256);
    }

    public final void b(java.util.List list) {
        this.d = aify.n(list);
    }

    public final void c(float f) {
        this.l = f;
        this.o = (short) (this.o | 2048);
    }

    public final void d() {
        this.o = (short) (this.o | 4096);
    }

    public final void e() {
        this.o = (short) (this.o | 1024);
    }

    public final void f() {
        this.o = (short) (this.o | 512);
    }

    public final void g() {
        this.o = (short) (this.o | 128);
    }

    public final void h() {
        this.o = (short) (this.o | 64);
    }
}

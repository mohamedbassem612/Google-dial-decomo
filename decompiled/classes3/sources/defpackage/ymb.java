package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymb {
    public aify a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public com.google.android.apps.aicore.aidl.SummarizationArguments h;
    public com.google.android.apps.aicore.aidl.UserProperties i;
    public byte j;

    public final void a(int i) {
        this.f = i;
        this.j = (byte) (this.j | 32);
    }

    public final void b(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null messages");
        }
        this.a = aifyVar;
    }

    public final void c(int i) {
        this.g = i;
        this.j = (byte) (this.j | 64);
    }

    public final void d() {
        this.e = 1;
        this.j = (byte) (this.j | 16);
    }

    public final void e(int i) {
        this.d = i;
        this.j = (byte) (this.j | 8);
    }

    public final void f(int i) {
        this.c = i;
        this.j = (byte) (this.j | 4);
    }

    public final void g(int i) {
        this.b = i;
        this.j = (byte) (this.j | 2);
    }

    public final void h() {
        this.j = (byte) (this.j | (-128));
    }

    public final void i() {
        this.j = (byte) (this.j | 1);
    }
}

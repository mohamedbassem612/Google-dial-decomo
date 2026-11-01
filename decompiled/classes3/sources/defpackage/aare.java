package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aare {
    public float a;
    public float b;
    public float c;
    public float d;
    public short e;

    public final void a(float f) {
        this.d = f;
        this.e = (short) (this.e | 8);
    }

    public final void b(float f) {
        this.c = f;
        this.e = (short) (this.e | 4);
    }

    public final void c(float f) {
        this.b = f;
        this.e = (short) (this.e | 2);
    }

    public final void d(float f) {
        this.a = f;
        this.e = (short) (this.e | 1);
    }
}

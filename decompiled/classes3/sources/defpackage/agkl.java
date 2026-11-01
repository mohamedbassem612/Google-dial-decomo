package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkl {
    public float[] a;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    private float[] h;
    private java.lang.String i;

    public agkl(defpackage.agjl agjlVar) {
        aooh.f(agjlVar, "baseConfig");
        this.a = agjlVar.a;
        this.b = agjlVar.b;
        this.c = agjlVar.c;
        this.h = agjlVar.d;
        this.d = agjlVar.g;
        this.e = agjlVar.f;
        this.f = agjlVar.e;
        if (agjlVar.e) {
            boolean z = agjlVar.f;
        }
        this.g = agjlVar.h;
        this.i = agjlVar.i;
    }

    public final defpackage.agjl a() {
        return new defpackage.agjl(this.a, this.b, this.c, this.h, this.f, this.e, this.d, this.g, this.i, 259);
    }

    public agkl() {
        this((byte[]) null);
    }

    public /* synthetic */ agkl(byte[] bArr) {
        this(new defpackage.agjl(null));
    }
}

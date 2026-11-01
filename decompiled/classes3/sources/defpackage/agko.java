package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agko {
    public float a;
    public int b;
    public int c;
    public int d;
    private float e;

    public agko(defpackage.agjo agjoVar) {
        this.a = agjoVar.a;
        this.b = agjoVar.b;
        this.e = agjoVar.c;
        this.c = agjoVar.d;
        this.d = agjoVar.e;
    }

    public final defpackage.agjo a() {
        return new defpackage.agjo(this.a, this.b, this.e, this.c, this.d);
    }

    public final void b() {
        this.a = 0.0f;
    }

    public final void c() {
        this.e = 0.25f;
    }

    public agko() {
        this((byte[]) null);
    }

    public /* synthetic */ agko(byte[] bArr) {
        this(new defpackage.agjo(null));
    }
}

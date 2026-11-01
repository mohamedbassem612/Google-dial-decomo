package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkn {
    public float a;
    public float b;
    public int c;
    public float d;
    private float e;

    public agkn(defpackage.agjn agjnVar) {
        this.a = agjnVar.a;
        this.b = agjnVar.b;
        this.c = agjnVar.c;
        this.d = agjnVar.d;
        this.e = agjnVar.e;
    }

    public final defpackage.agjn a() {
        return new defpackage.agjn(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b() {
        this.d = 0.0f;
    }

    public agkn() {
        this((byte[]) null);
    }

    public /* synthetic */ agkn(byte[] bArr) {
        this(new defpackage.agjn(null));
    }
}

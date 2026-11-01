package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qto {
    public float a;
    public j$.util.Optional b;
    public byte c;
    private float d;
    private float e;
    private int f;

    public qto(defpackage.qtq qtqVar) {
        this.b = j$.util.Optional.empty();
        this.d = qtqVar.a;
        this.e = qtqVar.b;
        this.f = qtqVar.c;
        this.a = qtqVar.d;
        this.b = qtqVar.e;
        this.c = (byte) 15;
    }

    public final defpackage.qtq a() {
        if (this.c == 15) {
            return new defpackage.qtq(this.d, this.e, this.f, this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" scaleX");
        }
        if ((this.c & 2) == 0) {
            sb.append(" scaleY");
        }
        if ((this.c & 4) == 0) {
            sb.append(" rotationDegrees");
        }
        if ((this.c & 8) == 0) {
            sb.append(" preScaleFactor");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.f = i;
        this.c = (byte) (this.c | 4);
    }

    public final void c(float f) {
        this.d = f;
        this.c = (byte) (this.c | 1);
    }

    public final void d(float f) {
        this.e = f;
        this.c = (byte) (this.c | 2);
    }

    public qto() {
        this.b = j$.util.Optional.empty();
    }
}

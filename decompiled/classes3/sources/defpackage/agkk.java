package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkk {
    public float a;

    public agkk(byte[] bArr) {
        ahvr.bR(true, "input is not between 0 and 1: %s", java.lang.Float.valueOf(0.8f));
        this.a = 0.0f;
    }

    public final void a(float f) {
        this.a = f + ((this.a - f) * 0.8f);
    }

    public agkk(byte[] bArr, byte[] bArr2) {
        this.a = 0.0f;
    }

    public agkk(defpackage.agji agjiVar) {
        this.a = agjiVar.a;
    }

    public agkk() {
        this(new defpackage.agji(3.0f));
    }
}

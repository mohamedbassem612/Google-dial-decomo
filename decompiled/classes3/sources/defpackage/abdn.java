package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdn {
    public float a;
    private final boolean c;
    public boolean b = false;
    private boolean d = false;
    private float e = 0.0f;

    public abdn(float f, boolean z) {
        this.a = f;
        this.c = z;
    }

    public final void a() {
        this.b = false;
        this.d = false;
    }

    final void b(defpackage.agkk agkkVar, float f) {
        boolean z = this.c;
        float f2 = agkkVar.a;
        boolean z2 = !z ? f2 >= this.a : f2 <= this.a;
        if (z2 && this.d && f - this.e > 2.0E8f) {
            this.b = true;
            return;
        }
        if (!z2) {
            this.d = false;
            this.b = false;
        } else {
            if (this.d) {
                return;
            }
            this.e = f;
            this.d = true;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyn {
    public long a;
    public float b;
    public long c;

    public eyn() {
        this.a = -9223372036854775807L;
        this.b = -3.4028235E38f;
        this.c = -9223372036854775807L;
    }

    public final void a(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        ahvr.bM(z);
        this.c = j;
    }

    public final void b(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        ahvr.bM(z);
        this.b = f;
    }

    public eyn(defpackage.eyo eyoVar) {
        this.a = eyoVar.a;
        this.b = eyoVar.b;
        this.c = eyoVar.c;
    }
}

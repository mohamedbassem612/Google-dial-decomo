package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adoh {
    public java.lang.String a;
    public boolean b;
    public long f;
    public byte h;
    public j$.util.Optional c = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional g = j$.util.Optional.empty();

    public final void a(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null audioData");
        }
        this.e = optional;
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null confidence");
        }
        this.c = optional;
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null latencyMs");
        }
        this.d = optional;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null transcriptionType");
        }
        this.g = optional;
    }
}

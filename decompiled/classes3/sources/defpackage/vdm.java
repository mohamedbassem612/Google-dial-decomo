package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdm {
    public j$.util.Optional a = j$.util.Optional.empty();
    public j$.util.Optional b = j$.util.Optional.empty();
    private j$.util.Optional d = j$.util.Optional.empty();
    private j$.util.Optional e = j$.util.Optional.empty();
    private final j$.util.Optional f = j$.util.Optional.empty();
    private j$.util.Optional g = j$.util.Optional.empty();
    private final j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();

    public final defpackage.vdn a() {
        return new defpackage.vdn(this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.c);
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null isRead");
        }
        this.g = optional;
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null transcription");
        }
        this.d = optional;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null transcriptionState");
        }
        this.e = optional;
    }
}

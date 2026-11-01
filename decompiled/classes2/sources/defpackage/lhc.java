package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhc {
    public defpackage.adnw a;
    public defpackage.adnw b;
    public byte e;
    public int f;
    private boolean g;
    private boolean h;
    public j$.util.Optional c = j$.util.Optional.empty();
    private j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();

    public final defpackage.lhd a() {
        int i;
        defpackage.adnw adnwVar;
        defpackage.adnw adnwVar2;
        if (this.e == 15 && (i = this.f) != 0 && (adnwVar = this.a) != null && (adnwVar2 = this.b) != null) {
            return new defpackage.lhd(i, this.g, this.h, adnwVar, adnwVar2, this.c, this.i, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f == 0) {
            sb.append(" sessionType");
        }
        if ((this.e & 1) == 0) {
            sb.append(" shouldRequestSpamAudioDetection");
        }
        if ((this.e & 2) == 0) {
            sb.append(" shouldRequestAudioRecording");
        }
        if ((this.e & 4) == 0) {
            sb.append(" spamAudioDetectionTimeoutMillis");
        }
        if ((this.e & 8) == 0) {
            sb.append(" isAudioProcessingStateSupported");
        }
        if (this.a == null) {
            sb.append(" disclosureRequest");
        }
        if (this.b == null) {
            sb.append(" resumeScreeningRequest");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.h = z;
        this.e = (byte) (this.e | 8);
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null rejectCallRequest");
        }
        this.i = optional;
    }

    public final void d(boolean z) {
        this.g = z;
        this.e = (byte) (this.e | 2);
    }
}

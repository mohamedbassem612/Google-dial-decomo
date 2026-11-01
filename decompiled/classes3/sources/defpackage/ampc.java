package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ampc implements alah {
    UNKNOWN_FEATURE(0),
    OVERALL(1),
    TRANSCRIPTION_QUALITY(2),
    TRANSCRIPTION_LATENCY(3);

    public final int e;

    ampc(int i) {
        this.e = i;
    }

    public static defpackage.ampc b(int i) {
        if (i == 0) {
            return UNKNOWN_FEATURE;
        }
        if (i == 1) {
            return OVERALL;
        }
        if (i == 2) {
            return TRANSCRIPTION_QUALITY;
        }
        if (i != 3) {
            return null;
        }
        return TRANSCRIPTION_LATENCY;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}

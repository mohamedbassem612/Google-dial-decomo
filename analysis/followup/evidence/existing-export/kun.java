package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum kun implements alah {
    CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED(0),
    BEEP_SOUND(1),
    BUILT_IN(2),
    TTS(3);

    public final int e;

    kun(int i) {
        this.e = i;
    }

    public static defpackage.kun b(int i) {
        if (i == 0) {
            return CALL_RECORDING_DISCLOSURE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return BEEP_SOUND;
        }
        if (i == 2) {
            return BUILT_IN;
        }
        if (i != 3) {
            return null;
        }
        return TTS;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}

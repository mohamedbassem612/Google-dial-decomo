package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum altg implements alah {
    TTS_VOICE_UNSPECIFIED(0),
    EN_US_DUPLEX_VOICE_BGS(1),
    EN_US_DUPLEX_VOICE_BGG(2),
    EN_US_ASSISTANT_VOICE(3);

    public final int e;

    altg(int i) {
        this.e = i;
    }

    public static defpackage.altg b(int i) {
        if (i == 0) {
            return TTS_VOICE_UNSPECIFIED;
        }
        if (i == 1) {
            return EN_US_DUPLEX_VOICE_BGS;
        }
        if (i == 2) {
            return EN_US_DUPLEX_VOICE_BGG;
        }
        if (i != 3) {
            return null;
        }
        return EN_US_ASSISTANT_VOICE;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}

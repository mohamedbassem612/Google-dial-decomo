package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum uzm implements alah {
    UNKNOWN(0),
    TRANSCRIPTION_NOT_STARTED(1),
    TRANSCRIPTION_IN_PROGRESS(2),
    TRANSCRIPTION_FAILED(3),
    TRANSCRIPTION_AVAILABLE(4),
    TRANSCRIPTION_FAILED_NO_SPEECH_DETECTED(5),
    TRANSCRIPTION_FAILED_LANGUAGE_NOT_SUPPORTED(6),
    TRANSCRIPTION_AVAILABLE_AND_RATED(7),
    TRANSCRIPTION_FAILED_LANGUAGE_MODEL_MISSING(8),
    TRANSCRIPTION_FAILED_SODA_APP_MISSING(9),
    TRANSCRIPTION_FAILED_NO_MICROPHONE_PERMISSION(10);

    public final int l;

    uzm(int i) {
        this.l = i;
    }

    public static defpackage.uzm b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TRANSCRIPTION_NOT_STARTED;
            case 2:
                return TRANSCRIPTION_IN_PROGRESS;
            case 3:
                return TRANSCRIPTION_FAILED;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return TRANSCRIPTION_AVAILABLE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return TRANSCRIPTION_FAILED_NO_SPEECH_DETECTED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return TRANSCRIPTION_FAILED_LANGUAGE_NOT_SUPPORTED;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return TRANSCRIPTION_AVAILABLE_AND_RATED;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return TRANSCRIPTION_FAILED_LANGUAGE_MODEL_MISSING;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return TRANSCRIPTION_FAILED_SODA_APP_MISSING;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return TRANSCRIPTION_FAILED_NO_MICROPHONE_PERMISSION;
            default:
                return null;
        }
    }

    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}

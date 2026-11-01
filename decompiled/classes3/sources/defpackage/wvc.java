package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wvc {
    public static final defpackage.wvc a;
    public static final defpackage.wvc b;
    public static final defpackage.wvc c;
    public static final defpackage.wvc d;
    public static final defpackage.wvc e;
    public static final defpackage.wvc f;
    public static final defpackage.wvc g;
    public static final defpackage.wvc h;
    public static final defpackage.wvc i;
    public static final defpackage.wvc j;
    private static final /* synthetic */ defpackage.wvc[] k;

    static {
        defpackage.wvc wvcVar = new defpackage.wvc("PLAY_AUDIO", 0);
        a = wvcVar;
        defpackage.wvc wvcVar2 = new defpackage.wvc("REMOTE_SIDE_REFUSED_RECORDING", 1);
        b = wvcVar2;
        defpackage.wvc wvcVar3 = new defpackage.wvc("REMOTE_SIDE_PLAYING_MUSIC", 2);
        c = wvcVar3;
        defpackage.wvc wvcVar4 = new defpackage.wvc("REMOTE_SIDE_SILENCE", 3);
        d = wvcVar4;
        defpackage.wvc wvcVar5 = new defpackage.wvc("REMOTE_SIDE_SPEECH", 4);
        e = wvcVar5;
        defpackage.wvc wvcVar6 = new defpackage.wvc("OFF_HOLD", 5);
        f = wvcVar6;
        defpackage.wvc wvcVar7 = new defpackage.wvc("USER_ATTENTION_REQUIRED", 6);
        g = wvcVar7;
        defpackage.wvc wvcVar8 = new defpackage.wvc("AUDIO_ERROR", 7);
        h = wvcVar8;
        defpackage.wvc wvcVar9 = new defpackage.wvc("GENERIC_ERROR", 8);
        i = wvcVar9;
        defpackage.wvc wvcVar10 = new defpackage.wvc("VALUE_NOT_SET", 9);
        j = wvcVar10;
        k = new defpackage.wvc[]{wvcVar, wvcVar2, wvcVar3, wvcVar4, wvcVar5, wvcVar6, wvcVar7, wvcVar8, wvcVar9, wvcVar10};
    }

    public static defpackage.wvc a(int i2) {
        switch (i2) {
            case 0:
                return j;
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return d;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return e;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return f;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return g;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return h;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return i;
            default:
                return null;
        }
    }

    public static defpackage.wvc[] values() {
        return (defpackage.wvc[]) k.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zkg {
    public static final defpackage.zkg a;
    public static final defpackage.zkg b;
    public static final defpackage.zkg c;
    public static final defpackage.zkg d;
    public static final defpackage.zkg e;
    public static final defpackage.zkg f;
    public static final defpackage.zkg g;
    public static final defpackage.zkg h;
    public static final defpackage.zkg i;
    public static final defpackage.zkg j;
    public static final defpackage.zkg k;
    public static final defpackage.zkg l;
    public static final defpackage.zkg m;
    public static final defpackage.zkg n;
    public static final defpackage.zkg o;
    private static final /* synthetic */ defpackage.zkg[] p;

    static {
        defpackage.zkg zkgVar = new defpackage.zkg("BAM_TO_WEAR", 0);
        a = zkgVar;
        defpackage.zkg zkgVar2 = new defpackage.zkg("BAM_TO_PHONE", 1);
        b = zkgVar2;
        defpackage.zkg zkgVar3 = new defpackage.zkg("ECHO_TO_WEAR", 2);
        c = zkgVar3;
        defpackage.zkg zkgVar4 = new defpackage.zkg("ECHO_TO_PHONE", 3);
        d = zkgVar4;
        defpackage.zkg zkgVar5 = new defpackage.zkg("SHARPIE_TO_WEAR", 4);
        e = zkgVar5;
        defpackage.zkg zkgVar6 = new defpackage.zkg("BEESLY_TO_WEAR", 5);
        f = zkgVar6;
        defpackage.zkg zkgVar7 = new defpackage.zkg("BEESLY_TO_PHONE", 6);
        g = zkgVar7;
        defpackage.zkg zkgVar8 = new defpackage.zkg("CALL_BACKGROUND_TO_WEAR", 7);
        h = zkgVar8;
        defpackage.zkg zkgVar9 = new defpackage.zkg("WINKY_TO_WEAR", 8);
        i = zkgVar9;
        defpackage.zkg zkgVar10 = new defpackage.zkg("WINKY_TO_PHONE", 9);
        j = zkgVar10;
        defpackage.zkg zkgVar11 = new defpackage.zkg("DOBBY_PROXY_TO_PHONE", 10);
        k = zkgVar11;
        defpackage.zkg zkgVar12 = new defpackage.zkg("SIMULATED_RINGING_TO_WEAR", 11);
        l = zkgVar12;
        defpackage.zkg zkgVar13 = new defpackage.zkg("SIMULATED_RINGING_TO_PHONE", 12);
        m = zkgVar13;
        defpackage.zkg zkgVar14 = new defpackage.zkg("SWITCH_AUDIO_ON_PHONE", 13);
        n = zkgVar14;
        defpackage.zkg zkgVar15 = new defpackage.zkg("INCALLFEATUREDATA_NOT_SET", 14);
        o = zkgVar15;
        p = new defpackage.zkg[]{zkgVar, zkgVar2, zkgVar3, zkgVar4, zkgVar5, zkgVar6, zkgVar7, zkgVar8, zkgVar9, zkgVar10, zkgVar11, zkgVar12, zkgVar13, zkgVar14, zkgVar15};
    }

    public static defpackage.zkg a(int i2) {
        switch (i2) {
            case 0:
                return o;
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
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return j;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return k;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return l;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return m;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return n;
            default:
                return null;
        }
    }

    public static defpackage.zkg[] values() {
        return (defpackage.zkg[]) p.clone();
    }
}

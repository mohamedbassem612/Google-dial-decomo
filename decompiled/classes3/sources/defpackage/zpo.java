package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zpo {
    public static final defpackage.zpo a;
    public static final defpackage.zpo b;
    public static final defpackage.zpo c;
    public static final defpackage.zpo d;
    public static final defpackage.zpo e;
    public static final defpackage.zpo f;
    public static final defpackage.zpo g;
    public static final defpackage.zpo h;
    public static final defpackage.zpo i;
    public static final defpackage.zpo j;
    public static final defpackage.zpo k;
    public static final defpackage.zpo l;
    private static final /* synthetic */ defpackage.zpo[] m;

    static {
        defpackage.zpo zpoVar = new defpackage.zpo("UNKNOWN", 0);
        a = zpoVar;
        defpackage.zpo zpoVar2 = new defpackage.zpo("NEW", 1);
        b = zpoVar2;
        defpackage.zpo zpoVar3 = new defpackage.zpo("DIALING", 2);
        c = zpoVar3;
        defpackage.zpo zpoVar4 = new defpackage.zpo("RINGING", 3);
        d = zpoVar4;
        defpackage.zpo zpoVar5 = new defpackage.zpo("HOLDING", 4);
        e = zpoVar5;
        defpackage.zpo zpoVar6 = new defpackage.zpo("ACTIVE", 5);
        f = zpoVar6;
        defpackage.zpo zpoVar7 = new defpackage.zpo("DISCONNECTED", 6);
        g = zpoVar7;
        defpackage.zpo zpoVar8 = new defpackage.zpo("SELECT_PHONE_ACCOUNT", 7);
        h = zpoVar8;
        defpackage.zpo zpoVar9 = new defpackage.zpo("CONNECTING", 8);
        i = zpoVar9;
        defpackage.zpo zpoVar10 = new defpackage.zpo("DISCONNECTING", 9);
        j = zpoVar10;
        defpackage.zpo zpoVar11 = new defpackage.zpo("PULLING_CALL", 10);
        k = zpoVar11;
        defpackage.zpo zpoVar12 = new defpackage.zpo("AUDIO_PROCESSING", 11);
        l = zpoVar12;
        m = new defpackage.zpo[]{zpoVar, zpoVar2, zpoVar3, zpoVar4, zpoVar5, zpoVar6, zpoVar7, zpoVar8, zpoVar9, zpoVar10, zpoVar11, zpoVar12};
    }

    public static defpackage.zpo a(int i2) {
        switch (i2) {
            case 0:
                return b;
            case 1:
                return c;
            case 2:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return d;
            case 3:
                return e;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return f;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            default:
                return a;
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
        }
    }

    public static defpackage.zpo[] values() {
        return (defpackage.zpo[]) m.clone();
    }
}

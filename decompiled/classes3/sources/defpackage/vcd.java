package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vcd {
    public static final defpackage.vcd a;
    public static final defpackage.vcd b;
    public static final defpackage.vcd c;
    public static final defpackage.vcd d;
    public static final defpackage.vcd e;
    public static final defpackage.vcd f;
    public static final defpackage.vcd g;
    public static final defpackage.vcd h;
    public static final defpackage.vcd i;
    public static final defpackage.vcd j;
    public static final defpackage.vcd k;
    public static final defpackage.vcd l;
    private static final /* synthetic */ defpackage.vcd[] m;

    static {
        defpackage.vcd vcdVar = new defpackage.vcd("ACTIVATE", 0);
        a = vcdVar;
        defpackage.vcd vcdVar2 = new defpackage.vcd("DEACTIVATE", 1);
        b = vcdVar2;
        defpackage.vcd vcdVar3 = new defpackage.vcd("DOWNLOAD_ACTIVE_GREETING", 2);
        c = vcdVar3;
        defpackage.vcd vcdVar4 = new defpackage.vcd("SYNC", 3);
        d = vcdVar4;
        defpackage.vcd vcdVar5 = new defpackage.vcd("UPDATE_STATUS", 4);
        e = vcdVar5;
        defpackage.vcd vcdVar6 = new defpackage.vcd("CHANGE_PIN", 5);
        f = vcdVar6;
        defpackage.vcd vcdVar7 = new defpackage.vcd("SYNC_VOICEMAIL", 6);
        g = vcdVar7;
        defpackage.vcd vcdVar8 = new defpackage.vcd("UPLOAD_GREETING", 7);
        h = vcdVar8;
        defpackage.vcd vcdVar9 = new defpackage.vcd("DOWNLOAD_AUDIO", 8);
        i = vcdVar9;
        defpackage.vcd vcdVar10 = new defpackage.vcd("DELETE_ALL_GREETINGS", 9);
        j = vcdVar10;
        defpackage.vcd vcdVar11 = new defpackage.vcd("INSERT_STATUS", 10);
        k = vcdVar11;
        defpackage.vcd vcdVar12 = new defpackage.vcd("ACTION_NOT_SET", 11);
        l = vcdVar12;
        m = new defpackage.vcd[]{vcdVar, vcdVar2, vcdVar3, vcdVar4, vcdVar5, vcdVar6, vcdVar7, vcdVar8, vcdVar9, vcdVar10, vcdVar11, vcdVar12};
    }

    public static defpackage.vcd a(int i2) {
        if (i2 == 16) {
            return k;
        }
        switch (i2) {
            case 0:
                return l;
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
            default:
                return null;
        }
    }

    public static defpackage.vcd[] values() {
        return (defpackage.vcd[]) m.clone();
    }
}

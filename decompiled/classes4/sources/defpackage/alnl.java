package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alnl {
    public static final defpackage.alnl a;
    public static final defpackage.alnl b;
    public static final defpackage.alnl c;
    public static final defpackage.alnl d;
    public static final defpackage.alnl e;
    private static final /* synthetic */ defpackage.alnl[] f;

    static {
        defpackage.alnl alnlVar = new defpackage.alnl("HUMAN_INTENT_EXTRACTION", 0);
        a = alnlVar;
        defpackage.alnl alnlVar2 = new defpackage.alnl("BOT_INTENT_EXTRACTION", 1);
        b = alnlVar2;
        defpackage.alnl alnlVar3 = new defpackage.alnl("OPTIONS_EXTRACTION", 2);
        c = alnlVar3;
        defpackage.alnl alnlVar4 = new defpackage.alnl("GENERATED_BOT_INTENT_EXTRACTION", 3);
        d = alnlVar4;
        defpackage.alnl alnlVar5 = new defpackage.alnl("EXTRACTION_NOT_SET", 4);
        e = alnlVar5;
        f = new defpackage.alnl[]{alnlVar, alnlVar2, alnlVar3, alnlVar4, alnlVar5};
    }

    public static defpackage.alnl a(int i) {
        if (i == 0) {
            return e;
        }
        switch (i) {
            case 7:
                return a;
            case 8:
                return b;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return c;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return d;
            default:
                return null;
        }
    }

    public static defpackage.alnl[] values() {
        return (defpackage.alnl[]) f.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsv {
    public static final defpackage.alsv a;
    public static final defpackage.alsv b;
    public static final defpackage.alsv c;
    public static final defpackage.alsv d;
    private static final /* synthetic */ defpackage.alsv[] e;

    static {
        defpackage.alsv alsvVar = new defpackage.alsv("RECORDING", 0);
        a = alsvVar;
        defpackage.alsv alsvVar2 = new defpackage.alsv("TTS_REQUEST", 1);
        b = alsvVar2;
        defpackage.alsv alsvVar3 = new defpackage.alsv("DTMF_TONE_REQUEST", 2);
        c = alsvVar3;
        defpackage.alsv alsvVar4 = new defpackage.alsv("REQUEST_NOT_SET", 3);
        d = alsvVar4;
        e = new defpackage.alsv[]{alsvVar, alsvVar2, alsvVar3, alsvVar4};
    }

    public static defpackage.alsv a(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i != 3) {
            return null;
        }
        return c;
    }

    public static defpackage.alsv[] values() {
        return (defpackage.alsv[]) e.clone();
    }
}

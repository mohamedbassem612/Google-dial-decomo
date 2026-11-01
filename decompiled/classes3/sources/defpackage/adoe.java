package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adoe {
    public static final defpackage.adoe a;
    public static final defpackage.adoe b;
    public static final defpackage.adoe c;
    public static final defpackage.adoe d;
    public static final defpackage.adoe e;
    private static final /* synthetic */ defpackage.adoe[] f;

    static {
        defpackage.adoe adoeVar = new defpackage.adoe("SPEECH_REC_FAILED", 0);
        a = adoeVar;
        defpackage.adoe adoeVar2 = new defpackage.adoe("AUDIO_RECORDING_ERROR", 1);
        b = adoeVar2;
        defpackage.adoe adoeVar3 = new defpackage.adoe("PLAYBACK_ERROR", 2);
        c = adoeVar3;
        defpackage.adoe adoeVar4 = new defpackage.adoe("AUDIO_GENERATION_ERROR", 3);
        d = adoeVar4;
        defpackage.adoe adoeVar5 = new defpackage.adoe("INTERNAL", 4);
        e = adoeVar5;
        f = new defpackage.adoe[]{adoeVar, adoeVar2, adoeVar3, adoeVar4, adoeVar5};
    }

    public static defpackage.adoe[] values() {
        return (defpackage.adoe[]) f.clone();
    }
}

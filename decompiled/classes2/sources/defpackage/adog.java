package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adog {
    public static final defpackage.adog a;
    public static final defpackage.adog b;
    public static final defpackage.adog c;
    private static final /* synthetic */ defpackage.adog[] d;

    static {
        defpackage.adog adogVar = new defpackage.adog("VOICE_CALL", 0);
        a = adogVar;
        defpackage.adog adogVar2 = new defpackage.adog("VOICE_CALL_HD", 1);
        b = adogVar2;
        defpackage.adog adogVar3 = new defpackage.adog("VOIP", 2);
        c = adogVar3;
        d = new defpackage.adog[]{adogVar, adogVar2, adogVar3};
    }

    public static defpackage.adog[] values() {
        return (defpackage.adog[]) d.clone();
    }
}

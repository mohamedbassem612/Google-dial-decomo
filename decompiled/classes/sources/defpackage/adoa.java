package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adoa {
    public static final defpackage.adoa a;
    public static final defpackage.adoa b;
    public static final defpackage.adoa c;
    private static final /* synthetic */ defpackage.adoa[] d;

    static {
        defpackage.adoa adoaVar = new defpackage.adoa("VOICE_CALL", 0);
        a = adoaVar;
        defpackage.adoa adoaVar2 = new defpackage.adoa("VOICE_CALL_AUTO", 1);
        b = adoaVar2;
        defpackage.adoa adoaVar3 = new defpackage.adoa("VOICE_CALL_TULIP", 2);
        c = adoaVar3;
        d = new defpackage.adoa[]{adoaVar, adoaVar2, adoaVar3};
    }

    public static defpackage.adoa[] values() {
        return (defpackage.adoa[]) d.clone();
    }
}

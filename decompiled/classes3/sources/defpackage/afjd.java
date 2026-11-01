package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjd {
    public static final defpackage.afjd a;
    public static final defpackage.afjd b;
    public static final defpackage.afjd c;
    public static final defpackage.afjd d;
    public static final defpackage.afjd e;
    private static final /* synthetic */ defpackage.afjd[] f;

    static {
        defpackage.afjd afjdVar = new defpackage.afjd("BACKEND_TIMEOUT", 0);
        a = afjdVar;
        defpackage.afjd afjdVar2 = new defpackage.afjd("FAILED_TO_FETCH_SURVEY", 1);
        b = afjdVar2;
        defpackage.afjd afjdVar3 = new defpackage.afjd("NO_AVAILABLE_SURVEY", 2);
        c = afjdVar3;
        defpackage.afjd afjdVar4 = new defpackage.afjd("TRIGGER_ID_NOT_SET", 3);
        d = afjdVar4;
        defpackage.afjd afjdVar5 = new defpackage.afjd("UNSUPPORTED_CRONET_ENGINE", 4);
        e = afjdVar5;
        f = new defpackage.afjd[]{afjdVar, afjdVar2, afjdVar3, afjdVar4, afjdVar5};
    }

    public static defpackage.afjd[] values() {
        return (defpackage.afjd[]) f.clone();
    }
}

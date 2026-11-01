package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvd {
    public static final defpackage.nvd a;
    public static final defpackage.nvd b;
    public static final defpackage.nvd c;
    private static final /* synthetic */ defpackage.nvd[] d;

    static {
        defpackage.nvd nvdVar = new defpackage.nvd("LIFECYCLE_STATE_TRANSITIONED", 0);
        a = nvdVar;
        defpackage.nvd nvdVar2 = new defpackage.nvd("NEW_CONVERSATION_STATE_RECEIVED", 1);
        b = nvdVar2;
        defpackage.nvd nvdVar3 = new defpackage.nvd("EVENT_NOT_SET", 2);
        c = nvdVar3;
        d = new defpackage.nvd[]{nvdVar, nvdVar2, nvdVar3};
    }

    public static defpackage.nvd[] values() {
        return (defpackage.nvd[]) d.clone();
    }
}

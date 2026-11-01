package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adol {
    public static final defpackage.adol a;
    public static final defpackage.adol b;
    private static final /* synthetic */ defpackage.adol[] c;

    static {
        defpackage.adol adolVar = new defpackage.adol("SPEECH", 0);
        a = adolVar;
        defpackage.adol adolVar2 = new defpackage.adol("NONSPEECH", 1);
        b = adolVar2;
        c = new defpackage.adol[]{adolVar, adolVar2};
    }

    public static defpackage.adol[] values() {
        return (defpackage.adol[]) c.clone();
    }
}

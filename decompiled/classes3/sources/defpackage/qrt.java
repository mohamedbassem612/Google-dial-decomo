package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qrt {
    public static final defpackage.qrt a;
    public static final defpackage.qrt b;
    private static final /* synthetic */ defpackage.qrt[] c;

    static {
        defpackage.qrt qrtVar = new defpackage.qrt("BLURRED_IMAGE_TYPE_LOCAL_OFF", 0);
        a = qrtVar;
        defpackage.qrt qrtVar2 = new defpackage.qrt("BLURRED_IMAGE_TYPE_REMOTE_OFF", 1);
        b = qrtVar2;
        c = new defpackage.qrt[]{qrtVar, qrtVar2};
    }

    public static defpackage.qrt[] values() {
        return (defpackage.qrt[]) c.clone();
    }
}

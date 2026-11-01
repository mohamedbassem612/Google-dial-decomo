package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acuv {
    public static final defpackage.acuv a;
    public static final defpackage.acuv b;
    public static final defpackage.acuv c;
    private static final /* synthetic */ defpackage.acuv[] d;

    static {
        defpackage.acuv acuvVar = new defpackage.acuv("SUCCESS", 0);
        a = acuvVar;
        defpackage.acuv acuvVar2 = new defpackage.acuv("FAILURE", 1);
        b = acuvVar2;
        defpackage.acuv acuvVar3 = new defpackage.acuv("FAILURE_KEEP_PENDING", 2);
        c = acuvVar3;
        d = new defpackage.acuv[]{acuvVar, acuvVar2, acuvVar3};
    }

    public static defpackage.acuv[] values() {
        return (defpackage.acuv[]) d.clone();
    }
}

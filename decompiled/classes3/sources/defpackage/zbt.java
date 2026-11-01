package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zbt {
    public static final defpackage.zbt a;
    public static final defpackage.zbt b;
    public static final defpackage.zbt c;
    private static final /* synthetic */ defpackage.zbt[] d;

    static {
        defpackage.zbt zbtVar = new defpackage.zbt("UNKNOWN", 0);
        a = zbtVar;
        defpackage.zbt zbtVar2 = new defpackage.zbt("TEST_EVENT", 1);
        b = zbtVar2;
        defpackage.zbt zbtVar3 = new defpackage.zbt("SCAM_DETECTION_ON_SCAM_DETECTED", 2);
        c = zbtVar3;
        defpackage.zbt[] zbtVarArr = {zbtVar, zbtVar2, zbtVar3};
        d = zbtVarArr;
        ajsz.am(zbtVarArr);
    }

    public static defpackage.zbt[] values() {
        return (defpackage.zbt[]) d.clone();
    }
}

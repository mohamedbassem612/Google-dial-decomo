package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmv {
    public static final defpackage.mmv a;
    public static final defpackage.mmv b;
    public static final defpackage.mmv c;
    private static final /* synthetic */ defpackage.mmv[] d;

    static {
        defpackage.mmv mmvVar = new defpackage.mmv("UNKNOWN", 0);
        a = mmvVar;
        defpackage.mmv mmvVar2 = new defpackage.mmv("DECLINED", 1);
        b = mmvVar2;
        defpackage.mmv mmvVar3 = new defpackage.mmv("MISSED", 2);
        c = mmvVar3;
        defpackage.mmv[] mmvVarArr = {mmvVar, mmvVar2, mmvVar3};
        d = mmvVarArr;
        ajsz.am(mmvVarArr);
    }

    public static defpackage.mmv[] values() {
        return (defpackage.mmv[]) d.clone();
    }
}

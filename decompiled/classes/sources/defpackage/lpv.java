package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lpv {
    public static final defpackage.lpv a;
    public static final defpackage.lpv b;
    public static final defpackage.lpv c;
    private static final /* synthetic */ defpackage.lpv[] d;

    static {
        defpackage.lpv lpvVar = new defpackage.lpv("SMALL", 0);
        a = lpvVar;
        defpackage.lpv lpvVar2 = new defpackage.lpv("NORMAL", 1);
        b = lpvVar2;
        defpackage.lpv lpvVar3 = new defpackage.lpv("LARGE", 2);
        c = lpvVar3;
        defpackage.lpv[] lpvVarArr = {lpvVar, lpvVar2, lpvVar3};
        d = lpvVarArr;
        defpackage.ajsz.am(lpvVarArr);
    }

    public static defpackage.lpv[] values() {
        return (defpackage.lpv[]) d.clone();
    }
}

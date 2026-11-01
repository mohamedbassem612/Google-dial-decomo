package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abra {
    public static final defpackage.abra a;
    public static final defpackage.abra b;
    public static final defpackage.abra c;
    private static final /* synthetic */ defpackage.abra[] d;

    static {
        defpackage.abra abraVar = new defpackage.abra("LOG_ERROR", 0);
        a = abraVar;
        defpackage.abra abraVar2 = new defpackage.abra("REPORT_STRICT_MODE_VIOLATION", 1);
        b = abraVar2;
        defpackage.abra abraVar3 = new defpackage.abra("CRASH_APP", 2);
        c = abraVar3;
        d = new defpackage.abra[]{abraVar, abraVar2, abraVar3};
    }

    public static defpackage.abra[] values() {
        return (defpackage.abra[]) d.clone();
    }
}

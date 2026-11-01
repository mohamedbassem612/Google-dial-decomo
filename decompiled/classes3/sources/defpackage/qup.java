package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qup {
    public static final defpackage.qup a;
    public static final defpackage.qup b;
    public static final defpackage.qup c;
    private static final /* synthetic */ defpackage.qup[] d;

    static {
        defpackage.qup qupVar = new defpackage.qup("SMALL", 0);
        a = qupVar;
        defpackage.qup qupVar2 = new defpackage.qup("LARGE", 1);
        b = qupVar2;
        defpackage.qup qupVar3 = new defpackage.qup("TAKEOVER", 2);
        c = qupVar3;
        d = new defpackage.qup[]{qupVar, qupVar2, qupVar3};
    }

    public static defpackage.qup[] values() {
        return (defpackage.qup[]) d.clone();
    }
}

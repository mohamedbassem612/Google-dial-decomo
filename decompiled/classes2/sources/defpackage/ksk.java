package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksk {
    public static final defpackage.ksk a;
    public static final defpackage.ksk b;
    private static final /* synthetic */ defpackage.ksk[] c;

    static {
        defpackage.ksk kskVar = new defpackage.ksk("THUMBS_UP", 0);
        a = kskVar;
        defpackage.ksk kskVar2 = new defpackage.ksk("THUMBS_DOWN", 1);
        b = kskVar2;
        defpackage.ksk[] kskVarArr = {kskVar, kskVar2};
        c = kskVarArr;
        ajsz.am(kskVarArr);
    }

    public static defpackage.ksk[] values() {
        return (defpackage.ksk[]) c.clone();
    }
}

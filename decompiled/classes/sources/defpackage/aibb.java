package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aibb {
    public static final defpackage.aibb a;
    public static final defpackage.aibb b;
    public static final defpackage.aibb c;
    private static final /* synthetic */ defpackage.aibb[] d;

    static {
        defpackage.aibb aibbVar = new defpackage.aibb("STRONG", 0);
        a = aibbVar;
        defpackage.aibb aibbVar2 = new defpackage.aibb("SOFT", 1);
        b = aibbVar2;
        defpackage.aibb aibbVar3 = new defpackage.aibb("WEAK", 2);
        c = aibbVar3;
        d = new defpackage.aibb[]{aibbVar, aibbVar2, aibbVar3};
    }

    public static defpackage.aibb[] values() {
        return (defpackage.aibb[]) d.clone();
    }

    final defpackage.ahxt a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return defpackage.ahxr.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return defpackage.ahxs.a;
        }
        throw null;
    }
}

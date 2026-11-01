package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akcs {
    public static final defpackage.akcs a;
    public static final defpackage.akcs b;
    public static final defpackage.akcs c;
    public static final defpackage.akcs d;
    public static final defpackage.akcs e;
    private static final /* synthetic */ defpackage.akcs[] f;

    static {
        defpackage.akcs akcsVar = new defpackage.akcs("NO_USER_DATA", 0);
        a = akcsVar;
        defpackage.akcs akcsVar2 = new defpackage.akcs("SERVER_KNOWN_USER_DATA", 1);
        b = akcsVar2;
        defpackage.akcs akcsVar3 = new defpackage.akcs("NON_TEXTUAL_INTERACTION_USER_DATA", 2);
        c = akcsVar3;
        defpackage.akcs akcsVar4 = new defpackage.akcs("CONFIRMED_UPLOAD_SAFE_USER_DATA", 3);
        d = akcsVar4;
        defpackage.akcs akcsVar5 = new defpackage.akcs("NEW_COLLECTION_USER_DATA", 4);
        e = akcsVar5;
        f = new defpackage.akcs[]{akcsVar, akcsVar2, akcsVar3, akcsVar4, akcsVar5};
    }

    public static defpackage.akcs[] values() {
        return (defpackage.akcs[]) f.clone();
    }
}

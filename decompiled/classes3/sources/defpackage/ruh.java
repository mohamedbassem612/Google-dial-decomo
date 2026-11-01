package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ruh {
    public static final defpackage.ruh a;
    public static final defpackage.ruh b;
    public static final defpackage.ruh c;
    public static final defpackage.ruh d;
    private static final /* synthetic */ defpackage.ruh[] e;

    static {
        defpackage.ruh ruhVar = new defpackage.ruh("INVALID_CODE", 0);
        a = ruhVar;
        defpackage.ruh ruhVar2 = new defpackage.ruh("VALID_CODE_CONFLICTS_WITH_CARRIER_CODES", 1);
        b = ruhVar2;
        defpackage.ruh ruhVar3 = new defpackage.ruh("VALID_CODE_NO_CONFLICTS", 2);
        c = ruhVar3;
        defpackage.ruh ruhVar4 = new defpackage.ruh("UNAUTHORIZED_USER", 3);
        d = ruhVar4;
        e = new defpackage.ruh[]{ruhVar, ruhVar2, ruhVar3, ruhVar4};
    }

    public static defpackage.ruh[] values() {
        return (defpackage.ruh[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zul {
    public static final defpackage.zul a;
    public static final defpackage.zul b;
    public static final defpackage.zul c;
    public static final defpackage.zul d;
    public static final defpackage.zul e;
    private static final /* synthetic */ defpackage.zul[] f;

    static {
        defpackage.zul zulVar = new defpackage.zul("SUCCESS", 0);
        a = zulVar;
        defpackage.zul zulVar2 = new defpackage.zul("NODE_OFFLINE", 1);
        b = zulVar2;
        defpackage.zul zulVar3 = new defpackage.zul("EXCEEDED_MAX_RETRIES", 2);
        c = zulVar3;
        defpackage.zul zulVar4 = new defpackage.zul("ERROR", 3);
        d = zulVar4;
        defpackage.zul zulVar5 = new defpackage.zul("WEAR_API_UNAVAILABLE", 4);
        e = zulVar5;
        f = new defpackage.zul[]{zulVar, zulVar2, zulVar3, zulVar4, zulVar5};
    }

    public static defpackage.zul[] values() {
        return (defpackage.zul[]) f.clone();
    }
}

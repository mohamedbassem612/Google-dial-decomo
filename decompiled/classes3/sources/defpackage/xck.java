package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xck {
    public static final defpackage.xck a;
    public static final defpackage.xck b;
    public static final defpackage.xck c;
    private static final /* synthetic */ defpackage.xck[] d;

    static {
        defpackage.xck xckVar = new defpackage.xck("CONNECTING", 0);
        a = xckVar;
        defpackage.xck xckVar2 = new defpackage.xck("ERROR", 1);
        b = xckVar2;
        defpackage.xck xckVar3 = new defpackage.xck("OFF_HOLD", 2);
        c = xckVar3;
        d = new defpackage.xck[]{xckVar, xckVar2, xckVar3};
    }

    public static defpackage.xck[] values() {
        return (defpackage.xck[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ixc {
    public static final defpackage.ixc a;
    public static final defpackage.ixc b;
    public static final defpackage.ixc c;
    private static final /* synthetic */ defpackage.ixc[] d;

    static {
        defpackage.ixc ixcVar = new defpackage.ixc("BOT_GREETING", 0);
        a = ixcVar;
        defpackage.ixc ixcVar2 = new defpackage.ixc("CUSTOM_GREETING", 1);
        b = ixcVar2;
        defpackage.ixc ixcVar3 = new defpackage.ixc("GREETINGTYPE_NOT_SET", 2);
        c = ixcVar3;
        d = new defpackage.ixc[]{ixcVar, ixcVar2, ixcVar3};
    }

    public static defpackage.ixc a(int i) {
        if (i == 0) {
            return c;
        }
        if (i == 1) {
            return a;
        }
        if (i != 2) {
            return null;
        }
        return b;
    }

    public static defpackage.ixc[] values() {
        return (defpackage.ixc[]) d.clone();
    }
}

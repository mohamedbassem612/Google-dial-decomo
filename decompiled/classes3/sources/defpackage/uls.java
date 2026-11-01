package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uls {
    public static final defpackage.uls a;
    public static final defpackage.uls b;
    public static final defpackage.uls c;
    private static final /* synthetic */ defpackage.uls[] d;

    static {
        defpackage.uls ulsVar = new defpackage.uls("SPAM_DIALOG", 0);
        a = ulsVar;
        defpackage.uls ulsVar2 = new defpackage.uls("NON_SPAM_DIALOG", 1);
        b = ulsVar2;
        defpackage.uls ulsVar3 = new defpackage.uls("TYPE_NOT_SET", 2);
        c = ulsVar3;
        d = new defpackage.uls[]{ulsVar, ulsVar2, ulsVar3};
    }

    public static defpackage.uls a(int i) {
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

    public static defpackage.uls[] values() {
        return (defpackage.uls[]) d.clone();
    }
}

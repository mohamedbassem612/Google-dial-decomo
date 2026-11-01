package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwv {
    public static final defpackage.alwv a;
    public static final defpackage.alwv b;
    public static final defpackage.alwv c;
    private static final /* synthetic */ defpackage.alwv[] d;

    static {
        defpackage.alwv alwvVar = new defpackage.alwv("UTTERANCE", 0);
        a = alwvVar;
        defpackage.alwv alwvVar2 = new defpackage.alwv("ALERT_MESSAGE", 1);
        b = alwvVar2;
        defpackage.alwv alwvVar3 = new defpackage.alwv("ITEM_NOT_SET", 2);
        c = alwvVar3;
        d = new defpackage.alwv[]{alwvVar, alwvVar2, alwvVar3};
    }

    public static defpackage.alwv a(int i) {
        if (i == 0) {
            return c;
        }
        if (i == 3) {
            return a;
        }
        if (i != 4) {
            return null;
        }
        return b;
    }

    public static defpackage.alwv[] values() {
        return (defpackage.alwv[]) d.clone();
    }
}

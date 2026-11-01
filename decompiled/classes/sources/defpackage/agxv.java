package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxv {
    public static final defpackage.agxv a;
    public static final defpackage.agxv b;
    private static final /* synthetic */ defpackage.agxv[] c;

    static {
        defpackage.agxv agxvVar = new defpackage.agxv("LOCAL_STATE_CHANGE", 0);
        a = agxvVar;
        defpackage.agxv agxvVar2 = new defpackage.agxv("REMOTE_STATE_CHANGE", 1);
        b = agxvVar2;
        c = new defpackage.agxv[]{agxvVar, agxvVar2};
    }

    public static defpackage.agxv[] values() {
        return (defpackage.agxv[]) c.clone();
    }
}

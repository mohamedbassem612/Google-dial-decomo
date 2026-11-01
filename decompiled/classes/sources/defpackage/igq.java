package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class igq {
    public static final defpackage.igq a;
    public static final defpackage.igq b;
    public static final defpackage.igq c;
    public static final defpackage.igq d;
    public static final defpackage.igq e;
    public static final defpackage.igq f;
    private static final /* synthetic */ defpackage.igq[] g;

    static {
        defpackage.igq igqVar = new defpackage.igq("AUDIO_QUALITY_MONITOR_CONFIG", 0);
        a = igqVar;
        defpackage.igq igqVar2 = new defpackage.igq("DAREDEVIL_CONFIG", 1);
        b = igqVar2;
        defpackage.igq igqVar3 = new defpackage.igq("DUPLEX_CONFIG", 2);
        c = igqVar3;
        defpackage.igq igqVar4 = new defpackage.igq("SODA_CONFIG", 3);
        d = igqVar4;
        defpackage.igq igqVar5 = new defpackage.igq("ALT_CONFIG", 4);
        e = igqVar5;
        defpackage.igq igqVar6 = new defpackage.igq("CONFIG_NOT_SET", 5);
        f = igqVar6;
        g = new defpackage.igq[]{igqVar, igqVar2, igqVar3, igqVar4, igqVar5, igqVar6};
    }

    public static defpackage.igq a(int i) {
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        if (i != 5) {
            return null;
        }
        return e;
    }

    public static defpackage.igq[] values() {
        return (defpackage.igq[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vcw {
    public static final defpackage.vcw a;
    public static final defpackage.vcw b;
    public static final defpackage.vcw c;
    public static final defpackage.vcw d;
    private static final /* synthetic */ defpackage.vcw[] e;

    static {
        defpackage.vcw vcwVar = new defpackage.vcw("SUCCESS", 0);
        a = vcwVar;
        defpackage.vcw vcwVar2 = new defpackage.vcw("FAILURE", 1);
        b = vcwVar2;
        defpackage.vcw vcwVar3 = new defpackage.vcw("UNATTEMPTED", 2);
        c = vcwVar3;
        defpackage.vcw vcwVar4 = new defpackage.vcw("CANNOT_COMPLETE", 3);
        d = vcwVar4;
        e = new defpackage.vcw[]{vcwVar, vcwVar2, vcwVar3, vcwVar4};
    }

    public static defpackage.vcw[] values() {
        return (defpackage.vcw[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class meg {
    public static final defpackage.meg a;
    public static final defpackage.meg b;
    public static final defpackage.meg c;
    private static final /* synthetic */ defpackage.meg[] d;

    static {
        defpackage.meg megVar = new defpackage.meg("FEATURE_CALLER_ID_AND_SPAM", 0);
        a = megVar;
        defpackage.meg megVar2 = new defpackage.meg("FEATURE_SPAM_BLOCKING", 1);
        b = megVar2;
        defpackage.meg megVar3 = new defpackage.meg("FEATURE_DOBBY", 2);
        c = megVar3;
        defpackage.meg[] megVarArr = {megVar, megVar2, megVar3};
        d = megVarArr;
        defpackage.ajsz.am(megVarArr);
    }

    public static defpackage.meg[] values() {
        return (defpackage.meg[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abhk {
    public static final defpackage.abhk a;
    public static final defpackage.abhk b;
    public static final defpackage.abhk c;
    private static final /* synthetic */ defpackage.abhk[] d;

    static {
        defpackage.abhk abhkVar = new defpackage.abhk("Downloadable", 0);
        a = abhkVar;
        defpackage.abhk abhkVar2 = new defpackage.abhk("Downloading", 1);
        b = abhkVar2;
        defpackage.abhk abhkVar3 = new defpackage.abhk("Downloaded", 2);
        c = abhkVar3;
        defpackage.abhk[] abhkVarArr = {abhkVar, abhkVar2, abhkVar3};
        d = abhkVarArr;
        ajsz.am(abhkVarArr);
    }

    public static defpackage.abhk[] values() {
        return (defpackage.abhk[]) d.clone();
    }
}

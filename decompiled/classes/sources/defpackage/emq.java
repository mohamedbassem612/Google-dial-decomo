package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class emq {
    public static final defpackage.emq a;
    public static final defpackage.emq b;
    public static final defpackage.emq c;
    public static final defpackage.emq d;
    public static final defpackage.emq e;
    private static final /* synthetic */ defpackage.emq[] f;

    static {
        defpackage.emq emqVar = new defpackage.emq("DESTROYED", 0);
        a = emqVar;
        defpackage.emq emqVar2 = new defpackage.emq("INITIALIZED", 1);
        b = emqVar2;
        defpackage.emq emqVar3 = new defpackage.emq("CREATED", 2);
        c = emqVar3;
        defpackage.emq emqVar4 = new defpackage.emq("STARTED", 3);
        d = emqVar4;
        defpackage.emq emqVar5 = new defpackage.emq("RESUMED", 4);
        e = emqVar5;
        defpackage.emq[] emqVarArr = {emqVar, emqVar2, emqVar3, emqVar4, emqVar5};
        f = emqVarArr;
        defpackage.ajsz.am(emqVarArr);
    }

    public static defpackage.emq[] values() {
        return (defpackage.emq[]) f.clone();
    }

    public final boolean a(defpackage.emq emqVar) {
        return compareTo(emqVar) >= 0;
    }
}

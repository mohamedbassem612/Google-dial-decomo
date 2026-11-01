package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuc {
    public static final defpackage.abuc a;
    public static final defpackage.abuc b;
    public static final defpackage.abuc c;
    public static final defpackage.abuc d;
    public static final defpackage.abuc e;
    public static final defpackage.abuc f;
    public static final defpackage.abuc g;
    private static final /* synthetic */ defpackage.abuc[] h;

    static {
        defpackage.abuc abucVar = new defpackage.abuc("IMAGE_GIF", 0);
        a = abucVar;
        defpackage.abuc abucVar2 = new defpackage.abuc("IMAGE_JPEG", 1);
        b = abucVar2;
        defpackage.abuc abucVar3 = new defpackage.abuc("IMAGE_PNG", 2);
        c = abucVar3;
        defpackage.abuc abucVar4 = new defpackage.abuc("IMAGE_WEBP", 3);
        d = abucVar4;
        defpackage.abuc abucVar5 = new defpackage.abuc("IMAGE_AVIF", 4);
        e = abucVar5;
        defpackage.abuc abucVar6 = new defpackage.abuc("VIDEO_MP4", 5);
        f = abucVar6;
        defpackage.abuc abucVar7 = new defpackage.abuc("VIDEO_WEBM", 6);
        g = abucVar7;
        defpackage.abuc[] abucVarArr = {abucVar, abucVar2, abucVar3, abucVar4, abucVar5, abucVar6, abucVar7};
        h = abucVarArr;
        ajsz.am(abucVarArr);
    }

    public static defpackage.abuc[] values() {
        return (defpackage.abuc[]) h.clone();
    }
}

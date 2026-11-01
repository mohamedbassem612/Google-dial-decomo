package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class czt {
    public static final defpackage.czu a;
    public static final defpackage.czu b;
    public static final defpackage.czu c;
    public static final defpackage.czu d;
    public static final defpackage.czu e;
    public static final defpackage.czu f;
    public static final defpackage.czu g;
    public static final defpackage.czu h;
    public static final defpackage.czu i;

    static {
        defpackage.czv czvVar = new defpackage.czv("caption bar");
        a = czvVar;
        defpackage.czv czvVar2 = new defpackage.czv("display cutout");
        b = czvVar2;
        defpackage.czv czvVar3 = new defpackage.czv("ime");
        c = czvVar3;
        defpackage.czv czvVar4 = new defpackage.czv("mandatory system gestures");
        d = czvVar4;
        defpackage.czv czvVar5 = new defpackage.czv("navigation bars");
        e = czvVar5;
        defpackage.czv czvVar6 = new defpackage.czv("status bars");
        f = czvVar6;
        new defpackage.cxd("system bars", new defpackage.czu[]{czvVar6, czvVar5, czvVar});
        defpackage.czv czvVar7 = new defpackage.czv("system gestures");
        g = czvVar7;
        defpackage.czv czvVar8 = new defpackage.czv("tappable element");
        h = czvVar8;
        defpackage.czv czvVar9 = new defpackage.czv("waterfall");
        i = czvVar9;
        new defpackage.cxd("safe drawing", new defpackage.czu[]{czvVar6, czvVar5, czvVar, czvVar2, czvVar3, czvVar8});
        new defpackage.cxd("safe gestures", new defpackage.czu[]{czvVar4, czvVar7, czvVar8, czvVar9});
        new defpackage.cxd("safe content", new defpackage.czu[]{czvVar6, czvVar5, czvVar, czvVar3, czvVar7, czvVar4, czvVar8, czvVar2, czvVar9});
    }
}

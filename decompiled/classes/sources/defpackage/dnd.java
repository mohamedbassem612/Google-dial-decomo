package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnd implements java.lang.Comparable {
    public static final defpackage.dnd a;
    public static final defpackage.dnd b;
    public static final defpackage.dnd c;
    public static final defpackage.dnd d;
    public static final defpackage.dnd e;
    public static final defpackage.dnd f;
    public static final defpackage.dnd g;
    private static final defpackage.dnd i;
    private static final defpackage.dnd j;
    private static final defpackage.dnd k;
    private static final defpackage.dnd l;
    private static final defpackage.dnd m;
    public final int h;

    static {
        defpackage.dnd dndVar = new defpackage.dnd(100);
        i = dndVar;
        defpackage.dnd dndVar2 = new defpackage.dnd(200);
        j = dndVar2;
        defpackage.dnd dndVar3 = new defpackage.dnd(300);
        k = dndVar3;
        defpackage.dnd dndVar4 = new defpackage.dnd(400);
        a = dndVar4;
        defpackage.dnd dndVar5 = new defpackage.dnd(500);
        b = dndVar5;
        defpackage.dnd dndVar6 = new defpackage.dnd(600);
        c = dndVar6;
        defpackage.dnd dndVar7 = new defpackage.dnd(700);
        d = dndVar7;
        defpackage.dnd dndVar8 = new defpackage.dnd(800);
        l = dndVar8;
        defpackage.dnd dndVar9 = new defpackage.dnd(900);
        m = dndVar9;
        e = dndVar4;
        f = dndVar5;
        g = dndVar7;
        defpackage.ajsz.bb(dndVar, dndVar2, dndVar3, dndVar4, dndVar5, dndVar6, dndVar7, dndVar8, dndVar9);
    }

    public dnd(int i2) {
        this.h = i2;
        if (i2 <= 0 || i2 >= 1001) {
            dnv.b(defpackage.a.bj(i2, "Font weight can be in range [1, 1000]. Current value: "));
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.dnd dndVar) {
        return defpackage.aooh.a(this.h, dndVar.h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dnd) && this.h == ((defpackage.dnd) obj).h;
        }
        return true;
    }

    public final int hashCode() {
        return this.h;
    }

    public final java.lang.String toString() {
        return "FontWeight(weight=" + this.h + ')';
    }
}

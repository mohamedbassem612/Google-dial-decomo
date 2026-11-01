package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbd implements agak {
    final int a;
    final agal b;
    final int[][] c;
    final agal[] d;
    final yg e;
    final yg f;
    final yg g;
    final yg h;

    public agbd(defpackage.agbc agbcVar) {
        this.a = agbcVar.a;
        this.b = (agal) agbcVar.b;
        this.c = (int[][]) agbcVar.c;
        this.d = (agal[]) agbcVar.d;
        this.e = (yg) agbcVar.e;
        this.f = (yg) agbcVar.f;
        this.g = (yg) agbcVar.g;
        this.h = (yg) agbcVar.h;
    }

    public static defpackage.agbd f(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !j$.util.Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        return new defpackage.agbc(context, resourceId).a();
    }

    private final int h(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (android.util.StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public final agal a() {
        return g();
    }

    public final agal b(int[] iArr) {
        int iH = h(iArr);
        if (iH < 0) {
            iH = h(android.util.StateSet.WILD_CARD);
        }
        yg ygVar = this.e;
        if (ygVar == null && this.f == null && this.g == null && this.h == null) {
            return this.d[iH];
        }
        aguv aguvVar = new aguv(this.d[iH]);
        if (ygVar != null) {
            aguvVar.d = ygVar.b(iArr);
        }
        yg ygVar2 = this.f;
        if (ygVar2 != null) {
            aguvVar.k = ygVar2.b(iArr);
        }
        yg ygVar3 = this.g;
        if (ygVar3 != null) {
            aguvVar.b = ygVar3.b(iArr);
        }
        yg ygVar4 = this.h;
        if (ygVar4 != null) {
            aguvVar.f = ygVar4.b(iArr);
        }
        return new agal(aguvVar);
    }

    public final agal c(float f) {
        return g().c(f);
    }

    public final boolean d() {
        if (this.a > 1) {
            return true;
        }
        yg ygVar = this.e;
        if (ygVar != null && ygVar.c()) {
            return true;
        }
        yg ygVar2 = this.f;
        if (ygVar2 != null && ygVar2.c()) {
            return true;
        }
        yg ygVar3 = this.g;
        if (ygVar3 != null && ygVar3.c()) {
            return true;
        }
        yg ygVar4 = this.h;
        return ygVar4 != null && ygVar4.c();
    }

    public final agal[] e() {
        return this.d;
    }

    public final agal g() {
        yg ygVar = this.e;
        if (ygVar == null && this.f == null && this.g == null && this.h == null) {
            return this.b;
        }
        aguv aguvVar = new aguv(this.b);
        if (ygVar != null) {
            aguvVar.d = ygVar.b;
        }
        yg ygVar2 = this.f;
        if (ygVar2 != null) {
            aguvVar.k = ygVar2.b;
        }
        yg ygVar3 = this.g;
        if (ygVar3 != null) {
            aguvVar.b = ygVar3.b;
        }
        yg ygVar4 = this.h;
        if (ygVar4 != null) {
            aguvVar.f = ygVar4.b;
        }
        return new agal(aguvVar);
    }
}

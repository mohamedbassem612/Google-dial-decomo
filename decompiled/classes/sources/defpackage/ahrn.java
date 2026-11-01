package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahrn extends java.util.concurrent.atomic.AtomicInteger {
    public static final defpackage.ahrj a;
    public final defpackage.ahrn b;
    public final java.lang.String c;
    public volatile defpackage.ahrk currentMetadata;
    public final java.lang.String d;
    public final java.lang.String e;
    public final long f;
    public final defpackage.ahou g;
    public int h;
    public defpackage.ahrn i;
    public boolean j;
    public volatile long k;
    int l;
    private final int m;

    static {
        defpackage.ahrj ahrmVar;
        try {
            ahrmVar = new defpackage.ahrl();
        } catch (java.lang.Error | java.lang.RuntimeException unused) {
            ahrmVar = new defpackage.ahrm();
        }
        a = ahrmVar;
    }

    public ahrn(defpackage.ahrn ahrnVar, java.lang.String str, int i, long j, defpackage.ahou ahouVar) {
        this.l = 2;
        this.j = false;
        this.k = 0L;
        this.b = ahrnVar.f() ? ahrnVar.b : ahrnVar;
        this.c = str;
        this.h = -1;
        this.d = "B";
        this.e = "a";
        this.m = i;
        this.f = j;
        this.g = ahouVar;
    }

    final int a() {
        defpackage.ahrn ahrnVar = this.b;
        if (ahrnVar == null) {
            return -1;
        }
        return ahrnVar.h;
    }

    public final defpackage.ahop b(boolean z, int i, java.util.Map map, java.util.Map map2) {
        defpackage.akzx akzxVarM = defpackage.ahop.a.m();
        akzxVarM.u();
        defpackage.ahop ahopVar = (defpackage.ahop) akzxVarM.b;
        java.lang.String str = this.c;
        j$.util.Objects.requireNonNull(str);
        ahopVar.b |= 1;
        ahopVar.c = str;
        int i2 = this.h;
        akzxVarM.u();
        defpackage.ahop ahopVar2 = (defpackage.ahop) akzxVarM.b;
        ahopVar2.b |= 2;
        ahopVar2.d = i2;
        akzxVarM.u();
        defpackage.ahop ahopVar3 = (defpackage.ahop) akzxVarM.b;
        ahopVar3.b |= 4;
        ahopVar3.e = i;
        int i3 = this.l;
        akzxVarM.u();
        defpackage.ahop ahopVar4 = (defpackage.ahop) akzxVarM.b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        ahopVar4.l = i4;
        ahopVar4.b |= 512;
        boolean z2 = this.j;
        akzxVarM.u();
        defpackage.ahop ahopVar5 = (defpackage.ahop) akzxVarM.b;
        ahopVar5.b |= 1024;
        ahopVar5.m = z2;
        long j = this.f;
        akzxVarM.u();
        defpackage.ahop ahopVar6 = (defpackage.ahop) akzxVarM.b;
        ahopVar6.b |= 8;
        ahopVar6.f = j / 1000000;
        long j2 = this.k;
        if (j2 != 0) {
            akzxVarM.u();
            defpackage.ahop ahopVar7 = (defpackage.ahop) akzxVarM.b;
            ahopVar7.b |= 32;
            ahopVar7.h = (4611686018427387903L & j2) / 1000000;
            boolean z3 = (j2 & 4611686018427387904L) != 0;
            akzxVarM.u();
            defpackage.ahop ahopVar8 = (defpackage.ahop) akzxVarM.b;
            ahopVar8.b |= 256;
            ahopVar8.k = z3;
        }
        if (z) {
            int i5 = get();
            akzxVarM.u();
            defpackage.ahop ahopVar9 = (defpackage.ahop) akzxVarM.b;
            ahopVar9.b |= 128;
            ahopVar9.j = i5;
        }
        java.lang.String str2 = this.d;
        str2.isEmpty();
        java.lang.String str3 = this.e;
        str3.isEmpty();
        int i6 = this.m;
        if (i6 != 0 && !map.isEmpty() && !map2.isEmpty()) {
            if (map.containsKey(str2)) {
                int iIntValue = ((java.lang.Integer) map.get(str2)).intValue();
                akzxVarM.u();
                defpackage.ahop ahopVar10 = (defpackage.ahop) akzxVarM.b;
                ahopVar10.b |= 2048;
                ahopVar10.n = iIntValue;
            }
            if (map2.containsKey(str3)) {
                int iIntValue2 = ((java.lang.Integer) map2.get(str3)).intValue();
                akzxVarM.u();
                defpackage.ahop ahopVar11 = (defpackage.ahop) akzxVarM.b;
                ahopVar11.b |= 4096;
                ahopVar11.o = iIntValue2;
            }
            akzxVarM.u();
            defpackage.ahop ahopVar12 = (defpackage.ahop) akzxVarM.b;
            ahopVar12.b |= 8192;
            ahopVar12.p = i6;
        }
        return (defpackage.ahop) akzxVarM.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final defpackage.ahou c() {
        defpackage.ahrk ahrkVarA = a.a(this);
        if (ahrkVarA == null) {
            return defpackage.ahot.a;
        }
        defpackage.ahos ahosVarC = defpackage.ahot.a.c();
        while (ahrkVarA != null) {
            ahosVarC.a(ahrkVarA.c, ahrkVarA.a);
            ahrkVarA = ahrkVarA.b;
        }
        return ((defpackage.ahou) ahosVarC).f();
    }

    final void d(int i, defpackage.ahrn ahrnVar) {
        this.h = i;
        this.i = ahrnVar;
    }

    final boolean e() {
        return this.k != 0;
    }

    final boolean f() {
        return this.h < 0;
    }

    public ahrn(java.lang.String str, int i, defpackage.ahou ahouVar, int i2) {
        this.l = 2;
        this.j = false;
        this.k = 0L;
        this.b = null;
        this.c = str;
        this.h = 0;
        this.d = "B";
        this.e = "a";
        this.m = i;
        this.f = 0L;
        this.g = ahouVar;
        this.k = i2 != 2 ? Long.MIN_VALUE : 0L;
    }
}

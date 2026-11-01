package j$.util.stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v7 {
    public static final j$.util.stream.v7 DISTINCT;
    public static final j$.util.stream.v7 ORDERED;
    public static final j$.util.stream.v7 SHORT_CIRCUIT;
    public static final j$.util.stream.v7 SIZED;
    public static final j$.util.stream.v7 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ j$.util.stream.v7[] v;
    public final java.util.EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        j$.util.stream.u7 u7Var = j$.util.stream.u7.SPLITERATOR;
        j$.desugar.sun.nio.fs.g gVarR = r(u7Var);
        j$.util.stream.u7 u7Var2 = j$.util.stream.u7.STREAM;
        gVarR.e(u7Var2);
        j$.util.stream.u7 u7Var3 = j$.util.stream.u7.OP;
        ((java.util.EnumMap) gVarR.b).put(u7Var3, 3);
        j$.util.stream.v7 v7Var = new j$.util.stream.v7("DISTINCT", 0, 0, gVarR);
        DISTINCT = v7Var;
        j$.desugar.sun.nio.fs.g gVarR2 = r(u7Var);
        gVarR2.e(u7Var2);
        ((java.util.EnumMap) gVarR2.b).put(u7Var3, 3);
        j$.util.stream.v7 v7Var2 = new j$.util.stream.v7("SORTED", 1, 1, gVarR2);
        SORTED = v7Var2;
        j$.desugar.sun.nio.fs.g gVarR3 = r(u7Var);
        gVarR3.e(u7Var2);
        java.util.EnumMap enumMap = (java.util.EnumMap) gVarR3.b;
        enumMap.put(u7Var3, 3);
        j$.util.stream.u7 u7Var4 = j$.util.stream.u7.TERMINAL_OP;
        enumMap.put(u7Var4, 2);
        j$.util.stream.u7 u7Var5 = j$.util.stream.u7.UPSTREAM_TERMINAL_OP;
        enumMap.put(u7Var5, 2);
        j$.util.stream.v7 v7Var3 = new j$.util.stream.v7("ORDERED", 2, 2, gVarR3);
        ORDERED = v7Var3;
        j$.desugar.sun.nio.fs.g gVarR4 = r(u7Var);
        gVarR4.e(u7Var2);
        ((java.util.EnumMap) gVarR4.b).put(u7Var3, 2);
        j$.util.stream.v7 v7Var4 = new j$.util.stream.v7("SIZED", 3, 3, gVarR4);
        SIZED = v7Var4;
        j$.desugar.sun.nio.fs.g gVarR5 = r(u7Var3);
        gVarR5.e(u7Var4);
        int i2 = 0;
        j$.util.stream.v7 v7Var5 = new j$.util.stream.v7("SHORT_CIRCUIT", 4, 12, gVarR5);
        SHORT_CIRCUIT = v7Var5;
        v = new j$.util.stream.v7[]{v7Var, v7Var2, v7Var3, v7Var4, v7Var5};
        f = k(u7Var);
        g = k(u7Var2);
        h = k(u7Var3);
        k(u7Var4);
        k(u7Var5);
        for (j$.util.stream.v7 v7Var6 : values()) {
            i2 |= v7Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        j$.util.stream.v7 v7Var7 = DISTINCT;
        m = v7Var7.c;
        n = v7Var7.d;
        j$.util.stream.v7 v7Var8 = SORTED;
        o = v7Var8.c;
        p = v7Var8.d;
        j$.util.stream.v7 v7Var9 = ORDERED;
        q = v7Var9.c;
        r = v7Var9.d;
        j$.util.stream.v7 v7Var10 = SIZED;
        s = v7Var10.c;
        t = v7Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public v7(java.lang.String str, int i2, int i3, j$.desugar.sun.nio.fs.g gVar) {
        super(str, i2);
        java.util.EnumMap enumMap = (java.util.EnumMap) gVar.b;
        for (j$.util.stream.u7 u7Var : j$.util.stream.u7.values()) {
            j$.util.Map.EL.putIfAbsent(enumMap, u7Var, 0);
        }
        this.a = enumMap;
        int i4 = i3 << 1;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int h(int i2, int i3) {
        return (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1)))) | i2;
    }

    public static int k(j$.util.stream.u7 u7Var) {
        int iIntValue = 0;
        for (j$.util.stream.v7 v7Var : values()) {
            iIntValue |= ((java.lang.Integer) v7Var.a.get(u7Var)).intValue() << v7Var.b;
        }
        return iIntValue;
    }

    public static int l(j$.util.Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static j$.desugar.sun.nio.fs.g r(j$.util.stream.u7 u7Var) {
        j$.desugar.sun.nio.fs.g gVar = new j$.desugar.sun.nio.fs.g((byte) 13, new java.util.EnumMap(j$.util.stream.u7.class));
        gVar.e(u7Var);
        return gVar;
    }

    public static j$.util.stream.v7 valueOf(java.lang.String str) {
        return (j$.util.stream.v7) java.lang.Enum.valueOf(j$.util.stream.v7.class, str);
    }

    public static j$.util.stream.v7[] values() {
        return (j$.util.stream.v7[]) v.clone();
    }

    public final boolean p(int i2) {
        return (i2 & this.e) == this.c;
    }
}

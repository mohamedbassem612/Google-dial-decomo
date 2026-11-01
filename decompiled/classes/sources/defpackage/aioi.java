package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum aioi {
    STRING('s', defpackage.aiok.GENERAL, "-#", true),
    BOOLEAN('b', defpackage.aiok.BOOLEAN, "-", true),
    CHAR('c', defpackage.aiok.CHARACTER, "-", true),
    DECIMAL('d', defpackage.aiok.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', defpackage.aiok.INTEGRAL, "-#0(", false),
    HEX('x', defpackage.aiok.INTEGRAL, "-#0(", true),
    FLOAT('f', defpackage.aiok.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', defpackage.aiok.FLOAT, "-#0+ (", true),
    GENERAL('g', defpackage.aiok.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', defpackage.aiok.FLOAT, "-#0+ ", true);

    public static final defpackage.aioi[] k = new defpackage.aioi[26];
    public final char l;
    public final defpackage.aiok m;
    public final int n;
    public final java.lang.String o;

    static {
        for (defpackage.aioi aioiVar : values()) {
            k[(aioiVar.l | ' ') - 97] = aioiVar;
        }
    }

    aioi(char c, defpackage.aiok aiokVar, java.lang.String str, boolean z) {
        this.l = c;
        this.m = aiokVar;
        defpackage.aioj aiojVar = defpackage.aioj.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = defpackage.aioj.a(str.charAt(i2));
            if (iA < 0) {
                throw new java.lang.IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }
}

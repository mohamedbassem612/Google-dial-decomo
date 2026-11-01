package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aiqr {
    public static final defpackage.aiqr a;
    public static final defpackage.aiqr b;
    public static final defpackage.aiqr c;
    public static final defpackage.aiqr d;
    private static final /* synthetic */ defpackage.aiqr[] e;

    static {
        defpackage.aiqr aiqrVar = new defpackage.aiqr("BOOLEAN", 0);
        a = aiqrVar;
        defpackage.aiqr aiqrVar2 = new defpackage.aiqr("STRING", 1);
        b = aiqrVar2;
        defpackage.aiqr aiqrVar3 = new defpackage.aiqr("LONG", 2);
        c = aiqrVar3;
        defpackage.aiqr aiqrVar4 = new defpackage.aiqr("DOUBLE", 3);
        d = aiqrVar4;
        e = new defpackage.aiqr[]{aiqrVar, aiqrVar2, aiqrVar3, aiqrVar4};
    }

    public static defpackage.aiqr a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return b;
        }
        if (obj instanceof java.lang.Boolean) {
            return a;
        }
        if (obj instanceof java.lang.Long) {
            return c;
        }
        if (obj instanceof java.lang.Double) {
            return d;
        }
        throw new java.lang.AssertionError("invalid tag type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
    }

    public static defpackage.aiqr[] values() {
        return (defpackage.aiqr[]) e.clone();
    }
}

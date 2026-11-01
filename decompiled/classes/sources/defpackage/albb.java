package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum albb {
    VOID(java.lang.Void.class),
    INT(java.lang.Integer.class),
    LONG(java.lang.Long.class),
    FLOAT(java.lang.Float.class),
    DOUBLE(java.lang.Double.class),
    BOOLEAN(java.lang.Boolean.class),
    STRING(java.lang.String.class),
    BYTE_STRING(defpackage.akzc.class),
    ENUM(java.lang.Integer.class),
    MESSAGE(java.lang.Object.class);

    public final java.lang.Class k;

    static {
        defpackage.akzc akzcVar = defpackage.akzc.d;
    }

    albb(java.lang.Class cls) {
        this.k = cls;
    }
}

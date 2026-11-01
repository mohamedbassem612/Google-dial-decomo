package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum apyn {
    VOID(java.lang.Void.class),
    INT(java.lang.Integer.class),
    LONG(java.lang.Long.class),
    FLOAT(java.lang.Float.class),
    DOUBLE(java.lang.Double.class),
    BOOLEAN(java.lang.Boolean.class),
    STRING(java.lang.String.class),
    BYTE_STRING(defpackage.apxo.class),
    ENUM(java.lang.Integer.class),
    MESSAGE(java.lang.Object.class);

    public final java.lang.Class k;

    static {
        defpackage.apxo apxoVar = defpackage.apxo.d;
    }

    apyn(java.lang.Class cls) {
        this.k = cls;
    }
}

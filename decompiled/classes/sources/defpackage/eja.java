package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum eja {
    DOUBLE(defpackage.ejb.d, 1),
    FLOAT(defpackage.ejb.c, 5),
    INT64(defpackage.ejb.b, 0),
    UINT64(defpackage.ejb.b, 0),
    INT32(defpackage.ejb.a, 0),
    FIXED64(defpackage.ejb.b, 1),
    FIXED32(defpackage.ejb.a, 5),
    BOOL(defpackage.ejb.e, 0),
    STRING(defpackage.ejb.f, 2),
    GROUP(defpackage.ejb.i, 3),
    MESSAGE(defpackage.ejb.i, 2),
    BYTES(defpackage.ejb.g, 2),
    UINT32(defpackage.ejb.a, 0),
    ENUM(defpackage.ejb.h, 0),
    SFIXED32(defpackage.ejb.a, 5),
    SFIXED64(defpackage.ejb.b, 1),
    SINT32(defpackage.ejb.a, 0),
    SINT64(defpackage.ejb.b, 0);

    public final defpackage.ejb s;
    public final int t;

    eja(defpackage.ejb ejbVar, int i) {
        this.s = ejbVar;
        this.t = i;
    }
}

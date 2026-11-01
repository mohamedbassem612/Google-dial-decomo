package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum alcr {
    DOUBLE(defpackage.alcs.d, 1),
    FLOAT(defpackage.alcs.c, 5),
    INT64(defpackage.alcs.b, 0),
    UINT64(defpackage.alcs.b, 0),
    INT32(defpackage.alcs.a, 0),
    FIXED64(defpackage.alcs.b, 1),
    FIXED32(defpackage.alcs.a, 5),
    BOOL(defpackage.alcs.e, 0),
    STRING(defpackage.alcs.f, 2),
    GROUP(defpackage.alcs.i, 3),
    MESSAGE(defpackage.alcs.i, 2),
    BYTES(defpackage.alcs.g, 2),
    UINT32(defpackage.alcs.a, 0),
    ENUM(defpackage.alcs.h, 0),
    SFIXED32(defpackage.alcs.a, 5),
    SFIXED64(defpackage.alcs.b, 1),
    SINT32(defpackage.alcs.a, 0),
    SINT64(defpackage.alcs.b, 0);

    public final defpackage.alcs s;
    public final int t;

    alcr(defpackage.alcs alcsVar, int i) {
        this.s = alcsVar;
        this.t = i;
    }
}

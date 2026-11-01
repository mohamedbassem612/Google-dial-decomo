package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akzt {
    DOUBLE(0, 1, defpackage.albb.DOUBLE),
    FLOAT(1, 1, defpackage.albb.FLOAT),
    INT64(2, 1, defpackage.albb.LONG),
    UINT64(3, 1, defpackage.albb.LONG),
    INT32(4, 1, defpackage.albb.INT),
    FIXED64(5, 1, defpackage.albb.LONG),
    FIXED32(6, 1, defpackage.albb.INT),
    BOOL(7, 1, defpackage.albb.BOOLEAN),
    STRING(8, 1, defpackage.albb.STRING),
    MESSAGE(9, 1, defpackage.albb.MESSAGE),
    BYTES(10, 1, defpackage.albb.BYTE_STRING),
    UINT32(11, 1, defpackage.albb.INT),
    ENUM(12, 1, defpackage.albb.ENUM),
    SFIXED32(13, 1, defpackage.albb.INT),
    SFIXED64(14, 1, defpackage.albb.LONG),
    SINT32(15, 1, defpackage.albb.INT),
    SINT64(16, 1, defpackage.albb.LONG),
    GROUP(17, 1, defpackage.albb.MESSAGE),
    DOUBLE_LIST(18, 2, defpackage.albb.DOUBLE),
    FLOAT_LIST(19, 2, defpackage.albb.FLOAT),
    INT64_LIST(20, 2, defpackage.albb.LONG),
    UINT64_LIST(21, 2, defpackage.albb.LONG),
    INT32_LIST(22, 2, defpackage.albb.INT),
    FIXED64_LIST(23, 2, defpackage.albb.LONG),
    FIXED32_LIST(24, 2, defpackage.albb.INT),
    BOOL_LIST(25, 2, defpackage.albb.BOOLEAN),
    STRING_LIST(26, 2, defpackage.albb.STRING),
    MESSAGE_LIST(27, 2, defpackage.albb.MESSAGE),
    BYTES_LIST(28, 2, defpackage.albb.BYTE_STRING),
    UINT32_LIST(29, 2, defpackage.albb.INT),
    ENUM_LIST(30, 2, defpackage.albb.ENUM),
    SFIXED32_LIST(31, 2, defpackage.albb.INT),
    SFIXED64_LIST(32, 2, defpackage.albb.LONG),
    SINT32_LIST(33, 2, defpackage.albb.INT),
    SINT64_LIST(34, 2, defpackage.albb.LONG),
    DOUBLE_LIST_PACKED(35, 3, defpackage.albb.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, defpackage.albb.FLOAT),
    INT64_LIST_PACKED(37, 3, defpackage.albb.LONG),
    UINT64_LIST_PACKED(38, 3, defpackage.albb.LONG),
    INT32_LIST_PACKED(39, 3, defpackage.albb.INT),
    FIXED64_LIST_PACKED(40, 3, defpackage.albb.LONG),
    FIXED32_LIST_PACKED(41, 3, defpackage.albb.INT),
    BOOL_LIST_PACKED(42, 3, defpackage.albb.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, defpackage.albb.INT),
    ENUM_LIST_PACKED(44, 3, defpackage.albb.ENUM),
    SFIXED32_LIST_PACKED(45, 3, defpackage.albb.INT),
    SFIXED64_LIST_PACKED(46, 3, defpackage.albb.LONG),
    SINT32_LIST_PACKED(47, 3, defpackage.albb.INT),
    SINT64_LIST_PACKED(48, 3, defpackage.albb.LONG),
    GROUP_LIST(49, 2, defpackage.albb.MESSAGE),
    MAP(50, 4, defpackage.albb.VOID);

    private static final defpackage.akzt[] aa;
    public final int Z;

    static {
        defpackage.akzt[] akztVarArrValues = values();
        aa = new defpackage.akzt[akztVarArrValues.length];
        for (defpackage.akzt akztVar : akztVarArrValues) {
            aa[akztVar.Z] = akztVar;
        }
    }

    akzt(int i, int i2, defpackage.albb albbVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            java.lang.Class cls = albbVar.k;
        }
        if (i2 == 1) {
            defpackage.albb albbVar2 = defpackage.albb.VOID;
            albbVar.ordinal();
        }
    }
}

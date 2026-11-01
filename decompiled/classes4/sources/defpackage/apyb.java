package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum apyb {
    DOUBLE(0, 1, defpackage.apyn.DOUBLE),
    FLOAT(1, 1, defpackage.apyn.FLOAT),
    INT64(2, 1, defpackage.apyn.LONG),
    UINT64(3, 1, defpackage.apyn.LONG),
    INT32(4, 1, defpackage.apyn.INT),
    FIXED64(5, 1, defpackage.apyn.LONG),
    FIXED32(6, 1, defpackage.apyn.INT),
    BOOL(7, 1, defpackage.apyn.BOOLEAN),
    STRING(8, 1, defpackage.apyn.STRING),
    MESSAGE(9, 1, defpackage.apyn.MESSAGE),
    BYTES(10, 1, defpackage.apyn.BYTE_STRING),
    UINT32(11, 1, defpackage.apyn.INT),
    ENUM(12, 1, defpackage.apyn.ENUM),
    SFIXED32(13, 1, defpackage.apyn.INT),
    SFIXED64(14, 1, defpackage.apyn.LONG),
    SINT32(15, 1, defpackage.apyn.INT),
    SINT64(16, 1, defpackage.apyn.LONG),
    GROUP(17, 1, defpackage.apyn.MESSAGE),
    DOUBLE_LIST(18, 2, defpackage.apyn.DOUBLE),
    FLOAT_LIST(19, 2, defpackage.apyn.FLOAT),
    INT64_LIST(20, 2, defpackage.apyn.LONG),
    UINT64_LIST(21, 2, defpackage.apyn.LONG),
    INT32_LIST(22, 2, defpackage.apyn.INT),
    FIXED64_LIST(23, 2, defpackage.apyn.LONG),
    FIXED32_LIST(24, 2, defpackage.apyn.INT),
    BOOL_LIST(25, 2, defpackage.apyn.BOOLEAN),
    STRING_LIST(26, 2, defpackage.apyn.STRING),
    MESSAGE_LIST(27, 2, defpackage.apyn.MESSAGE),
    BYTES_LIST(28, 2, defpackage.apyn.BYTE_STRING),
    UINT32_LIST(29, 2, defpackage.apyn.INT),
    ENUM_LIST(30, 2, defpackage.apyn.ENUM),
    SFIXED32_LIST(31, 2, defpackage.apyn.INT),
    SFIXED64_LIST(32, 2, defpackage.apyn.LONG),
    SINT32_LIST(33, 2, defpackage.apyn.INT),
    SINT64_LIST(34, 2, defpackage.apyn.LONG),
    DOUBLE_LIST_PACKED(35, 3, defpackage.apyn.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, defpackage.apyn.FLOAT),
    INT64_LIST_PACKED(37, 3, defpackage.apyn.LONG),
    UINT64_LIST_PACKED(38, 3, defpackage.apyn.LONG),
    INT32_LIST_PACKED(39, 3, defpackage.apyn.INT),
    FIXED64_LIST_PACKED(40, 3, defpackage.apyn.LONG),
    FIXED32_LIST_PACKED(41, 3, defpackage.apyn.INT),
    BOOL_LIST_PACKED(42, 3, defpackage.apyn.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, defpackage.apyn.INT),
    ENUM_LIST_PACKED(44, 3, defpackage.apyn.ENUM),
    SFIXED32_LIST_PACKED(45, 3, defpackage.apyn.INT),
    SFIXED64_LIST_PACKED(46, 3, defpackage.apyn.LONG),
    SINT32_LIST_PACKED(47, 3, defpackage.apyn.INT),
    SINT64_LIST_PACKED(48, 3, defpackage.apyn.LONG),
    GROUP_LIST(49, 2, defpackage.apyn.MESSAGE),
    MAP(50, 4, defpackage.apyn.VOID);

    private static final defpackage.apyb[] aa;
    public final int Z;

    static {
        defpackage.apyb[] apybVarArrValues = values();
        aa = new defpackage.apyb[apybVarArrValues.length];
        for (defpackage.apyb apybVar : apybVarArrValues) {
            aa[apybVar.Z] = apybVar;
        }
    }

    apyb(int i, int i2, defpackage.apyn apynVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            java.lang.Class cls = apynVar.k;
        }
        if (i2 == 1) {
            defpackage.apyn apynVar2 = defpackage.apyn.VOID;
            apynVar.ordinal();
        }
    }
}

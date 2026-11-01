package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum aqaf implements alah {
    DT_INVALID(0),
    DT_FLOAT(1),
    DT_DOUBLE(2),
    DT_INT32(3),
    DT_UINT8(4),
    DT_INT16(5),
    DT_INT8(6),
    DT_STRING(7),
    DT_COMPLEX64(8),
    DT_INT64(9),
    DT_BOOL(10),
    DT_QINT8(11),
    DT_QUINT8(12),
    DT_QINT32(13),
    DT_BFLOAT16(14),
    DT_QINT16(15),
    DT_QUINT16(16),
    DT_UINT16(17),
    DT_COMPLEX128(18),
    DT_HALF(19),
    DT_RESOURCE(20),
    DT_VARIANT(21),
    DT_UINT32(22),
    DT_UINT64(23),
    DT_FLOAT8_E5M2(24),
    DT_FLOAT8_E4M3FN(25),
    DT_FLOAT8_E4M3FNUZ(26),
    DT_FLOAT8_E4M3B11FNUZ(27),
    DT_FLOAT8_E5M2FNUZ(28),
    DT_INT4(29),
    DT_UINT4(30),
    DT_INT2(31),
    DT_UINT2(32),
    DT_FLOAT4_E2M1FN(33),
    DT_FLOAT8_E8M0FNU(34),
    DT_FLOAT_REF(101),
    DT_DOUBLE_REF(102),
    DT_INT32_REF(103),
    DT_UINT8_REF(104),
    DT_INT16_REF(105),
    DT_INT8_REF(106),
    DT_STRING_REF(107),
    DT_COMPLEX64_REF(108),
    DT_INT64_REF(109),
    DT_BOOL_REF(110),
    DT_QINT8_REF(111),
    DT_QUINT8_REF(112),
    DT_QINT32_REF(113),
    DT_BFLOAT16_REF(114),
    DT_QINT16_REF(115),
    DT_QUINT16_REF(116),
    DT_UINT16_REF(117),
    DT_COMPLEX128_REF(118),
    DT_HALF_REF(119),
    DT_RESOURCE_REF(120),
    DT_VARIANT_REF(121),
    DT_UINT32_REF(122),
    DT_UINT64_REF(123),
    DT_FLOAT8_E5M2_REF(124),
    DT_FLOAT8_E4M3FN_REF(125),
    DT_FLOAT8_E4M3FNUZ_REF(126),
    DT_FLOAT8_E4M3B11FNUZ_REF(127),
    DT_FLOAT8_E5M2FNUZ_REF(128),
    DT_INT4_REF(129),
    DT_UINT4_REF(130),
    DT_INT2_REF(131),
    DT_UINT2_REF(132),
    DT_FLOAT4_E2M1FN_REF(133),
    DT_FLOAT8_E8M0FNU_REF(134),
    UNRECOGNIZED(-1);

    private final int at;

    aqaf(int i) {
        this.at = i;
    }

    public static defpackage.aqaf b(int i) {
        switch (i) {
            case 0:
                return DT_INVALID;
            case 1:
                return DT_FLOAT;
            case 2:
                return DT_DOUBLE;
            case 3:
                return DT_INT32;
            case 4:
                return DT_UINT8;
            case 5:
                return DT_INT16;
            case 6:
                return DT_INT8;
            case 7:
                return DT_STRING;
            case 8:
                return DT_COMPLEX64;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return DT_INT64;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return DT_BOOL;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return DT_QINT8;
            case 12:
                return DT_QUINT8;
            case 13:
                return DT_QINT32;
            case 14:
                return DT_BFLOAT16;
            case 15:
                return DT_QINT16;
            case 16:
                return DT_QUINT16;
            case 17:
                return DT_UINT16;
            case 18:
                return DT_COMPLEX128;
            case 19:
                return DT_HALF;
            case 20:
                return DT_RESOURCE;
            case 21:
                return DT_VARIANT;
            case 22:
                return DT_UINT32;
            case 23:
                return DT_UINT64;
            case 24:
                return DT_FLOAT8_E5M2;
            case 25:
                return DT_FLOAT8_E4M3FN;
            case 26:
                return DT_FLOAT8_E4M3FNUZ;
            case 27:
                return DT_FLOAT8_E4M3B11FNUZ;
            case 28:
                return DT_FLOAT8_E5M2FNUZ;
            case 29:
                return DT_INT4;
            case 30:
                return DT_UINT4;
            case 31:
                return DT_INT2;
            case 32:
                return DT_UINT2;
            case 33:
                return DT_FLOAT4_E2M1FN;
            case 34:
                return DT_FLOAT8_E8M0FNU;
            default:
                switch (i) {
                    case 101:
                        return DT_FLOAT_REF;
                    case 102:
                        return DT_DOUBLE_REF;
                    case 103:
                        return DT_INT32_REF;
                    case 104:
                        return DT_UINT8_REF;
                    case 105:
                        return DT_INT16_REF;
                    case 106:
                        return DT_INT8_REF;
                    case 107:
                        return DT_STRING_REF;
                    case 108:
                        return DT_COMPLEX64_REF;
                    case 109:
                        return DT_INT64_REF;
                    case 110:
                        return DT_BOOL_REF;
                    case 111:
                        return DT_QINT8_REF;
                    case 112:
                        return DT_QUINT8_REF;
                    case 113:
                        return DT_QINT32_REF;
                    case 114:
                        return DT_BFLOAT16_REF;
                    case 115:
                        return DT_QINT16_REF;
                    case 116:
                        return DT_QUINT16_REF;
                    case 117:
                        return DT_UINT16_REF;
                    case 118:
                        return DT_COMPLEX128_REF;
                    case 119:
                        return DT_HALF_REF;
                    case 120:
                        return DT_RESOURCE_REF;
                    case 121:
                        return DT_VARIANT_REF;
                    case 122:
                        return DT_UINT32_REF;
                    case 123:
                        return DT_UINT64_REF;
                    case 124:
                        return DT_FLOAT8_E5M2_REF;
                    case 125:
                        return DT_FLOAT8_E4M3FN_REF;
                    case 126:
                        return DT_FLOAT8_E4M3FNUZ_REF;
                    case 127:
                        return DT_FLOAT8_E4M3B11FNUZ_REF;
                    case 128:
                        return DT_FLOAT8_E5M2FNUZ_REF;
                    case 129:
                        return DT_INT4_REF;
                    case 130:
                        return DT_UINT4_REF;
                    case 131:
                        return DT_INT2_REF;
                    case 132:
                        return DT_UINT2_REF;
                    case 133:
                        return DT_FLOAT4_E2M1FN_REF;
                    case 134:
                        return DT_FLOAT8_E8M0FNU_REF;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.at;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.at);
    }
}

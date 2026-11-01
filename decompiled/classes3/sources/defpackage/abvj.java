package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvj extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ abvp d;
    final /* synthetic */ java.util.List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvj(abvp abvpVar, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.d = abvpVar;
        this.e = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:101:0x01f8 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0202 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0216 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0242 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:141:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014d A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0187 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0193 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0199 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f4 A[Catch: IllegalStateException -> 0x02bb, TryCatch #1 {IllegalStateException -> 0x02bb, blocks: (B:58:0x013f, B:60:0x0143, B:62:0x0147, B:64:0x014d, B:67:0x0159, B:96:0x01e9, B:98:0x01ed, B:99:0x01f4, B:101:0x01f8, B:102:0x0202, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:110:0x022c, B:112:0x0232, B:114:0x023c, B:117:0x0249, B:116:0x0242, B:68:0x016f, B:69:0x0174, B:70:0x0175, B:71:0x017a, B:72:0x017b, B:73:0x0180, B:74:0x0181, B:75:0x0186, B:76:0x0187, B:79:0x018f, B:81:0x0193, B:83:0x0199, B:86:0x01a5, B:87:0x01be, B:88:0x01c3, B:89:0x01c4, B:90:0x01c9, B:91:0x01ca, B:92:0x01d1, B:93:0x01d2, B:94:0x01d7, B:95:0x01d8, B:118:0x0253, B:119:0x0283, B:122:0x0286, B:123:0x029e, B:124:0x029f, B:125:0x02ac, B:126:0x02ad, B:127:0x02ba), top: B:141:0x013f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object objY;
        java.lang.Object obj2;
        ?? r6;
        defpackage.abuw abuwVarI;
        java.lang.Object obj3;
        int i;
        java.util.Iterator it;
        defpackage.abuo abukVar;
        defpackage.abuw abuwVar;
        int iG;
        defpackage.abtx abuqVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strZ;
        java.lang.String strZ2;
        java.lang.String str3;
        java.lang.String str4;
        java.sql.Timestamp timestampA;
        java.lang.Long lValueOf;
        java.lang.String str5;
        java.lang.String str6;
        java.sql.Timestamp timestampA2;
        java.lang.Long lValueOf2;
        aolu aoluVar = aolu.a;
        int i2 = 1;
        defpackage.abuw abuwVar2 = null;
        if (this.c != 0) {
            obj2 = this.b;
            java.lang.Object obj4 = this.a;
            aooc.af(obj);
            r6 = obj4;
            objY = obj;
        } else {
            aooc.af(obj);
            abvp abvpVar = this.d;
            if (!abvpVar.g()) {
                return ajsz.aY(new defpackage.abui(defpackage.abuf.n, null));
            }
            java.util.List listE = abvpVar.e(this.e);
            defpackage.afpl afplVar = new defpackage.afpl(abvpVar.b, (byte[]) null, (byte[]) null);
            aarf aarfVar = abvpVar.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listE, 10));
            java.util.Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                arrayList.add(((defpackage.abuw) it2.next()).a());
            }
            aaum aaumVarE = aarfVar.e(arrayList);
            this.a = listE;
            this.b = afplVar;
            this.c = 1;
            objY = aooh.Y(aaumVarE, this);
            if (objY == aoluVar) {
                return aoluVar;
            }
            obj2 = afplVar;
            r6 = listE;
        }
        aooh.e(objY, "await(...)");
        java.util.List listCc = ajsz.cc((java.lang.Iterable) objY, (java.lang.Iterable) r6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listCc, 10));
        java.util.Iterator it3 = listCc.iterator();
        while (it3.hasNext()) {
            aoiu aoiuVar = (aoiu) it3.next();
            com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse getCallingCardsByIdentifierResponse = (com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse) aoiuVar.a;
            defpackage.abuw abuwVar3 = (defpackage.abuw) aoiuVar.b;
            defpackage.abuf abufVarK = abts.k(getCallingCardsByIdentifierResponse.a.a);
            try {
                abuwVarI = abts.i(getCallingCardsByIdentifierResponse.h, getCallingCardsByIdentifierResponse.f);
            } catch (java.lang.IllegalStateException unused) {
                abuwVarI = abuwVar2;
            }
            if (abuwVarI == null) {
                abvp.a.d().l("com/google/android/libraries/contacts/callingcard/impl/CallingCardRepositoryV2Impl", "getCallingCards$<anonymous>$<anonymous>$<anonymous>", 431, "CallingCardRepositoryV2Impl.kt").y("Missing identifier in getCallingCards response with status %s.", abufVarK);
                if (abufVarK == defpackage.abuf.l) {
                    abufVarK = defpackage.abuf.p;
                }
                abukVar = new defpackage.abuk(abuwVar3, abufVarK, new java.lang.IllegalStateException("Missing identifier in getCallingCards response"));
                obj3 = obj2;
                it = it3;
                i = i2;
                abuwVar = abuwVar2;
            } else if (abufVarK == defpackage.abuf.l) {
                try {
                    aooh.c(getCallingCardsByIdentifierResponse);
                    aooh.f(getCallingCardsByIdentifierResponse, "response");
                    android.net.Uri uri = getCallingCardsByIdentifierResponse.c;
                    if (uri == null) {
                        throw new java.lang.IllegalStateException("File uri not found.");
                    }
                    com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata = getCallingCardsByIdentifierResponse.d;
                    if (metadata == null) {
                        throw new java.lang.IllegalStateException("Metadata not found.");
                    }
                    com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier = getCallingCardsByIdentifierResponse.h;
                    java.lang.String str7 = getCallingCardsByIdentifierResponse.f;
                    defpackage.abuw abuwVarI2 = abts.i(identifier, str7);
                    if (abuwVarI2 == null) {
                        java.util.Objects.toString(identifier);
                        throw new java.lang.IllegalStateException("Invalid or null identifier found: ".concat(java.lang.String.valueOf(identifier)));
                    }
                    defpackage.abup abupVar = defpackage.abup.UNKNOWN;
                    defpackage.abup abupVarJ = abts.j(getCallingCardsByIdentifierResponse.b);
                    int iG2 = abts.g(abuwVarI2);
                    obj3 = obj2;
                    if (iG2 == 0) {
                        if (abupVarJ != defpackage.abup.CONTACT) {
                            java.lang.String simpleName = abuwVarI2.getClass().getSimpleName();
                            java.lang.String strName = abupVarJ.name();
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = simpleName;
                            objArr[i2] = strName;
                            java.lang.String str8 = java.lang.String.format("Mismatch found between IdentifierType and CallingCardType. identifierType = %s, callingCardType = %s", java.util.Arrays.copyOf(objArr, 2));
                            aooh.e(str8, "format(...)");
                            throw new java.lang.IllegalStateException(str8.toString());
                        }
                        iG = abts.g(abuwVarI2);
                        if (iG != 0) {
                            it = it3;
                            if (iG != i2) {
                                i = i2;
                                if (iG != 2) {
                                    throw new aois();
                                }
                                str5 = getCallingCardsByIdentifierResponse.e;
                                if (str5 == null) {
                                    throw new java.lang.IllegalStateException("Owner Id not found");
                                }
                                str6 = getCallingCardsByIdentifierResponse.i;
                                if (str6 == null) {
                                    throw new java.lang.IllegalStateException("photoToken not found");
                                }
                                timestampA2 = getCallingCardsByIdentifierResponse.a();
                                if (timestampA2 != null) {
                                    lValueOf2 = java.lang.Long.valueOf(timestampA2.getTime());
                                } else {
                                    lValueOf2 = null;
                                }
                                if (lValueOf2 == null) {
                                    throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                }
                                abuqVar = new defpackage.abvc((defpackage.abut) abuwVarI2, uri, abts.d(metadata), str5, str6, lValueOf2.longValue());
                            } else {
                                i = i2;
                                str3 = getCallingCardsByIdentifierResponse.e;
                                if (str3 == null) {
                                    throw new java.lang.IllegalStateException("Owner Id not found");
                                }
                                if (str7 == null) {
                                    throw new java.lang.IllegalStateException("Lookup key not found");
                                }
                                str4 = getCallingCardsByIdentifierResponse.i;
                                if (str4 == null) {
                                    throw new java.lang.IllegalStateException("photoToken not found");
                                }
                                timestampA = getCallingCardsByIdentifierResponse.a();
                                if (timestampA != null) {
                                    lValueOf = java.lang.Long.valueOf(timestampA.getTime());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null) {
                                    throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                }
                                abuqVar = new defpackage.abuz(((defpackage.abuv) abuwVarI2).a, uri, abts.d(metadata), str3, str7, str4, lValueOf.longValue());
                            }
                        } else {
                            it = it3;
                            i = i2;
                            abuqVar = new defpackage.abuq(((defpackage.abuu) abuwVarI2).a, uri, abts.d(metadata));
                        }
                        if (!(abuqVar instanceof defpackage.abuz)) {
                            abukVar = new defpackage.abuj(abuqVar);
                        } else if (abuwVar3 instanceof defpackage.abuv) {
                            str = ((defpackage.abuz) abuqVar).d;
                            str2 = ((defpackage.abuv) abuwVar3).b;
                            aooh.f(str2, "clientLookupKey");
                            if (aooh.n(str, str2)) {
                                abukVar = new defpackage.abuj(abuqVar);
                            } else {
                                abukVar = new defpackage.abuj(abuqVar);
                            }
                        } else {
                            abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.t, null);
                        }
                        abuwVar = null;
                    } else if (iG2 != i2) {
                        if (iG2 != 2) {
                            throw new aois();
                        }
                        try {
                            if (abupVarJ != defpackage.abup.SELF) {
                                java.lang.String simpleName2 = abuwVarI2.getClass().getSimpleName();
                                java.lang.String strName2 = abupVarJ.name();
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[0] = simpleName2;
                                objArr2[i2] = strName2;
                                java.lang.String str9 = java.lang.String.format("Mismatch found between IdentifierType and CallingCardType. identifierType = %s, callingCardType = %s", java.util.Arrays.copyOf(objArr2, 2));
                                aooh.e(str9, "format(...)");
                                throw new java.lang.IllegalStateException(str9.toString());
                            }
                            iG = abts.g(abuwVarI2);
                            if (iG != 0) {
                                it = it3;
                                if (iG != i2) {
                                    i = i2;
                                    if (iG != 2) {
                                        throw new aois();
                                    }
                                    try {
                                        str5 = getCallingCardsByIdentifierResponse.e;
                                        if (str5 == null) {
                                            throw new java.lang.IllegalStateException("Owner Id not found");
                                        }
                                        str6 = getCallingCardsByIdentifierResponse.i;
                                        if (str6 == null) {
                                            throw new java.lang.IllegalStateException("photoToken not found");
                                        }
                                        timestampA2 = getCallingCardsByIdentifierResponse.a();
                                        if (timestampA2 != null) {
                                            lValueOf2 = java.lang.Long.valueOf(timestampA2.getTime());
                                        } else {
                                            lValueOf2 = null;
                                        }
                                        if (lValueOf2 == null) {
                                            throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                        }
                                        abuqVar = new defpackage.abvc((defpackage.abut) abuwVarI2, uri, abts.d(metadata), str5, str6, lValueOf2.longValue());
                                    } catch (java.lang.IllegalStateException e) {
                                        e = e;
                                        abvp.a.d().k(e).l("com/google/android/libraries/contacts/callingcard/impl/CallingCardRepositoryV2Impl", "getCallingCards$<anonymous>$<anonymous>$<anonymous>", 467, "CallingCardRepositoryV2Impl.kt").v("Failed to parse calling card response.");
                                        abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.p, e);
                                    }
                                } else {
                                    i = i2;
                                    str3 = getCallingCardsByIdentifierResponse.e;
                                    if (str3 == null) {
                                        throw new java.lang.IllegalStateException("Owner Id not found");
                                    }
                                    if (str7 == null) {
                                        throw new java.lang.IllegalStateException("Lookup key not found");
                                    }
                                    str4 = getCallingCardsByIdentifierResponse.i;
                                    if (str4 == null) {
                                        throw new java.lang.IllegalStateException("photoToken not found");
                                    }
                                    timestampA = getCallingCardsByIdentifierResponse.a();
                                    if (timestampA != null) {
                                        lValueOf = java.lang.Long.valueOf(timestampA.getTime());
                                    } else {
                                        lValueOf = null;
                                    }
                                    if (lValueOf == null) {
                                        throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                    }
                                    abuqVar = new defpackage.abuz(((defpackage.abuv) abuwVarI2).a, uri, abts.d(metadata), str3, str7, str4, lValueOf.longValue());
                                }
                            } else {
                                it = it3;
                                i = i2;
                                abuqVar = new defpackage.abuq(((defpackage.abuu) abuwVarI2).a, uri, abts.d(metadata));
                            }
                            if (!(abuqVar instanceof defpackage.abuz)) {
                                abukVar = new defpackage.abuj(abuqVar);
                            } else if (abuwVar3 instanceof defpackage.abuv) {
                                abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.t, null);
                            } else {
                                str = ((defpackage.abuz) abuqVar).d;
                                str2 = ((defpackage.abuv) abuwVar3).b;
                                aooh.f(str2, "clientLookupKey");
                                if (aooh.n(str, str2) || !(aoov.H(str) || aoov.H(str2) || (strZ = ((defpackage.afpl) obj3).z(str)) == null || (!aooh.n(strZ, str2) && ((strZ2 = ((defpackage.afpl) obj3).z(str2)) == null || !aooh.n(strZ2, strZ))))) {
                                    abukVar = new defpackage.abuj(abuqVar);
                                } else {
                                    abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.r, null);
                                }
                            }
                            abuwVar = null;
                        } catch (java.lang.IllegalStateException e2) {
                            e = e2;
                            it = it3;
                            i = i2;
                        }
                        e = e2;
                    } else {
                        if (abupVarJ != defpackage.abup.MCC) {
                            java.lang.String simpleName3 = abuwVarI2.getClass().getSimpleName();
                            java.lang.String strName3 = abupVarJ.name();
                            java.lang.Object[] objArr3 = new java.lang.Object[2];
                            objArr3[0] = simpleName3;
                            objArr3[i2] = strName3;
                            java.lang.String str10 = java.lang.String.format("Mismatch found between IdentifierType and CallingCardType. identifierType = %s, callingCardType = %s", java.util.Arrays.copyOf(objArr3, 2));
                            aooh.e(str10, "format(...)");
                            throw new java.lang.IllegalStateException(str10.toString());
                        }
                        iG = abts.g(abuwVarI2);
                        if (iG != 0) {
                            it = it3;
                            if (iG != i2) {
                                i = i2;
                                if (iG != 2) {
                                    throw new aois();
                                }
                                str5 = getCallingCardsByIdentifierResponse.e;
                                if (str5 == null) {
                                    throw new java.lang.IllegalStateException("Owner Id not found");
                                }
                                str6 = getCallingCardsByIdentifierResponse.i;
                                if (str6 == null) {
                                    throw new java.lang.IllegalStateException("photoToken not found");
                                }
                                timestampA2 = getCallingCardsByIdentifierResponse.a();
                                if (timestampA2 != null) {
                                    lValueOf2 = java.lang.Long.valueOf(timestampA2.getTime());
                                } else {
                                    lValueOf2 = null;
                                }
                                if (lValueOf2 == null) {
                                    throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                }
                                abuqVar = new defpackage.abvc((defpackage.abut) abuwVarI2, uri, abts.d(metadata), str5, str6, lValueOf2.longValue());
                            } else {
                                i = i2;
                                str3 = getCallingCardsByIdentifierResponse.e;
                                if (str3 == null) {
                                    throw new java.lang.IllegalStateException("Owner Id not found");
                                }
                                if (str7 == null) {
                                    throw new java.lang.IllegalStateException("Lookup key not found");
                                }
                                str4 = getCallingCardsByIdentifierResponse.i;
                                if (str4 == null) {
                                    throw new java.lang.IllegalStateException("photoToken not found");
                                }
                                timestampA = getCallingCardsByIdentifierResponse.a();
                                if (timestampA != null) {
                                    lValueOf = java.lang.Long.valueOf(timestampA.getTime());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null) {
                                    throw new java.lang.IllegalStateException("lastRefreshedAtTime not found");
                                }
                                abuqVar = new defpackage.abuz(((defpackage.abuv) abuwVarI2).a, uri, abts.d(metadata), str3, str7, str4, lValueOf.longValue());
                            }
                        } else {
                            it = it3;
                            i = i2;
                            abuqVar = new defpackage.abuq(((defpackage.abuu) abuwVarI2).a, uri, abts.d(metadata));
                        }
                        if (!(abuqVar instanceof defpackage.abuz)) {
                            abukVar = new defpackage.abuj(abuqVar);
                        } else if (abuwVar3 instanceof defpackage.abuv) {
                            abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.t, null);
                        } else {
                            str = ((defpackage.abuz) abuqVar).d;
                            str2 = ((defpackage.abuv) abuwVar3).b;
                            aooh.f(str2, "clientLookupKey");
                            if (aooh.n(str, str2)) {
                                abukVar = new defpackage.abuj(abuqVar);
                            } else {
                                abukVar = new defpackage.abuj(abuqVar);
                            }
                        }
                        abuwVar = null;
                    }
                } catch (java.lang.IllegalStateException e3) {
                    e = e3;
                    obj3 = obj2;
                }
                it = it3;
                i = i2;
                abvp.a.d().k(e).l("com/google/android/libraries/contacts/callingcard/impl/CallingCardRepositoryV2Impl", "getCallingCards$<anonymous>$<anonymous>$<anonymous>", 467, "CallingCardRepositoryV2Impl.kt").v("Failed to parse calling card response.");
                abukVar = new defpackage.abuk(abuwVarI, defpackage.abuf.p, e);
                abuwVar = null;
            } else {
                obj3 = obj2;
                it = it3;
                i = i2;
                abuwVar = null;
                abukVar = new defpackage.abuk(abuwVarI, abufVarK, null);
            }
            arrayList2.add(abukVar);
            abuwVar2 = abuwVar;
            it3 = it;
            i2 = i;
            obj2 = obj3;
        }
        return arrayList2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abvj(this.d, this.e, aolnVar);
    }
}

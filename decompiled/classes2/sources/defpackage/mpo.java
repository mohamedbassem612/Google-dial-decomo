package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mpo {
    private defpackage.mok A;
    private final qbe B;
    private final apdp C;
    private final aoin a;
    private final aoin b;
    private final java.util.List c;
    private java.lang.String d;
    private java.lang.Integer e;
    private defpackage.msg f;
    private alxy g;
    private java.lang.String h;
    private defpackage.iht i;
    private nok j;
    private defpackage.mzv k;
    private defpackage.nfb l;
    private final java.util.List m;
    private final java.util.List n;
    private defpackage.igw o;
    private final java.util.List p;
    private java.lang.String q;
    private final java.util.List r;
    private final java.util.List s;
    private final java.util.List t;
    private defpackage.mta u;
    private java.util.List v;
    private java.util.List w;
    private mnm x;
    private final java.util.List y;
    private java.lang.Boolean z;

    public mpo(qbe qbeVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aoinVar, "enableWinkyPhaseOne");
        aooh.f(aoinVar2, "enableWinkyFullFunctionality");
        this.B = qbeVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.C = new apdp();
        this.c = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
        this.p = new java.util.ArrayList();
        this.r = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        this.t = new java.util.ArrayList();
        aokc aokcVar = aokc.a;
        this.v = aokcVar;
        this.w = aokcVar;
        this.y = new java.util.ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.moo mooVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.moo) {
            mooVar = (defpackage.moo) aolnVar;
            int i = mooVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mooVar.c = i - Integer.MIN_VALUE;
            } else {
                mooVar = new defpackage.moo(this, aolnVar);
            }
        } else {
            mooVar = new defpackage.moo(this, aolnVar);
        }
        java.lang.Object obj = mooVar.a;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = mooVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.C;
                mooVar.d = apdpVar2;
                mooVar.c = 1;
                if (apdpVar2.b(mooVar) != arrayList) {
                    apdpVar = apdpVar2;
                }
                return arrayList;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = mooVar.d;
            aooc.af(obj);
            java.util.List<amqb> list = this.c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (amqb amqbVar : list) {
                if (!arrayList2.isEmpty()) {
                    java.lang.Object objBI = ajsz.bI(arrayList2);
                    defpackage.nvp nvpVarB = defpackage.nvp.b(amqbVar.c);
                    if (nvpVarB == null) {
                        nvpVarB = defpackage.nvp.EVENT_UNKNOWN;
                    }
                    if (objBI != nvpVarB) {
                    }
                }
                defpackage.nvp nvpVarB2 = defpackage.nvp.b(amqbVar.c);
                if (nvpVarB2 == null) {
                    nvpVarB2 = defpackage.nvp.EVENT_UNKNOWN;
                }
                arrayList2.add(nvpVarB2);
            }
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList2) {
                if (((defpackage.nvp) obj2) != defpackage.nvp.EVENT_DUPLEX_NOTIFY_TRANSCRIPTION_SUMMARY) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0437 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0463 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0472 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:109:0x04ba A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:112:0x04cd A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:114:0x04f9 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0508 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:121:0x056b A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0573 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:125:0x05a4 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:128:0x05d7 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0635 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0644 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:138:0x068a A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:142:0x069a A[Catch: all -> 0x0742, LOOP:0: B:140:0x0694->B:142:0x069a, LOOP_END, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x06ac A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:148:0x06ca A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:150:0x06db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:152:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:153:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:156:0x06fa A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0341 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0361 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0381 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x03eb A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0424 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:13:0x003c, B:81:0x02ea, B:83:0x033d, B:85:0x0341, B:86:0x035d, B:88:0x0361, B:89:0x037d, B:91:0x0381, B:92:0x03bb, B:94:0x03eb, B:95:0x03f1, B:97:0x0424, B:98:0x042a, B:100:0x0437, B:102:0x0463, B:103:0x0469, B:104:0x046e, B:106:0x0472, B:107:0x048c, B:109:0x04ba, B:110:0x04c0, B:112:0x04cd, B:114:0x04f9, B:115:0x04ff, B:116:0x0504, B:118:0x0508, B:119:0x0563, B:121:0x056b, B:130:0x0607, B:132:0x0635, B:133:0x063b, B:135:0x0644, B:136:0x065e, B:138:0x068a, B:139:0x0690, B:140:0x0694, B:142:0x069a, B:143:0x06a8, B:145:0x06ac, B:146:0x06c6, B:148:0x06ca, B:154:0x06e3, B:156:0x06fa, B:157:0x070c, B:158:0x0730, B:123:0x0573, B:125:0x05a4, B:126:0x05aa, B:128:0x05d7, B:129:0x05dd), top: B:167:0x003c }] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mop mopVar;
        apdp apdpVar;
        apdp apdpVar2;
        vqu vquVar;
        int i;
        nok nokVar;
        int i2;
        vqu vquVar2;
        int iU;
        amqi amqiVarP;
        vqu vquVar3;
        defpackage.mzv mzvVar;
        defpackage.nfb nfbVar;
        defpackage.igw igwVar;
        java.lang.Object obj;
        amqi amqiVar;
        alat alatVar;
        amqi amqiVar2;
        alat alatVar2;
        java.util.List list;
        java.lang.String str;
        amqi amqiVar3;
        alat alatVar3;
        java.util.List list2;
        defpackage.mta mtaVar;
        amqk amqkVar;
        alat alatVar4;
        amqk amqkVar2;
        alat alatVar5;
        amqi amqiVar4;
        alag alagVar;
        mnm mnmVar;
        amqi amqiVar5;
        alak alakVar;
        java.util.Iterator it;
        java.lang.Boolean bool;
        defpackage.mok mokVar;
        akzx akzxVarM;
        int i3;
        int i4;
        java.lang.Long l;
        amqi amqiVar6;
        alat alatVar6;
        amqi amqiVar7;
        alat alatVar7;
        if (aolnVar instanceof defpackage.mop) {
            mopVar = (defpackage.mop) aolnVar;
            int i5 = mopVar.c;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mopVar.c = i5 - Integer.MIN_VALUE;
            } else {
                mopVar = new defpackage.mop(this, aolnVar);
            }
        } else {
            mopVar = new defpackage.mop(this, aolnVar);
        }
        java.lang.Object obj2 = mopVar.a;
        amqi amqiVar8 = aolu.a;
        int i6 = mopVar.c;
        try {
            if (i6 == 0) {
                aooc.af(obj2);
                apdpVar = this.C;
                mopVar.e = apdpVar;
                mopVar.c = 1;
                if (apdpVar.b(mopVar) != amqiVar8) {
                }
                return amqiVar8;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vquVar3 = mopVar.h;
                nokVar = mopVar.d;
                vquVar = mopVar.g;
                vquVar2 = mopVar.f;
                apdpVar2 = mopVar.e;
                try {
                    aooc.af(obj2);
                    i2 = 1;
                    i = 4;
                    defpackage.nvq nvqVar = (defpackage.nvq) obj2;
                    aooh.f(nvqVar, "value");
                    java.lang.Object obj3 = vquVar3.a;
                    ((akzx) obj3).u();
                    amqi amqiVar9 = ((akzx) obj3).b;
                    alal alalVar = amqi.a;
                    amqiVar9.m = nvqVar.e;
                    amqiVar9.c |= 256;
                    boolean z = nokVar.f;
                    java.lang.Object obj4 = vquVar.a;
                    ((akzx) obj4).u();
                    amqi amqiVar10 = ((akzx) obj4).b;
                    amqiVar10.c |= 512;
                    amqiVar10.n = z;
                    boolean z2 = nokVar.g;
                    ((akzx) obj4).u();
                    amqi amqiVar11 = ((akzx) obj4).b;
                    amqiVar11.c |= 1024;
                    amqiVar11.o = z2;
                    mzvVar = this.k;
                    if (mzvVar != null) {
                        int iT = mni.t(mzvVar);
                        java.lang.Object obj5 = vquVar.a;
                        ((akzx) obj5).u();
                        amqi amqiVar12 = ((akzx) obj5).b;
                        amqiVar12.p = iT - 1;
                        amqiVar12.c |= 2048;
                    }
                    nfbVar = this.l;
                    if (nfbVar != null) {
                        int iV = mni.v(nfbVar);
                        java.lang.Object obj6 = vquVar.a;
                        ((akzx) obj6).u();
                        amqi amqiVar13 = ((akzx) obj6).b;
                        amqiVar13.s = iV - 1;
                        amqiVar13.c |= 4096;
                    }
                    igwVar = this.o;
                    if (igwVar != null) {
                        int i7 = igwVar.c;
                        java.lang.Object obj7 = vquVar.a;
                        ((akzx) obj7).u();
                        amqi amqiVar14 = ((akzx) obj7).b;
                        amqiVar14.c |= 8192;
                        amqiVar14.t = i7;
                        java.lang.String str2 = igwVar.d;
                        aooh.e(str2, "getSodaLpLocale(...)");
                        aooh.f(str2, "value");
                        ((akzx) obj7).u();
                        amqi amqiVar15 = ((akzx) obj7).b;
                        j$.util.Objects.requireNonNull(str2);
                        amqiVar15.c |= 16384;
                        amqiVar15.u = str2;
                    }
                    obj = vquVar.a;
                    java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.q);
                    aooh.e(listUnmodifiableList, "getManualScreeningReplyChipsDisplayedList(...)");
                    new alct(listUnmodifiableList);
                    java.util.List list3 = this.m;
                    ((akzx) obj).u();
                    amqiVar = ((akzx) obj).b;
                    alatVar = amqiVar.q;
                    if (!alatVar.c()) {
                        amqiVar.q = alad.J(alatVar);
                    }
                    akyl.i(list3, amqiVar.q);
                    java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.r);
                    aooh.e(listUnmodifiableList2, "getManualScreeningReplyChipsClickedList(...)");
                    new alct(listUnmodifiableList2);
                    java.util.List list4 = this.n;
                    ((akzx) obj).u();
                    amqiVar2 = ((akzx) obj).b;
                    alatVar2 = amqiVar2.r;
                    if (!alatVar2.c()) {
                        amqiVar2.r = alad.J(alatVar2);
                    }
                    akyl.i(list4, amqiVar2.r);
                    list = this.p;
                    if (!list.isEmpty()) {
                        java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.v);
                        aooh.e(listUnmodifiableList3, "getPostScreeningQuickRep…playedContentIdsList(...)");
                        new alct(listUnmodifiableList3);
                        ((akzx) obj).u();
                        amqiVar7 = ((akzx) obj).b;
                        alatVar7 = amqiVar7.v;
                        if (!alatVar7.c()) {
                            amqiVar7.v = alad.J(alatVar7);
                        }
                        akyl.i(list, amqiVar7.v);
                    }
                    str = this.q;
                    if (str != null) {
                        ((akzx) obj).u();
                        amqi amqiVar16 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(str);
                        amqiVar16.c |= 32768;
                        amqiVar16.w = str;
                    }
                    java.util.List listUnmodifiableList4 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.x);
                    aooh.e(listUnmodifiableList4, "getManualScreeningDuplexPredictedIntentsList(...)");
                    new alct(listUnmodifiableList4);
                    java.util.List list5 = this.r;
                    ((akzx) obj).u();
                    amqiVar3 = ((akzx) obj).b;
                    alatVar3 = amqiVar3.x;
                    if (!alatVar3.c()) {
                        amqiVar3.x = alad.J(alatVar3);
                    }
                    akyl.i(list5, amqiVar3.x);
                    list2 = this.s;
                    if (!list2.isEmpty()) {
                        java.util.List listUnmodifiableList5 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.y);
                        aooh.e(listUnmodifiableList5, "getLanguageDetectionEventsList(...)");
                        new alct(listUnmodifiableList5);
                        ((akzx) obj).u();
                        amqiVar6 = ((akzx) obj).b;
                        alatVar6 = amqiVar6.y;
                        if (!alatVar6.c()) {
                            amqiVar6.y = alad.J(alatVar6);
                        }
                        akyl.i(list2, amqiVar6.y);
                    }
                    mtaVar = this.u;
                    if (mtaVar != null) {
                        akzx akzxVarM2 = amqa.a.m();
                        aooh.f(akzxVarM2, "builder");
                        int iR = mni.r(mtaVar.a);
                        akzxVarM2.u();
                        amqa amqaVar = akzxVarM2.b;
                        amqaVar.c = iR - 1;
                        amqaVar.b |= 1;
                        int iS = mni.s(mtaVar.b);
                        akzxVarM2.u();
                        amqa amqaVar2 = akzxVarM2.b;
                        amqaVar2.d = iS - 1;
                        amqaVar2.b |= 2;
                        amqa amqaVarP = akzxVarM2.p();
                        aooh.e(amqaVarP, "build(...)");
                        amqa amqaVar3 = amqaVarP;
                        aooh.f(amqaVar3, "value");
                        ((akzx) obj).u();
                        amqi amqiVar17 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqaVar3);
                        amqiVar17.z = amqaVar3;
                        amqiVar17.c |= 65536;
                    }
                    if (this.v.isEmpty() || !this.w.isEmpty()) {
                        akzx akzxVarM3 = amqk.a.m();
                        aooh.f(akzxVarM3, "builder");
                        java.util.List listUnmodifiableList6 = j$.util.DesugarCollections.unmodifiableList(akzxVarM3.b.b);
                        aooh.e(listUnmodifiableList6, "getConsideredExperimentsList(...)");
                        new alct(listUnmodifiableList6);
                        java.util.List list6 = this.v;
                        aooh.f(list6, "values");
                        akzxVarM3.u();
                        amqkVar = akzxVarM3.b;
                        alatVar4 = amqkVar.b;
                        if (!alatVar4.c()) {
                            amqkVar.b = alad.J(alatVar4);
                        }
                        akyl.i(list6, amqkVar.b);
                        java.util.List listUnmodifiableList7 = j$.util.DesugarCollections.unmodifiableList(akzxVarM3.b.c);
                        aooh.e(listUnmodifiableList7, "getTriggeredExperimentsList(...)");
                        new alct(listUnmodifiableList7);
                        java.util.List list7 = this.w;
                        aooh.f(list7, "values");
                        akzxVarM3.u();
                        amqkVar2 = akzxVarM3.b;
                        alatVar5 = amqkVar2.c;
                        if (!alatVar5.c()) {
                            amqkVar2.c = alad.J(alatVar5);
                        }
                        akyl.i(list7, amqkVar2.c);
                        amqk amqkVarP = akzxVarM3.p();
                        aooh.e(amqkVarP, "build(...)");
                        amqk amqkVar3 = amqkVarP;
                        aooh.f(amqkVar3, "value");
                        ((akzx) obj).u();
                        amqi amqiVar18 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqkVar3);
                        amqiVar18.A = amqkVar3;
                        amqiVar18.c |= 131072;
                    }
                    java.util.List listUnmodifiableList8 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.B);
                    aooh.e(listUnmodifiableList8, "getDuplexAudioMatchDetectedDistancesList(...)");
                    new alct(listUnmodifiableList8);
                    java.util.List list8 = this.t;
                    ((akzx) obj).u();
                    amqiVar4 = ((akzx) obj).b;
                    alagVar = amqiVar4.B;
                    if (!alagVar.c()) {
                        amqiVar4.B = alad.F(alagVar);
                    }
                    akyl.i(list8, amqiVar4.B);
                    mnmVar = this.x;
                    if (mnmVar != null) {
                        ((akzx) obj).u();
                        amqi amqiVar19 = ((akzx) obj).b;
                        amqiVar19.C = mnmVar.a();
                        amqiVar19.c |= 262144;
                    }
                    new alct(new alam(((akzx) obj).b.D, amqi.a));
                    java.util.List list9 = this.y;
                    ((akzx) obj).u();
                    amqiVar5 = ((akzx) obj).b;
                    alakVar = amqiVar5.D;
                    if (!alakVar.c()) {
                        amqiVar5.D = alad.H(alakVar);
                    }
                    it = list9.iterator();
                    while (it.hasNext()) {
                        amqiVar5.D.g(((amqd) it.next()).g);
                    }
                    bool = this.z;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        ((akzx) obj).u();
                        amqi amqiVar20 = ((akzx) obj).b;
                        amqiVar20.c |= 1048576;
                        amqiVar20.F = zBooleanValue;
                    }
                    mokVar = this.A;
                    if (mokVar != null) {
                        akzxVarM = amqc.a.m();
                        aooh.f(akzxVarM, "builder");
                        i3 = mokVar.b - 1;
                        if (i3 == i2) {
                            i4 = 2;
                        } else if (i3 != 2) {
                            i4 = i;
                        } else {
                            i4 = 3;
                        }
                        akzxVarM.u();
                        amqc amqcVar = akzxVarM.b;
                        amqcVar.c = i4 - 1;
                        amqcVar.b |= 1;
                        l = mokVar.a;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            akzxVarM.u();
                            amqc amqcVar2 = akzxVarM.b;
                            amqcVar2.b |= 2;
                            amqcVar2.d = jLongValue;
                        }
                        amqc amqcVarP = akzxVarM.p();
                        aooh.e(amqcVarP, "build(...)");
                        amqc amqcVar3 = amqcVarP;
                        aooh.f(amqcVar3, "value");
                        ((akzx) obj).u();
                        amqi amqiVar21 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqcVar3);
                        amqiVar21.G = amqcVar3;
                        amqiVar21.c |= 2097152;
                    }
                    amqi amqiVarP2 = ((akzx) vquVar2.a).p();
                    aooh.e(amqiVarP2, "build(...)");
                    amqiVar8 = amqiVarP2;
                    apdpVar2.d();
                    return amqiVar8;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar3 = mopVar.e;
            aooc.af(obj2);
            apdpVar = apdpVar3;
            akzx akzxVarM4 = amqi.b.m();
            aooh.f(akzxVarM4, "builder");
            vquVar = new vqu(akzxVarM4);
            java.lang.Object obj8 = vquVar.a;
            java.util.List listUnmodifiableList9 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj8).b.d);
            aooh.e(listUnmodifiableList9, "getDobbyEventSequenceList(...)");
            new alct(listUnmodifiableList9);
            java.util.List list10 = this.c;
            ((akzx) obj8).u();
            amqi amqiVar22 = ((akzx) obj8).b;
            alat alatVar8 = amqiVar22.d;
            if (!alatVar8.c()) {
                amqiVar22.d = alad.J(alatVar8);
            }
            akyl.i(list10, amqiVar22.d);
            java.lang.String str3 = this.d;
            if (str3 != null) {
                ((akzx) obj8).u();
                amqi amqiVar23 = ((akzx) obj8).b;
                j$.util.Objects.requireNonNull(str3);
                amqiVar23.c |= 1;
                amqiVar23.e = str3;
            }
            java.lang.Integer num = this.e;
            if (num != null) {
                int iIntValue = num.intValue();
                ((akzx) obj8).u();
                amqi amqiVar24 = ((akzx) obj8).b;
                amqiVar24.c |= 524288;
                amqiVar24.E = iIntValue;
            }
            defpackage.msg msgVar = this.f;
            if (msgVar != null) {
                akzx akzxVarM5 = amqf.a.m();
                aooh.f(akzxVarM5, "builder");
                int iY = mni.y(msgVar.a);
                akzxVarM5.u();
                i = 4;
                amqf amqfVar = akzxVarM5.b;
                amqfVar.c = iY - 1;
                amqfVar.b |= 1;
                int iZ = mni.z(msgVar.c);
                akzxVarM5.u();
                amqf amqfVar2 = akzxVarM5.b;
                amqfVar2.d = iZ - 1;
                amqfVar2.b |= 2;
                int iA = mni.A(msgVar.b);
                akzxVarM5.u();
                amqf amqfVar3 = akzxVarM5.b;
                amqfVar3.e = iA - 1;
                amqfVar3.b |= 4;
                amqf amqfVarP = akzxVarM5.p();
                aooh.e(amqfVarP, "build(...)");
                amqf amqfVar4 = amqfVarP;
                aooh.f(amqfVar4, "value");
                ((akzx) obj8).u();
                amqi amqiVar25 = ((akzx) obj8).b;
                j$.util.Objects.requireNonNull(amqfVar4);
                amqiVar25.f = amqfVar4;
                amqiVar25.c |= 2;
            } else {
                i = 4;
            }
            alxy alxyVar = this.g;
            if (alxyVar != null) {
                akzx akzxVarM6 = amqe.a.m();
                aooh.f(akzxVarM6, "builder");
                alxx alxxVarB = alxx.b(alxyVar.c);
                if (alxxVarB == null) {
                    alxxVarB = alxx.a;
                }
                int iX = mni.x(alxxVarB);
                akzxVarM6.u();
                amqe amqeVar = akzxVarM6.b;
                amqeVar.c = iX - 1;
                amqeVar.b |= 1;
                alxx alxxVarB2 = alxx.b(alxyVar.e);
                if (alxxVarB2 == null) {
                    alxxVarB2 = alxx.a;
                }
                int iX2 = mni.x(alxxVarB2);
                akzxVarM6.u();
                amqe amqeVar2 = akzxVarM6.b;
                amqeVar2.e = iX2 - 1;
                amqeVar2.b |= 4;
                int iAN = a.aN(alxyVar.d);
                if (iAN == 0) {
                    iAN = 1;
                }
                int iW = mni.w(iAN);
                akzxVarM6.u();
                amqe amqeVar3 = akzxVarM6.b;
                amqeVar3.d = iW - 1;
                amqeVar3.b |= 2;
                amqe amqeVarP = akzxVarM6.p();
                aooh.e(amqeVarP, "build(...)");
                amqe amqeVar4 = amqeVarP;
                aooh.f(amqeVar4, "value");
                ((akzx) obj8).u();
                amqi amqiVar26 = ((akzx) obj8).b;
                j$.util.Objects.requireNonNull(amqeVar4);
                amqiVar26.g = amqeVar4;
                amqiVar26.c |= 4;
            }
            java.lang.String str4 = this.h;
            if (str4 != null) {
                ((akzx) obj8).u();
                amqi amqiVar27 = ((akzx) obj8).b;
                j$.util.Objects.requireNonNull(str4);
                amqiVar27.c |= 8;
                amqiVar27.h = str4;
            }
            defpackage.iht ihtVar = this.i;
            if (ihtVar != null) {
                int iQ = mni.q(ihtVar);
                ((akzx) obj8).u();
                amqi amqiVar28 = ((akzx) obj8).b;
                amqiVar28.i = mni.af(iQ);
                amqiVar28.c |= 16;
            }
            nokVar = this.j;
            if (nokVar != null) {
                defpackage.noi noiVarB = defpackage.noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                defpackage.nvq nvqVarP = mni.p(noiVarB);
                ((akzx) obj8).u();
                amqi amqiVar29 = ((akzx) obj8).b;
                amqiVar29.j = nvqVarP.e;
                amqiVar29.c |= 32;
                defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                int iU2 = mni.u(nohVarB);
                ((akzx) obj8).u();
                amqi amqiVar30 = ((akzx) obj8).b;
                amqiVar30.k = iU2 - 1;
                amqiVar30.c |= 64;
                defpackage.noh nohVarB2 = defpackage.noh.b(nokVar.c);
                if (nohVarB2 == null) {
                    nohVarB2 = defpackage.noh.UNRECOGNIZED;
                }
                mnm mnmVar2 = this.x;
                mnm mnmVar3 = mnm.b;
                if (mnmVar2 != mnmVar3) {
                    iU = 1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    iU = aooh.n(this.z, java.lang.Boolean.TRUE) ? 10 : mni.u(nohVarB2);
                }
                ((akzx) obj8).u();
                amqi amqiVar31 = ((akzx) obj8).b;
                amqiVar31.l = iU - 1;
                amqiVar31.c |= 128;
                defpackage.noi noiVarB2 = defpackage.noi.b(nokVar.d);
                if (noiVarB2 == null) {
                    noiVarB2 = defpackage.noi.UNRECOGNIZED;
                }
                mopVar.e = apdpVar;
                mopVar.f = vquVar;
                mopVar.g = vquVar;
                mopVar.d = nokVar;
                mopVar.h = vquVar;
                mopVar.c = 2;
                if (this.x != mnmVar3) {
                    amqiVarP = defpackage.nvq.PROTECTION_LEVEL_UNSPECIFIED;
                } else {
                    amqiVarP = aooh.n(this.z, java.lang.Boolean.TRUE) ? mni.p(defpackage.noi.PROTECTION_LEVEL_MEDIUM) : mni.p(noiVarB2);
                }
                if (amqiVarP != amqiVar8) {
                    amqi amqiVar32 = amqiVarP;
                    apdpVar2 = apdpVar;
                    obj2 = amqiVar32;
                    vquVar3 = vquVar;
                    vquVar2 = vquVar3;
                    defpackage.nvq nvqVar2 = (defpackage.nvq) obj2;
                    aooh.f(nvqVar2, "value");
                    java.lang.Object obj9 = vquVar3.a;
                    ((akzx) obj9).u();
                    amqi amqiVar33 = ((akzx) obj9).b;
                    alal alalVar2 = amqi.a;
                    amqiVar33.m = nvqVar2.e;
                    amqiVar33.c |= 256;
                    boolean z3 = nokVar.f;
                    java.lang.Object obj10 = vquVar.a;
                    ((akzx) obj10).u();
                    amqi amqiVar110 = ((akzx) obj10).b;
                    amqiVar110.c |= 512;
                    amqiVar110.n = z3;
                    boolean z4 = nokVar.g;
                    ((akzx) obj10).u();
                    amqi amqiVar111 = ((akzx) obj10).b;
                    amqiVar111.c |= 1024;
                    amqiVar111.o = z4;
                    mzvVar = this.k;
                    if (mzvVar != null) {
                        int iT2 = mni.t(mzvVar);
                        java.lang.Object obj11 = vquVar.a;
                        ((akzx) obj11).u();
                        amqi amqiVar112 = ((akzx) obj11).b;
                        amqiVar112.p = iT2 - 1;
                        amqiVar112.c |= 2048;
                    }
                    nfbVar = this.l;
                    if (nfbVar != null) {
                        int iV2 = mni.v(nfbVar);
                        java.lang.Object obj12 = vquVar.a;
                        ((akzx) obj12).u();
                        amqi amqiVar113 = ((akzx) obj12).b;
                        amqiVar113.s = iV2 - 1;
                        amqiVar113.c |= 4096;
                    }
                    igwVar = this.o;
                    if (igwVar != null) {
                        int i8 = igwVar.c;
                        java.lang.Object obj13 = vquVar.a;
                        ((akzx) obj13).u();
                        amqi amqiVar114 = ((akzx) obj13).b;
                        amqiVar114.c |= 8192;
                        amqiVar114.t = i8;
                        java.lang.String str5 = igwVar.d;
                        aooh.e(str5, "getSodaLpLocale(...)");
                        aooh.f(str5, "value");
                        ((akzx) obj13).u();
                        amqi amqiVar115 = ((akzx) obj13).b;
                        j$.util.Objects.requireNonNull(str5);
                        amqiVar115.c |= 16384;
                        amqiVar115.u = str5;
                    }
                    obj = vquVar.a;
                    java.util.List listUnmodifiableList10 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.q);
                    aooh.e(listUnmodifiableList10, "getManualScreeningReplyChipsDisplayedList(...)");
                    new alct(listUnmodifiableList10);
                    java.util.List list11 = this.m;
                    ((akzx) obj).u();
                    amqiVar = ((akzx) obj).b;
                    alatVar = amqiVar.q;
                    if (!alatVar.c()) {
                        amqiVar.q = alad.J(alatVar);
                    }
                    akyl.i(list11, amqiVar.q);
                    java.util.List listUnmodifiableList11 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.r);
                    aooh.e(listUnmodifiableList11, "getManualScreeningReplyChipsClickedList(...)");
                    new alct(listUnmodifiableList11);
                    java.util.List list12 = this.n;
                    ((akzx) obj).u();
                    amqiVar2 = ((akzx) obj).b;
                    alatVar2 = amqiVar2.r;
                    if (!alatVar2.c()) {
                        amqiVar2.r = alad.J(alatVar2);
                    }
                    akyl.i(list12, amqiVar2.r);
                    list = this.p;
                    if (!list.isEmpty()) {
                        java.util.List listUnmodifiableList12 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.v);
                        aooh.e(listUnmodifiableList12, "getPostScreeningQuickRep…playedContentIdsList(...)");
                        new alct(listUnmodifiableList12);
                        ((akzx) obj).u();
                        amqiVar7 = ((akzx) obj).b;
                        alatVar7 = amqiVar7.v;
                        if (!alatVar7.c()) {
                            amqiVar7.v = alad.J(alatVar7);
                        }
                        akyl.i(list, amqiVar7.v);
                    }
                    str = this.q;
                    if (str != null) {
                        ((akzx) obj).u();
                        amqi amqiVar116 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(str);
                        amqiVar116.c |= 32768;
                        amqiVar116.w = str;
                    }
                    java.util.List listUnmodifiableList13 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.x);
                    aooh.e(listUnmodifiableList13, "getManualScreeningDuplexPredictedIntentsList(...)");
                    new alct(listUnmodifiableList13);
                    java.util.List list13 = this.r;
                    ((akzx) obj).u();
                    amqiVar3 = ((akzx) obj).b;
                    alatVar3 = amqiVar3.x;
                    if (!alatVar3.c()) {
                        amqiVar3.x = alad.J(alatVar3);
                    }
                    akyl.i(list13, amqiVar3.x);
                    list2 = this.s;
                    if (!list2.isEmpty()) {
                        java.util.List listUnmodifiableList14 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.y);
                        aooh.e(listUnmodifiableList14, "getLanguageDetectionEventsList(...)");
                        new alct(listUnmodifiableList14);
                        ((akzx) obj).u();
                        amqiVar6 = ((akzx) obj).b;
                        alatVar6 = amqiVar6.y;
                        if (!alatVar6.c()) {
                            amqiVar6.y = alad.J(alatVar6);
                        }
                        akyl.i(list2, amqiVar6.y);
                    }
                    mtaVar = this.u;
                    if (mtaVar != null) {
                        akzx akzxVarM7 = amqa.a.m();
                        aooh.f(akzxVarM7, "builder");
                        int iR2 = mni.r(mtaVar.a);
                        akzxVarM7.u();
                        amqa amqaVar4 = akzxVarM7.b;
                        amqaVar4.c = iR2 - 1;
                        amqaVar4.b |= 1;
                        int iS2 = mni.s(mtaVar.b);
                        akzxVarM7.u();
                        amqa amqaVar5 = akzxVarM7.b;
                        amqaVar5.d = iS2 - 1;
                        amqaVar5.b |= 2;
                        amqa amqaVarP2 = akzxVarM7.p();
                        aooh.e(amqaVarP2, "build(...)");
                        amqa amqaVar6 = amqaVarP2;
                        aooh.f(amqaVar6, "value");
                        ((akzx) obj).u();
                        amqi amqiVar117 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqaVar6);
                        amqiVar117.z = amqaVar6;
                        amqiVar117.c |= 65536;
                    }
                    if (this.v.isEmpty()) {
                        akzx akzxVarM8 = amqk.a.m();
                        aooh.f(akzxVarM8, "builder");
                        java.util.List listUnmodifiableList15 = j$.util.DesugarCollections.unmodifiableList(akzxVarM8.b.b);
                        aooh.e(listUnmodifiableList15, "getConsideredExperimentsList(...)");
                        new alct(listUnmodifiableList15);
                        java.util.List list14 = this.v;
                        aooh.f(list14, "values");
                        akzxVarM8.u();
                        amqkVar = akzxVarM8.b;
                        alatVar4 = amqkVar.b;
                        if (!alatVar4.c()) {
                            amqkVar.b = alad.J(alatVar4);
                        }
                        akyl.i(list14, amqkVar.b);
                        java.util.List listUnmodifiableList16 = j$.util.DesugarCollections.unmodifiableList(akzxVarM8.b.c);
                        aooh.e(listUnmodifiableList16, "getTriggeredExperimentsList(...)");
                        new alct(listUnmodifiableList16);
                        java.util.List list15 = this.w;
                        aooh.f(list15, "values");
                        akzxVarM8.u();
                        amqkVar2 = akzxVarM8.b;
                        alatVar5 = amqkVar2.c;
                        if (!alatVar5.c()) {
                            amqkVar2.c = alad.J(alatVar5);
                        }
                        akyl.i(list15, amqkVar2.c);
                        amqk amqkVarP2 = akzxVarM8.p();
                        aooh.e(amqkVarP2, "build(...)");
                        amqk amqkVar4 = amqkVarP2;
                        aooh.f(amqkVar4, "value");
                        ((akzx) obj).u();
                        amqi amqiVar118 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqkVar4);
                        amqiVar118.A = amqkVar4;
                        amqiVar118.c |= 131072;
                    } else {
                        akzx akzxVarM9 = amqk.a.m();
                        aooh.f(akzxVarM9, "builder");
                        java.util.List listUnmodifiableList17 = j$.util.DesugarCollections.unmodifiableList(akzxVarM9.b.b);
                        aooh.e(listUnmodifiableList17, "getConsideredExperimentsList(...)");
                        new alct(listUnmodifiableList17);
                        java.util.List list16 = this.v;
                        aooh.f(list16, "values");
                        akzxVarM9.u();
                        amqkVar = akzxVarM9.b;
                        alatVar4 = amqkVar.b;
                        if (!alatVar4.c()) {
                            amqkVar.b = alad.J(alatVar4);
                        }
                        akyl.i(list16, amqkVar.b);
                        java.util.List listUnmodifiableList18 = j$.util.DesugarCollections.unmodifiableList(akzxVarM9.b.c);
                        aooh.e(listUnmodifiableList18, "getTriggeredExperimentsList(...)");
                        new alct(listUnmodifiableList18);
                        java.util.List list17 = this.w;
                        aooh.f(list17, "values");
                        akzxVarM9.u();
                        amqkVar2 = akzxVarM9.b;
                        alatVar5 = amqkVar2.c;
                        if (!alatVar5.c()) {
                            amqkVar2.c = alad.J(alatVar5);
                        }
                        akyl.i(list17, amqkVar2.c);
                        amqk amqkVarP3 = akzxVarM9.p();
                        aooh.e(amqkVarP3, "build(...)");
                        amqk amqkVar5 = amqkVarP3;
                        aooh.f(amqkVar5, "value");
                        ((akzx) obj).u();
                        amqi amqiVar119 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqkVar5);
                        amqiVar119.A = amqkVar5;
                        amqiVar119.c |= 131072;
                    }
                    java.util.List listUnmodifiableList19 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.B);
                    aooh.e(listUnmodifiableList19, "getDuplexAudioMatchDetectedDistancesList(...)");
                    new alct(listUnmodifiableList19);
                    java.util.List list18 = this.t;
                    ((akzx) obj).u();
                    amqiVar4 = ((akzx) obj).b;
                    alagVar = amqiVar4.B;
                    if (!alagVar.c()) {
                        amqiVar4.B = alad.F(alagVar);
                    }
                    akyl.i(list18, amqiVar4.B);
                    mnmVar = this.x;
                    if (mnmVar != null) {
                        ((akzx) obj).u();
                        amqi amqiVar120 = ((akzx) obj).b;
                        amqiVar120.C = mnmVar.a();
                        amqiVar120.c |= 262144;
                    }
                    new alct(new alam(((akzx) obj).b.D, amqi.a));
                    java.util.List list19 = this.y;
                    ((akzx) obj).u();
                    amqiVar5 = ((akzx) obj).b;
                    alakVar = amqiVar5.D;
                    if (!alakVar.c()) {
                        amqiVar5.D = alad.H(alakVar);
                    }
                    it = list19.iterator();
                    while (it.hasNext()) {
                        amqiVar5.D.g(((amqd) it.next()).g);
                    }
                    bool = this.z;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        ((akzx) obj).u();
                        amqi amqiVar210 = ((akzx) obj).b;
                        amqiVar210.c |= 1048576;
                        amqiVar210.F = zBooleanValue2;
                    }
                    mokVar = this.A;
                    if (mokVar != null) {
                        akzxVarM = amqc.a.m();
                        aooh.f(akzxVarM, "builder");
                        i3 = mokVar.b - 1;
                        if (i3 == i2) {
                            i4 = 2;
                        } else if (i3 != 2) {
                            i4 = i;
                        } else {
                            i4 = 3;
                        }
                        akzxVarM.u();
                        amqc amqcVar4 = akzxVarM.b;
                        amqcVar4.c = i4 - 1;
                        amqcVar4.b |= 1;
                        l = mokVar.a;
                        if (l != null) {
                            long jLongValue2 = l.longValue();
                            akzxVarM.u();
                            amqc amqcVar5 = akzxVarM.b;
                            amqcVar5.b |= 2;
                            amqcVar5.d = jLongValue2;
                        }
                        amqc amqcVarP2 = akzxVarM.p();
                        aooh.e(amqcVarP2, "build(...)");
                        amqc amqcVar6 = amqcVarP2;
                        aooh.f(amqcVar6, "value");
                        ((akzx) obj).u();
                        amqi amqiVar211 = ((akzx) obj).b;
                        j$.util.Objects.requireNonNull(amqcVar6);
                        amqiVar211.G = amqcVar6;
                        amqiVar211.c |= 2097152;
                    }
                    amqi amqiVarP3 = ((akzx) vquVar2.a).p();
                    aooh.e(amqiVarP3, "build(...)");
                    amqiVar8 = amqiVarP3;
                    apdpVar2.d();
                }
            } else {
                i2 = 1;
                apdpVar2 = apdpVar;
                vquVar2 = vquVar;
                mzvVar = this.k;
                if (mzvVar != null) {
                    int iT3 = mni.t(mzvVar);
                    java.lang.Object obj14 = vquVar.a;
                    ((akzx) obj14).u();
                    amqi amqiVar1110 = ((akzx) obj14).b;
                    amqiVar1110.p = iT3 - 1;
                    amqiVar1110.c |= 2048;
                }
                nfbVar = this.l;
                if (nfbVar != null) {
                    int iV3 = mni.v(nfbVar);
                    java.lang.Object obj15 = vquVar.a;
                    ((akzx) obj15).u();
                    amqi amqiVar1111 = ((akzx) obj15).b;
                    amqiVar1111.s = iV3 - 1;
                    amqiVar1111.c |= 4096;
                }
                igwVar = this.o;
                if (igwVar != null) {
                    int i9 = igwVar.c;
                    java.lang.Object obj16 = vquVar.a;
                    ((akzx) obj16).u();
                    amqi amqiVar1112 = ((akzx) obj16).b;
                    amqiVar1112.c |= 8192;
                    amqiVar1112.t = i9;
                    java.lang.String str6 = igwVar.d;
                    aooh.e(str6, "getSodaLpLocale(...)");
                    aooh.f(str6, "value");
                    ((akzx) obj16).u();
                    amqi amqiVar1113 = ((akzx) obj16).b;
                    j$.util.Objects.requireNonNull(str6);
                    amqiVar1113.c |= 16384;
                    amqiVar1113.u = str6;
                }
                obj = vquVar.a;
                java.util.List listUnmodifiableList110 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.q);
                aooh.e(listUnmodifiableList110, "getManualScreeningReplyChipsDisplayedList(...)");
                new alct(listUnmodifiableList110);
                java.util.List list110 = this.m;
                ((akzx) obj).u();
                amqiVar = ((akzx) obj).b;
                alatVar = amqiVar.q;
                if (!alatVar.c()) {
                    amqiVar.q = alad.J(alatVar);
                }
                akyl.i(list110, amqiVar.q);
                java.util.List listUnmodifiableList111 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.r);
                aooh.e(listUnmodifiableList111, "getManualScreeningReplyChipsClickedList(...)");
                new alct(listUnmodifiableList111);
                java.util.List list111 = this.n;
                ((akzx) obj).u();
                amqiVar2 = ((akzx) obj).b;
                alatVar2 = amqiVar2.r;
                if (!alatVar2.c()) {
                    amqiVar2.r = alad.J(alatVar2);
                }
                akyl.i(list111, amqiVar2.r);
                list = this.p;
                if (!list.isEmpty()) {
                    java.util.List listUnmodifiableList112 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.v);
                    aooh.e(listUnmodifiableList112, "getPostScreeningQuickRep…playedContentIdsList(...)");
                    new alct(listUnmodifiableList112);
                    ((akzx) obj).u();
                    amqiVar7 = ((akzx) obj).b;
                    alatVar7 = amqiVar7.v;
                    if (!alatVar7.c()) {
                        amqiVar7.v = alad.J(alatVar7);
                    }
                    akyl.i(list, amqiVar7.v);
                }
                str = this.q;
                if (str != null) {
                    ((akzx) obj).u();
                    amqi amqiVar1114 = ((akzx) obj).b;
                    j$.util.Objects.requireNonNull(str);
                    amqiVar1114.c |= 32768;
                    amqiVar1114.w = str;
                }
                java.util.List listUnmodifiableList113 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.x);
                aooh.e(listUnmodifiableList113, "getManualScreeningDuplexPredictedIntentsList(...)");
                new alct(listUnmodifiableList113);
                java.util.List list112 = this.r;
                ((akzx) obj).u();
                amqiVar3 = ((akzx) obj).b;
                alatVar3 = amqiVar3.x;
                if (!alatVar3.c()) {
                    amqiVar3.x = alad.J(alatVar3);
                }
                akyl.i(list112, amqiVar3.x);
                list2 = this.s;
                if (!list2.isEmpty()) {
                    java.util.List listUnmodifiableList114 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.y);
                    aooh.e(listUnmodifiableList114, "getLanguageDetectionEventsList(...)");
                    new alct(listUnmodifiableList114);
                    ((akzx) obj).u();
                    amqiVar6 = ((akzx) obj).b;
                    alatVar6 = amqiVar6.y;
                    if (!alatVar6.c()) {
                        amqiVar6.y = alad.J(alatVar6);
                    }
                    akyl.i(list2, amqiVar6.y);
                }
                mtaVar = this.u;
                if (mtaVar != null) {
                    akzx akzxVarM10 = amqa.a.m();
                    aooh.f(akzxVarM10, "builder");
                    int iR3 = mni.r(mtaVar.a);
                    akzxVarM10.u();
                    amqa amqaVar7 = akzxVarM10.b;
                    amqaVar7.c = iR3 - 1;
                    amqaVar7.b |= 1;
                    int iS3 = mni.s(mtaVar.b);
                    akzxVarM10.u();
                    amqa amqaVar8 = akzxVarM10.b;
                    amqaVar8.d = iS3 - 1;
                    amqaVar8.b |= 2;
                    amqa amqaVarP3 = akzxVarM10.p();
                    aooh.e(amqaVarP3, "build(...)");
                    amqa amqaVar9 = amqaVarP3;
                    aooh.f(amqaVar9, "value");
                    ((akzx) obj).u();
                    amqi amqiVar1115 = ((akzx) obj).b;
                    j$.util.Objects.requireNonNull(amqaVar9);
                    amqiVar1115.z = amqaVar9;
                    amqiVar1115.c |= 65536;
                }
                if (this.v.isEmpty()) {
                    akzx akzxVarM11 = amqk.a.m();
                    aooh.f(akzxVarM11, "builder");
                    java.util.List listUnmodifiableList115 = j$.util.DesugarCollections.unmodifiableList(akzxVarM11.b.b);
                    aooh.e(listUnmodifiableList115, "getConsideredExperimentsList(...)");
                    new alct(listUnmodifiableList115);
                    java.util.List list113 = this.v;
                    aooh.f(list113, "values");
                    akzxVarM11.u();
                    amqkVar = akzxVarM11.b;
                    alatVar4 = amqkVar.b;
                    if (!alatVar4.c()) {
                        amqkVar.b = alad.J(alatVar4);
                    }
                    akyl.i(list113, amqkVar.b);
                    java.util.List listUnmodifiableList116 = j$.util.DesugarCollections.unmodifiableList(akzxVarM11.b.c);
                    aooh.e(listUnmodifiableList116, "getTriggeredExperimentsList(...)");
                    new alct(listUnmodifiableList116);
                    java.util.List list114 = this.w;
                    aooh.f(list114, "values");
                    akzxVarM11.u();
                    amqkVar2 = akzxVarM11.b;
                    alatVar5 = amqkVar2.c;
                    if (!alatVar5.c()) {
                        amqkVar2.c = alad.J(alatVar5);
                    }
                    akyl.i(list114, amqkVar2.c);
                    amqk amqkVarP4 = akzxVarM11.p();
                    aooh.e(amqkVarP4, "build(...)");
                    amqk amqkVar6 = amqkVarP4;
                    aooh.f(amqkVar6, "value");
                    ((akzx) obj).u();
                    amqi amqiVar1116 = ((akzx) obj).b;
                    j$.util.Objects.requireNonNull(amqkVar6);
                    amqiVar1116.A = amqkVar6;
                    amqiVar1116.c |= 131072;
                } else {
                    akzx akzxVarM12 = amqk.a.m();
                    aooh.f(akzxVarM12, "builder");
                    java.util.List listUnmodifiableList117 = j$.util.DesugarCollections.unmodifiableList(akzxVarM12.b.b);
                    aooh.e(listUnmodifiableList117, "getConsideredExperimentsList(...)");
                    new alct(listUnmodifiableList117);
                    java.util.List list115 = this.v;
                    aooh.f(list115, "values");
                    akzxVarM12.u();
                    amqkVar = akzxVarM12.b;
                    alatVar4 = amqkVar.b;
                    if (!alatVar4.c()) {
                        amqkVar.b = alad.J(alatVar4);
                    }
                    akyl.i(list115, amqkVar.b);
                    java.util.List listUnmodifiableList118 = j$.util.DesugarCollections.unmodifiableList(akzxVarM12.b.c);
                    aooh.e(listUnmodifiableList118, "getTriggeredExperimentsList(...)");
                    new alct(listUnmodifiableList118);
                    java.util.List list116 = this.w;
                    aooh.f(list116, "values");
                    akzxVarM12.u();
                    amqkVar2 = akzxVarM12.b;
                    alatVar5 = amqkVar2.c;
                    if (!alatVar5.c()) {
                        amqkVar2.c = alad.J(alatVar5);
                    }
                    akyl.i(list116, amqkVar2.c);
                    amqk amqkVarP5 = akzxVarM12.p();
                    aooh.e(amqkVarP5, "build(...)");
                    amqk amqkVar7 = amqkVarP5;
                    aooh.f(amqkVar7, "value");
                    ((akzx) obj).u();
                    amqi amqiVar1117 = ((akzx) obj).b;
                    j$.util.Objects.requireNonNull(amqkVar7);
                    amqiVar1117.A = amqkVar7;
                    amqiVar1117.c |= 131072;
                }
                java.util.List listUnmodifiableList119 = j$.util.DesugarCollections.unmodifiableList(((akzx) obj).b.B);
                aooh.e(listUnmodifiableList119, "getDuplexAudioMatchDetectedDistancesList(...)");
                new alct(listUnmodifiableList119);
                java.util.List list117 = this.t;
                ((akzx) obj).u();
                amqiVar4 = ((akzx) obj).b;
                alagVar = amqiVar4.B;
                if (!alagVar.c()) {
                    amqiVar4.B = alad.F(alagVar);
                }
                akyl.i(list117, amqiVar4.B);
                mnmVar = this.x;
                if (mnmVar != null) {
                    ((akzx) obj).u();
                    amqi amqiVar121 = ((akzx) obj).b;
                    amqiVar121.C = mnmVar.a();
                    amqiVar121.c |= 262144;
                }
                new alct(new alam(((akzx) obj).b.D, amqi.a));
                java.util.List list118 = this.y;
                ((akzx) obj).u();
                amqiVar5 = ((akzx) obj).b;
                alakVar = amqiVar5.D;
                if (!alakVar.c()) {
                    amqiVar5.D = alad.H(alakVar);
                }
                it = list118.iterator();
                while (it.hasNext()) {
                    amqiVar5.D.g(((amqd) it.next()).g);
                }
                bool = this.z;
                if (bool != null) {
                    boolean zBooleanValue3 = bool.booleanValue();
                    ((akzx) obj).u();
                    amqi amqiVar212 = ((akzx) obj).b;
                    amqiVar212.c |= 1048576;
                    amqiVar212.F = zBooleanValue3;
                }
                mokVar = this.A;
                if (mokVar != null) {
                    akzxVarM = amqc.a.m();
                    aooh.f(akzxVarM, "builder");
                    i3 = mokVar.b - 1;
                    if (i3 == i2) {
                        i4 = 2;
                    } else if (i3 != 2) {
                        i4 = i;
                    } else {
                        i4 = 3;
                    }
                    akzxVarM.u();
                    amqc amqcVar7 = akzxVarM.b;
                    amqcVar7.c = i4 - 1;
                    amqcVar7.b |= 1;
                    l = mokVar.a;
                    if (l != null) {
                        long jLongValue3 = l.longValue();
                        akzxVarM.u();
                        amqc amqcVar8 = akzxVarM.b;
                        amqcVar8.b |= 2;
                        amqcVar8.d = jLongValue3;
                    }
                    amqc amqcVarP3 = akzxVarM.p();
                    aooh.e(amqcVarP3, "build(...)");
                    amqc amqcVar9 = amqcVarP3;
                    aooh.f(amqcVar9, "value");
                    ((akzx) obj).u();
                    amqi amqiVar213 = ((akzx) obj).b;
                    j$.util.Objects.requireNonNull(amqcVar9);
                    amqiVar213.G = amqcVar9;
                    amqiVar213.c |= 2097152;
                }
                amqi amqiVarP4 = ((akzx) vquVar2.a).p();
                aooh.e(amqiVarP4, "build(...)");
                amqiVar8 = amqiVarP4;
                apdpVar2.d();
            }
            return amqiVar8;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(boolean z, aoln aolnVar) {
        defpackage.moq moqVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.moq) {
            moqVar = (defpackage.moq) aolnVar;
            int i = moqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                moqVar.d = i - Integer.MIN_VALUE;
            } else {
                moqVar = new defpackage.moq(this, aolnVar);
            }
        } else {
            moqVar = new defpackage.moq(this, aolnVar);
        }
        java.lang.Object obj = moqVar.b;
        aojh aojhVar = aolu.a;
        int i2 = moqVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.C;
                moqVar.e = apdpVar2;
                moqVar.a = z;
                moqVar.d = 1;
                if (apdpVar2.b(moqVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = moqVar.a;
            apdpVar = moqVar.e;
            aooc.af(obj);
            this.z = java.lang.Boolean.valueOf(z);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.mok mokVar, aoln aolnVar) {
        defpackage.mor morVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mor) {
            morVar = (defpackage.mor) aolnVar;
            int i = morVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                morVar.c = i - Integer.MIN_VALUE;
            } else {
                morVar = new defpackage.mor(this, aolnVar);
            }
        } else {
            morVar = new defpackage.mor(this, aolnVar);
        }
        java.lang.Object obj = morVar.a;
        aojh aojhVar = aolu.a;
        int i2 = morVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                morVar.d = mokVar;
                morVar.e = apdpVar;
                morVar.c = 1;
                if (apdpVar.b(morVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = morVar.e;
            defpackage.mok mokVar2 = morVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mokVar = mokVar2;
            this.A = mokVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final java.lang.Object e(java.util.List list, aoln aolnVar) {
        defpackage.mos mosVar;
        apdp apdpVar;
        ?? r5;
        if (aolnVar instanceof defpackage.mos) {
            mosVar = (defpackage.mos) aolnVar;
            int i = mosVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mosVar.d = i - Integer.MIN_VALUE;
            } else {
                mosVar = new defpackage.mos(this, aolnVar);
            }
        } else {
            mosVar = new defpackage.mos(this, aolnVar);
        }
        java.lang.Object obj = mosVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mosVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mosVar.a = list;
                mosVar.e = apdpVar;
                mosVar.d = 1;
                if (apdpVar.b(mosVar) != aojhVar) {
                }
                r5 = list;
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mosVar.e;
            java.lang.Object obj2 = mosVar.a;
            aooc.af(obj);
            apdpVar = apdpVar2;
            r5 = obj2;
            r5 = list;
            ajsz.bv(this.t, (java.lang.Iterable) r5);
            aojhVar = aojh.a;
            r5 = list;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.igw igwVar, aoln aolnVar) {
        defpackage.mot motVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mot) {
            motVar = (defpackage.mot) aolnVar;
            int i = motVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                motVar.c = i - Integer.MIN_VALUE;
            } else {
                motVar = new defpackage.mot(this, aolnVar);
            }
        } else {
            motVar = new defpackage.mot(this, aolnVar);
        }
        java.lang.Object obj = motVar.a;
        aojh aojhVar = aolu.a;
        int i2 = motVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                motVar.d = igwVar;
                motVar.e = apdpVar;
                motVar.c = 1;
                if (apdpVar.b(motVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = motVar.e;
            defpackage.igw igwVar2 = motVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            igwVar = igwVar2;
            this.o = igwVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(alsj alsjVar, aoln aolnVar) {
        defpackage.mou mouVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mou) {
            mouVar = (defpackage.mou) aolnVar;
            int i = mouVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mouVar.c = i - Integer.MIN_VALUE;
            } else {
                mouVar = new defpackage.mou(this, aolnVar);
            }
        } else {
            mouVar = new defpackage.mou(this, aolnVar);
        }
        java.lang.Object obj = mouVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mouVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mouVar.d = alsjVar;
                mouVar.e = apdpVar;
                mouVar.c = 1;
                if (apdpVar.b(mouVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mouVar.e;
            alsj alsjVar2 = mouVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alsjVar = alsjVar2;
            this.q = alsjVar.c;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(alsj alsjVar, aoln aolnVar) {
        defpackage.mov movVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mov) {
            movVar = (defpackage.mov) aolnVar;
            int i = movVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                movVar.c = i - Integer.MIN_VALUE;
            } else {
                movVar = new defpackage.mov(this, aolnVar);
            }
        } else {
            movVar = new defpackage.mov(this, aolnVar);
        }
        java.lang.Object obj = movVar.a;
        aojh aojhVar = aolu.a;
        int i2 = movVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                movVar.d = alsjVar;
                movVar.e = apdpVar;
                movVar.c = 1;
                if (apdpVar.b(movVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = movVar.e;
            alsj alsjVar2 = movVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alsjVar = alsjVar2;
            this.p.add(alsjVar.c);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.iht ihtVar, aoln aolnVar) {
        defpackage.mow mowVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mow) {
            mowVar = (defpackage.mow) aolnVar;
            int i = mowVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mowVar.c = i - Integer.MIN_VALUE;
            } else {
                mowVar = new defpackage.mow(this, aolnVar);
            }
        } else {
            mowVar = new defpackage.mow(this, aolnVar);
        }
        java.lang.Object obj = mowVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mowVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mowVar.d = ihtVar;
                mowVar.e = apdpVar;
                mowVar.c = 1;
                if (apdpVar.b(mowVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mowVar.e;
            defpackage.iht ihtVar2 = mowVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            ihtVar = ihtVar2;
            this.i = ihtVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.mta mtaVar, aoln aolnVar) {
        defpackage.mox moxVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mox) {
            moxVar = (defpackage.mox) aolnVar;
            int i = moxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                moxVar.c = i - Integer.MIN_VALUE;
            } else {
                moxVar = new defpackage.mox(this, aolnVar);
            }
        } else {
            moxVar = new defpackage.mox(this, aolnVar);
        }
        java.lang.Object obj = moxVar.a;
        aojh aojhVar = aolu.a;
        int i2 = moxVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                moxVar.d = mtaVar;
                moxVar.e = apdpVar;
                moxVar.c = 1;
                if (apdpVar.b(moxVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = moxVar.e;
            defpackage.mta mtaVar2 = moxVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mtaVar = mtaVar2;
            this.u = mtaVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.mzv mzvVar, aoln aolnVar) {
        defpackage.moy moyVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.moy) {
            moyVar = (defpackage.moy) aolnVar;
            int i = moyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                moyVar.c = i - Integer.MIN_VALUE;
            } else {
                moyVar = new defpackage.moy(this, aolnVar);
            }
        } else {
            moyVar = new defpackage.moy(this, aolnVar);
        }
        java.lang.Object obj = moyVar.a;
        aojh aojhVar = aolu.a;
        int i2 = moyVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                moyVar.d = mzvVar;
                moyVar.e = apdpVar;
                moyVar.c = 1;
                if (apdpVar.b(moyVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = moyVar.e;
            defpackage.mzv mzvVar2 = moyVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mzvVar = mzvVar2;
            this.k = mzvVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(defpackage.nvp nvpVar, long j, aoln aolnVar) {
        defpackage.moz mozVar;
        apdp apdpVar;
        qbc qbcVar;
        if (aolnVar instanceof defpackage.moz) {
            mozVar = (defpackage.moz) aolnVar;
            int i = mozVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mozVar.d = i - Integer.MIN_VALUE;
            } else {
                mozVar = new defpackage.moz(this, aolnVar);
            }
        } else {
            mozVar = new defpackage.moz(this, aolnVar);
        }
        java.lang.Object obj = mozVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mozVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mozVar.e = nvpVar;
                mozVar.f = apdpVar;
                mozVar.a = j;
                mozVar.d = 1;
                if (apdpVar.b(mozVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = mozVar.a;
            apdp apdpVar2 = mozVar.f;
            defpackage.nvp nvpVar2 = mozVar.e;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nvpVar = nvpVar2;
            int iOrdinal = nvpVar.ordinal();
            if (iOrdinal == 62) {
                qbcVar = qbc.bc;
            } else if (iOrdinal == 69) {
                qbcVar = qbc.Q;
            } else if (iOrdinal == 109) {
                qbcVar = qbc.ad;
            } else if (iOrdinal == 85) {
                qbcVar = qbc.bf;
            } else if (iOrdinal != 86) {
                switch (iOrdinal) {
                    case 1:
                        qbcVar = qbc.bh;
                        break;
                    case 2:
                        qbcVar = qbc.ac;
                        break;
                    case 3:
                        qbcVar = qbc.P;
                        break;
                    case 4:
                        qbcVar = qbc.R;
                        break;
                    case 5:
                        qbcVar = qbc.U;
                        break;
                    case 6:
                        qbcVar = qbc.V;
                        break;
                    case 7:
                        qbcVar = qbc.W;
                        break;
                    case 8:
                        qbcVar = qbc.X;
                        break;
                    case 9:
                        qbcVar = qbc.Y;
                        break;
                    case 10:
                        qbcVar = qbc.Z;
                        break;
                    case 11:
                        qbcVar = qbc.bi;
                        break;
                    case 12:
                        qbcVar = qbc.aU;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        qbcVar = qbc.aV;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        qbcVar = qbc.aW;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        qbcVar = qbc.aX;
                        break;
                    case 16:
                        qbcVar = qbc.aY;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        qbcVar = qbc.ae;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        qbcVar = qbc.af;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        qbcVar = qbc.ai;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                        qbcVar = qbc.ah;
                        break;
                    default:
                        switch (iOrdinal) {
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                                qbcVar = qbc.aI;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                                qbcVar = qbc.bd;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                qbcVar = qbc.aJ;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                                qbcVar = qbc.aK;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                qbcVar = qbc.ak;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                qbcVar = qbc.al;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                qbcVar = qbc.am;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                qbcVar = qbc.an;
                                break;
                            case 30:
                                qbcVar = qbc.ao;
                                break;
                            case 31:
                                qbcVar = qbc.ap;
                                break;
                            case 32:
                                qbcVar = qbc.aq;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                qbcVar = qbc.be;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                qbcVar = qbc.bb;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                qbcVar = qbc.ar;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                qbcVar = qbc.as;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                qbcVar = qbc.at;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                qbcVar = qbc.au;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                qbcVar = qbc.av;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                qbcVar = qbc.aL;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                qbcVar = qbc.aw;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                qbcVar = qbc.ax;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                qbcVar = qbc.ay;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                qbcVar = qbc.az;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                qbcVar = qbc.aA;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                qbcVar = qbc.aB;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                qbcVar = qbc.aC;
                                break;
                            case 48:
                                qbcVar = qbc.ag;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                qbcVar = qbc.aO;
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                qbcVar = qbc.aM;
                                break;
                            case 51:
                                qbcVar = qbc.aN;
                                break;
                            case 52:
                                qbcVar = qbc.aj;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 55:
                                        qbcVar = qbc.aD;
                                        break;
                                    case 56:
                                        qbcVar = qbc.aE;
                                        break;
                                    case 57:
                                        qbcVar = qbc.aF;
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                                qbcVar = qbc.aG;
                                                break;
                                            case 65:
                                                qbcVar = qbc.aH;
                                                break;
                                            case 66:
                                                qbcVar = qbc.T;
                                                break;
                                            default:
                                                switch (iOrdinal) {
                                                    case 92:
                                                        qbcVar = qbc.aa;
                                                        break;
                                                    case 93:
                                                        qbcVar = qbc.aP;
                                                        break;
                                                    case 94:
                                                        qbcVar = qbc.aQ;
                                                        break;
                                                    case 95:
                                                        qbcVar = qbc.ab;
                                                        break;
                                                    case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                                        qbcVar = qbc.aR;
                                                        break;
                                                    default:
                                                        qbcVar = null;
                                                        switch (iOrdinal) {
                                                            case 99:
                                                                if (((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue()) {
                                                                    qbcVar = qbc.oK;
                                                                }
                                                                break;
                                                            case 100:
                                                                qbcVar = qbc.bj;
                                                                break;
                                                            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                                                qbcVar = qbc.S;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                qbcVar = qbc.bg;
            }
            if (qbcVar != null) {
                this.B.a(qbcVar);
            }
            java.util.List list = this.c;
            akzx akzxVarM = amqb.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(nvpVar, "value");
            akzxVarM.u();
            amqb amqbVar = akzxVarM.b;
            amqbVar.c = nvpVar.bg;
            amqbVar.b |= 1;
            akzxVarM.u();
            amqb amqbVar2 = akzxVarM.b;
            amqbVar2.b |= 2;
            amqbVar2.d = j;
            amqb amqbVarP = akzxVarM.p();
            aooh.e(amqbVarP, "build(...)");
            list.add(amqbVarP);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(defpackage.nfb nfbVar, aoln aolnVar) {
        defpackage.mpa mpaVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpa) {
            mpaVar = (defpackage.mpa) aolnVar;
            int i = mpaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpaVar.c = i - Integer.MIN_VALUE;
            } else {
                mpaVar = new defpackage.mpa(this, aolnVar);
            }
        } else {
            mpaVar = new defpackage.mpa(this, aolnVar);
        }
        java.lang.Object obj = mpaVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpaVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpaVar.d = nfbVar;
                mpaVar.e = apdpVar;
                mpaVar.c = 1;
                if (apdpVar.b(mpaVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpaVar.e;
            defpackage.nfb nfbVar2 = mpaVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nfbVar = nfbVar2;
            this.l = nfbVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(nok nokVar, aoln aolnVar) {
        defpackage.mpb mpbVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpb) {
            mpbVar = (defpackage.mpb) aolnVar;
            int i = mpbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpbVar.c = i - Integer.MIN_VALUE;
            } else {
                mpbVar = new defpackage.mpb(this, aolnVar);
            }
        } else {
            mpbVar = new defpackage.mpb(this, aolnVar);
        }
        java.lang.Object obj = mpbVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpbVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpbVar.d = nokVar;
                mpbVar.e = apdpVar;
                mpbVar.c = 1;
                if (apdpVar.b(mpbVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpbVar.e;
            nok nokVar2 = mpbVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nokVar = nokVar2;
            this.j = nokVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(defpackage.msg msgVar, aoln aolnVar) {
        defpackage.mpc mpcVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpc) {
            mpcVar = (defpackage.mpc) aolnVar;
            int i = mpcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpcVar.c = i - Integer.MIN_VALUE;
            } else {
                mpcVar = new defpackage.mpc(this, aolnVar);
            }
        } else {
            mpcVar = new defpackage.mpc(this, aolnVar);
        }
        java.lang.Object obj = mpcVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpcVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpcVar.d = msgVar;
                mpcVar.e = apdpVar;
                mpcVar.c = 1;
                if (apdpVar.b(mpcVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpcVar.e;
            defpackage.msg msgVar2 = mpcVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            msgVar = msgVar2;
            this.f = msgVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(mnm mnmVar, aoln aolnVar) {
        defpackage.mpd mpdVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpd) {
            mpdVar = (defpackage.mpd) aolnVar;
            int i = mpdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpdVar.c = i - Integer.MIN_VALUE;
            } else {
                mpdVar = new defpackage.mpd(this, aolnVar);
            }
        } else {
            mpdVar = new defpackage.mpd(this, aolnVar);
        }
        java.lang.Object obj = mpdVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpdVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpdVar.d = mnmVar;
                mpdVar.e = apdpVar;
                mpdVar.c = 1;
                if (apdpVar.b(mpdVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpdVar.e;
            mnm mnmVar2 = mpdVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mnmVar = mnmVar2;
            this.x = mnmVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(java.lang.String str, aoln aolnVar) {
        defpackage.mpe mpeVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpe) {
            mpeVar = (defpackage.mpe) aolnVar;
            int i = mpeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpeVar.c = i - Integer.MIN_VALUE;
            } else {
                mpeVar = new defpackage.mpe(this, aolnVar);
            }
        } else {
            mpeVar = new defpackage.mpe(this, aolnVar);
        }
        java.lang.Object obj = mpeVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpeVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpeVar.d = str;
                mpeVar.e = apdpVar;
                mpeVar.c = 1;
                if (apdpVar.b(mpeVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpeVar.e;
            java.lang.String str2 = mpeVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.h = str;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(alrx alrxVar, aoln aolnVar) {
        defpackage.mpf mpfVar;
        apdp apdpVar;
        amqd amqdVar;
        if (aolnVar instanceof defpackage.mpf) {
            mpfVar = (defpackage.mpf) aolnVar;
            int i = mpfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpfVar.c = i - Integer.MIN_VALUE;
            } else {
                mpfVar = new defpackage.mpf(this, aolnVar);
            }
        } else {
            mpfVar = new defpackage.mpf(this, aolnVar);
        }
        java.lang.Object obj = mpfVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpfVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpfVar.d = alrxVar;
                mpfVar.e = apdpVar;
                mpfVar.c = 1;
                if (apdpVar.b(mpfVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpfVar.e;
            alrx alrxVar2 = mpfVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alrxVar = alrxVar2;
            java.util.List list = this.y;
            int iOrdinal = alrxVar.ordinal();
            if (iOrdinal == 0) {
                amqdVar = amqd.a;
            } else if (iOrdinal == 1) {
                amqdVar = amqd.b;
            } else if (iOrdinal == 2) {
                amqdVar = amqd.c;
            } else if (iOrdinal == 3) {
                amqdVar = amqd.d;
            } else if (iOrdinal == 4) {
                amqdVar = amqd.e;
            } else {
                if (iOrdinal != 5) {
                    throw new aois();
                }
                amqdVar = amqd.f;
            }
            list.add(amqdVar);
            aojhVar = aojh.a;
            apdpVar.d();
            return aojhVar;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(java.lang.String str, aoln aolnVar) {
        defpackage.mpg mpgVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpg) {
            mpgVar = (defpackage.mpg) aolnVar;
            int i = mpgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpgVar.c = i - Integer.MIN_VALUE;
            } else {
                mpgVar = new defpackage.mpg(this, aolnVar);
            }
        } else {
            mpgVar = new defpackage.mpg(this, aolnVar);
        }
        java.lang.Object obj = mpgVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpgVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpgVar.d = str;
                mpgVar.e = apdpVar;
                mpgVar.c = 1;
                if (apdpVar.b(mpgVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpgVar.e;
            java.lang.String str2 = mpgVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.d = str;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(alxy alxyVar, aoln aolnVar) {
        defpackage.mph mphVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mph) {
            mphVar = (defpackage.mph) aolnVar;
            int i = mphVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mphVar.c = i - Integer.MIN_VALUE;
            } else {
                mphVar = new defpackage.mph(this, aolnVar);
            }
        } else {
            mphVar = new defpackage.mph(this, aolnVar);
        }
        java.lang.Object obj = mphVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mphVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mphVar.d = alxyVar;
                mphVar.e = apdpVar;
                mphVar.c = 1;
                if (apdpVar.b(mphVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mphVar.e;
            alxy alxyVar2 = mphVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alxyVar = alxyVar2;
            this.g = alxyVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(alri alriVar, aoln aolnVar) {
        defpackage.mpi mpiVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpi) {
            mpiVar = (defpackage.mpi) aolnVar;
            int i = mpiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpiVar.c = i - Integer.MIN_VALUE;
            } else {
                mpiVar = new defpackage.mpi(this, aolnVar);
            }
        } else {
            mpiVar = new defpackage.mpi(this, aolnVar);
        }
        java.lang.Object obj = mpiVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpiVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpiVar.d = alriVar;
                mpiVar.e = apdpVar;
                mpiVar.c = 1;
                if (apdpVar.b(mpiVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpiVar.e;
            alri alriVar2 = mpiVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alriVar = alriVar2;
            java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(alriVar.c);
            aooh.e(mapUnmodifiableMap, "getConsideredExperimentsMap(...)");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                if (((java.lang.Integer) entry.getValue()).intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.v = ajsz.bZ(linkedHashMap.keySet());
            java.util.Map mapUnmodifiableMap2 = j$.util.DesugarCollections.unmodifiableMap(alriVar.d);
            aooh.e(mapUnmodifiableMap2, "getTriggeredExperimentsMap(...)");
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : mapUnmodifiableMap2.entrySet()) {
                if (((java.lang.Integer) entry2.getValue()).intValue() > 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            this.w = ajsz.bZ(linkedHashMap2.keySet());
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(tvx tvxVar, aoln aolnVar) {
        defpackage.mpj mpjVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpj) {
            mpjVar = (defpackage.mpj) aolnVar;
            int i = mpjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpjVar.c = i - Integer.MIN_VALUE;
            } else {
                mpjVar = new defpackage.mpj(this, aolnVar);
            }
        } else {
            mpjVar = new defpackage.mpj(this, aolnVar);
        }
        java.lang.Object obj = mpjVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpjVar.d = tvxVar;
                mpjVar.e = apdpVar;
                mpjVar.c = 1;
                if (apdpVar.b(mpjVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpjVar.e;
            tvx tvxVar2 = mpjVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            tvxVar = tvxVar2;
            this.s.add(tvxVar);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(java.lang.String str, aoln aolnVar) {
        defpackage.mpk mpkVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpk) {
            mpkVar = (defpackage.mpk) aolnVar;
            int i = mpkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpkVar.c = i - Integer.MIN_VALUE;
            } else {
                mpkVar = new defpackage.mpk(this, aolnVar);
            }
        } else {
            mpkVar = new defpackage.mpk(this, aolnVar);
        }
        java.lang.Object obj = mpkVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mpkVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpkVar.d = str;
                mpkVar.e = apdpVar;
                mpkVar.c = 1;
                if (apdpVar.b(mpkVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpkVar.e;
            java.lang.String str2 = mpkVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.r.add(str);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(int i, aoln aolnVar) {
        defpackage.mpl mplVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpl) {
            mplVar = (defpackage.mpl) aolnVar;
            int i2 = mplVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mplVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mplVar = new defpackage.mpl(this, aolnVar);
            }
        } else {
            mplVar = new defpackage.mpl(this, aolnVar);
        }
        java.lang.Object obj = mplVar.b;
        aojh aojhVar = aolu.a;
        int i3 = mplVar.d;
        try {
            if (i3 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.C;
                mplVar.e = apdpVar2;
                mplVar.a = i;
                mplVar.d = 1;
                if (apdpVar2.b(mplVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = mplVar.a;
            apdpVar = mplVar.e;
            aooc.af(obj);
            this.e = new java.lang.Integer(i);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d A[PHI: r2
      0x007d: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:22:0x006b, B:26:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(alyi alyiVar, aoln aolnVar) {
        defpackage.mpm mpmVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mpm) {
            mpmVar = (defpackage.mpm) aolnVar;
            int i = mpmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpmVar.c = i - Integer.MIN_VALUE;
            } else {
                mpmVar = new defpackage.mpm(this, aolnVar);
            }
        } else {
            mpmVar = new defpackage.mpm(this, aolnVar);
        }
        java.lang.Object obj = mpmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mpmVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.C;
            mpmVar.d = alyiVar;
            mpmVar.e = apdpVar;
            mpmVar.c = 1;
            if (apdpVar.b(mpmVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpmVar.e;
            alyi alyiVar2 = mpmVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alyiVar = alyiVar2;
        }
        try {
            java.util.List list = this.n;
            vqu vquVarM = akky.M(amqh.a.m());
            java.lang.String str = alyiVar.g;
            aooh.e(str, "getContentId(...)");
            vquVarM.aE(str);
            int iR = defpackage.airh.r(alyiVar.h);
            int i3 = (iR != 0 ? iR : 1) - 1;
            int i4 = 2;
            if (i3 != 0) {
                int i5 = 3;
                if (i3 != 2) {
                    i4 = 4;
                    if (i3 != 3) {
                        i5 = 5;
                        if (i3 == 4) {
                            i4 = i5;
                        } else {
                            if (i3 != 5) {
                                throw new aois();
                            }
                            i4 = 6;
                        }
                    }
                } else {
                    i4 = i5;
                }
            }
            vquVarM.aG(i4);
            vquVarM.aF(alyiVar.c);
            list.add(vquVarM.aD());
            apdpVar.d();
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    public final java.lang.Object z(java.lang.Iterable iterable, aoln aolnVar) {
        defpackage.mpn mpnVar;
        apdp apdpVar;
        ?? r8;
        if (aolnVar instanceof defpackage.mpn) {
            mpnVar = (defpackage.mpn) aolnVar;
            int i = mpnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpnVar.d = i - Integer.MIN_VALUE;
            } else {
                mpnVar = new defpackage.mpn(this, aolnVar);
            }
        } else {
            mpnVar = new defpackage.mpn(this, aolnVar);
        }
        java.lang.Object obj = mpnVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpnVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.C;
                mpnVar.a = iterable;
                mpnVar.e = apdpVar;
                mpnVar.d = 1;
                if (apdpVar.b(mpnVar) != aojhVar) {
                }
                r8 = iterable;
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mpnVar.e;
            java.lang.Object obj2 = mpnVar.a;
            aooc.af(obj);
            apdpVar = apdpVar2;
            r8 = obj2;
            r8 = iterable;
            java.util.List list = this.m;
            akzx akzxVarM = amqg.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.b);
            aooh.e(listUnmodifiableList, "getSuggestedReplyInfosList(...)");
            new alct(listUnmodifiableList);
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r8, 10));
            for (defpackage.njg njgVar : r8) {
                vqu vquVarM = akky.M(amqh.a.m());
                java.lang.String str = njgVar.h;
                aooh.e(str, "getContentId(...)");
                vquVarM.aE(str);
                int iAb = a.ab(njgVar.i);
                if (iAb == 0) {
                    iAb = 1;
                }
                vquVarM.aG(iAb);
                vquVarM.aF(njgVar.d);
                arrayList.add(vquVarM.aD());
            }
            akzxVarM.u();
            amqg amqgVar = akzxVarM.b;
            alat alatVar = amqgVar.b;
            if (!alatVar.c()) {
                amqgVar.b = alad.J(alatVar);
            }
            akyl.i(arrayList, amqgVar.b);
            amqg amqgVarP = akzxVarM.p();
            aooh.e(amqgVarP, "build(...)");
            list.add(amqgVarP);
            aojhVar = aojh.a;
            r8 = iterable;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }
}

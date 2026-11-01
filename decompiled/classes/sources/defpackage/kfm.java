package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfm implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource");
    public static final java.lang.String b;
    public final defpackage.aoin c;
    public final defpackage.ojo d;
    public final defpackage.zrw e;
    public final defpackage.aoin f;
    public final defpackage.aoir g;
    public final defpackage.rsr h;
    private final android.content.Context i;
    private final defpackage.aoss j;
    private final defpackage.kfv k;
    private final defpackage.rlv l;
    private final defpackage.ssq m;
    private final defpackage.aoin n;
    private final defpackage.aoir o;
    private java.lang.Long p;
    private final defpackage.aoir q;
    private final defpackage.aoir r;

    static {
        java.lang.String strFlattenToString = new android.content.ComponentName("com.google.android.apps.tachyon", "com.google.android.apps.tachyon.telecom.TachyonTelecomConnectionService").flattenToString();
        defpackage.aooh.e(strFlattenToString, "flattenToString(...)");
        b = strFlattenToString;
    }

    public kfm(android.content.Context context, defpackage.aoss aossVar, defpackage.aoin aoinVar, defpackage.rsr rsrVar, defpackage.ojo ojoVar, defpackage.kfv kfvVar, defpackage.rlv rlvVar, defpackage.ssq ssqVar, defpackage.zrw zrwVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.zjm zjmVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("sharedPreferencesProvider");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (ssqVar == null) {
            defpackage.aooh.i("phoneNumberHelper");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableHalo");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("haloPhoneAccountComponentNameAllowlist");
        }
        this.i = context;
        this.j = aossVar;
        this.c = aoinVar;
        this.h = rsrVar;
        this.d = ojoVar;
        this.k = kfvVar;
        this.l = rlvVar;
        this.m = ssqVar;
        this.e = zrwVar;
        this.f = aoinVar2;
        this.n = aoinVar3;
        this.o = new defpackage.aoiy(new defpackage.jza(zjmVar, 15));
        this.q = new defpackage.aoiy(new defpackage.jza(this, 16));
        this.g = new defpackage.aoiy(new defpackage.jza(this, 17));
        this.r = new defpackage.aoiy(new defpackage.jza(this, 18));
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("SystemCallLogDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        if (kfjVar.f()) {
            return defpackage.aosv.F(this.j, 0, new defpackage.mbq(this, kfjVar, (defpackage.aoln) null, 1), 3);
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02fd A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0319 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0354 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x035e A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0367  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b8 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03c0 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03c6 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x03ce A[Catch: all -> 0x057f, PHI: r4
      0x03ce: PHI (r4v26 int) = (r4v24 int), (r4v38 int) binds: [B:117:0x03c4, B:119:0x03cd] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03d8 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x03de  */
    /* JADX WARN: Code duplicated, block: B:126:0x03e2 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ef A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f9 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0401  */
    /* JADX WARN: Code duplicated, block: B:138:0x0408 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x040e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0412 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x041b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0426 A[Catch: all -> 0x057f, TRY_ENTER, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x046c  */
    /* JADX WARN: Code duplicated, block: B:160:0x049c A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x04c3 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x04ce A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x04e6 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04f3 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x050b A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0511  */
    /* JADX WARN: Code duplicated, block: B:180:0x0520 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0558 A[LOOP:0: B:211:0x01e4->B:185:0x0558, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0579 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0573 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0569 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:14:0x0048, B:19:0x0059, B:42:0x011c, B:43:0x0122, B:45:0x0128, B:46:0x0136, B:22:0x0064, B:31:0x00b8, B:33:0x00c2, B:35:0x00ed, B:34:0x00d4), top: B:207:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:14:0x0048, B:19:0x0059, B:42:0x011c, B:43:0x0122, B:45:0x0128, B:46:0x0136, B:22:0x0064, B:31:0x00b8, B:33:0x00c2, B:35:0x00ed, B:34:0x00d4), top: B:207:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128 A[Catch: all -> 0x0068, LOOP:2: B:43:0x0122->B:45:0x0128, LOOP_END, TryCatch #1 {all -> 0x0068, blocks: (B:14:0x0048, B:19:0x0059, B:42:0x011c, B:43:0x0122, B:45:0x0128, B:46:0x0136, B:22:0x0064, B:31:0x00b8, B:33:0x00c2, B:35:0x00ed, B:34:0x00d4), top: B:207:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01be  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c9 A[Catch: all -> 0x0581, TRY_ENTER, TryCatch #0 {all -> 0x0581, blocks: (B:56:0x01a8, B:59:0x01b4, B:61:0x01b9, B:63:0x01bf, B:66:0x01c9, B:68:0x01d7, B:187:0x056b, B:188:0x0572), top: B:205:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ea A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0206 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x027e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b8 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02be  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c0 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02c6 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d8 A[Catch: all -> 0x057f, TryCatch #4 {all -> 0x057f, blocks: (B:70:0x01e4, B:72:0x01ea, B:171:0x0501, B:175:0x050b, B:177:0x0512, B:178:0x051a, B:180:0x0520, B:182:0x0530, B:183:0x053a, B:73:0x0206, B:77:0x0227, B:79:0x0240, B:83:0x0280, B:85:0x0288, B:87:0x028d, B:91:0x02b8, B:96:0x02c6, B:98:0x02d8, B:100:0x02f7, B:102:0x02fd, B:103:0x0319, B:105:0x0354, B:106:0x0357, B:108:0x035e, B:113:0x0368, B:115:0x03b8, B:120:0x03ce, B:122:0x03d8, B:127:0x03e7, B:130:0x03ef, B:134:0x03fd, B:138:0x0408, B:143:0x0417, B:145:0x041d, B:148:0x0426, B:150:0x042c, B:152:0x0434, B:154:0x043a, B:156:0x0446, B:159:0x0479, B:161:0x04ab, B:163:0x04c3, B:164:0x04ce, B:166:0x04e6, B:168:0x04f3, B:189:0x0573, B:190:0x0578, B:191:0x0579, B:192:0x057e, B:158:0x0471, B:160:0x049c, B:142:0x0412, B:133:0x03f9, B:126:0x03e2, B:116:0x03c0, B:118:0x03c6, B:94:0x02c0), top: B:211:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.io.Closeable] */
    public final java.lang.Object c(defpackage.kfj kfjVar, defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.kfl kflVar;
        java.lang.Throwable th;
        ?? r13;
        java.lang.String str;
        defpackage.sso ssoVar;
        kfx kfxVar;
        defpackage.kfj kfjVar2;
        long j;
        ?? r14;
        defpackage.acz aczVar;
        long j2;
        defpackage.kfj kfjVar3;
        java.lang.Object obj;
        java.io.Closeable closeable;
        boolean zBooleanValue;
        defpackage.aimz aimzVar;
        defpackage.aojh aojhVar;
        java.lang.Throwable th2;
        ?? r15;
        java.util.Iterator it;
        ?? r11;
        ?? r23;
        java.util.Set set;
        defpackage.kgz kgzVarF;
        java.lang.String str2;
        int columnIndex;
        java.lang.String str3;
        long j3;
        int columnIndex2;
        int columnIndex3;
        kfx kfxVar2;
        long j4;
        defpackage.kfj kfjVar4;
        int i;
        int i2;
        defpackage.sso ssoVar2;
        long j5;
        java.lang.String str4;
        java.lang.String str5;
        long j6;
        boolean zContains;
        java.lang.String string;
        java.lang.String string2;
        int i3;
        java.lang.String string3;
        java.lang.String string4;
        int i4;
        defpackage.kfm kfmVar;
        android.content.ContentValues contentValues;
        java.lang.String str6;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String str7;
        java.lang.String string5;
        int i9;
        kfx kfxVar3;
        defpackage.kfj kfjVar5;
        java.lang.Long lValueOf;
        java.lang.String string6;
        java.lang.String string7;
        java.lang.String string8;
        java.lang.String string9;
        long j7;
        java.lang.Long l;
        java.util.Iterator it2;
        int i10;
        long jLongValue;
        java.lang.String str8 = "name";
        if (aolnVar instanceof defpackage.kfl) {
            kflVar = (defpackage.kfl) aolnVar;
            int i11 = kflVar.g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kflVar.g = i11 - Integer.MIN_VALUE;
            } else {
                kflVar = new defpackage.kfl(this, aolnVar);
            }
        } else {
            kflVar = new defpackage.kfl(this, aolnVar);
        }
        java.lang.Object objA = kflVar.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i12 = kflVar.g;
        java.lang.String str9 = "fillFromSystemCallLog$<anonymous>";
        try {
            if (i12 == 0) {
                str = "SystemCallLogDataSource.kt";
                defpackage.aooc.af(objA);
                defpackage.aosy aosyVarAm = defpackage.aoov.am(this.j, 0, new defpackage.dgz(this, (defpackage.aoln) null, 20), 3);
                defpackage.ojo ojoVar = this.d;
                java.lang.Object objA2 = this.q.a();
                defpackage.aooh.e(objA2, "getValue(...)");
                android.database.Cursor cursorB = ojoVar.b((android.net.Uri) objA2, (java.lang.String[]) this.r.a(), null, null, "date DESC");
                try {
                    if (cursorB == null) {
                        defpackage.zrw zrwVar = this.e;
                        kflVar.k = null;
                        kflVar.g = 1;
                        objA = zrwVar.j(kflVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        closeable = cursorB;
                        zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                        aimzVar = a;
                        if (zBooleanValue) {
                            ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 175, str)).v("handleInsertsAndUpdatesInternal null cursor");
                        } else {
                            ((defpackage.aimw) aimzVar.d().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 170, str)).v("handleInsertsAndUpdatesInternal null cursor missing permission");
                        }
                        aojhVar = defpackage.aojh.a;
                        th2 = null;
                        r15 = closeable;
                        defpackage.ajsz.ak(r15, th2);
                        return aojhVar;
                    }
                    if (!cursorB.moveToFirst()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 182, str)).v("no results; deleting all entries");
                        kflVar.k = (defpackage.kfk) kfjVar;
                        kflVar.a = cursorB;
                        kflVar.g = 2;
                        objA = aosyVarAm.a(kflVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        kfjVar3 = kfjVar;
                        obj = cursorB;
                        it = ((java.util.Set) objA).iterator();
                        while (it.hasNext()) {
                            kfjVar3.c(((java.lang.Number) it.next()).longValue());
                        }
                        aojhVar = defpackage.aojh.a;
                        th2 = null;
                        r15 = obj;
                        defpackage.ajsz.ak(r15, th2);
                        return aojhVar;
                    }
                    ssoVar = new defpackage.sso(this.i);
                    this.k.a();
                    if (kfjVar == null) {
                        defpackage.aooh.i("callLogMutations");
                    }
                    kfxVar = new kfx(kfjVar);
                    long j8 = ((defpackage.zth) this.c.a()).a().getLong("systemCallLogMaxTimestampProcessed", 0L);
                    int count = cursorB.getCount();
                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 202, str)).w("found %d entries", count);
                    defpackage.acz aczVar2 = new defpackage.acz(count);
                    kflVar.k = (defpackage.kfk) kfjVar;
                    kflVar.a = cursorB;
                    kflVar.b = cursorB;
                    kflVar.h = ssoVar;
                    kflVar.j = kfxVar;
                    kflVar.i = aczVar2;
                    kflVar.c = j8;
                    kflVar.d = j8;
                    kflVar.g = 3;
                    objA = aosyVarAm.a(kflVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    kfjVar2 = kfjVar;
                    j = j8;
                    r14 = cursorB;
                    aczVar = aczVar2;
                    j2 = j;
                    r11 = cursorB;
                    set = (java.util.Set) objA;
                    kgzVarF = f();
                    long j9 = j;
                    str2 = "lookup_uri";
                    if (kgzVarF == null) {
                        columnIndex = -1;
                    } else {
                        columnIndex = -1;
                    }
                    str3 = "uuid";
                    if (f() != null) {
                        long j10 = j2;
                        columnIndex2 = r11.getColumnIndex("uuid");
                        j3 = j10;
                    } else {
                        j3 = j2;
                        columnIndex2 = -1;
                    }
                    columnIndex3 = r11.getColumnIndex("name");
                    r23 = r14;
                    kfxVar2 = kfxVar;
                    j4 = j9;
                    kfjVar4 = kfjVar2;
                    i = 0;
                    while (true) {
                        if (r11.isNull(i)) {
                            ssoVar2 = ssoVar;
                            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 229, str)).v("skipping the entry where Calls._ID column is null.");
                            str4 = str2;
                            str5 = str3;
                            i2 = columnIndex3;
                        } else {
                            i2 = columnIndex3;
                            ssoVar2 = ssoVar;
                            j5 = r11.getLong(0);
                            str4 = str2;
                            str5 = str3;
                            j6 = r11.getLong(2);
                            zContains = set.contains(new java.lang.Long(j5));
                            if (zContains) {
                            }
                            long jMax = java.lang.Math.max(j6, j4);
                            string = r11.getString(11);
                            string2 = r11.getString(12);
                            i3 = r11.getInt(13);
                            string3 = r11.getString(11);
                            string4 = r11.getString(12);
                            int i13 = r11.getInt(13);
                            if (defpackage.aooh.n(b, string3)) {
                                i4 = columnIndex;
                                if (!defpackage.aooh.n(string4, "0")) {
                                }
                                j7 = jMax;
                                if (!r11.moveToNext()) {
                                    if (j7 != j3) {
                                        l = new java.lang.Long(j7);
                                    } else {
                                        l = null;
                                    }
                                    kfmVar.p = l;
                                    it2 = set.iterator();
                                    i10 = i9;
                                    while (it2.hasNext()) {
                                        jLongValue = ((java.lang.Number) it2.next()).longValue();
                                        if (!aczVar.a(jLongValue)) {
                                            defpackage.kfj kfjVar6 = kfjVar4;
                                            kfjVar6.c(jLongValue);
                                            i10++;
                                            kfjVar4 = kfjVar6;
                                        }
                                    }
                                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                    defpackage.ajsz.ak(r23, null);
                                    return defpackage.aojh.a;
                                }
                                columnIndex = i8;
                                str2 = str7;
                                kfxVar2 = kfxVar3;
                                i = i9;
                                str3 = str5;
                                str9 = str6;
                                j4 = j7;
                                str8 = str8;
                                set = set;
                            } else {
                                i4 = columnIndex;
                            }
                            if (columnIndex2 < 0) {
                                kfmVar = this;
                                if (aczVar.c(j5)) {
                                    contentValues = new android.content.ContentValues();
                                    str6 = str9;
                                    contentValues.put("duration", new java.lang.Integer(r11.getInt(7)));
                                    long j11 = r11.getLong(1);
                                    contentValues.put("call_mapping_id", java.lang.String.valueOf(j11));
                                    contentValues.put("features", new java.lang.Integer(i3));
                                    contentValues.put("phone_account_component_name", string);
                                    if (r11 == 0) {
                                        defpackage.aooh.i("<this>");
                                    }
                                    if (r11.isNull(5)) {
                                        i5 = 3;
                                    } else {
                                        i5 = 3;
                                    }
                                    contentValues.put("call_type", new java.lang.Integer(i5));
                                    contentValues.put("is_read", new java.lang.Integer(defpackage.kcq.x(r11, 9)));
                                    contentValues.put("timestamp", new java.lang.Long(j11));
                                    contentValues.put("new", new java.lang.Integer(defpackage.kcq.x(r11, 10)));
                                    contentValues.put("data_usage", new java.lang.Integer(r11.getInt(8)));
                                    contentValues.put("phone_account_id", string2);
                                    if (r11.isNull(4)) {
                                        kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_NULL_IN_SYSTEM_CALL_LOG);
                                    } else {
                                        i6 = r11.getInt(4);
                                        if (i6 == 0) {
                                            kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_ZERO_IN_SYSTEM_CALL_LOG);
                                        } else {
                                            contentValues.put("presentation", new java.lang.Integer(i6));
                                            if (columnIndex2 >= 0) {
                                                if (r11.isNull(columnIndex2)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = r11.getString(columnIndex2);
                                                }
                                                str5 = str5;
                                                contentValues.put(str5, string8);
                                            } else {
                                                str5 = str5;
                                            }
                                            if (i2 >= 0) {
                                                i7 = i2;
                                                if (r11.isNull(i7)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = r11.getString(i7);
                                                }
                                                contentValues.put(str8, string7);
                                            } else {
                                                i7 = i2;
                                            }
                                            i8 = i4;
                                            if (i8 != -1) {
                                                if (r11.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = r11.getString(i8);
                                                }
                                                str7 = str4;
                                                contentValues.put(str7, string6);
                                            } else {
                                                str7 = str4;
                                            }
                                            string5 = r11.getString(3);
                                            if (string5 != null) {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            } else {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            }
                                            i9 = 0;
                                            java.lang.Object[] objArr = {new kfw(j6)};
                                            defpackage.ahvr.ay(objArr, 1);
                                            new defpackage.aike(objArr, 1);
                                            if (zContains) {
                                                columnIndex3 = i7;
                                                kfxVar3 = kfxVar2;
                                                kfjVar5 = kfxVar3.a;
                                                lValueOf = java.lang.Long.valueOf(j5);
                                                if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                }
                                                if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                }
                                                if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                    r14 = r23;
                                                    throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                }
                                                th = th;
                                                r13 = r23;
                                                throw th;
                                            }
                                            kfxVar3 = kfxVar2;
                                            columnIndex3 = i7;
                                            kfxVar3.a.d(j5, contentValues);
                                        }
                                    }
                                    i6 = 1;
                                    contentValues.put("presentation", new java.lang.Integer(i6));
                                    if (columnIndex2 >= 0) {
                                        if (r11.isNull(columnIndex2)) {
                                            string8 = null;
                                        } else {
                                            string8 = r11.getString(columnIndex2);
                                        }
                                        str5 = str5;
                                        contentValues.put(str5, string8);
                                    } else {
                                        str5 = str5;
                                    }
                                    if (i2 >= 0) {
                                        i7 = i2;
                                        if (r11.isNull(i7)) {
                                            string7 = null;
                                        } else {
                                            string7 = r11.getString(i7);
                                        }
                                        contentValues.put(str8, string7);
                                    } else {
                                        i7 = i2;
                                    }
                                    i8 = i4;
                                    if (i8 != -1) {
                                        if (r11.isNull(i8)) {
                                            string6 = null;
                                        } else {
                                            string6 = r11.getString(i8);
                                        }
                                        str7 = str4;
                                        contentValues.put(str7, string6);
                                    } else {
                                        str7 = str4;
                                    }
                                    string5 = r11.getString(3);
                                    if (string5 != null) {
                                        str5 = str5;
                                        str8 = str8;
                                        ssoVar = ssoVar2;
                                        contentValues.put("number", hkd.a.i());
                                    } else {
                                        str5 = str5;
                                        str8 = str8;
                                        ssoVar = ssoVar2;
                                        contentValues.put("number", hkd.a.i());
                                    }
                                    i9 = 0;
                                    java.lang.Object[] objArr2 = {new kfw(j6)};
                                    defpackage.ahvr.ay(objArr2, 1);
                                    new defpackage.aike(objArr2, 1);
                                    if (zContains) {
                                        columnIndex3 = i7;
                                        kfxVar3 = kfxVar2;
                                        kfjVar5 = kfxVar3.a;
                                        lValueOf = java.lang.Long.valueOf(j5);
                                        if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                        }
                                        if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                        }
                                        if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                            r14 = r23;
                                            throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                        }
                                        th = th;
                                        r13 = r23;
                                        throw th;
                                    }
                                    kfxVar3 = kfxVar2;
                                    columnIndex3 = i7;
                                    kfxVar3.a.d(j5, contentValues);
                                } else {
                                    ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 257, str)).x("System call log duplicate ID: %d", j5);
                                }
                                j7 = jMax;
                                if (!r11.moveToNext()) {
                                    if (j7 != j3) {
                                        l = new java.lang.Long(j7);
                                    } else {
                                        l = null;
                                    }
                                    kfmVar.p = l;
                                    it2 = set.iterator();
                                    i10 = i9;
                                    while (it2.hasNext()) {
                                        jLongValue = ((java.lang.Number) it2.next()).longValue();
                                        if (!aczVar.a(jLongValue)) {
                                            defpackage.kfj kfjVar7 = kfjVar4;
                                            kfjVar7.c(jLongValue);
                                            i10++;
                                            kfjVar4 = kfjVar7;
                                        }
                                    }
                                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                    defpackage.ajsz.ak(r23, null);
                                    return defpackage.aojh.a;
                                }
                                columnIndex = i8;
                                str2 = str7;
                                kfxVar2 = kfxVar3;
                                i = i9;
                                str3 = str5;
                                str9 = str6;
                                j4 = j7;
                                str8 = str8;
                                set = set;
                            } else {
                                if (r11.isNull(columnIndex2)) {
                                    string9 = null;
                                } else {
                                    string9 = r11.getString(columnIndex2);
                                }
                                if (string9 != null) {
                                    kfmVar = this;
                                    if (!((defpackage.alfc) kfmVar.n.a()).b.contains(string3)) {
                                        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "shouldSkip", 464, str)).v("skipping the entry as the phone account is not in the allowlist");
                                    }
                                } else {
                                    kfmVar = this;
                                }
                                if (aczVar.c(j5)) {
                                    ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 257, str)).x("System call log duplicate ID: %d", j5);
                                } else {
                                    contentValues = new android.content.ContentValues();
                                    str6 = str9;
                                    contentValues.put("duration", new java.lang.Integer(r11.getInt(7)));
                                    long j12 = r11.getLong(1);
                                    contentValues.put("call_mapping_id", java.lang.String.valueOf(j12));
                                    contentValues.put("features", new java.lang.Integer(i3));
                                    contentValues.put("phone_account_component_name", string);
                                    if (r11 == 0) {
                                        defpackage.aooh.i("<this>");
                                    }
                                    if (r11.isNull(5)) {
                                        i5 = 3;
                                    } else {
                                        i5 = 3;
                                    }
                                    contentValues.put("call_type", new java.lang.Integer(i5));
                                    contentValues.put("is_read", new java.lang.Integer(defpackage.kcq.x(r11, 9)));
                                    contentValues.put("timestamp", new java.lang.Long(j12));
                                    contentValues.put("new", new java.lang.Integer(defpackage.kcq.x(r11, 10)));
                                    contentValues.put("data_usage", new java.lang.Integer(r11.getInt(8)));
                                    contentValues.put("phone_account_id", string2);
                                    if (r11.isNull(4)) {
                                        kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_NULL_IN_SYSTEM_CALL_LOG);
                                    } else {
                                        i6 = r11.getInt(4);
                                        if (i6 == 0) {
                                            kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_ZERO_IN_SYSTEM_CALL_LOG);
                                        } else {
                                            contentValues.put("presentation", new java.lang.Integer(i6));
                                            if (columnIndex2 >= 0) {
                                                if (r11.isNull(columnIndex2)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = r11.getString(columnIndex2);
                                                }
                                                str5 = str5;
                                                contentValues.put(str5, string8);
                                            } else {
                                                str5 = str5;
                                            }
                                            if (i2 >= 0) {
                                                i7 = i2;
                                                if (r11.isNull(i7)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = r11.getString(i7);
                                                }
                                                contentValues.put(str8, string7);
                                            } else {
                                                i7 = i2;
                                            }
                                            i8 = i4;
                                            if (i8 != -1) {
                                                if (r11.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = r11.getString(i8);
                                                }
                                                str7 = str4;
                                                contentValues.put(str7, string6);
                                            } else {
                                                str7 = str4;
                                            }
                                            string5 = r11.getString(3);
                                            if (string5 != null) {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            } else {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            }
                                            i9 = 0;
                                            java.lang.Object[] objArr3 = {new kfw(j6)};
                                            defpackage.ahvr.ay(objArr3, 1);
                                            new defpackage.aike(objArr3, 1);
                                            if (zContains) {
                                                columnIndex3 = i7;
                                                kfxVar3 = kfxVar2;
                                                kfjVar5 = kfxVar3.a;
                                                lValueOf = java.lang.Long.valueOf(j5);
                                                if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                }
                                                if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                }
                                                if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                    r14 = r23;
                                                    throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                }
                                                th = th;
                                                r13 = r23;
                                                throw th;
                                            }
                                            kfxVar3 = kfxVar2;
                                            columnIndex3 = i7;
                                            kfxVar3.a.d(j5, contentValues);
                                        }
                                    }
                                    i6 = 1;
                                    contentValues.put("presentation", new java.lang.Integer(i6));
                                    if (columnIndex2 >= 0) {
                                        if (r11.isNull(columnIndex2)) {
                                            string8 = null;
                                        } else {
                                            string8 = r11.getString(columnIndex2);
                                        }
                                        str5 = str5;
                                        contentValues.put(str5, string8);
                                    } else {
                                        str5 = str5;
                                    }
                                    if (i2 >= 0) {
                                        i7 = i2;
                                        if (r11.isNull(i7)) {
                                            string7 = null;
                                        } else {
                                            string7 = r11.getString(i7);
                                        }
                                        contentValues.put(str8, string7);
                                    } else {
                                        i7 = i2;
                                    }
                                    i8 = i4;
                                    if (i8 != -1) {
                                        if (r11.isNull(i8)) {
                                            string6 = null;
                                        } else {
                                            string6 = r11.getString(i8);
                                        }
                                        str7 = str4;
                                        contentValues.put(str7, string6);
                                    } else {
                                        str7 = str4;
                                    }
                                    string5 = r11.getString(3);
                                    if (string5 != null) {
                                        str5 = str5;
                                        str8 = str8;
                                        ssoVar = ssoVar2;
                                        contentValues.put("number", hkd.a.i());
                                    } else {
                                        str5 = str5;
                                        str8 = str8;
                                        ssoVar = ssoVar2;
                                        contentValues.put("number", hkd.a.i());
                                    }
                                    i9 = 0;
                                    java.lang.Object[] objArr4 = {new kfw(j6)};
                                    defpackage.ahvr.ay(objArr4, 1);
                                    new defpackage.aike(objArr4, 1);
                                    if (zContains) {
                                        columnIndex3 = i7;
                                        kfxVar3 = kfxVar2;
                                        kfjVar5 = kfxVar3.a;
                                        lValueOf = java.lang.Long.valueOf(j5);
                                        if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                        }
                                        if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                        }
                                        if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                            r14 = r23;
                                            throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                        }
                                        th = th;
                                        r13 = r23;
                                        throw th;
                                    }
                                    kfxVar3 = kfxVar2;
                                    columnIndex3 = i7;
                                    kfxVar3.a.d(j5, contentValues);
                                }
                                j7 = jMax;
                                if (!r11.moveToNext()) {
                                    if (j7 != j3) {
                                        l = new java.lang.Long(j7);
                                    } else {
                                        l = null;
                                    }
                                    kfmVar.p = l;
                                    it2 = set.iterator();
                                    i10 = i9;
                                    while (it2.hasNext()) {
                                        jLongValue = ((java.lang.Number) it2.next()).longValue();
                                        if (!aczVar.a(jLongValue)) {
                                            defpackage.kfj kfjVar8 = kfjVar4;
                                            kfjVar8.c(jLongValue);
                                            i10++;
                                            kfjVar4 = kfjVar8;
                                        }
                                    }
                                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                    defpackage.ajsz.ak(r23, null);
                                    return defpackage.aojh.a;
                                }
                                columnIndex = i8;
                                str2 = str7;
                                kfxVar2 = kfxVar3;
                                i = i9;
                                str3 = str5;
                                str9 = str6;
                                j4 = j7;
                                str8 = str8;
                                set = set;
                            }
                            str6 = str9;
                            ssoVar = ssoVar2;
                            kfxVar3 = kfxVar2;
                            columnIndex3 = i2;
                            i8 = i4;
                            i9 = 0;
                            str7 = str4;
                            str8 = str8;
                            j7 = jMax;
                            if (!r11.moveToNext()) {
                                if (j7 != j3) {
                                    l = new java.lang.Long(j7);
                                } else {
                                    l = null;
                                }
                                kfmVar.p = l;
                                it2 = set.iterator();
                                i10 = i9;
                                while (it2.hasNext()) {
                                    jLongValue = ((java.lang.Number) it2.next()).longValue();
                                    if (!aczVar.a(jLongValue)) {
                                        defpackage.kfj kfjVar9 = kfjVar4;
                                        kfjVar9.c(jLongValue);
                                        i10++;
                                        kfjVar4 = kfjVar9;
                                    }
                                }
                                ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                defpackage.ajsz.ak(r23, null);
                                return defpackage.aojh.a;
                            }
                            columnIndex = i8;
                            str2 = str7;
                            kfxVar2 = kfxVar3;
                            i = i9;
                            str3 = str5;
                            str9 = str6;
                            j4 = j7;
                            str8 = str8;
                            set = set;
                        }
                        i8 = columnIndex;
                        str6 = str9;
                        ssoVar = ssoVar2;
                        columnIndex3 = i2;
                        i9 = 0;
                        kfmVar = this;
                        str7 = str4;
                        str8 = str8;
                        j7 = j4;
                        kfxVar3 = kfxVar2;
                        if (!r11.moveToNext()) {
                            if (j7 != j3) {
                                l = new java.lang.Long(j7);
                            } else {
                                l = null;
                            }
                            kfmVar.p = l;
                            it2 = set.iterator();
                            i10 = i9;
                            while (it2.hasNext()) {
                                jLongValue = ((java.lang.Number) it2.next()).longValue();
                                if (!aczVar.a(jLongValue)) {
                                    defpackage.kfj kfjVar10 = kfjVar4;
                                    kfjVar10.c(jLongValue);
                                    i10++;
                                    kfjVar4 = kfjVar10;
                                }
                            }
                            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                            defpackage.ajsz.ak(r23, null);
                            return defpackage.aojh.a;
                        }
                        columnIndex = i8;
                        str2 = str7;
                        kfxVar2 = kfxVar3;
                        i = i9;
                        str3 = str5;
                        str9 = str6;
                        j4 = j7;
                        str8 = str8;
                        set = set;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    r13 = cursorB;
                }
            } else {
                if (i12 == 1) {
                    str = "SystemCallLogDataSource.kt";
                    java.io.Closeable closeable2 = (java.io.Closeable) kflVar.k;
                    defpackage.aooc.af(objA);
                    closeable = closeable2;
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (zBooleanValue) {
                        ((defpackage.aimw) aimzVar.d().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 170, str)).v("handleInsertsAndUpdatesInternal null cursor missing permission");
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fillFromSystemCallLog$<anonymous>", 175, str)).v("handleInsertsAndUpdatesInternal null cursor");
                    }
                    aojhVar = defpackage.aojh.a;
                    th2 = null;
                    r15 = closeable;
                    defpackage.ajsz.ak(r15, th2);
                    return aojhVar;
                }
                if (i12 == 2) {
                    java.lang.Object obj2 = kflVar.a;
                    kfjVar3 = kflVar.k;
                    defpackage.aooc.af(objA);
                    obj = obj2;
                    it = ((java.util.Set) objA).iterator();
                    while (it.hasNext()) {
                        kfjVar3.c(((java.lang.Number) it.next()).longValue());
                    }
                    aojhVar = defpackage.aojh.a;
                    th2 = null;
                    r15 = obj;
                    defpackage.ajsz.ak(r15, th2);
                    return aojhVar;
                }
                if (i12 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = kflVar.d;
                str = "SystemCallLogDataSource.kt";
                j2 = kflVar.c;
                aczVar = kflVar.i;
                kfxVar = kflVar.j;
                ssoVar = kflVar.h;
                java.lang.Object obj3 = kflVar.b;
                java.lang.Object obj4 = kflVar.a;
                kfjVar2 = kflVar.k;
                defpackage.aooc.af(objA);
                r11 = obj3;
                r14 = obj4;
                try {
                    set = (java.util.Set) objA;
                    kgzVarF = f();
                    long j13 = j;
                    str2 = "lookup_uri";
                    if (kgzVarF == null && kgzVarF.d) {
                        columnIndex = r11.getColumnIndex("lookup_uri");
                    } else {
                        columnIndex = -1;
                    }
                    str3 = "uuid";
                    if (f() != null) {
                        long j14 = j2;
                        columnIndex2 = r11.getColumnIndex("uuid");
                        j3 = j14;
                    } else {
                        j3 = j2;
                        columnIndex2 = -1;
                    }
                    columnIndex3 = r11.getColumnIndex("name");
                    r23 = r14;
                    kfxVar2 = kfxVar;
                    j4 = j13;
                    kfjVar4 = kfjVar2;
                    i = 0;
                    while (true) {
                        try {
                            if (r11.isNull(i)) {
                                ssoVar2 = ssoVar;
                                ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 229, str)).v("skipping the entry where Calls._ID column is null.");
                                str4 = str2;
                                str5 = str3;
                                i2 = columnIndex3;
                            } else {
                                i2 = columnIndex3;
                                ssoVar2 = ssoVar;
                                j5 = r11.getLong(0);
                                str4 = str2;
                                str5 = str3;
                                j6 = r11.getLong(2);
                                zContains = set.contains(new java.lang.Long(j5));
                                if (zContains || j6 > j3) {
                                    long jMax2 = java.lang.Math.max(j6, j4);
                                    string = r11.getString(11);
                                    string2 = r11.getString(12);
                                    i3 = r11.getInt(13);
                                    string3 = r11.getString(11);
                                    string4 = r11.getString(12);
                                    int i14 = r11.getInt(13);
                                    if (defpackage.aooh.n(b, string3)) {
                                        i4 = columnIndex;
                                        if (!defpackage.aooh.n(string4, "0") && (i14 & 1) != 1) {
                                            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "shouldSkip", 453, str)).v("skipping the entry as the call is a duo audio call");
                                            kfmVar = this;
                                        }
                                        str6 = str9;
                                        ssoVar = ssoVar2;
                                        kfxVar3 = kfxVar2;
                                        columnIndex3 = i2;
                                        i8 = i4;
                                        i9 = 0;
                                        str7 = str4;
                                        str8 = str8;
                                        j7 = jMax2;
                                    } else {
                                        i4 = columnIndex;
                                    }
                                    if (columnIndex2 < 0) {
                                        kfmVar = this;
                                        if (aczVar.c(j5)) {
                                            ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 257, str)).x("System call log duplicate ID: %d", j5);
                                        } else {
                                            contentValues = new android.content.ContentValues();
                                            str6 = str9;
                                            contentValues.put("duration", new java.lang.Integer(r11.getInt(7)));
                                            long j15 = r11.getLong(1);
                                            contentValues.put("call_mapping_id", java.lang.String.valueOf(j15));
                                            contentValues.put("features", new java.lang.Integer(i3));
                                            contentValues.put("phone_account_component_name", string);
                                            if (r11 == 0) {
                                                defpackage.aooh.i("<this>");
                                            }
                                            if (r11.isNull(5) || (i5 = r11.getInt(5)) <= 0 || i5 > 7) {
                                                i5 = 3;
                                            }
                                            contentValues.put("call_type", new java.lang.Integer(i5));
                                            contentValues.put("is_read", new java.lang.Integer(defpackage.kcq.x(r11, 9)));
                                            contentValues.put("timestamp", new java.lang.Long(j15));
                                            contentValues.put("new", new java.lang.Integer(defpackage.kcq.x(r11, 10)));
                                            contentValues.put("data_usage", new java.lang.Integer(r11.getInt(8)));
                                            contentValues.put("phone_account_id", string2);
                                            if (r11.isNull(4)) {
                                                kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_NULL_IN_SYSTEM_CALL_LOG);
                                            } else {
                                                i6 = r11.getInt(4);
                                                if (i6 == 0) {
                                                    kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_ZERO_IN_SYSTEM_CALL_LOG);
                                                } else {
                                                    contentValues.put("presentation", new java.lang.Integer(i6));
                                                    if (columnIndex2 >= 0) {
                                                        if (r11.isNull(columnIndex2)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = r11.getString(columnIndex2);
                                                        }
                                                        str5 = str5;
                                                        contentValues.put(str5, string8);
                                                    } else {
                                                        str5 = str5;
                                                    }
                                                    if (i2 >= 0) {
                                                        i7 = i2;
                                                        if (r11.isNull(i7)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = r11.getString(i7);
                                                        }
                                                        contentValues.put(str8, string7);
                                                    } else {
                                                        i7 = i2;
                                                    }
                                                    i8 = i4;
                                                    if (i8 != -1) {
                                                        if (r11.isNull(i8)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = r11.getString(i8);
                                                        }
                                                        str7 = str4;
                                                        contentValues.put(str7, string6);
                                                    } else {
                                                        str7 = str4;
                                                    }
                                                    string5 = r11.getString(3);
                                                    if (string5 != null || string5.length() == 0) {
                                                        str5 = str5;
                                                        str8 = str8;
                                                        ssoVar = ssoVar2;
                                                        contentValues.put("number", hkd.a.i());
                                                    } else {
                                                        java.lang.String string10 = r11.getString(14);
                                                        if (string10 != null) {
                                                            if (!defpackage.kcq.w(string5)) {
                                                                string5 = string5.concat(string10);
                                                            } else if (defpackage.kcq.w(defpackage.aoov.Q(string5, string10, ""))) {
                                                                ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "getNumberWithPostDialDigits$<anonymous>", 347, str)).v("Post dial digits are different in Calls.NUMBER and Calls.POST_DIAL_DIGITS in SystemCallLog");
                                                                string5 = string5.concat(string10);
                                                            }
                                                        }
                                                        contentValues.put("raw_number", string5);
                                                        java.lang.String string11 = r11.getString(6);
                                                        ssoVar = ssoVar2;
                                                        contentValues.put("number", ssoVar.a(string5, string11).i());
                                                        contentValues.put("formatted_number", kfmVar.m.g(string5, string11));
                                                    }
                                                    i9 = 0;
                                                    java.lang.Object[] objArr5 = {new kfw(j6)};
                                                    defpackage.ahvr.ay(objArr5, 1);
                                                    new defpackage.aike(objArr5, 1);
                                                    if (zContains) {
                                                        columnIndex3 = i7;
                                                        kfxVar3 = kfxVar2;
                                                        kfjVar5 = kfxVar3.a;
                                                        lValueOf = java.lang.Long.valueOf(j5);
                                                        if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                        }
                                                        if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                        }
                                                        if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                            r14 = r23;
                                                            throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                        }
                                                        th = th;
                                                        r13 = r23;
                                                        try {
                                                            throw th;
                                                        } catch (java.lang.Throwable th4) {
                                                            defpackage.ajsz.ak(r13, th);
                                                            throw th4;
                                                        }
                                                    }
                                                    kfxVar3 = kfxVar2;
                                                    columnIndex3 = i7;
                                                    kfxVar3.a.d(j5, contentValues);
                                                }
                                            }
                                            i6 = 1;
                                            contentValues.put("presentation", new java.lang.Integer(i6));
                                            if (columnIndex2 >= 0) {
                                                if (r11.isNull(columnIndex2)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = r11.getString(columnIndex2);
                                                }
                                                str5 = str5;
                                                contentValues.put(str5, string8);
                                            } else {
                                                str5 = str5;
                                            }
                                            if (i2 >= 0) {
                                                i7 = i2;
                                                if (r11.isNull(i7)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = r11.getString(i7);
                                                }
                                                contentValues.put(str8, string7);
                                            } else {
                                                i7 = i2;
                                            }
                                            i8 = i4;
                                            if (i8 != -1) {
                                                if (r11.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = r11.getString(i8);
                                                }
                                                str7 = str4;
                                                contentValues.put(str7, string6);
                                            } else {
                                                str7 = str4;
                                            }
                                            string5 = r11.getString(3);
                                            if (string5 != null) {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            } else {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            }
                                            i9 = 0;
                                            java.lang.Object[] objArr6 = {new kfw(j6)};
                                            defpackage.ahvr.ay(objArr6, 1);
                                            new defpackage.aike(objArr6, 1);
                                            if (zContains) {
                                                columnIndex3 = i7;
                                                kfxVar3 = kfxVar2;
                                                kfjVar5 = kfxVar3.a;
                                                lValueOf = java.lang.Long.valueOf(j5);
                                                if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                }
                                                if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                }
                                                if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                    r14 = r23;
                                                    throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                }
                                                th = th;
                                                r13 = r23;
                                                throw th;
                                            }
                                            kfxVar3 = kfxVar2;
                                            columnIndex3 = i7;
                                            kfxVar3.a.d(j5, contentValues);
                                        }
                                        j7 = jMax2;
                                    } else {
                                        if (r11.isNull(columnIndex2)) {
                                            string9 = null;
                                        } else {
                                            string9 = r11.getString(columnIndex2);
                                        }
                                        if (string9 != null) {
                                            kfmVar = this;
                                            if (!((defpackage.alfc) kfmVar.n.a()).b.contains(string3)) {
                                                ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "shouldSkip", 464, str)).v("skipping the entry as the phone account is not in the allowlist");
                                            }
                                        } else {
                                            kfmVar = this;
                                        }
                                        if (aczVar.c(j5)) {
                                            ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str9, 257, str)).x("System call log duplicate ID: %d", j5);
                                        } else {
                                            contentValues = new android.content.ContentValues();
                                            str6 = str9;
                                            contentValues.put("duration", new java.lang.Integer(r11.getInt(7)));
                                            long j16 = r11.getLong(1);
                                            contentValues.put("call_mapping_id", java.lang.String.valueOf(j16));
                                            contentValues.put("features", new java.lang.Integer(i3));
                                            contentValues.put("phone_account_component_name", string);
                                            if (r11 == 0) {
                                                defpackage.aooh.i("<this>");
                                            }
                                            if (r11.isNull(5)) {
                                                i5 = 3;
                                            } else {
                                                i5 = 3;
                                            }
                                            contentValues.put("call_type", new java.lang.Integer(i5));
                                            contentValues.put("is_read", new java.lang.Integer(defpackage.kcq.x(r11, 9)));
                                            contentValues.put("timestamp", new java.lang.Long(j16));
                                            contentValues.put("new", new java.lang.Integer(defpackage.kcq.x(r11, 10)));
                                            contentValues.put("data_usage", new java.lang.Integer(r11.getInt(8)));
                                            contentValues.put("phone_account_id", string2);
                                            if (r11.isNull(4)) {
                                                kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_NULL_IN_SYSTEM_CALL_LOG);
                                            } else {
                                                i6 = r11.getInt(4);
                                                if (i6 == 0) {
                                                    kfmVar.l.o(defpackage.rmx.NUMBER_PRESENTATION_IS_ZERO_IN_SYSTEM_CALL_LOG);
                                                } else {
                                                    contentValues.put("presentation", new java.lang.Integer(i6));
                                                    if (columnIndex2 >= 0) {
                                                        if (r11.isNull(columnIndex2)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = r11.getString(columnIndex2);
                                                        }
                                                        str5 = str5;
                                                        contentValues.put(str5, string8);
                                                    } else {
                                                        str5 = str5;
                                                    }
                                                    if (i2 >= 0) {
                                                        i7 = i2;
                                                        if (r11.isNull(i7)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = r11.getString(i7);
                                                        }
                                                        contentValues.put(str8, string7);
                                                    } else {
                                                        i7 = i2;
                                                    }
                                                    i8 = i4;
                                                    if (i8 != -1) {
                                                        if (r11.isNull(i8)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = r11.getString(i8);
                                                        }
                                                        str7 = str4;
                                                        contentValues.put(str7, string6);
                                                    } else {
                                                        str7 = str4;
                                                    }
                                                    string5 = r11.getString(3);
                                                    if (string5 != null) {
                                                        str5 = str5;
                                                        str8 = str8;
                                                        ssoVar = ssoVar2;
                                                        contentValues.put("number", hkd.a.i());
                                                    } else {
                                                        str5 = str5;
                                                        str8 = str8;
                                                        ssoVar = ssoVar2;
                                                        contentValues.put("number", hkd.a.i());
                                                    }
                                                    i9 = 0;
                                                    java.lang.Object[] objArr7 = {new kfw(j6)};
                                                    defpackage.ahvr.ay(objArr7, 1);
                                                    new defpackage.aike(objArr7, 1);
                                                    if (zContains) {
                                                        columnIndex3 = i7;
                                                        kfxVar3 = kfxVar2;
                                                        kfjVar5 = kfxVar3.a;
                                                        lValueOf = java.lang.Long.valueOf(j5);
                                                        if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                        }
                                                        if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                            throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                        }
                                                        if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                            r14 = r23;
                                                            throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                        }
                                                        th = th;
                                                        r13 = r23;
                                                        throw th;
                                                    }
                                                    kfxVar3 = kfxVar2;
                                                    columnIndex3 = i7;
                                                    kfxVar3.a.d(j5, contentValues);
                                                }
                                            }
                                            i6 = 1;
                                            contentValues.put("presentation", new java.lang.Integer(i6));
                                            if (columnIndex2 >= 0) {
                                                if (r11.isNull(columnIndex2)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = r11.getString(columnIndex2);
                                                }
                                                str5 = str5;
                                                contentValues.put(str5, string8);
                                            } else {
                                                str5 = str5;
                                            }
                                            if (i2 >= 0) {
                                                i7 = i2;
                                                if (r11.isNull(i7)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = r11.getString(i7);
                                                }
                                                contentValues.put(str8, string7);
                                            } else {
                                                i7 = i2;
                                            }
                                            i8 = i4;
                                            if (i8 != -1) {
                                                if (r11.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = r11.getString(i8);
                                                }
                                                str7 = str4;
                                                contentValues.put(str7, string6);
                                            } else {
                                                str7 = str4;
                                            }
                                            string5 = r11.getString(3);
                                            if (string5 != null) {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            } else {
                                                str5 = str5;
                                                str8 = str8;
                                                ssoVar = ssoVar2;
                                                contentValues.put("number", hkd.a.i());
                                            }
                                            i9 = 0;
                                            java.lang.Object[] objArr8 = {new kfw(j6)};
                                            defpackage.ahvr.ay(objArr8, 1);
                                            new defpackage.aike(objArr8, 1);
                                            if (zContains) {
                                                columnIndex3 = i7;
                                                kfxVar3 = kfxVar2;
                                                kfjVar5 = kfxVar3.a;
                                                lValueOf = java.lang.Long.valueOf(j5);
                                                if (!((defpackage.kfk) kfjVar5).b.containsKey(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for update");
                                                }
                                                if (!((defpackage.kfk) kfjVar5).c.contains(lValueOf)) {
                                                    throw new java.lang.IllegalArgumentException("Can't insert row scheduled for delete");
                                                }
                                                if (((android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(((defpackage.kfk) kfjVar5).a, lValueOf, contentValues)) != null) {
                                                    r14 = r23;
                                                    throw new java.lang.IllegalArgumentException("Can't insert row already scheduled for insert");
                                                }
                                                th = th;
                                                r13 = r23;
                                                throw th;
                                            }
                                            kfxVar3 = kfxVar2;
                                            columnIndex3 = i7;
                                            kfxVar3.a.d(j5, contentValues);
                                        }
                                        j7 = jMax2;
                                    }
                                    str6 = str9;
                                    ssoVar = ssoVar2;
                                    kfxVar3 = kfxVar2;
                                    columnIndex3 = i2;
                                    i8 = i4;
                                    i9 = 0;
                                    str7 = str4;
                                    str8 = str8;
                                    j7 = jMax2;
                                } else {
                                    aczVar.c(j5);
                                }
                                if (!r11.moveToNext()) {
                                    if (j7 != j3) {
                                        l = new java.lang.Long(j7);
                                    } else {
                                        l = null;
                                    }
                                    kfmVar.p = l;
                                    it2 = set.iterator();
                                    i10 = i9;
                                    while (it2.hasNext()) {
                                        jLongValue = ((java.lang.Number) it2.next()).longValue();
                                        if (!aczVar.a(jLongValue)) {
                                            defpackage.kfj kfjVar11 = kfjVar4;
                                            kfjVar11.c(jLongValue);
                                            i10++;
                                            kfjVar4 = kfjVar11;
                                        }
                                    }
                                    ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                    defpackage.ajsz.ak(r23, null);
                                    return defpackage.aojh.a;
                                }
                                columnIndex = i8;
                                str2 = str7;
                                kfxVar2 = kfxVar3;
                                i = i9;
                                str3 = str5;
                                str9 = str6;
                                j4 = j7;
                                str8 = str8;
                                set = set;
                            }
                            i8 = columnIndex;
                            str6 = str9;
                            ssoVar = ssoVar2;
                            columnIndex3 = i2;
                            i9 = 0;
                            kfmVar = this;
                            str7 = str4;
                            str8 = str8;
                            j7 = j4;
                            kfxVar3 = kfxVar2;
                            if (!r11.moveToNext()) {
                                if (j7 != j3) {
                                    l = new java.lang.Long(j7);
                                } else {
                                    l = null;
                                }
                                kfmVar.p = l;
                                it2 = set.iterator();
                                i10 = i9;
                                while (it2.hasNext()) {
                                    jLongValue = ((java.lang.Number) it2.next()).longValue();
                                    if (!aczVar.a(jLongValue)) {
                                        defpackage.kfj kfjVar12 = kfjVar4;
                                        kfjVar12.c(jLongValue);
                                        i10++;
                                        kfjVar4 = kfjVar12;
                                    }
                                }
                                ((defpackage.aimw) a.b().l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", str6, 308, str)).w("found %d call log entries to remove", i10);
                                defpackage.ajsz.ak(r23, null);
                                return defpackage.aojh.a;
                            }
                            columnIndex = i8;
                            str2 = str7;
                            kfxVar2 = kfxVar3;
                            i = i9;
                            str3 = str5;
                            str9 = str6;
                            j4 = j7;
                            str8 = str8;
                            set = set;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r23 = r14;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aosv.F(this.j, 0, new hqi(this, (defpackage.aoln) null, 10), 3);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        defpackage.ajcq ajcqVarF;
        java.lang.Long l = this.p;
        return (l == null || (ajcqVarF = defpackage.aosv.F(this.j, 0, new atg(l.longValue(), this, (defpackage.aoln) null, 10), 3)) == null) ? defpackage.ajcm.a : ajcqVarF;
    }

    public final defpackage.kgz f() {
        return (defpackage.kgz) this.o.a();
    }
}

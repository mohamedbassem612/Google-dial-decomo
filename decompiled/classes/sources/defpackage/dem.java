package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dem extends defpackage.dye implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    private static final defpackage.acm B;
    public static final /* synthetic */ int z = 0;
    private final defpackage.dei E;
    private final defpackage.aed F;
    private final defpackage.acc G;
    private final defpackage.aowi H;
    private defpackage.aco I;
    private final defpackage.aonj J;
    private final defpackage.acj K;
    private final defpackage.aogc L;
    public final defpackage.deg a;
    public boolean c;
    public int d;
    public int e;
    public ebd f;
    public ebd g;
    public boolean h;
    public final defpackage.aed i;
    public int j;
    public java.lang.Integer k;
    public boolean l;
    public dej m;
    public final java.lang.String n;
    public final java.lang.String o;
    public boolean p;
    public final java.lang.Runnable q;
    public final java.util.List r;
    public final defpackage.aco s;
    public final defpackage.aco t;
    public final defpackage.acq u;
    public final defpackage.acj v;
    public final defpackage.acj w;
    public final defpackage.aco x;
    public defpackage.nf y;
    public int b = Integer.MIN_VALUE;
    private final defpackage.aonj C = new defpackage.ddz(this, 2);
    private final long D = 100;

    static {
        int[] iArr = {2131427349, 2131427350, 2131427361, 2131427372, 2131427375, 2131427376, 2131427377, 2131427378, 2131427379, 2131427380, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427357, 2131427358, 2131427359, 2131427360, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427368, 2131427369, 2131427370, 2131427371, 2131427373, 2131427374};
        defpackage.acm acmVar = defpackage.acn.a;
        defpackage.acm acmVar2 = new defpackage.acm(32);
        int i = acmVar2.b;
        if (i < 0) {
            defpackage.un.c("");
        }
        acmVar2.c(acmVar2.b + 32);
        int[] iArr2 = acmVar2.a;
        int i2 = acmVar2.b;
        if (i != i2) {
            defpackage.ajsz.db(iArr2, iArr2, i + 32, i, i2);
        }
        defpackage.ajsz.df(iArr, iArr2, i, 0, 12);
        acmVar2.b += 32;
        B = acmVar2;
    }

    public dem(defpackage.deg degVar) {
        this.a = degVar;
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.E = new defpackage.dei(this);
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.s = new defpackage.aco(6);
        this.t = new defpackage.aco(6);
        this.i = new defpackage.aed(null);
        this.F = new defpackage.aed(null);
        this.j = -1;
        this.G = new defpackage.acc(0);
        this.H = defpackage.aooh.H(1, 0, null, 6);
        this.l = true;
        defpackage.aco acoVar = defpackage.acp.a;
        if (acoVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        }
        this.I = acoVar;
        this.u = new defpackage.acq(6);
        this.v = new defpackage.acj(6);
        this.w = new defpackage.acj(6);
        this.n = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.o = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.L = new defpackage.aogc((short[]) null);
        this.x = new defpackage.aco(6);
        defpackage.dij dijVarA = degVar.p.a();
        if (acoVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        }
        this.y = new defpackage.nf(dijVarA, acoVar);
        int i = defpackage.ack.a;
        this.K = new defpackage.acj(6);
        degVar.addOnAttachStateChangeListener(this);
        this.q = new java.lang.Runnable() { // from class: deh
            /* JADX WARN: Code duplicated, block: B:101:0x02aa A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:104:0x02c1 A[Catch: all -> 0x08d4, TRY_LEAVE, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:107:0x02d0 A[Catch: all -> 0x08d4, TRY_ENTER, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:109:0x02d8 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:111:0x02e5  */
            /* JADX WARN: Code duplicated, block: B:114:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:117:0x0305  */
            /* JADX WARN: Code duplicated, block: B:120:0x030b A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:122:0x0319 A[Catch: all -> 0x08d4, LOOP:4: B:119:0x0309->B:122:0x0319, LOOP_END, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:127:0x0329 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:129:0x033c A[Catch: all -> 0x08d4, LOOP:5: B:125:0x0325->B:129:0x033c, LOOP_END, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:133:0x0355 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:135:0x0369  */
            /* JADX WARN: Code duplicated, block: B:136:0x036b  */
            /* JADX WARN: Code duplicated, block: B:140:0x0374 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:143:0x0384  */
            /* JADX WARN: Code duplicated, block: B:146:0x038f A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:149:0x0395  */
            /* JADX WARN: Code duplicated, block: B:151:0x0398 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:154:0x039e  */
            /* JADX WARN: Code duplicated, block: B:156:0x03a1 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:158:0x03c8 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:161:0x03e9 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:163:0x03fb  */
            /* JADX WARN: Code duplicated, block: B:164:0x03fd  */
            /* JADX WARN: Code duplicated, block: B:168:0x040b A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:173:0x0431 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:175:0x044e A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:177:0x0460 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:179:0x0468 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:183:0x04b5 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:185:0x04bc A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:236:0x05a7 A[PHI: r28
              0x05a7: PHI (r28v14 int) = (r28v12 int), (r28v12 int), (r28v12 int), (r28v15 int), (r28v16 int) binds: [B:224:0x0588, B:235:0x05a5, B:232:0x05a0, B:217:0x0573, B:212:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:237:0x05aa A[PHI: r28
              0x05aa: PHI (r28v13 int) = 
              (r28v12 int)
              (r28v12 int)
              (r28v12 int)
              (r28v12 int)
              (r28v12 int)
              (r28v12 int)
              (r28v15 int)
              (r28v15 int)
              (r28v16 int)
              (r28v16 int)
             binds: [B:220:0x0578, B:222:0x057c, B:226:0x058c, B:228:0x0598, B:235:0x05a5, B:233:0x05a2, B:215:0x056d, B:218:0x0575, B:210:0x0562, B:213:0x056a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:238:0x05ad A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:240:0x05be A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:263:0x0691  */
            /* JADX WARN: Code duplicated, block: B:294:0x0764  */
            /* JADX WARN: Code duplicated, block: B:343:0x08ad A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:344:0x08af A[Catch: all -> 0x08cf, LOOP:15: B:328:0x084e->B:344:0x08af, LOOP_END, TryCatch #4 {all -> 0x08cf, blocks: (B:273:0x06f1, B:276:0x0702, B:278:0x070e, B:280:0x071a, B:282:0x0720, B:284:0x0731, B:287:0x0737, B:289:0x0743, B:291:0x0750, B:293:0x075e, B:295:0x0766, B:301:0x0779, B:302:0x077e, B:305:0x078a, B:308:0x0795, B:309:0x07b2, B:312:0x07f1, B:314:0x07ff, B:319:0x0811, B:320:0x0814, B:315:0x0804, B:321:0x081e, B:324:0x082f, B:325:0x0837, B:328:0x084e, B:330:0x085a, B:332:0x0866, B:334:0x086c, B:336:0x0884, B:338:0x088a, B:339:0x0895, B:340:0x08a3, B:344:0x08af, B:345:0x08b2), top: B:371:0x06f1, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:388:0x0320 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:389:0x0324 A[EDGE_INSN: B:389:0x0324->B:124:0x0324 BREAK  A[LOOP:4: B:119:0x0309->B:122:0x0319], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:390:0x0341 A[EDGE_INSN: B:390:0x0341->B:131:0x0341 BREAK  A[LOOP:5: B:125:0x0325->B:129:0x033c], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:391:0x033f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:410:0x08b2 A[EDGE_INSN: B:410:0x08b2->B:345:0x08b2 BREAK  A[LOOP:15: B:328:0x084e->B:344:0x08af], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:49:0x0127 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:51:0x0135 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:53:0x013d  */
            /* JADX WARN: Code duplicated, block: B:55:0x0141 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x0151 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0167 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:62:0x0171 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x0187 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x018f A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x01a7 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:68:0x01af A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x01c0 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x01c8 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x01eb A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:76:0x01f6 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:78:0x0200 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:96:0x027d A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:97:0x0293 A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:99:0x029e A[Catch: all -> 0x08d4, TryCatch #1 {all -> 0x08d4, blocks: (B:14:0x0046, B:17:0x006b, B:19:0x0079, B:21:0x0083, B:23:0x0089, B:25:0x0099, B:27:0x00a5, B:30:0x00ae, B:33:0x00d0, B:35:0x00e0, B:37:0x00ea, B:39:0x00f0, B:41:0x010a, B:49:0x0127, B:51:0x0135, B:55:0x0141, B:56:0x0145, B:58:0x0151, B:245:0x05e9, B:60:0x0167, B:62:0x0171, B:63:0x0187, B:65:0x018f, B:66:0x01a7, B:68:0x01af, B:69:0x01c0, B:71:0x01c8, B:74:0x01eb, B:76:0x01f6, B:78:0x0200, B:80:0x0204, B:82:0x0210, B:84:0x0230, B:86:0x0240, B:88:0x0250, B:91:0x0262, B:93:0x0267, B:94:0x026e, B:95:0x0272, B:96:0x027d, B:97:0x0293, B:99:0x029e, B:101:0x02aa, B:102:0x02ae, B:104:0x02c1, B:107:0x02d0, B:109:0x02d8, B:112:0x02e7, B:115:0x02f1, B:120:0x030b, B:122:0x0319, B:125:0x0325, B:127:0x0329, B:129:0x033c, B:131:0x0341, B:133:0x0355, B:138:0x036e, B:140:0x0374, B:144:0x0385, B:157:0x03a3, B:159:0x03de, B:161:0x03e9, B:165:0x03fe, B:166:0x0406, B:172:0x0416, B:158:0x03c8, B:173:0x0431, B:175:0x044e, B:177:0x0460, B:179:0x0468, B:182:0x046e, B:183:0x04b5, B:185:0x04bc, B:187:0x04c4, B:189:0x04cc, B:191:0x04da, B:193:0x04e0, B:195:0x04e8, B:199:0x04fe, B:196:0x04f4, B:198:0x04fa, B:200:0x0508, B:202:0x0512, B:204:0x0524, B:206:0x0535, B:207:0x0545, B:209:0x0552, B:211:0x0564, B:216:0x056f, B:221:0x057a, B:223:0x057e, B:225:0x058a, B:227:0x058e, B:229:0x059a, B:231:0x059e, B:234:0x05a3, B:238:0x05ad, B:240:0x05be, B:241:0x05c1, B:43:0x0112, B:47:0x0122, B:46:0x011b, B:251:0x0624, B:254:0x0651, B:255:0x0659, B:257:0x065f, B:259:0x0679, B:261:0x0686, B:262:0x0690), top: B:366:0x0046, outer: #3 }] */
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                java.lang.String str;
                int i3;
                long[] jArr;
                int iNumberOfTrailingZeros;
                int i4;
                int i5;
                int i6;
                defpackage.aco acoVar2;
                java.util.ArrayList arrayList;
                int[] iArr;
                long[] jArr2;
                int i7;
                defpackage.aco acoVar3;
                java.util.ArrayList arrayList2;
                int[] iArr2;
                long[] jArr3;
                int i8;
                int i9;
                int i10;
                int i11;
                defpackage.nf nfVar;
                int i12;
                boolean z2;
                long[] jArr4;
                defpackage.die dieVar;
                long[] jArr5;
                defpackage.aco acoVar4;
                long j;
                defpackage.nf nfVar2;
                boolean z3;
                defpackage.dip dipVar;
                defpackage.dip dipVar2;
                defpackage.dip dipVar3;
                java.lang.String str2;
                defpackage.die dieVar2;
                defpackage.dip dipVar4;
                dgf dgfVarC;
                java.lang.Object obj;
                int i13;
                defpackage.dji djiVar;
                java.lang.String str3;
                defpackage.nf nfVar3;
                defpackage.die dieVar3;
                java.lang.Object obj2;
                java.lang.CharSequence charSequence;
                java.lang.CharSequence charSequence2;
                java.lang.CharSequence charSequenceJ;
                int length;
                int length2;
                java.lang.Integer num;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                defpackage.dip dipVar5;
                boolean z4;
                boolean zF;
                boolean z5;
                boolean z6;
                android.view.accessibility.AccessibilityEvent accessibilityEventP;
                int i19;
                defpackage.dib dibVar;
                java.lang.String str4;
                defpackage.dem demVar = this.a;
                defpackage.deg degVar2 = demVar.a;
                java.lang.Integer num2 = 0;
                if (!degVar2.isAttachedToWindow()) {
                    demVar.p = false;
                    return;
                }
                android.os.Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    degVar2.w(true);
                    android.os.Trace.endSection();
                    android.os.Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        android.os.Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
                        try {
                            if (demVar.C()) {
                                demVar.M(demVar.a.p.a(), demVar.y);
                            }
                            android.os.Trace.endSection();
                            android.os.Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
                            try {
                                defpackage.aco acoVarQ = demVar.q();
                                java.util.List list = demVar.r;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(list);
                                list.clear();
                                int[] iArr3 = acoVarQ.b;
                                long[] jArr6 = acoVarQ.a;
                                int length3 = jArr6.length - 2;
                                int i20 = 8;
                                if (length3 >= 0) {
                                    int i21 = 0;
                                    while (true) {
                                        long j2 = jArr6[i21];
                                        i3 = 32;
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j2 & 255) < 128) {
                                                    int i24 = iArr3[(i21 << 3) + i23];
                                                    defpackage.nf nfVar4 = (defpackage.nf) demVar.x.a(i24);
                                                    if (nfVar4 != null) {
                                                        int i25 = i20;
                                                        defpackage.ajwz ajwzVar = (defpackage.ajwz) acoVarQ.a(i24);
                                                        java.lang.Object obj3 = ajwzVar != null ? ajwzVar.c : null;
                                                        if (obj3 == null) {
                                                            defpackage.cwh.b("no value for specified key");
                                                            throw new defpackage.aoiq();
                                                        }
                                                        defpackage.die dieVar4 = ((defpackage.dij) obj3).b;
                                                        int i26 = i21;
                                                        defpackage.adw adwVar = dieVar4.c;
                                                        java.lang.Object[] objArr = adwVar.b;
                                                        java.lang.Object[] objArr2 = adwVar.c;
                                                        long[] jArr7 = adwVar.a;
                                                        int length4 = jArr7.length - 2;
                                                        if (length4 >= 0) {
                                                            iArr2 = iArr3;
                                                            jArr3 = jArr6;
                                                            int i27 = 0;
                                                            z2 = false;
                                                            while (true) {
                                                                long j3 = jArr7[i27];
                                                                i8 = length3;
                                                                i9 = i22;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i28 = 8 - ((~(i27 - length4)) >>> 31);
                                                                    int i29 = 0;
                                                                    while (i29 < i28) {
                                                                        if ((j3 & 255) < 128) {
                                                                            int i30 = (i27 << 3) + i29;
                                                                            java.lang.Object obj4 = objArr[i30];
                                                                            jArr5 = jArr7;
                                                                            java.lang.Object obj5 = objArr2[i30];
                                                                            acoVar4 = acoVarQ;
                                                                            defpackage.dip dipVar6 = (defpackage.dip) obj4;
                                                                            j = j3;
                                                                            defpackage.dip dipVar7 = defpackage.din.w;
                                                                            if (defpackage.aooh.n(dipVar6, dipVar7) || defpackage.aooh.n(dipVar6, defpackage.din.x)) {
                                                                                dgf dgfVarC2 = defpackage.dff.c(arrayList3, i24);
                                                                                if (dgfVarC2 != null) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    dgfVarC2 = new dgf(i24, list);
                                                                                    z3 = true;
                                                                                }
                                                                                list.add(dgfVarC2);
                                                                                if (z3) {
                                                                                    dipVar = defpackage.din.d;
                                                                                    if (defpackage.aooh.n(dipVar6, dipVar)) {
                                                                                        if (obj5 == null) {
                                                                                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                                                                                            obj5 = null;
                                                                                        }
                                                                                        str4 = (java.lang.String) obj5;
                                                                                        if (((defpackage.die) nfVar4.a).f(dipVar)) {
                                                                                            int i31 = i25;
                                                                                            demVar.x(i24, i31, str4);
                                                                                            i25 = i31;
                                                                                        }
                                                                                    } else {
                                                                                        if (defpackage.aooh.n(dipVar6, defpackage.din.b)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.L)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 8192, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.P)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 3072, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.c)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else {
                                                                                            dipVar2 = defpackage.din.K;
                                                                                            arrayList3 = arrayList3;
                                                                                            if (defpackage.aooh.n(dipVar6, dipVar2)) {
                                                                                                dibVar = (defpackage.dib) dieVar4.g(defpackage.din.A);
                                                                                                if (dibVar != null) {
                                                                                                    demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                } else {
                                                                                                    demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                }
                                                                                            } else if (defpackage.aooh.n(dipVar6, defpackage.din.a)) {
                                                                                                int iM = demVar.m(i24);
                                                                                                if (obj5 == null) {
                                                                                                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                                                    obj5 = null;
                                                                                                }
                                                                                                demVar.H(iM, 2048, 4, (java.util.List) obj5);
                                                                                            } else {
                                                                                                dipVar3 = defpackage.din.H;
                                                                                                str2 = "";
                                                                                                if (defpackage.aooh.n(dipVar6, dipVar3)) {
                                                                                                    if (dieVar4.f(defpackage.did.k)) {
                                                                                                        obj2 = nfVar4.a;
                                                                                                        charSequence = (defpackage.dji) ((defpackage.die) obj2).g(dipVar3);
                                                                                                        if (charSequence == null) {
                                                                                                            charSequence = "";
                                                                                                        }
                                                                                                        charSequence2 = (defpackage.dji) dieVar4.g(dipVar3);
                                                                                                        if (charSequence2 == null) {
                                                                                                            charSequence2 = "";
                                                                                                        }
                                                                                                        charSequenceJ = defpackage.dem.J(charSequence2);
                                                                                                        length = charSequence.length();
                                                                                                        nfVar3 = nfVar4;
                                                                                                        length2 = charSequence2.length();
                                                                                                        if (length <= length2) {
                                                                                                            length2 = length;
                                                                                                        }
                                                                                                        num = num2;
                                                                                                        i14 = 0;
                                                                                                        while (true) {
                                                                                                            if (i14 >= length2) {
                                                                                                                i15 = length2;
                                                                                                                i16 = length;
                                                                                                                break;
                                                                                                            }
                                                                                                            i15 = length2;
                                                                                                            i16 = length;
                                                                                                            if (charSequence.charAt(i14) != charSequence2.charAt(i14)) {
                                                                                                                break;
                                                                                                                break;
                                                                                                            } else {
                                                                                                                i14++;
                                                                                                                length2 = i15;
                                                                                                                length = i16;
                                                                                                            }
                                                                                                        }
                                                                                                        i17 = 0;
                                                                                                        while (true) {
                                                                                                            if (i17 >= i15 - i14) {
                                                                                                                i18 = i17;
                                                                                                                break;
                                                                                                            }
                                                                                                            i18 = i17;
                                                                                                            if (charSequence.charAt((i16 - 1) - i17) != charSequence2.charAt((length2 - 1) - i18)) {
                                                                                                                break;
                                                                                                                break;
                                                                                                            }
                                                                                                            i17 = i18 + 1;
                                                                                                        }
                                                                                                        int i32 = (i16 - i18) - i14;
                                                                                                        int i33 = (length2 - i18) - i14;
                                                                                                        dipVar5 = defpackage.din.N;
                                                                                                        i29 = i29;
                                                                                                        if (((defpackage.die) obj2).f(dipVar5)) {
                                                                                                            i23 = i23;
                                                                                                            if (defpackage.aooh.n(((defpackage.die) obj2).g(defpackage.din.O), java.lang.Boolean.FALSE)) {
                                                                                                            }
                                                                                                            if (dieVar4.f(dipVar5)) {
                                                                                                                z4 = false;
                                                                                                            } else {
                                                                                                                z4 = false;
                                                                                                            }
                                                                                                            zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                            if (zF) {
                                                                                                                z5 = false;
                                                                                                            } else {
                                                                                                                z5 = false;
                                                                                                            }
                                                                                                            if (zF) {
                                                                                                                z6 = false;
                                                                                                            } else {
                                                                                                                z6 = false;
                                                                                                            }
                                                                                                            if (z5) {
                                                                                                                dieVar3 = dieVar4;
                                                                                                                num2 = num;
                                                                                                                accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                            } else {
                                                                                                                dieVar3 = dieVar4;
                                                                                                                num2 = num;
                                                                                                                accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                            }
                                                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                            if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                                if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                    i19 = 1;
                                                                                                                } else {
                                                                                                                    i19 = 0;
                                                                                                                }
                                                                                                                deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                            }
                                                                                                            demVar.I(accessibilityEventP);
                                                                                                            if (z5) {
                                                                                                            }
                                                                                                            long j4 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                            accessibilityEventP.setFromIndex((int) (j4 >> 32));
                                                                                                            accessibilityEventP.setToIndex((int) (j4 & 4294967295L));
                                                                                                            demVar.I(accessibilityEventP);
                                                                                                        } else {
                                                                                                            i23 = i23;
                                                                                                        }
                                                                                                        if (dieVar4.f(dipVar5)) {
                                                                                                            z4 = false;
                                                                                                        } else {
                                                                                                            z4 = false;
                                                                                                        }
                                                                                                        zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                        if (zF) {
                                                                                                            z5 = false;
                                                                                                        } else {
                                                                                                            z5 = false;
                                                                                                        }
                                                                                                        if (zF) {
                                                                                                            z6 = false;
                                                                                                        } else {
                                                                                                            z6 = false;
                                                                                                        }
                                                                                                        if (z5) {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        } else {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        }
                                                                                                        accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                        if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                            if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                i19 = 1;
                                                                                                            } else {
                                                                                                                i19 = 0;
                                                                                                            }
                                                                                                            deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                        }
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                        if (z5) {
                                                                                                        }
                                                                                                        long j5 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                        accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                                                        accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                    } else {
                                                                                                        nfVar3 = nfVar4;
                                                                                                        dieVar3 = dieVar4;
                                                                                                        i24 = i24;
                                                                                                        i29 = i29;
                                                                                                        i23 = i23;
                                                                                                        i26 = i26;
                                                                                                        demVar.H(demVar.m(i24), 2048, 2, null);
                                                                                                    }
                                                                                                    i24 = i24;
                                                                                                    dieVar4 = dieVar3;
                                                                                                    nfVar2 = nfVar3;
                                                                                                } else {
                                                                                                    i24 = i24;
                                                                                                    i29 = i29;
                                                                                                    i23 = i23;
                                                                                                    i26 = i26;
                                                                                                    i28 = i28;
                                                                                                    nfVar2 = nfVar4;
                                                                                                    dieVar2 = dieVar4;
                                                                                                    dipVar4 = defpackage.din.I;
                                                                                                    if (defpackage.aooh.n(dipVar6, dipVar4)) {
                                                                                                        djiVar = (defpackage.dji) dieVar2.g(dipVar3);
                                                                                                        if (djiVar != null) {
                                                                                                            str2 = str3;
                                                                                                        }
                                                                                                        long j6 = ((defpackage.dky) dieVar2.c(dipVar4)).b;
                                                                                                        demVar = demVar;
                                                                                                        dieVar4 = dieVar2;
                                                                                                        demVar.I(demVar.p(demVar.m(i24), java.lang.Integer.valueOf((int) (j6 >> 32)), java.lang.Integer.valueOf((int) (j6 & 4294967295L)), java.lang.Integer.valueOf(str2.length()), defpackage.dem.J(str2)));
                                                                                                        demVar.y(((defpackage.dij) obj3).c);
                                                                                                        num2 = num2;
                                                                                                    } else {
                                                                                                        dieVar4 = dieVar2;
                                                                                                        if (defpackage.aooh.n(dipVar6, dipVar7)) {
                                                                                                            i25 = 8;
                                                                                                            demVar.u(((defpackage.dij) obj3).a);
                                                                                                            dgfVarC = defpackage.dff.c(list, i24);
                                                                                                            if (dgfVarC == null) {
                                                                                                                defpackage.aooh.g();
                                                                                                            }
                                                                                                            dgfVarC.d = (defpackage.dic) dieVar4.g(dipVar7);
                                                                                                            dgfVarC.e = (defpackage.dic) dieVar4.g(defpackage.din.x);
                                                                                                            demVar.w(dgfVarC);
                                                                                                        } else {
                                                                                                            i25 = 8;
                                                                                                            demVar.u(((defpackage.dij) obj3).a);
                                                                                                            dgfVarC = defpackage.dff.c(list, i24);
                                                                                                            if (dgfVarC == null) {
                                                                                                                defpackage.aooh.g();
                                                                                                            }
                                                                                                            dgfVarC.d = (defpackage.dic) dieVar4.g(dipVar7);
                                                                                                            dgfVarC.e = (defpackage.dic) dieVar4.g(defpackage.din.x);
                                                                                                            demVar.w(dgfVarC);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                i25 = 8;
                                                                                            }
                                                                                            i24 = i24;
                                                                                            i29 = i29;
                                                                                            i23 = i23;
                                                                                            i26 = i26;
                                                                                            i25 = 8;
                                                                                            i28 = i28;
                                                                                            nfVar2 = nfVar4;
                                                                                        }
                                                                                        i25 = 8;
                                                                                        i28 = i28;
                                                                                        nfVar2 = nfVar4;
                                                                                    }
                                                                                } else if (!defpackage.aooh.n(obj5, ((defpackage.die) nfVar4.a).g(dipVar6))) {
                                                                                    dipVar = defpackage.din.d;
                                                                                    if (defpackage.aooh.n(dipVar6, dipVar)) {
                                                                                        if (obj5 == null) {
                                                                                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                                                                                            obj5 = null;
                                                                                        }
                                                                                        str4 = (java.lang.String) obj5;
                                                                                        if (((defpackage.die) nfVar4.a).f(dipVar)) {
                                                                                            int i34 = i25;
                                                                                            demVar.x(i24, i34, str4);
                                                                                            i25 = i34;
                                                                                        }
                                                                                    } else {
                                                                                        if (defpackage.aooh.n(dipVar6, defpackage.din.b)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.L)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 8192, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.P)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 3072, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.c)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else {
                                                                                            dipVar2 = defpackage.din.K;
                                                                                            arrayList3 = arrayList3;
                                                                                            if (defpackage.aooh.n(dipVar6, dipVar2)) {
                                                                                                dibVar = (defpackage.dib) dieVar4.g(defpackage.din.A);
                                                                                                if (dibVar != null || dibVar.a != 4) {
                                                                                                    demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                } else if (defpackage.aooh.n(dieVar4.g(dipVar2), java.lang.Boolean.TRUE)) {
                                                                                                    android.view.accessibility.AccessibilityEvent accessibilityEventO = demVar.o(demVar.m(i24), 4);
                                                                                                    defpackage.dij dijVarI = ((defpackage.dij) obj3).i();
                                                                                                    java.util.List list2 = (java.util.List) dijVarI.h().g(defpackage.din.a);
                                                                                                    java.lang.String strC = list2 != null ? defpackage.dpy.c(list2, ",", null, null, null, 62) : null;
                                                                                                    java.util.List list3 = (java.util.List) dijVarI.h().g(defpackage.din.D);
                                                                                                    java.lang.String strC2 = list3 != null ? defpackage.dpy.c(list3, ",", null, null, null, 62) : null;
                                                                                                    if (strC != null) {
                                                                                                        accessibilityEventO.setContentDescription(strC);
                                                                                                    }
                                                                                                    if (strC2 != null) {
                                                                                                        accessibilityEventO.getText().add(strC2);
                                                                                                    }
                                                                                                    demVar.I(accessibilityEventO);
                                                                                                } else {
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                }
                                                                                            } else if (defpackage.aooh.n(dipVar6, defpackage.din.a)) {
                                                                                                int iM2 = demVar.m(i24);
                                                                                                if (obj5 == null) {
                                                                                                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                                                    obj5 = null;
                                                                                                }
                                                                                                demVar.H(iM2, 2048, 4, (java.util.List) obj5);
                                                                                            } else {
                                                                                                dipVar3 = defpackage.din.H;
                                                                                                str2 = "";
                                                                                                if (defpackage.aooh.n(dipVar6, dipVar3)) {
                                                                                                    if (dieVar4.f(defpackage.did.k)) {
                                                                                                        obj2 = nfVar4.a;
                                                                                                        charSequence = (defpackage.dji) ((defpackage.die) obj2).g(dipVar3);
                                                                                                        if (charSequence == null) {
                                                                                                            charSequence = "";
                                                                                                        }
                                                                                                        charSequence2 = (defpackage.dji) dieVar4.g(dipVar3);
                                                                                                        if (charSequence2 == null) {
                                                                                                            charSequence2 = "";
                                                                                                        }
                                                                                                        charSequenceJ = defpackage.dem.J(charSequence2);
                                                                                                        length = charSequence.length();
                                                                                                        nfVar3 = nfVar4;
                                                                                                        length2 = charSequence2.length();
                                                                                                        if (length <= length2) {
                                                                                                            length2 = length;
                                                                                                        }
                                                                                                        num = num2;
                                                                                                        i14 = 0;
                                                                                                        while (true) {
                                                                                                            if (i14 >= length2) {
                                                                                                                i15 = length2;
                                                                                                                i16 = length;
                                                                                                                break;
                                                                                                            }
                                                                                                            i15 = length2;
                                                                                                            i16 = length;
                                                                                                            if (charSequence.charAt(i14) != charSequence2.charAt(i14)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            i14++;
                                                                                                            length2 = i15;
                                                                                                            length = i16;
                                                                                                        }
                                                                                                        i17 = 0;
                                                                                                        while (true) {
                                                                                                            if (i17 >= i15 - i14) {
                                                                                                                i18 = i17;
                                                                                                                break;
                                                                                                            }
                                                                                                            i18 = i17;
                                                                                                            if (charSequence.charAt((i16 - 1) - i17) != charSequence2.charAt((length2 - 1) - i18)) {
                                                                                                                break;
                                                                                                            } else {
                                                                                                                i17 = i18 + 1;
                                                                                                            }
                                                                                                        }
                                                                                                        int i35 = (i16 - i18) - i14;
                                                                                                        int i36 = (length2 - i18) - i14;
                                                                                                        dipVar5 = defpackage.din.N;
                                                                                                        i29 = i29;
                                                                                                        if (((defpackage.die) obj2).f(dipVar5)) {
                                                                                                            i23 = i23;
                                                                                                            boolean z7 = defpackage.aooh.n(((defpackage.die) obj2).g(defpackage.din.O), java.lang.Boolean.FALSE) ? false : true;
                                                                                                            if (dieVar4.f(dipVar5) || defpackage.aooh.n(dieVar4.g(defpackage.din.O), java.lang.Boolean.FALSE)) {
                                                                                                                z4 = false;
                                                                                                            } else {
                                                                                                                z4 = true;
                                                                                                            }
                                                                                                            zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                            if (zF || z7 || !z4) {
                                                                                                                z5 = false;
                                                                                                            } else {
                                                                                                                z5 = true;
                                                                                                            }
                                                                                                            if (zF || !z7 || z4) {
                                                                                                                z6 = false;
                                                                                                            } else {
                                                                                                                z6 = true;
                                                                                                            }
                                                                                                            if (z5 || z6) {
                                                                                                                dieVar3 = dieVar4;
                                                                                                                num2 = num;
                                                                                                                accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                            } else {
                                                                                                                android.view.accessibility.AccessibilityEvent accessibilityEventO2 = demVar.o(demVar.m(i24), 16);
                                                                                                                accessibilityEventO2.setFromIndex(i14);
                                                                                                                accessibilityEventO2.setRemovedCount(i35);
                                                                                                                accessibilityEventO2.setAddedCount(i36);
                                                                                                                accessibilityEventO2.setBeforeText(charSequence);
                                                                                                                accessibilityEventO2.getText().add(charSequenceJ);
                                                                                                                accessibilityEventP = accessibilityEventO2;
                                                                                                                num2 = num;
                                                                                                                dieVar3 = dieVar4;
                                                                                                            }
                                                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                            if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                                if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                    i19 = 1;
                                                                                                                } else {
                                                                                                                    i19 = 0;
                                                                                                                }
                                                                                                                deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                            }
                                                                                                            demVar.I(accessibilityEventP);
                                                                                                            if (!z5 || z6) {
                                                                                                                long j7 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                                accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                                                                accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                                                                demVar.I(accessibilityEventP);
                                                                                                            } else {
                                                                                                                i24 = i24;
                                                                                                                dieVar4 = dieVar3;
                                                                                                                i28 = i28;
                                                                                                            }
                                                                                                            nfVar2 = nfVar3;
                                                                                                        } else {
                                                                                                            i23 = i23;
                                                                                                        }
                                                                                                        if (dieVar4.f(dipVar5)) {
                                                                                                            z4 = false;
                                                                                                        } else {
                                                                                                            z4 = false;
                                                                                                        }
                                                                                                        zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                        if (zF) {
                                                                                                            z5 = false;
                                                                                                        } else {
                                                                                                            z5 = false;
                                                                                                        }
                                                                                                        if (zF) {
                                                                                                            z6 = false;
                                                                                                        } else {
                                                                                                            z6 = false;
                                                                                                        }
                                                                                                        if (z5) {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        } else {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        }
                                                                                                        accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                        if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                            if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                i19 = 1;
                                                                                                            } else {
                                                                                                                i19 = 0;
                                                                                                            }
                                                                                                            deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                        }
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                        if (z5) {
                                                                                                        }
                                                                                                        long j8 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                        accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                                                        accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                    } else {
                                                                                                        nfVar3 = nfVar4;
                                                                                                        dieVar3 = dieVar4;
                                                                                                        i24 = i24;
                                                                                                        i29 = i29;
                                                                                                        i23 = i23;
                                                                                                        i26 = i26;
                                                                                                        demVar.H(demVar.m(i24), 2048, 2, null);
                                                                                                    }
                                                                                                    i24 = i24;
                                                                                                    dieVar4 = dieVar3;
                                                                                                    nfVar2 = nfVar3;
                                                                                                } else {
                                                                                                    i24 = i24;
                                                                                                    i29 = i29;
                                                                                                    i23 = i23;
                                                                                                    i26 = i26;
                                                                                                    i28 = i28;
                                                                                                    nfVar2 = nfVar4;
                                                                                                    dieVar2 = dieVar4;
                                                                                                    dipVar4 = defpackage.din.I;
                                                                                                    if (defpackage.aooh.n(dipVar6, dipVar4)) {
                                                                                                        djiVar = (defpackage.dji) dieVar2.g(dipVar3);
                                                                                                        if (djiVar != null && (str3 = djiVar.c) != null) {
                                                                                                            str2 = str3;
                                                                                                        }
                                                                                                        long j9 = ((defpackage.dky) dieVar2.c(dipVar4)).b;
                                                                                                        demVar = demVar;
                                                                                                        dieVar4 = dieVar2;
                                                                                                        demVar.I(demVar.p(demVar.m(i24), java.lang.Integer.valueOf((int) (j9 >> 32)), java.lang.Integer.valueOf((int) (j9 & 4294967295L)), java.lang.Integer.valueOf(str2.length()), defpackage.dem.J(str2)));
                                                                                                        demVar.y(((defpackage.dij) obj3).c);
                                                                                                        num2 = num2;
                                                                                                    } else {
                                                                                                        dieVar4 = dieVar2;
                                                                                                        if (defpackage.aooh.n(dipVar6, dipVar7) || defpackage.aooh.n(dipVar6, defpackage.din.x)) {
                                                                                                            i25 = 8;
                                                                                                            demVar.u(((defpackage.dij) obj3).a);
                                                                                                            dgfVarC = defpackage.dff.c(list, i24);
                                                                                                            if (dgfVarC == null) {
                                                                                                                defpackage.aooh.g();
                                                                                                            }
                                                                                                            dgfVarC.d = (defpackage.dic) dieVar4.g(dipVar7);
                                                                                                            dgfVarC.e = (defpackage.dic) dieVar4.g(defpackage.din.x);
                                                                                                            demVar.w(dgfVarC);
                                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.l)) {
                                                                                                            int iM3 = demVar.m(((defpackage.dij) obj3).c);
                                                                                                            if (obj5 == null) {
                                                                                                                defpackage.aooh.h("null cannot be cast to non-null type kotlin.Boolean");
                                                                                                                obj = null;
                                                                                                            } else {
                                                                                                                obj = obj5;
                                                                                                            }
                                                                                                            if (((java.lang.Boolean) obj).booleanValue()) {
                                                                                                                demVar.e = iM3;
                                                                                                                i13 = 8;
                                                                                                                demVar.I(demVar.o(iM3, 8));
                                                                                                            } else {
                                                                                                                i13 = 8;
                                                                                                                if (demVar.e == iM3) {
                                                                                                                    demVar.e = Integer.MIN_VALUE;
                                                                                                                }
                                                                                                            }
                                                                                                            demVar.H(iM3, 2048, num2, null);
                                                                                                            i25 = i13;
                                                                                                        } else {
                                                                                                            defpackage.dip dipVar8 = defpackage.did.w;
                                                                                                            if (defpackage.aooh.n(dipVar6, dipVar8)) {
                                                                                                                java.util.List list4 = (java.util.List) dieVar4.c(dipVar8);
                                                                                                                java.util.List list5 = (java.util.List) ((defpackage.die) nfVar2.a).g(dipVar8);
                                                                                                                if (list5 != null) {
                                                                                                                    defpackage.ady adyVar = defpackage.adz.a;
                                                                                                                    defpackage.ady adyVar2 = new defpackage.ady(6);
                                                                                                                    int size = list4.size();
                                                                                                                    i25 = 8;
                                                                                                                    for (int i37 = 0; i37 < size; i37++) {
                                                                                                                        adyVar2.j(((dhw) list4.get(i37)).a);
                                                                                                                    }
                                                                                                                    defpackage.ady adyVar3 = new defpackage.ady(6);
                                                                                                                    int size2 = list5.size();
                                                                                                                    for (int i38 = 0; i38 < size2; i38++) {
                                                                                                                        adyVar3.j(((dhw) list5.get(i38)).a);
                                                                                                                    }
                                                                                                                    if (z2 || !defpackage.aooh.n(adyVar2, adyVar3)) {
                                                                                                                        z2 = true;
                                                                                                                    } else {
                                                                                                                        z2 = false;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i25 = 8;
                                                                                                                    if (z2 || !list4.isEmpty()) {
                                                                                                                        z2 = true;
                                                                                                                    } else {
                                                                                                                        z2 = false;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i25 = 8;
                                                                                                                if (!z2 && (obj5 instanceof defpackage.dhr)) {
                                                                                                                    defpackage.dhr dhrVar = (defpackage.dhr) obj5;
                                                                                                                    java.lang.Object objG = ((defpackage.die) nfVar2.a).g(dipVar6);
                                                                                                                    if (dhrVar != objG) {
                                                                                                                        if (objG instanceof defpackage.dhr) {
                                                                                                                            defpackage.dhr dhrVar2 = (defpackage.dhr) objG;
                                                                                                                            if (defpackage.aooh.n(dhrVar.a, dhrVar2.a)) {
                                                                                                                                if (dhrVar.b == null) {
                                                                                                                                    if (dhrVar2.b != null) {
                                                                                                                                    }
                                                                                                                                } else if (dhrVar2.b != null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    z2 = false;
                                                                                                                }
                                                                                                                z2 = true;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                i25 = 8;
                                                                                            }
                                                                                            i24 = i24;
                                                                                            i29 = i29;
                                                                                            i23 = i23;
                                                                                            i26 = i26;
                                                                                            i25 = 8;
                                                                                            i28 = i28;
                                                                                            nfVar2 = nfVar4;
                                                                                        }
                                                                                        i25 = 8;
                                                                                        i28 = i28;
                                                                                        nfVar2 = nfVar4;
                                                                                    }
                                                                                }
                                                                                i24 = i24;
                                                                                j3 = j >> i25;
                                                                                dieVar4 = dieVar4;
                                                                                nfVar4 = nfVar2;
                                                                                i26 = i26;
                                                                                i28 = i28;
                                                                                acoVarQ = acoVar4;
                                                                                arrayList3 = arrayList3;
                                                                                i23 = i23;
                                                                                i29++;
                                                                                jArr7 = jArr5;
                                                                            } else {
                                                                                if (!defpackage.aooh.n(obj5, ((defpackage.die) nfVar4.a).g(dipVar6))) {
                                                                                    dipVar = defpackage.din.d;
                                                                                    if (defpackage.aooh.n(dipVar6, dipVar)) {
                                                                                        if (obj5 == null) {
                                                                                            defpackage.aooh.h("null cannot be cast to non-null type kotlin.String");
                                                                                            obj5 = null;
                                                                                        }
                                                                                        str4 = (java.lang.String) obj5;
                                                                                        if (((defpackage.die) nfVar4.a).f(dipVar)) {
                                                                                            int i39 = i25;
                                                                                            demVar.x(i24, i39, str4);
                                                                                            i25 = i39;
                                                                                        }
                                                                                    } else {
                                                                                        if (defpackage.aooh.n(dipVar6, defpackage.din.b)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.L)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 8192, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.P)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 3072, null);
                                                                                        } else if (defpackage.aooh.n(dipVar6, defpackage.din.c)) {
                                                                                            demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                            demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                        } else {
                                                                                            dipVar2 = defpackage.din.K;
                                                                                            arrayList3 = arrayList3;
                                                                                            if (defpackage.aooh.n(dipVar6, dipVar2)) {
                                                                                                dibVar = (defpackage.dib) dieVar4.g(defpackage.din.A);
                                                                                                if (dibVar != null) {
                                                                                                    demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                } else {
                                                                                                    demVar.H(demVar.m(i24), 2048, 64, null);
                                                                                                    demVar.H(demVar.m(i24), 2048, num2, null);
                                                                                                }
                                                                                            } else if (defpackage.aooh.n(dipVar6, defpackage.din.a)) {
                                                                                                int iM4 = demVar.m(i24);
                                                                                                if (obj5 == null) {
                                                                                                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                                                    obj5 = null;
                                                                                                }
                                                                                                demVar.H(iM4, 2048, 4, (java.util.List) obj5);
                                                                                            } else {
                                                                                                dipVar3 = defpackage.din.H;
                                                                                                str2 = "";
                                                                                                if (defpackage.aooh.n(dipVar6, dipVar3)) {
                                                                                                    if (dieVar4.f(defpackage.did.k)) {
                                                                                                        obj2 = nfVar4.a;
                                                                                                        charSequence = (defpackage.dji) ((defpackage.die) obj2).g(dipVar3);
                                                                                                        if (charSequence == null) {
                                                                                                            charSequence = "";
                                                                                                        }
                                                                                                        charSequence2 = (defpackage.dji) dieVar4.g(dipVar3);
                                                                                                        if (charSequence2 == null) {
                                                                                                            charSequence2 = "";
                                                                                                        }
                                                                                                        charSequenceJ = defpackage.dem.J(charSequence2);
                                                                                                        length = charSequence.length();
                                                                                                        nfVar3 = nfVar4;
                                                                                                        length2 = charSequence2.length();
                                                                                                        if (length <= length2) {
                                                                                                            length2 = length;
                                                                                                        }
                                                                                                        num = num2;
                                                                                                        i14 = 0;
                                                                                                        while (true) {
                                                                                                            if (i14 >= length2) {
                                                                                                                i15 = length2;
                                                                                                                i16 = length;
                                                                                                                break;
                                                                                                            }
                                                                                                            i15 = length2;
                                                                                                            i16 = length;
                                                                                                            if (charSequence.charAt(i14) != charSequence2.charAt(i14)) {
                                                                                                                break;
                                                                                                                break;
                                                                                                            } else {
                                                                                                                i14++;
                                                                                                                length2 = i15;
                                                                                                                length = i16;
                                                                                                            }
                                                                                                        }
                                                                                                        i17 = 0;
                                                                                                        while (true) {
                                                                                                            if (i17 >= i15 - i14) {
                                                                                                                i18 = i17;
                                                                                                                break;
                                                                                                            }
                                                                                                            i18 = i17;
                                                                                                            if (charSequence.charAt((i16 - 1) - i17) != charSequence2.charAt((length2 - 1) - i18)) {
                                                                                                                break;
                                                                                                                break;
                                                                                                            }
                                                                                                            i17 = i18 + 1;
                                                                                                        }
                                                                                                        int i310 = (i16 - i18) - i14;
                                                                                                        int i311 = (length2 - i18) - i14;
                                                                                                        dipVar5 = defpackage.din.N;
                                                                                                        i29 = i29;
                                                                                                        if (((defpackage.die) obj2).f(dipVar5)) {
                                                                                                            i23 = i23;
                                                                                                            if (defpackage.aooh.n(((defpackage.die) obj2).g(defpackage.din.O), java.lang.Boolean.FALSE)) {
                                                                                                            }
                                                                                                            if (dieVar4.f(dipVar5)) {
                                                                                                                z4 = false;
                                                                                                            } else {
                                                                                                                z4 = false;
                                                                                                            }
                                                                                                            zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                            if (zF) {
                                                                                                                z5 = false;
                                                                                                            } else {
                                                                                                                z5 = false;
                                                                                                            }
                                                                                                            if (zF) {
                                                                                                                z6 = false;
                                                                                                            } else {
                                                                                                                z6 = false;
                                                                                                            }
                                                                                                            if (z5) {
                                                                                                                dieVar3 = dieVar4;
                                                                                                                num2 = num;
                                                                                                                accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                            } else {
                                                                                                                dieVar3 = dieVar4;
                                                                                                                num2 = num;
                                                                                                                accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                            }
                                                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                            if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                                if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                    i19 = 1;
                                                                                                                } else {
                                                                                                                    i19 = 0;
                                                                                                                }
                                                                                                                deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                            }
                                                                                                            demVar.I(accessibilityEventP);
                                                                                                            if (z5) {
                                                                                                            }
                                                                                                            long j10 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                            accessibilityEventP.setFromIndex((int) (j10 >> 32));
                                                                                                            accessibilityEventP.setToIndex((int) (j10 & 4294967295L));
                                                                                                            demVar.I(accessibilityEventP);
                                                                                                        } else {
                                                                                                            i23 = i23;
                                                                                                        }
                                                                                                        if (dieVar4.f(dipVar5)) {
                                                                                                            z4 = false;
                                                                                                        } else {
                                                                                                            z4 = false;
                                                                                                        }
                                                                                                        zF = ((defpackage.die) obj2).f(dipVar3);
                                                                                                        if (zF) {
                                                                                                            z5 = false;
                                                                                                        } else {
                                                                                                            z5 = false;
                                                                                                        }
                                                                                                        if (zF) {
                                                                                                            z6 = false;
                                                                                                        } else {
                                                                                                            z6 = false;
                                                                                                        }
                                                                                                        if (z5) {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        } else {
                                                                                                            dieVar3 = dieVar4;
                                                                                                            num2 = num;
                                                                                                            accessibilityEventP = demVar.p(demVar.m(i24), num2, num, java.lang.Integer.valueOf(length2), charSequenceJ);
                                                                                                        }
                                                                                                        accessibilityEventP.setClassName("android.widget.EditText");
                                                                                                        if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                                                            if (((defpackage.dky) dieVar3.g(defpackage.din.J)) != null) {
                                                                                                                i19 = 1;
                                                                                                            } else {
                                                                                                                i19 = 0;
                                                                                                            }
                                                                                                            deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP, deh$.ExternalSyntheticApiModelOutline0.m(accessibilityEventP) | i19);
                                                                                                        }
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                        if (z5) {
                                                                                                        }
                                                                                                        long j11 = ((defpackage.dky) dieVar3.c(defpackage.din.I)).b;
                                                                                                        accessibilityEventP.setFromIndex((int) (j11 >> 32));
                                                                                                        accessibilityEventP.setToIndex((int) (j11 & 4294967295L));
                                                                                                        demVar.I(accessibilityEventP);
                                                                                                    } else {
                                                                                                        nfVar3 = nfVar4;
                                                                                                        dieVar3 = dieVar4;
                                                                                                        i24 = i24;
                                                                                                        i29 = i29;
                                                                                                        i23 = i23;
                                                                                                        i26 = i26;
                                                                                                        demVar.H(demVar.m(i24), 2048, 2, null);
                                                                                                    }
                                                                                                    i24 = i24;
                                                                                                    dieVar4 = dieVar3;
                                                                                                    nfVar2 = nfVar3;
                                                                                                } else {
                                                                                                    i24 = i24;
                                                                                                    i29 = i29;
                                                                                                    i23 = i23;
                                                                                                    i26 = i26;
                                                                                                    i28 = i28;
                                                                                                    nfVar2 = nfVar4;
                                                                                                    dieVar2 = dieVar4;
                                                                                                    dipVar4 = defpackage.din.I;
                                                                                                    if (defpackage.aooh.n(dipVar6, dipVar4)) {
                                                                                                        djiVar = (defpackage.dji) dieVar2.g(dipVar3);
                                                                                                        if (djiVar != null) {
                                                                                                            str2 = str3;
                                                                                                        }
                                                                                                        long j12 = ((defpackage.dky) dieVar2.c(dipVar4)).b;
                                                                                                        demVar = demVar;
                                                                                                        dieVar4 = dieVar2;
                                                                                                        demVar.I(demVar.p(demVar.m(i24), java.lang.Integer.valueOf((int) (j12 >> 32)), java.lang.Integer.valueOf((int) (j12 & 4294967295L)), java.lang.Integer.valueOf(str2.length()), defpackage.dem.J(str2)));
                                                                                                        demVar.y(((defpackage.dij) obj3).c);
                                                                                                        num2 = num2;
                                                                                                    } else {
                                                                                                        dieVar4 = dieVar2;
                                                                                                        if (defpackage.aooh.n(dipVar6, dipVar7)) {
                                                                                                            i25 = 8;
                                                                                                            demVar.u(((defpackage.dij) obj3).a);
                                                                                                            dgfVarC = defpackage.dff.c(list, i24);
                                                                                                            if (dgfVarC == null) {
                                                                                                                defpackage.aooh.g();
                                                                                                            }
                                                                                                            dgfVarC.d = (defpackage.dic) dieVar4.g(dipVar7);
                                                                                                            dgfVarC.e = (defpackage.dic) dieVar4.g(defpackage.din.x);
                                                                                                            demVar.w(dgfVarC);
                                                                                                        } else {
                                                                                                            i25 = 8;
                                                                                                            demVar.u(((defpackage.dij) obj3).a);
                                                                                                            dgfVarC = defpackage.dff.c(list, i24);
                                                                                                            if (dgfVarC == null) {
                                                                                                                defpackage.aooh.g();
                                                                                                            }
                                                                                                            dgfVarC.d = (defpackage.dic) dieVar4.g(dipVar7);
                                                                                                            dgfVarC.e = (defpackage.dic) dieVar4.g(defpackage.din.x);
                                                                                                            demVar.w(dgfVarC);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                i25 = 8;
                                                                                            }
                                                                                            i24 = i24;
                                                                                            i29 = i29;
                                                                                            i23 = i23;
                                                                                            i26 = i26;
                                                                                            i25 = 8;
                                                                                            i28 = i28;
                                                                                            nfVar2 = nfVar4;
                                                                                        }
                                                                                        i25 = 8;
                                                                                        i28 = i28;
                                                                                        nfVar2 = nfVar4;
                                                                                    }
                                                                                }
                                                                                i24 = i24;
                                                                                j3 = j >> i25;
                                                                                dieVar4 = dieVar4;
                                                                                nfVar4 = nfVar2;
                                                                                i26 = i26;
                                                                                i28 = i28;
                                                                                acoVarQ = acoVar4;
                                                                                arrayList3 = arrayList3;
                                                                                i23 = i23;
                                                                                i29++;
                                                                                jArr7 = jArr5;
                                                                            }
                                                                            i28 = i28;
                                                                            nfVar2 = nfVar4;
                                                                            i24 = i24;
                                                                            j3 = j >> i25;
                                                                            dieVar4 = dieVar4;
                                                                            nfVar4 = nfVar2;
                                                                            i26 = i26;
                                                                            i28 = i28;
                                                                            acoVarQ = acoVar4;
                                                                            arrayList3 = arrayList3;
                                                                            i23 = i23;
                                                                            i29++;
                                                                            jArr7 = jArr5;
                                                                        } else {
                                                                            jArr5 = jArr7;
                                                                            acoVar4 = acoVarQ;
                                                                            j = j3;
                                                                        }
                                                                        i29 = i29;
                                                                        i23 = i23;
                                                                        i26 = i26;
                                                                        i24 = i24;
                                                                        i28 = i28;
                                                                        nfVar2 = nfVar4;
                                                                        i24 = i24;
                                                                        j3 = j >> i25;
                                                                        dieVar4 = dieVar4;
                                                                        nfVar4 = nfVar2;
                                                                        i26 = i26;
                                                                        i28 = i28;
                                                                        acoVarQ = acoVar4;
                                                                        arrayList3 = arrayList3;
                                                                        i23 = i23;
                                                                        i29++;
                                                                        jArr7 = jArr5;
                                                                    }
                                                                    i12 = i24;
                                                                    jArr4 = jArr7;
                                                                    acoVar3 = acoVarQ;
                                                                    arrayList2 = arrayList3;
                                                                    i10 = i23;
                                                                    i11 = i26;
                                                                    dieVar = dieVar4;
                                                                    int i40 = i28;
                                                                    nfVar = nfVar4;
                                                                    if (i40 != i25) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    nfVar = nfVar4;
                                                                    i12 = i24;
                                                                    jArr4 = jArr7;
                                                                    acoVar3 = acoVarQ;
                                                                    arrayList2 = arrayList3;
                                                                    i10 = i23;
                                                                    i11 = i26;
                                                                    dieVar = dieVar4;
                                                                }
                                                                if (i27 == length4) {
                                                                    break;
                                                                }
                                                                i27++;
                                                                dieVar4 = dieVar;
                                                                i24 = i12;
                                                                nfVar4 = nfVar;
                                                                i26 = i11;
                                                                length3 = i8;
                                                                i22 = i9;
                                                                acoVarQ = acoVar3;
                                                                jArr7 = jArr4;
                                                                arrayList3 = arrayList2;
                                                                i23 = i10;
                                                                i25 = 8;
                                                            }
                                                        } else {
                                                            acoVar3 = acoVarQ;
                                                            arrayList2 = arrayList3;
                                                            iArr2 = iArr3;
                                                            jArr3 = jArr6;
                                                            i8 = length3;
                                                            i9 = i22;
                                                            i10 = i23;
                                                            i11 = i26;
                                                            nfVar = nfVar4;
                                                            i12 = i24;
                                                            z2 = false;
                                                        }
                                                        if (z2) {
                                                            demVar.H(demVar.m(i12), 2048, num2, null);
                                                            break;
                                                        }
                                                        java.util.Iterator it = ((defpackage.die) nfVar.a).iterator();
                                                        while (it.hasNext()) {
                                                            if (!((defpackage.dij) obj3).h().f((defpackage.dip) ((java.util.Map.Entry) it.next()).getKey())) {
                                                                demVar.H(demVar.m(i12), 2048, num2, null);
                                                                break;
                                                            }
                                                        }
                                                        i20 = 8;
                                                    } else {
                                                        acoVar3 = acoVarQ;
                                                        arrayList2 = arrayList3;
                                                        iArr2 = iArr3;
                                                        jArr3 = jArr6;
                                                        i8 = length3;
                                                        i9 = i22;
                                                        i10 = i23;
                                                        i11 = i21;
                                                    }
                                                } else {
                                                    acoVar3 = acoVarQ;
                                                    arrayList2 = arrayList3;
                                                    iArr2 = iArr3;
                                                    jArr3 = jArr6;
                                                    i8 = length3;
                                                    i9 = i22;
                                                    i10 = i23;
                                                    i11 = i21;
                                                }
                                                j2 >>= i20;
                                                i23 = i10 + 1;
                                                i21 = i11;
                                                iArr3 = iArr2;
                                                jArr6 = jArr3;
                                                length3 = i8;
                                                i22 = i9;
                                                acoVarQ = acoVar3;
                                                arrayList3 = arrayList2;
                                            }
                                            acoVar2 = acoVarQ;
                                            arrayList = arrayList3;
                                            iArr = iArr3;
                                            jArr2 = jArr6;
                                            int i41 = length3;
                                            int i42 = i22;
                                            i2 = 6;
                                            str = null;
                                            i6 = i21;
                                            if (i42 != i20) {
                                                break;
                                            } else {
                                                i7 = i41;
                                            }
                                        } else {
                                            i6 = i21;
                                            acoVar2 = acoVarQ;
                                            arrayList = arrayList3;
                                            iArr = iArr3;
                                            jArr2 = jArr6;
                                            i2 = 6;
                                            str = null;
                                            i7 = length3;
                                        }
                                        if (i6 == i7) {
                                            break;
                                        }
                                        i21 = i6 + 1;
                                        length3 = i7;
                                        iArr3 = iArr;
                                        jArr6 = jArr2;
                                        acoVarQ = acoVar2;
                                        arrayList3 = arrayList;
                                        i20 = 8;
                                    }
                                } else {
                                    i2 = 6;
                                    str = null;
                                    i3 = 32;
                                }
                                android.os.Trace.endSection();
                                android.os.Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                                try {
                                    defpackage.acq acqVar = new defpackage.acq(i2);
                                    defpackage.acq acqVar2 = demVar.u;
                                    int[] iArr4 = acqVar2.b;
                                    long[] jArr8 = acqVar2.a;
                                    int length5 = jArr8.length - 2;
                                    if (length5 >= 0) {
                                        int i43 = 0;
                                        while (true) {
                                            long j13 = jArr8[i43];
                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i44 = 8 - ((~(i43 - length5)) >>> 31);
                                                int i45 = 0;
                                                while (i45 < i44) {
                                                    if ((j13 & 255) < 128) {
                                                        int i46 = iArr4[(i43 << 3) + i45];
                                                        defpackage.ajwz ajwzVar2 = (defpackage.ajwz) demVar.q().a(i46);
                                                        java.lang.Object obj6 = ajwzVar2 != null ? ajwzVar2.c : str;
                                                        if (obj6 == null || !((defpackage.dij) obj6).b.f(defpackage.din.d)) {
                                                            acqVar.d(i46);
                                                            defpackage.nf nfVar5 = (defpackage.nf) demVar.x.a(i46);
                                                            i5 = i3;
                                                            demVar.x(i46, i5, nfVar5 != null ? (java.lang.String) ((defpackage.die) nfVar5.a).g(defpackage.din.d) : str);
                                                        } else {
                                                            i5 = i3;
                                                        }
                                                    } else {
                                                        i5 = i3;
                                                    }
                                                    j13 >>= 8;
                                                    i45++;
                                                    i3 = i5;
                                                }
                                                i4 = i3;
                                                if (i44 != 8) {
                                                    break;
                                                }
                                            } else {
                                                i4 = i3;
                                            }
                                            if (i43 == length5) {
                                                break;
                                            }
                                            i43++;
                                            i3 = i4;
                                        }
                                    }
                                    int i47 = acqVar2.d;
                                    int[] iArr5 = acqVar.b;
                                    long[] jArr9 = acqVar.a;
                                    int length6 = jArr9.length - 2;
                                    if (length6 >= 0) {
                                        int i48 = 0;
                                        while (true) {
                                            long j14 = (~jArr9[i48]) & (-9187201950435737472L);
                                            while (true) {
                                                long j15 = 0;
                                                if (j14 == 0) {
                                                    break;
                                                }
                                                int i49 = iArr5[(i48 << 3) + (java.lang.Long.numberOfTrailingZeros(j14) >>> 3)];
                                                int i50 = acqVar2.c;
                                                int i51 = ((i49 >>> 16) ^ i49) * (-862048943);
                                                int i52 = i51 ^ (i51 >>> 16);
                                                int i53 = (i52 >>> 7) & i50;
                                                int i54 = i2;
                                                int i55 = 0;
                                                while (true) {
                                                    long[] jArr10 = acqVar2.a;
                                                    int i56 = i53 >> 3;
                                                    long j16 = j15;
                                                    int i57 = (i53 & 7) << 3;
                                                    long j17 = (jArr10[i56] >>> i57) | ((jArr10[i56 + 1] << (64 - i57)) & ((-i57) >> 63));
                                                    jArr = jArr9;
                                                    long j18 = (((long) (i52 & 127)) * 72340172838076673L) ^ j17;
                                                    for (long j19 = (j18 - 72340172838076673L) & (~j18) & (-9187201950435737472L); j19 != j16; j19 &= j19 - 1) {
                                                        iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j19) >> 3) + i53) & i50;
                                                        if (acqVar2.b[iNumberOfTrailingZeros] == i49) {
                                                            break;
                                                        }
                                                    }
                                                    if ((j17 & ((~j17) << i54) & (-9187201950435737472L)) != j16) {
                                                        iNumberOfTrailingZeros = -1;
                                                        break;
                                                    }
                                                    i55 += 8;
                                                    i53 = (i53 + i55) & i50;
                                                    jArr9 = jArr;
                                                    j15 = j16;
                                                }
                                                if (iNumberOfTrailingZeros >= 0) {
                                                    acqVar2.c(iNumberOfTrailingZeros);
                                                }
                                                j14 &= j14 - 1;
                                                jArr9 = jArr;
                                                i2 = i54;
                                            }
                                            int i58 = i2;
                                            long[] jArr11 = jArr9;
                                            if (i48 == length6) {
                                                break;
                                            }
                                            i48++;
                                            jArr9 = jArr11;
                                            i2 = i58;
                                        }
                                    }
                                    int i59 = acqVar2.d;
                                    defpackage.aco acoVar5 = demVar.x;
                                    acoVar5.f();
                                    defpackage.aco acoVarQ2 = demVar.q();
                                    int[] iArr6 = acoVarQ2.b;
                                    java.lang.Object[] objArr3 = acoVarQ2.c;
                                    long[] jArr12 = acoVarQ2.a;
                                    int length7 = jArr12.length - 2;
                                    if (length7 >= 0) {
                                        int i60 = 0;
                                        while (true) {
                                            long j20 = jArr12[i60];
                                            if ((((~j20) << 7) & j20 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i60 != length7) {
                                                    break;
                                                    break;
                                                }
                                                i60++;
                                            } else {
                                                int i61 = 8 - ((~(i60 - length7)) >>> 31);
                                                for (int i62 = 0; i62 < i61; i62++) {
                                                    if ((j20 & 255) < 128) {
                                                        int i63 = (i60 << 3) + i62;
                                                        int i64 = iArr6[i63];
                                                        java.lang.Object obj7 = ((defpackage.ajwz) objArr3[i63]).c;
                                                        defpackage.die dieVar5 = ((defpackage.dij) obj7).b;
                                                        defpackage.dip dipVar9 = defpackage.din.d;
                                                        if (dieVar5.f(dipVar9) && acqVar2.d(i64)) {
                                                            demVar.x(i64, 16, (java.lang.String) dieVar5.c(dipVar9));
                                                        }
                                                        acoVar5.g(i64, new defpackage.nf((defpackage.dij) obj7, demVar.q()));
                                                    }
                                                    j20 >>= 8;
                                                }
                                                if (i61 != 8) {
                                                    break;
                                                } else if (i60 != length7) {
                                                    break;
                                                } else {
                                                    i60++;
                                                }
                                            }
                                        }
                                    }
                                    demVar.y = new defpackage.nf(demVar.a.p.a(), demVar.q());
                                    android.os.Trace.endSection();
                                    android.os.Trace.endSection();
                                    demVar.p = false;
                                } catch (java.lang.Throwable th) {
                                    android.os.Trace.endSection();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                android.os.Trace.endSection();
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            android.os.Trace.endSection();
                            throw th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        android.os.Trace.endSection();
                        throw th4;
                    }
                } catch (java.lang.Throwable th5) {
                    android.os.Trace.endSection();
                    throw th5;
                }
            }
        };
        this.r = new java.util.ArrayList();
        this.J = new defpackage.ddz(this, 3);
    }

    public static final boolean F(defpackage.dic dicVar, float f) {
        if (f >= 0.0f || ((java.lang.Number) dicVar.a.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((java.lang.Number) dicVar.a.a()).floatValue() < ((java.lang.Number) dicVar.b.a()).floatValue();
        }
        return true;
    }

    public static final java.lang.CharSequence J(java.lang.CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (java.lang.Character.isHighSurrogate(charSequence.charAt(99999)) && java.lang.Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                charSequence = charSequence.subSequence(0, i);
                if (charSequence == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                }
            }
        }
        return charSequence;
    }

    public static final java.lang.String K(defpackage.dij dijVar) {
        defpackage.dji djiVar;
        if (dijVar == null) {
            return null;
        }
        defpackage.die dieVar = dijVar.b;
        defpackage.dip dipVar = defpackage.din.a;
        if (dieVar.f(dipVar)) {
            return defpackage.dpy.c((java.util.List) dieVar.c(dipVar), ",", null, null, null, 62);
        }
        defpackage.dip dipVar2 = defpackage.din.H;
        if (dieVar.f(dipVar2)) {
            djiVar = (defpackage.dji) dieVar.g(dipVar2);
            if (djiVar == null) {
                return null;
            }
        } else {
            java.util.List list = (java.util.List) dieVar.g(defpackage.din.D);
            if (list == null) {
                return null;
            }
            djiVar = (defpackage.dji) (list.isEmpty() ? null : list.get(0));
            if (djiVar == null) {
                return null;
            }
        }
        return djiVar.c;
    }

    private final android.graphics.Rect O(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L;
        defpackage.deg degVar = this.a;
        long jK = degVar.k((jFloatToRawIntBits << 32) | jFloatToRawIntBits2);
        long jK2 = degVar.k((((long) java.lang.Float.floatToRawIntBits(f3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L));
        int i = (int) (jK2 >> 32);
        int i2 = (int) (jK >> 32);
        int i3 = (int) (jK2 & 4294967295L);
        int i4 = (int) (jK & 4294967295L);
        return new android.graphics.Rect((int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i))), (int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i4), java.lang.Float.intBitsToFloat(i3))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i4), java.lang.Float.intBitsToFloat(i3))));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:0: B:5:0x0016->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0077 A[EDGE_INSN: B:48:0x0077->B:37:0x0077 BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0074], SYNTHETIC] */
    private final defpackage.cpn P(defpackage.dij dijVar, android.graphics.Rect rect, defpackage.crd crdVar) {
        defpackage.cmv cmvVarL;
        defpackage.diq delVar = new del(crdVar);
        defpackage.dbk dbkVar = dijVar.a;
        defpackage.dce dceVar = dbkVar.v;
        java.lang.Object obj = null;
        if ((dceVar.a() & 8) != 0) {
            loop0: for (defpackage.cmv cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                if ((cmvVar.u & 8) == 0) {
                    if ((cmvVar.v & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    defpackage.cmv cmvVarX = cmvVar;
                    defpackage.cfc cfcVar = null;
                    while (cmvVarX != null) {
                        if (cmvVarX instanceof defpackage.ddc) {
                            ((defpackage.ddc) cmvVarX).cQ(delVar);
                            if (((del) delVar).a) {
                                obj = cmvVarX;
                                break loop0;
                            }
                        } else if ((cmvVarX.u & 8) != 0 && (cmvVarX instanceof defpackage.dap)) {
                            int i = 0;
                            for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                if ((cmvVar2.u & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cmvVarX = cmvVar2;
                                    } else {
                                        if (cfcVar == null) {
                                            cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                        }
                                        if (cmvVarX != null) {
                                            cfcVar.n(cmvVarX);
                                        }
                                        cfcVar.n(cmvVar2);
                                        cmvVarX = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cmvVarX = defpackage.cfo.x(cfcVar);
                    }
                    if ((cmvVar.v & 8) != 0) {
                        break;
                    }
                }
            }
        }
        defpackage.ddc ddcVar = (defpackage.ddc) obj;
        if (ddcVar == null || (cmvVarL = ddcVar.L()) == null || !cmvVarL.D) {
            return defpackage.den.F(dbkVar.p(), false);
        }
        defpackage.cxi cxiVarY = defpackage.cfo.y(ddcVar);
        defpackage.cpn cpnVarQ = defpackage.den.G(cxiVarY).q(cxiVarY, false);
        android.graphics.Rect rectO = O(cpnVarQ.b, cpnVarQ.c, cpnVarQ.d, cpnVarQ.e);
        float f = rectO.left - rect.left;
        float f2 = rectO.top - rect.top;
        return new defpackage.cpn(f, f2, rectO.width() + f, rectO.height() + f2);
    }

    private final defpackage.cqx Q(defpackage.crd crdVar, long j, defpackage.dpq dpqVar) {
        return crdVar.a(j, dpqVar, this.a.t());
    }

    private final boolean R() {
        defpackage.dfl dflVar = this.a.e;
        return dflVar.b && ((android.view.accessibility.AccessibilityManager) dflVar.t.a).isEnabled();
    }

    private static final boolean S(defpackage.dic dicVar) {
        defpackage.aomy aomyVar = dicVar.a;
        if (((java.lang.Number) aomyVar.a()).floatValue() <= 0.0f || dicVar.c) {
            return ((java.lang.Number) aomyVar.a()).floatValue() < ((java.lang.Number) dicVar.b.a()).floatValue() && dicVar.c;
        }
        return true;
    }

    private static final boolean T(defpackage.dic dicVar) {
        defpackage.aomy aomyVar = dicVar.a;
        if (((java.lang.Number) aomyVar.a()).floatValue() >= ((java.lang.Number) dicVar.b.a()).floatValue() || dicVar.c) {
            return ((java.lang.Number) aomyVar.a()).floatValue() > 0.0f && dicVar.c;
        }
        return true;
    }

    private static final android.graphics.Rect U(defpackage.cpn cpnVar, float f, float f2) {
        float f3 = cpnVar.e + f2;
        float f4 = cpnVar.d + f;
        return new android.graphics.Rect((int) (cpnVar.b + f), (int) (cpnVar.c + f2), (int) f4, (int) f3);
    }

    private static final float[] V(defpackage.cqx cqxVar) {
        if (!(cqxVar instanceof defpackage.cqw)) {
            return null;
        }
        defpackage.cpo cpoVar = ((defpackage.cqw) cqxVar).a;
        long j = cpoVar.e;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cpoVar.f;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cpoVar.g;
        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cpoVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L))};
    }

    private static final android.graphics.Rect W(defpackage.cqx cqxVar, float f, float f2) {
        if ((cqxVar instanceof defpackage.cqv) || (cqxVar instanceof defpackage.cqw)) {
            return U(cqxVar.a(), f, f2);
        }
        return null;
    }

    private static final android.graphics.Region X(defpackage.cqx cqxVar, float f, float f2) {
        if (!(cqxVar instanceof defpackage.cqu)) {
            return null;
        }
        defpackage.cqu cquVar = (defpackage.cqu) cqxVar;
        android.graphics.Region region = new android.graphics.Region(U(cquVar.a().f(f, f2), 0.0f, 0.0f));
        android.graphics.Region region2 = new android.graphics.Region();
        defpackage.cpx cpxVar = cquVar.a;
        if (!(cpxVar instanceof defpackage.cpx)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path = cpxVar.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    private final void Y(defpackage.ajwz ajwzVar, ebd ebdVar, boolean z2, int i) {
        dqc dqcVar;
        java.lang.Object obj = ajwzVar.c;
        defpackage.deg degVar = this.a;
        dey deyVarAd = degVar.ad();
        if (deyVarAd != null) {
            dqcVar = (dqc) deyVarAd.b.get(((defpackage.dij) obj).a);
        } else {
            dqcVar = null;
        }
        if (dqcVar != null) {
            ebdVar.a.addChild(dqcVar);
        } else {
            defpackage.dij dijVar = (defpackage.dij) obj;
            boolean zN = defpackage.aooh.n(dijVar.h().g(defpackage.din.o), java.lang.Boolean.TRUE);
            if (z2 || !zN) {
                ebdVar.j(degVar, dijVar.c);
            }
        }
        this.K.c(((defpackage.dij) obj).c, i);
    }

    public static final float j(float f, float f2) {
        if (java.lang.Math.signum(f) == java.lang.Math.signum(f2)) {
            return java.lang.Math.abs(f) >= java.lang.Math.abs(f2) ? f2 : f;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[DONT_INVERT, PHI: r10
      0x00e1: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:16:0x005e, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[LOOP:0: B:15:0x0050->B:43:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7 A[EDGE_INSN: B:48:0x00e7->B:44:0x00e7 BREAK  A[LOOP:0: B:15:0x0050->B:43:0x00e3], SYNTHETIC] */
    public final boolean A(boolean z2, int i, long j) {
        int i2;
        char c;
        defpackage.dic dicVar;
        if (defpackage.aooh.n(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            defpackage.aco acoVarQ = q();
            if (j != 9205357640488583168L && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                defpackage.dip dipVar = z2 ? defpackage.din.x : defpackage.din.w;
                java.lang.Object[] objArr = acoVarQ.c;
                long[] jArr = acoVarQ.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z3 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = i3 - length;
                            int i5 = 0;
                            while (true) {
                                i2 = 8 - ((~i4) >>> 31);
                                if (i5 >= i2) {
                                    break;
                                }
                                if ((j2 & 255) < 128) {
                                    defpackage.ajwz ajwzVar = (defpackage.ajwz) objArr[(i3 << 3) + i5];
                                    if (!defpackage.dfd.h((defpackage.dpo) ajwzVar.b).h(j) || (dicVar = (defpackage.dic) ((defpackage.dij) ajwzVar.c).b.g(dipVar)) == null) {
                                        c = '\b';
                                    } else {
                                        boolean z4 = dicVar.c;
                                        c = '\b';
                                        int i6 = z4 ? -i : i;
                                        if (!(i == 0 && z4) && i6 >= 0) {
                                            if (((java.lang.Number) dicVar.a.a()).floatValue() < ((java.lang.Number) dicVar.b.a()).floatValue()) {
                                                z3 = true;
                                            }
                                        } else if (((java.lang.Number) dicVar.a.a()).floatValue() > 0.0f) {
                                            z3 = true;
                                        }
                                    }
                                } else {
                                    c = '\b';
                                }
                                j2 >>= c;
                                i5++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                    return z3;
                }
            }
        }
        return false;
    }

    public final boolean B(int i) {
        return this.d == i;
    }

    public final boolean C() {
        if (R()) {
            defpackage.dfl dflVar = this.a.e;
            java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = dflVar.d;
            if (enabledAccessibilityServiceList == null) {
                enabledAccessibilityServiceList = ((android.view.accessibility.AccessibilityManager) dflVar.t.a).getEnabledAccessibilityServiceList(-1);
                dflVar.d = enabledAccessibilityServiceList;
            }
            if (!enabledAccessibilityServiceList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        java.lang.Object obj = this.a.e.t.a;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return rp$.ExternalSyntheticApiModelOutline0.m((android.view.accessibility.AccessibilityManager) obj);
        }
        return true;
    }

    public final boolean E() {
        return R() && this.a.e.c;
    }

    public final boolean G(defpackage.dij dijVar, int i, int i2, boolean z2) {
        java.lang.String strK;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        java.lang.Integer numValueOf3;
        defpackage.die dieVar = dijVar.b;
        defpackage.dip dipVar = defpackage.did.j;
        if (dieVar.f(dipVar) && wt.d(dijVar)) {
            defpackage.aono aonoVar = (defpackage.aono) ((defpackage.dhr) dieVar.c(dipVar)).b;
            if (aonoVar != null) {
                return ((java.lang.Boolean) aonoVar.a(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z2))).booleanValue();
            }
            return false;
        }
        if ((i == i2 && i2 == this.j) || (strK = K(dijVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strK.length()) {
            i = -1;
        }
        this.j = i;
        boolean z3 = strK.length() > 0;
        int i3 = dijVar.c;
        int iM = m(i3);
        if (z3) {
            numValueOf = java.lang.Integer.valueOf(this.j);
            numValueOf2 = java.lang.Integer.valueOf(this.j);
            numValueOf3 = java.lang.Integer.valueOf(strK.length());
        } else {
            numValueOf = null;
            numValueOf2 = null;
            numValueOf3 = null;
        }
        I(p(iM, numValueOf, numValueOf2, numValueOf3, strK));
        y(i3);
        return true;
    }

    public final void H(int i, int i2, java.lang.Integer num, java.util.List list) {
        if (i == Integer.MIN_VALUE || !C()) {
            return;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(defpackage.dpy.c(list, ",", null, null, null, 62));
        }
        I(accessibilityEventO);
    }

    public final void I(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (C()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.h = true;
            }
            try {
                ((java.lang.Boolean) this.C.a(accessibilityEvent)).booleanValue();
            } finally {
                this.h = false;
            }
        }
    }

    public final android.graphics.Rect L(defpackage.ajwz ajwzVar) {
        defpackage.dpo dpoVar = (defpackage.dpo) ajwzVar.b;
        int i = dpoVar.e;
        return O(dpoVar.b, dpoVar.c, dpoVar.d, i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[LOOP:1: B:15:0x0052->B:28:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0094 A[EDGE_INSN: B:44:0x0094->B:29:0x0094 BREAK  A[LOOP:1: B:15:0x0052->B:28:0x0091], SYNTHETIC] */
    public final void M(defpackage.dij dijVar, defpackage.nf nfVar) {
        int[] iArr = defpackage.acr.a;
        defpackage.acq acqVar = new defpackage.acq(6);
        java.util.List listL = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        int size = listL.size();
        for (int i = 0; i < size; i++) {
            defpackage.dij dijVar2 = (defpackage.dij) listL.get(i);
            defpackage.aco acoVarQ = q();
            int i2 = dijVar2.c;
            if (acoVarQ.b(i2)) {
                if (!((defpackage.acq) nfVar.b).a(i2)) {
                    u(dijVar.a);
                    return;
                }
                acqVar.d(i2);
            }
        }
        defpackage.acq acqVar2 = (defpackage.acq) nfVar.b;
        int[] iArr2 = acqVar2.b;
        long[] jArr = acqVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 == 8) {
                                break;
                            } else {
                                break;
                            }
                        } else if ((j & 255) < 128 && !acqVar.a(iArr2[(i3 << 3) + i5])) {
                            u(dijVar.a);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                    if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        java.util.List listL2 = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        int size2 = listL2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            defpackage.dij dijVar3 = (defpackage.dij) listL2.get(i7);
            defpackage.aco acoVar = this.x;
            int i8 = dijVar3.c;
            defpackage.nf nfVar2 = (defpackage.nf) acoVar.a(i8);
            if (nfVar2 != null && q().b(i8)) {
                M(dijVar3, nfVar2);
            }
        }
    }

    @Override // defpackage.dye
    public final defpackage.ebg a(android.view.View view) {
        return this.E;
    }

    public final int k(defpackage.dij dijVar) {
        defpackage.die dieVar = dijVar.b;
        if (!dieVar.f(defpackage.din.a)) {
            defpackage.dip dipVar = defpackage.din.I;
            if (dieVar.f(dipVar)) {
                return (int) (((defpackage.dky) dieVar.c(dipVar)).b & 4294967295L);
            }
        }
        return this.j;
    }

    public final int l(defpackage.dij dijVar) {
        defpackage.die dieVar = dijVar.b;
        if (!dieVar.f(defpackage.din.a)) {
            defpackage.dip dipVar = defpackage.din.I;
            if (dieVar.f(dipVar)) {
                return (int) (((defpackage.dky) dieVar.c(dipVar)).b >> 32);
            }
        }
        return this.j;
    }

    public final int m(int i) {
        if (i == this.a.p.a().c) {
            return -1;
        }
        return i;
    }

    public final android.os.Handler n() {
        return this.a.getHandler();
    }

    public final android.view.accessibility.AccessibilityEvent o(int i, int i2) {
        defpackage.ajwz ajwzVar;
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        defpackage.deg degVar = this.a;
        accessibilityEventObtain.setPackageName(degVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(degVar, i);
        if (C() && (ajwzVar = (defpackage.ajwz) q().a(i)) != null) {
            defpackage.die dieVar = ((defpackage.dij) ajwzVar.c).b;
            accessibilityEventObtain.setPassword(dieVar.f(defpackage.din.N) && !defpackage.aooh.n(dieVar.g(defpackage.din.O), java.lang.Boolean.FALSE));
            boolean zN = defpackage.aooh.n(dieVar.g(defpackage.din.o), java.lang.Boolean.TRUE);
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                rp$.ExternalSyntheticApiModelOutline0.m(accessibilityEventObtain, zN);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        if (z2) {
            return;
        }
        this.c = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handlerN = n();
        if (handlerN != null) {
            handlerN.removeCallbacks(this.q);
        }
        this.c = false;
    }

    public final android.view.accessibility.AccessibilityEvent p(int i, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.CharSequence charSequence) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final defpackage.aco q() {
        if (this.l) {
            this.l = false;
            defpackage.deg degVar = this.a;
            this.I = defpackage.dil.c(degVar.p, new bxb(14));
            if (C()) {
                defpackage.aco acoVar = this.I;
                defpackage.acj acjVar = this.v;
                defpackage.acj acjVar2 = this.w;
                android.content.res.Resources resources = degVar.getContext().getResources();
                acjVar.b();
                acjVar2.b();
                defpackage.ajwz ajwzVar = (defpackage.ajwz) acoVar.a(-1);
                byte[] bArr = null;
                java.lang.Object obj = ajwzVar != null ? ajwzVar.c : null;
                if (obj == null) {
                    defpackage.aooh.g();
                }
                defpackage.clc clcVar = new defpackage.clc(acoVar, 20);
                int i = 1;
                defpackage.dpz dpzVar = new defpackage.dpz(resources, acoVar, i, bArr);
                java.util.List listSingletonList = java.util.Collections.singletonList(obj);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                java.util.List listA = dis.a((defpackage.dij) obj, clcVar, dpzVar, listSingletonList);
                int size = listA.size() - 1;
                if (size > 0) {
                    while (true) {
                        int i2 = ((defpackage.dij) listA.get(i - 1)).c;
                        int i3 = ((defpackage.dij) listA.get(i)).c;
                        acjVar.c(i2, i3);
                        acjVar2.c(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.I;
    }

    public final ebd r() {
        if (R()) {
            return null;
        }
        return ebd.b();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01d5 */
    /* JADX WARN: Code duplicated, block: B:112:0x018c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b9 A[EDGE_INSN: B:123:0x00b9->B:48:0x00b9 BREAK  A[LOOP:2: B:43:0x00a9->B:46:0x00b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:13:0x002e, B:22:0x0051, B:24:0x005d, B:26:0x0065, B:28:0x006e, B:91:0x0193, B:94:0x01a0, B:96:0x01a9, B:97:0x01ac, B:98:0x01ad, B:18:0x003e, B:21:0x0045, B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:106:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x002e, B:22:0x0051, B:24:0x005d, B:26:0x0065, B:28:0x006e, B:91:0x0193, B:94:0x01a0, B:96:0x01a9, B:97:0x01ac, B:98:0x01ad, B:18:0x003e, B:21:0x0045, B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:106:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[Catch: all -> 0x01a8, LOOP:2: B:43:0x00a9->B:46:0x00b3, LOOP_END, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9 A[Catch: all -> 0x01a8, TryCatch #1 {all -> 0x01a8, blocks: (B:29:0x0073, B:31:0x007a, B:33:0x0087, B:35:0x008f, B:37:0x0093, B:39:0x0099, B:49:0x00bb, B:51:0x00c1, B:53:0x00c5, B:55:0x00cb, B:57:0x00d1, B:59:0x00d5, B:63:0x00de, B:65:0x00e6, B:42:0x00a5, B:44:0x00ab, B:46:0x00b3, B:66:0x00f3, B:68:0x00f9, B:70:0x0101, B:72:0x0105, B:74:0x010b, B:77:0x0121, B:79:0x0129, B:81:0x014b, B:82:0x016b, B:84:0x0174, B:86:0x0178, B:88:0x0184, B:89:0x018c, B:90:0x0190), top: B:108:0x0073, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01c9 -> B:22:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:62:0x00dd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.aoln r17) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dem.s(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:124:0x034f  */
    /* JADX WARN: Code duplicated, block: B:155:0x03df  */
    /* JADX WARN: Code duplicated, block: B:163:0x040b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0415  */
    /* JADX WARN: Code duplicated, block: B:166:0x041f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0422  */
    /* JADX WARN: Code duplicated, block: B:170:0x0428  */
    /* JADX WARN: Code duplicated, block: B:171:0x0438  */
    /* JADX WARN: Code duplicated, block: B:50:0x0185  */
    public final void t(int i, ebd ebdVar, java.lang.String str, android.os.Bundle bundle) {
        java.lang.Object obj;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        defpackage.cqi cqiVar;
        defpackage.cqg cqgVar;
        java.lang.Integer numValueOf3;
        long j;
        java.lang.Object obj2;
        defpackage.dks dksVar;
        android.graphics.RectF[] rectFArr;
        defpackage.dkw dkwVar;
        defpackage.ajwz ajwzVar = (defpackage.ajwz) q().a(i);
        if (ajwzVar == null || (obj = ajwzVar.c) == null) {
            return;
        }
        java.lang.String str2 = this.n;
        defpackage.dij dijVar = (defpackage.dij) obj;
        java.lang.String strK = K(dijVar);
        if (defpackage.aooh.n(str, str2)) {
            int iD = this.v.d(i);
            if (iD != -1) {
                ebdVar.a().putInt(str, iD);
                return;
            }
            return;
        }
        if (defpackage.aooh.n(str, this.o)) {
            int iD2 = this.w.d(i);
            if (iD2 != -1) {
                ebdVar.a().putInt(str, iD2);
                return;
            }
            return;
        }
        defpackage.die dieVar = dijVar.b;
        int i2 = 0;
        if (dieVar.f(defpackage.did.a) && bundle != null && defpackage.aooh.n(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strK != null ? strK.length() : Integer.MAX_VALUE)) {
                    defpackage.dkw dkwVarD = defpackage.dff.d(dieVar);
                    if (dkwVarD != null) {
                        defpackage.dck dckVarO = dijVar.a.o();
                        if (true != dckVarO.u()) {
                            dckVarO = null;
                        }
                        if (dckVarO != null) {
                            long jK = dckVarO.k(0L);
                            defpackage.cpn cpnVarB = dijVar.b();
                            android.graphics.RectF[] rectFArr2 = new android.graphics.RectF[i4];
                            while (i2 < i4) {
                                int i5 = i3 + i2;
                                if (i5 >= dkwVarD.a.a.a()) {
                                    dkwVar = dkwVarD;
                                } else {
                                    defpackage.cpn cpnVarG = dkwVarD.j(i5).g(jK);
                                    float f = cpnVarB.d;
                                    dkwVar = dkwVarD;
                                    defpackage.cpn cpnVarE = ((((cpnVarG.b > f ? 1 : (cpnVarG.b == f ? 0 : -1)) & (cpnVarB.b > cpnVarG.d ? 1 : (cpnVarB.b == cpnVarG.d ? 0 : -1))) & (cpnVarG.c > cpnVarB.e ? 1 : (cpnVarG.c == cpnVarB.e ? 0 : -1))) & (cpnVarB.c > cpnVarG.e ? 1 : (cpnVarB.c == cpnVarG.e ? 0 : -1))) < 0 ? cpnVarG.e(cpnVarB) : null;
                                    if (cpnVarE != null) {
                                        defpackage.deg degVar = this.a;
                                        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(cpnVarE.b);
                                        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(cpnVarE.c);
                                        float f2 = cpnVarE.d;
                                        long jK2 = degVar.k((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                                        long jK3 = degVar.k((((long) java.lang.Float.floatToRawIntBits(f2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVarE.e)) & 4294967295L));
                                        int i6 = (int) (jK3 >> 32);
                                        int i7 = (int) (jK2 >> 32);
                                        int i8 = (int) (jK3 & 4294967295L);
                                        int i9 = (int) (jK2 & 4294967295L);
                                        rectFArr2[i2] = new android.graphics.RectF(java.lang.Math.min(java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i6)), java.lang.Math.min(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i8)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i6)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i8)));
                                    }
                                    i2++;
                                    dkwVarD = dkwVar;
                                    i3 = i3;
                                    i4 = i4;
                                    cpnVarB = cpnVarB;
                                    jK = jK;
                                }
                                i2++;
                                dkwVarD = dkwVar;
                                i3 = i3;
                                i4 = i4;
                                cpnVarB = cpnVarB;
                                jK = jK;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    } else {
                        rectFArr = null;
                    }
                    if (rectFArr != null) {
                        ebdVar.a().putParcelableArray(str, rectFArr);
                        return;
                    }
                    return;
                }
            }
            android.util.Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        defpackage.dip dipVar = defpackage.din.B;
        if (dieVar.f(dipVar) && bundle != null && defpackage.aooh.n(str, "androidx.compose.ui.semantics.testTag")) {
            java.lang.String str3 = (java.lang.String) dieVar.g(dipVar);
            if (str3 != null) {
                ebdVar.a().putCharSequence(str, str3);
                return;
            }
            return;
        }
        if (defpackage.aooh.n(str, "androidx.compose.ui.semantics.id")) {
            ebdVar.a().putInt(str, dijVar.c);
            return;
        }
        if (defpackage.aooh.n(str, "androidx.compose.ui.semantics.shapeType")) {
            defpackage.crd crdVar = (defpackage.crd) dieVar.g(defpackage.din.U);
            if (crdVar != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                ebdVar.l(rect);
                defpackage.cpn cpnVarP = P(dijVar, rect, crdVar);
                defpackage.cqx cqxVarQ = Q(crdVar, cpnVarP.c(), dijVar.a.s);
                if (cqxVarQ instanceof defpackage.cqv) {
                    ebdVar.a().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    ebdVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", W(cqxVarQ, cpnVarP.b, cpnVarP.c));
                    return;
                } else if (cqxVarQ instanceof defpackage.cqw) {
                    ebdVar.a().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    ebdVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", W(cqxVarQ, cpnVarP.b, cpnVarP.c));
                    ebdVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", V(cqxVarQ));
                    return;
                } else {
                    if (!(cqxVarQ instanceof defpackage.cqu)) {
                        throw new defpackage.aois();
                    }
                    ebdVar.a().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    ebdVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", X(cqxVarQ, cpnVarP.b, cpnVarP.c));
                    return;
                }
            }
            return;
        }
        if (defpackage.aooh.n(str, "androidx.compose.ui.semantics.shapeRect")) {
            defpackage.crd crdVar2 = (defpackage.crd) dieVar.g(defpackage.din.U);
            if (crdVar2 != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                ebdVar.l(rect2);
                defpackage.cpn cpnVarP2 = P(dijVar, rect2, crdVar2);
                android.graphics.Rect rectW = W(Q(crdVar2, cpnVarP2.c(), dijVar.a.s), cpnVarP2.b, cpnVarP2.c);
                if (rectW != null) {
                    ebdVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", rectW);
                    return;
                }
                return;
            }
            return;
        }
        if (defpackage.aooh.n(str, "androidx.compose.ui.semantics.shapeCorners")) {
            defpackage.crd crdVar3 = (defpackage.crd) dieVar.g(defpackage.din.U);
            if (crdVar3 != null) {
                android.graphics.Rect rect3 = new android.graphics.Rect();
                ebdVar.l(rect3);
                float[] fArrV = V(Q(crdVar3, P(dijVar, rect3, crdVar3).c(), dijVar.a.s));
                if (fArrV != null) {
                    ebdVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrV);
                    return;
                }
                return;
            }
            return;
        }
        if (defpackage.aooh.n(str, "androidx.compose.ui.semantics.shapeRegion")) {
            defpackage.crd crdVar4 = (defpackage.crd) dieVar.g(defpackage.din.U);
            if (crdVar4 != null) {
                android.graphics.Rect rect4 = new android.graphics.Rect();
                ebdVar.l(rect4);
                defpackage.cpn cpnVarP3 = P(dijVar, rect4, crdVar4);
                android.graphics.Region regionX = X(Q(crdVar4, cpnVarP3.c(), dijVar.a.s), cpnVarP3.b, cpnVarP3.c);
                if (regionX != null) {
                    ebdVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionX);
                    return;
                }
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 37 || !defpackage.aooh.n(str, "android.view.accessibility.extra.DATA_RENDERING_INFO_KEY")) {
            return;
        }
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ebdVar.a;
        defpackage.dcv dcvVar = dijVar.a.k;
        if (true != (dcvVar instanceof defpackage.deg)) {
            dcvVar = null;
        }
        if (dcvVar != null) {
            android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder builder = new android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo.Builder();
            defpackage.dkw dkwVarD2 = defpackage.dff.d(dieVar);
            if (dkwVarD2 != null) {
                long jF = dkwVarD2.a.b.f();
                if (jF != 16) {
                    float[] fArr = defpackage.crp.a;
                    numValueOf = java.lang.Integer.valueOf((int) (defpackage.cqg.e(jF, defpackage.crp.e) >>> 32));
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                deh$.ExternalSyntheticApiModelOutline0.m(builder, numValueOf.intValue());
            }
            java.util.List list = (java.util.List) dieVar.g(defpackage.din.D);
            if (list == null) {
                numValueOf2 = null;
            } else {
                defpackage.dji djiVar = (defpackage.dji) (list.isEmpty() ? null : list.get(0));
                if (djiVar != null) {
                    java.util.List listE = djiVar.e(djiVar.a());
                    java.util.ArrayList arrayList = new java.util.ArrayList(listE.size());
                    int size = listE.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        dkx dkxVarB = ((djw) ((defpackage.djg) listE.get(i10)).a).b();
                        defpackage.cqg cqgVar2 = (dkxVarB == null || (dksVar = dkxVarB.a) == null) ? null : new defpackage.cqg(dksVar.b());
                        if (cqgVar2 != null) {
                            arrayList.add(cqgVar2);
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        if (i2 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i2);
                        if (((defpackage.cqg) obj2).a != 16) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    defpackage.cqg cqgVar3 = (defpackage.cqg) obj2;
                    if (cqgVar3 != null) {
                        float[] fArr2 = defpackage.crp.a;
                        numValueOf2 = java.lang.Integer.valueOf((int) (defpackage.cqg.e(cqgVar3.a, defpackage.crp.e) >>> 32));
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    numValueOf2 = null;
                }
            }
            if (numValueOf2 != null) {
                deh$.ExternalSyntheticApiModelOutline0.m$1(builder, numValueOf2.intValue());
            }
            defpackage.dkw dkwVarD3 = defpackage.dff.d(dieVar);
            if (dkwVarD3 != null) {
                long jE = dkwVarD3.a.b.e();
                if (jE != 16) {
                    float[] fArr3 = defpackage.crp.a;
                    numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.cqg.e(jE, defpackage.crp.e) >>> 32));
                } else {
                    cqiVar = (defpackage.cqi) dieVar.g(defpackage.din.T);
                    if (cqiVar != null) {
                        cqgVar = new defpackage.cqg(cqiVar.a());
                    } else {
                        cqgVar = null;
                    }
                    if (cqgVar != null) {
                        j = cqgVar.a;
                        if (j != 16) {
                            float[] fArr4 = defpackage.crp.a;
                            numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
                        } else {
                            numValueOf3 = null;
                        }
                    } else {
                        numValueOf3 = null;
                    }
                }
            } else {
                cqiVar = (defpackage.cqi) dieVar.g(defpackage.din.T);
                if (cqiVar != null) {
                    cqgVar = new defpackage.cqg(cqiVar.a());
                } else {
                    cqgVar = null;
                }
                if (cqgVar != null) {
                    j = cqgVar.a;
                    if (j != 16) {
                        float[] fArr5 = defpackage.crp.a;
                        numValueOf3 = java.lang.Integer.valueOf((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
                    } else {
                        numValueOf3 = null;
                    }
                } else {
                    numValueOf3 = null;
                }
            }
            if (numValueOf3 != null) {
                deh$.ExternalSyntheticApiModelOutline0.m$2(builder, numValueOf3.intValue());
            }
            deh$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, deh$.ExternalSyntheticApiModelOutline0.m(builder));
        }
    }

    public final void u(defpackage.dbk dbkVar) {
        if (this.G.add(dbkVar)) {
            this.H.b(defpackage.aojh.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:450:0x09af  */
    /* JADX WARN: Code duplicated, block: B:464:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:500:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:502:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:503:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:510:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:513:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:516:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:518:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:529:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:539:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:541:0x0bc4 A[LOOP:11: B:540:0x0bc2->B:541:0x0bc4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:544:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:546:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:549:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:550:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:554:0x0c1e A[LOOP:13: B:553:0x0c1c->B:554:0x0c1e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:555:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:557:0x0c4b A[LOOP:14: B:556:0x0c49->B:557:0x0c4b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:560:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:564:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:566:0x0ca0  */
    /* JADX WARN: Code duplicated, block: B:567:0x0ca5  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ca8  */
    /* JADX WARN: Code duplicated, block: B:570:0x0cae  */
    /* JADX WARN: Code duplicated, block: B:572:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:575:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:577:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:578:0x0cd0  */
    /* JADX WARN: Code duplicated, block: B:580:0x0cd3  */
    /* JADX WARN: Code duplicated, block: B:583:0x0ce6  */
    /* JADX WARN: Code duplicated, block: B:585:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:621:0x0a15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0a15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:79:0x021e  */
    /* JADX WARN: Code duplicated, block: B:82:0x022e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0230  */
    /* JADX WARN: Code duplicated, block: B:86:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0239  */
    /* JADX WARN: Code duplicated, block: B:88:0x023b  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x023f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0241  */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v(int i, ebd ebdVar, defpackage.dij dijVar) {
        defpackage.dip dipVar;
        defpackage.dib dibVar;
        android.text.SpannableString spannableString;
        defpackage.dib dibVar2;
        int i2;
        int i3;
        defpackage.dij dijVarJ;
        int size;
        int size2;
        int i4;
        defpackage.dij dijVarJ2;
        defpackage.dic dicVar;
        defpackage.dic dicVar2;
        int iD;
        defpackage.deg degVar;
        int iD2;
        java.lang.String str;
        dey deyVarAd;
        android.view.View viewB;
        dey deyVarAd2;
        android.view.View viewB2;
        defpackage.dhr dhrVar;
        defpackage.dhr dhrVar2;
        defpackage.dhr dhrVar3;
        defpackage.dip dipVar2;
        java.util.List list;
        int size3;
        defpackage.acm acmVar;
        int i5;
        defpackage.aed aedVar;
        defpackage.ado adoVar;
        defpackage.aed aedVar2;
        int size4;
        int i6;
        defpackage.ado adoVar2;
        defpackage.acm acmVar2;
        int[] iArr;
        int i7;
        int i8;
        java.util.ArrayList arrayList;
        int size5;
        int i9;
        int size6;
        int i10;
        dhw dhwVar;
        java.lang.String str2;
        ebc ebcVar;
        ebc ebcVar2;
        defpackage.dhu dhuVar;
        java.util.ArrayList arrayList2;
        java.util.List listL;
        int size7;
        int i11;
        int i12;
        boolean zD;
        int i13;
        int i14;
        defpackage.dij dijVar2;
        defpackage.dhr dhrVar4;
        defpackage.die dieVarQ;
        android.content.ClipDescription primaryClipDescription;
        java.util.List arrayList3;
        java.util.List arrayList4;
        defpackage.dmw dmwVar;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        defpackage.deg degVar2 = this.a;
        android.content.res.Resources resources = degVar2.getContext().getResources();
        defpackage.ajwz ajwzVar = (defpackage.ajwz) q().a(i);
        boolean z3 = ajwzVar != null && ajwzVar.a;
        ebdVar.s("android.view.View");
        defpackage.die dieVar = dijVar.b;
        defpackage.dip dipVar3 = defpackage.din.H;
        if (dieVar.f(dipVar3)) {
            ebdVar.s("android.widget.EditText");
        }
        if (dieVar.f(defpackage.din.D)) {
            ebdVar.s("android.widget.TextView");
        }
        defpackage.dib dibVar3 = (defpackage.dib) dieVar.g(defpackage.din.A);
        if (dibVar3 != null && (dijVar.k() || dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true).isEmpty())) {
            int i20 = dibVar3.a;
            if (i20 == 4) {
                ebdVar.L(resources.getString(2132020522));
            } else if (i20 == 2) {
                ebdVar.L(resources.getString(2132020367));
            } else if (i20 != 5 || wt.h(dijVar) || dieVar.a) {
                ebdVar.s(defpackage.dff.e(i20));
            }
        }
        ebdVar.H(degVar2.getContext().getPackageName());
        boolean zB = defpackage.dil.b(dijVar);
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ebdVar.a;
        aa$.ExternalSyntheticApiModelOutline1.m(accessibilityNodeInfo, zB);
        boolean zD2 = D();
        boolean zBooleanValue = ((java.lang.Boolean) dieVar.d(defpackage.din.n, new bmt(9))).booleanValue();
        boolean z4 = dieVar.a;
        java.util.List listL2 = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        int size8 = listL2.size();
        if (zBooleanValue && z4 && size8 > 1) {
            int size9 = listL2.size();
            defpackage.dij[] dijVarArr = new defpackage.dij[size9];
            for (int i21 = 0; i21 < size9; i21++) {
                dijVarArr[i21] = (defpackage.dij) listL2.get(i21);
            }
            defpackage.ajsz.cx(dijVarArr, new bdt(dis.a, 7, (byte[]) null));
            int i22 = 0;
            int i23 = 0;
            while (i22 < size8) {
                defpackage.dij dijVar3 = dijVarArr[i22];
                defpackage.aco acoVarQ = q();
                int i24 = dijVar3.c;
                defpackage.ajwz ajwzVar2 = (defpackage.ajwz) acoVarQ.a(i24);
                int i25 = i22;
                if (ajwzVar2 != null && i24 != -1) {
                    Y(ajwzVar2, ebdVar, zD2, i23);
                    i23++;
                }
                i22 = i25 + 1;
            }
        } else {
            int size10 = listL2.size();
            int i26 = 0;
            int i27 = 0;
            while (i26 < size10) {
                defpackage.dij dijVar4 = (defpackage.dij) listL2.get(i26);
                defpackage.aco acoVarQ2 = q();
                int i28 = dijVar4.c;
                defpackage.ajwz ajwzVar3 = (defpackage.ajwz) acoVarQ2.a(i28);
                int i29 = size10;
                if (ajwzVar3 != null && i28 != -1) {
                    Y(ajwzVar3, ebdVar, zD2, i27);
                    i27++;
                }
                i26++;
                size10 = i29;
            }
        }
        if (i == this.d) {
            ebdVar.m(true);
            ebdVar.i(ebc.f);
        } else {
            ebdVar.m(false);
            ebdVar.i(ebc.e);
        }
        defpackage.dji djiVarB = wt.b(dijVar);
        if (djiVarB != null) {
            defpackage.aogc aogcVar = this.L;
            defpackage.gat gatVarT = degVar2.T();
            defpackage.dpf dpfVarT = degVar2.t();
            android.text.SpannableString spannableString2 = new android.text.SpannableString(djiVarB.c);
            java.util.List list2 = djiVarB.d;
            if (list2 != null) {
                int size11 = list2.size();
                int i30 = 0;
                while (i30 < size11) {
                    int i31 = size11;
                    defpackage.djg djgVar = (defpackage.djg) list2.get(i30);
                    java.util.List list3 = list2;
                    defpackage.dks dksVar = (defpackage.dks) djgVar.a;
                    int i32 = i30;
                    int i33 = djgVar.b;
                    int i34 = djgVar.c;
                    long jB = dksVar.b();
                    long j = dksVar.b;
                    defpackage.dnd dndVar = dksVar.c;
                    defpackage.dmw dmwVar2 = dksVar.d;
                    defpackage.dmx dmxVar = dksVar.e;
                    java.lang.String str3 = dksVar.g;
                    long j2 = dksVar.h;
                    defpackage.dok dokVar = dksVar.i;
                    defpackage.doz dozVar = dksVar.j;
                    defpackage.dnx dnxVar = dksVar.k;
                    long j3 = dksVar.l;
                    defpackage.dou douVar = dksVar.m;
                    defpackage.crc crcVar = dksVar.n;
                    dkh dkhVar = dksVar.o;
                    defpackage.dks dksVar2 = new defpackage.dks(jB == dksVar.b() ? dksVar.a : defpackage.dow.a(jB), j, dndVar, dmwVar2, dmxVar, (defpackage.dmq) null, str3, j2, dokVar, dozVar, dnxVar, j3, douVar, crcVar, dksVar.p);
                    defpackage.dip dipVar4 = dipVar3;
                    defpackage.dib dibVar4 = dibVar3;
                    defpackage.dfb.y(spannableString2, dksVar2.b(), i33, i34);
                    android.text.SpannableString spannableString3 = spannableString2;
                    defpackage.dfb.z(spannableString3, dksVar2.b, dpfVarT, i33, i34);
                    defpackage.dnd dndVar2 = dksVar2.c;
                    if (dndVar2 != null) {
                        dmwVar = dksVar2.d;
                        if (dmwVar != null) {
                            i15 = dmwVar.a;
                        } else {
                            i15 = 0;
                        }
                        int iCompareTo = dndVar2.compareTo(defpackage.dnd.c);
                        if (i15 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i16 = iCompareTo ^ (-1);
                        if (z2) {
                            if (i16 < 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else if (i16 < 0) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(i17);
                        i18 = 33;
                        spannableString3.setSpan(styleSpan, i33, i34, 33);
                    } else if (dksVar2.d != null) {
                        dndVar2 = defpackage.dnd.e;
                        dmwVar = dksVar2.d;
                        if (dmwVar != null) {
                            i15 = dmwVar.a;
                        } else {
                            i15 = 0;
                        }
                        int iCompareTo2 = dndVar2.compareTo(defpackage.dnd.c);
                        if (i15 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i16 = iCompareTo2 ^ (-1);
                        if (z2) {
                            if (i16 < 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else if (i16 < 0) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        android.text.style.StyleSpan styleSpan2 = new android.text.style.StyleSpan(i17);
                        i18 = 33;
                        spannableString3.setSpan(styleSpan2, i33, i34, 33);
                    } else {
                        i18 = 33;
                    }
                    defpackage.dmq dmqVar = dksVar2.f;
                    if (dmqVar == null) {
                        i19 = i18;
                    } else if (dmqVar instanceof defpackage.dnf) {
                        spannableString3.setSpan(new android.text.style.TypefaceSpan(((defpackage.dnf) dmqVar).f), i33, i34, i18);
                        i19 = i18;
                    } else {
                        defpackage.dmx dmxVar2 = dksVar2.e;
                        java.lang.Object objA = gatVarT.n(dmqVar, defpackage.dnd.e, 0, dmxVar2 != null ? dmxVar2.a : 65535).a();
                        if (objA == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type android.graphics.Typeface");
                        }
                        android.text.style.TypefaceSpan typefaceSpan = new android.text.style.TypefaceSpan((android.graphics.Typeface) objA);
                        i19 = 33;
                        spannableString3.setSpan(typefaceSpan, i33, i34, 33);
                    }
                    defpackage.dou douVar2 = dksVar2.m;
                    if (douVar2 != null) {
                        if (douVar2.a(defpackage.dou.b)) {
                            spannableString3.setSpan(new android.text.style.UnderlineSpan(), i33, i34, i19);
                        }
                        if (douVar2.a(defpackage.dou.c)) {
                            spannableString3.setSpan(new android.text.style.StrikethroughSpan(), i33, i34, i19);
                        }
                    }
                    defpackage.doz dozVar2 = dksVar2.j;
                    if (dozVar2 != null) {
                        spannableString3.setSpan(new android.text.style.ScaleXSpan(dozVar2.b), i33, i34, i19);
                    }
                    defpackage.dfb.A(spannableString3, dksVar2.k, i33, i34);
                    defpackage.dfb.x(spannableString3, dksVar2.l, i33, i34);
                    i30 = i32 + 1;
                    spannableString2 = spannableString3;
                    dipVar3 = dipVar4;
                    dibVar3 = dibVar4;
                    size11 = i31;
                    list2 = list3;
                }
            }
            dipVar = dipVar3;
            dibVar = dibVar3;
            android.text.SpannableString spannableString4 = spannableString2;
            int iA = djiVarB.a();
            java.util.List list4 = djiVarB.b;
            if (list4 != null) {
                arrayList3 = new java.util.ArrayList(list4.size());
                int size12 = list4.size();
                for (int i35 = 0; i35 < size12; i35++) {
                    java.lang.Object obj = list4.get(i35);
                    defpackage.djg djgVar2 = (defpackage.djg) obj;
                    if (djgVar2.a instanceof dla) {
                        int i36 = djgVar2.b;
                        int i37 = djgVar2.c;
                        int i38 = defpackage.djj.a;
                        boolean z5 = i36 < iA;
                        if ((((iA == 0) | (i36 == i37)) & (i36 == 0)) | ((i37 > 0) & z5)) {
                            arrayList3.add(obj);
                        }
                    }
                }
            } else {
                arrayList3 = defpackage.aokc.a;
            }
            int size13 = arrayList3.size();
            for (int i39 = 0; i39 < size13; i39++) {
                defpackage.djg djgVar3 = (defpackage.djg) arrayList3.get(i39);
                dla dlaVar = (dla) djgVar3.a;
                int i40 = djgVar3.b;
                int i41 = djgVar3.c;
                if (!(dlaVar instanceof dla)) {
                    throw new defpackage.aois();
                }
                spannableString4.setSpan(new android.text.style.TtsSpan.VerbatimBuilder(dlaVar.a).build(), i40, i41, 33);
            }
            int iA2 = djiVarB.a();
            if (list4 != null) {
                arrayList4 = new java.util.ArrayList(list4.size());
                int size14 = list4.size();
                for (int i42 = 0; i42 < size14; i42++) {
                    java.lang.Object obj2 = list4.get(i42);
                    defpackage.djg djgVar4 = (defpackage.djg) obj2;
                    if (djgVar4.a instanceof dlb) {
                        int i43 = djgVar4.b;
                        int i44 = djgVar4.c;
                        int i45 = defpackage.djj.a;
                        boolean z6 = i43 < iA2;
                        if ((((iA2 == 0) | (i43 == i44)) & (i43 == 0)) | ((i44 > 0) & z6)) {
                            arrayList4.add(obj2);
                        }
                    }
                }
            } else {
                arrayList4 = defpackage.aokc.a;
            }
            int i46 = 0;
            for (int size15 = arrayList4.size(); i46 < size15; size15 = size15) {
                defpackage.djg djgVar5 = (defpackage.djg) arrayList4.get(i46);
                dlb dlbVar = (dlb) djgVar5.a;
                int i47 = djgVar5.b;
                int i48 = djgVar5.c;
                ?? r13 = aogcVar.c;
                java.lang.Object obj3 = r13.get(dlbVar);
                if (obj3 == null) {
                    android.text.style.URLSpan uRLSpan = new android.text.style.URLSpan(dlbVar.a);
                    r13.put(dlbVar, uRLSpan);
                    obj3 = uRLSpan;
                }
                spannableString4.setSpan((android.text.style.URLSpan) obj3, i47, i48, 33);
                i46++;
            }
            java.util.List listE = djiVarB.e(djiVarB.a());
            int size16 = listE.size();
            for (int i49 = 0; i49 < size16; i49++) {
                defpackage.djg djgVar6 = (defpackage.djg) listE.get(i49);
                int i50 = djgVar6.b;
                int i51 = djgVar6.c;
                if (i50 != i51) {
                    java.lang.Object obj4 = djgVar6.a;
                    djv djvVar = (djw) obj4;
                    if (djvVar instanceof djv) {
                        if (obj4 == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        }
                        defpackage.djg djgVar7 = new defpackage.djg((djv) obj4, i50, i51, "");
                        ?? r12 = aogcVar.a;
                        java.lang.Object obj5 = r12.get(djgVar7);
                        if (obj5 == null) {
                            android.text.style.URLSpan uRLSpan2 = new android.text.style.URLSpan(((djv) djgVar7.a).a);
                            r12.put(djgVar7, uRLSpan2);
                            obj5 = uRLSpan2;
                        }
                        spannableString4.setSpan((android.text.style.URLSpan) obj5, i50, i51, 33);
                    } else {
                        ?? r14 = aogcVar.b;
                        java.lang.Object obj6 = r14.get(djgVar6);
                        if (obj6 == null) {
                            doc docVar = new doc(djvVar);
                            r14.put(djgVar6, docVar);
                            obj6 = docVar;
                        }
                        spannableString4.setSpan((android.text.style.ClickableSpan) obj6, i50, i51, 33);
                    }
                }
            }
            spannableString = (android.text.SpannableString) J(spannableString4);
        } else {
            dipVar = dipVar3;
            dibVar = dibVar3;
            spannableString = null;
        }
        ebdVar.R(spannableString);
        defpackage.dip dipVar5 = defpackage.din.P;
        if (dieVar.f(dipVar5)) {
            accessibilityNodeInfo.setContentInvalid(true);
            ebdVar.z((java.lang.CharSequence) dieVar.g(dipVar5));
        }
        ebdVar.Q(wt.c(dijVar, resources));
        ebdVar.q(wt.e(dijVar));
        defpackage.dja djaVar = (defpackage.dja) dieVar.g(defpackage.din.L);
        if (djaVar != null) {
            if (djaVar == defpackage.dja.a) {
                ebdVar.r(true);
            } else if (djaVar == defpackage.dja.b) {
                ebdVar.r(false);
            }
        }
        defpackage.dip dipVar6 = defpackage.din.K;
        java.lang.Boolean bool = (java.lang.Boolean) dieVar.g(dipVar6);
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            dibVar2 = dibVar;
            if (dibVar == null) {
                i2 = 4;
            } else {
                i2 = 4;
                if (dibVar2.a == 4) {
                    accessibilityNodeInfo.setSelected(zBooleanValue2);
                }
            }
            ebdVar.r(zBooleanValue2);
        } else {
            dibVar2 = dibVar;
            i2 = 4;
        }
        if (!dieVar.a || dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true).isEmpty()) {
            java.util.List list5 = (java.util.List) dieVar.g(defpackage.din.a);
            ebdVar.w(list5 != null ? (java.lang.String) (list5.isEmpty() ? null : list5.get(0)) : null);
        }
        defpackage.dip dipVar7 = defpackage.din.B;
        java.lang.String str4 = (java.lang.String) dieVar.g(dipVar7);
        if (str4 != null) {
            for (defpackage.dij dijVarJ3 = dijVar; dijVarJ3 != null; dijVarJ3 = dijVarJ3.j()) {
                defpackage.die dieVar2 = dijVarJ3.b;
                defpackage.dip dipVar8 = defpackage.dio.a;
                if (dieVar2.f(dipVar8)) {
                    if (!((java.lang.Boolean) dieVar2.c(dipVar8)).booleanValue()) {
                        break;
                    }
                    accessibilityNodeInfo.setViewIdResourceName(str4);
                    break;
                }
            }
        }
        java.lang.String str5 = (java.lang.String) dieVar.g(defpackage.din.v);
        if (str5 != null) {
            ebdVar.D(str5);
        }
        if (((defpackage.aojh) dieVar.g(defpackage.din.h)) != null) {
            ebdVar.C(true);
        }
        if (((defpackage.aojh) dieVar.g(defpackage.din.i)) != null) {
            da$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, true);
        }
        if (i != -1) {
            int iD3 = this.K.d(dijVar.c);
            if (iD3 != -1) {
                aa$.ExternalSyntheticApiModelOutline1.m(accessibilityNodeInfo, iD3);
            } else {
                android.util.Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        accessibilityNodeInfo.setPassword(dieVar.f(defpackage.din.N) && !defpackage.aooh.n(dieVar.g(defpackage.din.O), java.lang.Boolean.FALSE));
        java.lang.Object objG = dieVar.g(defpackage.din.R);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        accessibilityNodeInfo.setEditable(defpackage.aooh.n(objG, bool2));
        java.lang.Integer num = (java.lang.Integer) dieVar.g(defpackage.din.S);
        ebdVar.F(num != null ? num.intValue() : -1);
        ebdVar.y(wt.d(dijVar));
        defpackage.dip dipVar9 = defpackage.din.l;
        ebdVar.A(dieVar.f(dipVar9));
        if (ebdVar.Z()) {
            ebdVar.B(((java.lang.Boolean) dieVar.c(dipVar9)).booleanValue());
            if (ebdVar.aa()) {
                i3 = 2;
                ebdVar.h(2);
                this.e = i;
            } else {
                i3 = 2;
                ebdVar.h(1);
            }
        } else {
            i3 = 2;
        }
        ebdVar.W((defpackage.dil.a(dijVar) || z3) ? false : true);
        if (dijVar.k()) {
            dijVarJ = dijVar.j();
            if (dijVarJ == null) {
                defpackage.aooh.g();
            }
        } else {
            dijVarJ = dijVar;
        }
        if (dijVarJ.d().i()) {
            ebdVar.W(false);
        }
        dhz dhzVar = (dhz) dieVar.g(defpackage.din.k);
        if (dhzVar != null) {
            if (1 != dhzVar.a) {
                i3 = 1;
            }
            accessibilityNodeInfo.setLiveRegion(i3);
        }
        ebdVar.t(false);
        defpackage.dhr dhrVar5 = (defpackage.dhr) dieVar.g(defpackage.did.b);
        if (dhrVar5 != null) {
            ebdVar.t(dibVar2 == null || !((dibVar2.a == 4 || dibVar2.a == 3) && defpackage.aooh.n(dieVar.g(dipVar6), bool2)));
            if (wt.d(dijVar) && ebdVar.X()) {
                ebdVar.i(new ebc((java.lang.Object) null, 16, dhrVar5.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
        }
        ebdVar.E(false);
        defpackage.dhr dhrVar6 = (defpackage.dhr) dieVar.g(defpackage.did.c);
        if (dhrVar6 != null) {
            ebdVar.E(true);
            if (wt.d(dijVar)) {
                ebdVar.i(new ebc((java.lang.Object) null, 32, dhrVar6.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
        }
        defpackage.dhr dhrVar7 = (defpackage.dhr) dieVar.g(defpackage.did.p);
        if (dhrVar7 != null) {
            ebdVar.i(new ebc((java.lang.Object) null, 16384, dhrVar7.a, (defpackage.ebo) null, (java.lang.Class) null));
        }
        if (wt.d(dijVar)) {
            defpackage.dhr dhrVar8 = (defpackage.dhr) dieVar.g(defpackage.did.k);
            if (dhrVar8 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, 2097152, dhrVar8.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar9 = (defpackage.dhr) dieVar.g(defpackage.did.o);
            if (dhrVar9 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionImeEnter, dhrVar9.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar10 = (defpackage.dhr) dieVar.g(defpackage.did.q);
            if (dhrVar10 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, 65536, dhrVar10.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar11 = (defpackage.dhr) dieVar.g(defpackage.did.r);
            if (dhrVar11 != null && ebdVar.aa() && (primaryClipDescription = degVar2.J().a().getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                ebdVar.i(new ebc((java.lang.Object) null, 32768, dhrVar11.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
        }
        java.lang.String strK = K(dijVar);
        if (strK != null && strK.length() != 0) {
            accessibilityNodeInfo.setTextSelection(l(dijVar), k(dijVar));
            defpackage.dhr dhrVar12 = (defpackage.dhr) dieVar.g(defpackage.did.j);
            ebdVar.i(new ebc((java.lang.Object) null, 131072, dhrVar12 != null ? dhrVar12.a : null, (defpackage.ebo) null, (java.lang.Class) null));
            ebdVar.h(256);
            ebdVar.h(512);
            ebdVar.G(11);
            java.util.List list6 = (java.util.List) dieVar.g(defpackage.din.a);
            if ((list6 == null || list6.isEmpty()) && dieVar.f(defpackage.did.a)) {
                defpackage.dip dipVar10 = dipVar;
                if (!dieVar.f(dipVar10) || defpackage.aooh.n(dieVar.g(dipVar9), bool2)) {
                    defpackage.dbk dbkVarK = dijVar.a.k();
                    while (true) {
                        if (dbkVarK == null) {
                            dbkVarK = null;
                            break;
                        }
                        defpackage.die dieVarQ2 = dbkVarK.q();
                        if (dieVarQ2 != null && dieVarQ2.a && dieVarQ2.f(dipVar10)) {
                            break;
                        } else {
                            dbkVarK = dbkVarK.k();
                        }
                    }
                    if (dbkVarK == null || ((dieVarQ = dbkVarK.q()) != null && defpackage.aooh.n(dieVarQ.g(dipVar9), java.lang.Boolean.TRUE))) {
                        ebdVar.G(accessibilityNodeInfo.getMovementGranularities() | 20);
                    }
                }
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add("androidx.compose.ui.semantics.id");
        java.lang.CharSequence charSequenceE = ebdVar.e();
        if (charSequenceE != null && charSequenceE.length() != 0 && dieVar.f(defpackage.did.a)) {
            arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (android.os.Build.VERSION.SDK_INT >= 37 && wt.i(ebdVar, dijVar)) {
            arrayList5.add("android.view.accessibility.extra.DATA_RENDERING_INFO_KEY");
        }
        if (dieVar.f(dipVar7)) {
            arrayList5.add("androidx.compose.ui.semantics.testTag");
        }
        if (dieVar.f(defpackage.din.U)) {
            arrayList5.add("androidx.compose.ui.semantics.shapeType");
            arrayList5.add("androidx.compose.ui.semantics.shapeRect");
            arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
            arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
        }
        da$.ExternalSyntheticApiModelOutline1.m(accessibilityNodeInfo, arrayList5);
        dia diaVar = (dia) dieVar.g(defpackage.din.c);
        if (diaVar != null) {
            defpackage.dip dipVar11 = defpackage.did.i;
            if (dieVar.f(dipVar11)) {
                ebdVar.s("android.widget.SeekBar");
            } else {
                ebdVar.s("android.widget.ProgressBar");
            }
            if (diaVar != dia.a) {
                aopm aopmVar = diaVar.c;
                ebdVar.ae(ni.q(((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue(), diaVar.b));
            }
            if (dieVar.f(dipVar11) && wt.d(dijVar)) {
                float f = diaVar.b;
                aopm aopmVar2 = diaVar.c;
                float fFloatValue = ((java.lang.Number) aopmVar2.a()).floatValue();
                float fFloatValue2 = ((java.lang.Number) aopmVar2.b()).floatValue();
                if (fFloatValue < fFloatValue2) {
                    fFloatValue = fFloatValue2;
                }
                if (f < fFloatValue) {
                    ebdVar.i(ebc.g);
                }
                float fFloatValue3 = ((java.lang.Number) aopmVar2.b()).floatValue();
                float fFloatValue4 = ((java.lang.Number) aopmVar2.a()).floatValue();
                if (fFloatValue3 > fFloatValue4) {
                    fFloatValue3 = fFloatValue4;
                }
                if (f > fFloatValue3) {
                    ebdVar.i(ebc.h);
                }
            }
        }
        if (wt.d(dijVar) && (dhrVar4 = (defpackage.dhr) dieVar.g(defpackage.did.i)) != null) {
            ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionSetProgress, dhrVar4.a, (defpackage.ebo) null, (java.lang.Class) null));
        }
        defpackage.die dieVarH = dijVar.h();
        defpackage.dip dipVar12 = defpackage.din.f;
        defpackage.dhu dhuVar2 = (defpackage.dhu) dieVarH.g(dipVar12);
        if (dhuVar2 == null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            if (dijVar.h().g(defpackage.din.e) != null) {
                java.util.List listL3 = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
                int size17 = listL3.size();
                for (int i52 = 0; i52 < size17; i52++) {
                    defpackage.dij dijVar5 = (defpackage.dij) listL3.get(i52);
                    if (dijVar5.h().f(dipVar6)) {
                        arrayList6.add(dijVar5);
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                if (dfg.d(arrayList6)) {
                    size2 = arrayList6.size();
                    size = 1;
                } else {
                    size = arrayList6.size();
                    size2 = 1;
                }
                i4 = 0;
                ebdVar.u(ni.t(size, size2, 0));
            }
            if (((wx) dijVar.h().g(defpackage.din.g)) == null) {
                throw null;
            }
            dijVarJ2 = dijVar.j();
            if (dijVarJ2 != null && dijVarJ2.h().g(defpackage.din.e) != null && (((dhuVar = (defpackage.dhu) dijVarJ2.h().g(dipVar12)) == null || (dhuVar.a >= 0 && dhuVar.b >= 0)) && dijVar.h().f(dipVar6))) {
                arrayList2 = new java.util.ArrayList();
                listL = dijVarJ2.l((4 & 1) != 0 ? !dijVarJ2.e : false, ((4 & 2) == 0) & true);
                size7 = listL.size();
                i11 = i4;
                i12 = i11;
                while (i11 < size7) {
                    dijVar2 = (defpackage.dij) listL.get(i11);
                    if (dijVar2.h().f(dipVar6)) {
                        arrayList2.add(dijVar2);
                        if (dijVar2.a.f() < dijVar.a.f()) {
                            i12++;
                        }
                    }
                    i11++;
                }
                if (!arrayList2.isEmpty()) {
                    zD = dfg.d(arrayList2);
                    if (true != zD) {
                        i13 = i12;
                    } else {
                        i13 = i4;
                    }
                    if (true != zD) {
                        i14 = i4;
                    } else {
                        i14 = i12;
                    }
                    ebdVar.v(ni.r(i13, 1, i14, 1, false, ((java.lang.Boolean) dijVar.h().d(dipVar6, new bmt(11))).booleanValue()));
                }
            }
            dicVar = (defpackage.dic) dieVar.g(defpackage.din.w);
            defpackage.dhr dhrVar13 = (defpackage.dhr) dieVar.g(defpackage.did.d);
            if (dicVar != null && dhrVar13 != null) {
                if (!dfg.e(dijVar)) {
                    ebdVar.s("android.widget.HorizontalScrollView");
                }
                if (((java.lang.Number) dicVar.b.a()).floatValue() > 0.0f) {
                    ebdVar.N(true);
                }
                if (wt.d(dijVar)) {
                    if (T(dicVar)) {
                        ebdVar.i(ebc.g);
                        if (wt.f(dijVar)) {
                            ebcVar2 = ebc.n;
                        } else {
                            ebcVar2 = ebc.p;
                        }
                        ebdVar.i(ebcVar2);
                    }
                    if (S(dicVar)) {
                        ebdVar.i(ebc.h);
                        if (wt.f(dijVar)) {
                            ebcVar = ebc.p;
                        } else {
                            ebcVar = ebc.n;
                        }
                        ebdVar.i(ebcVar);
                    }
                }
            }
            dicVar2 = (defpackage.dic) dieVar.g(defpackage.din.x);
            if (dicVar2 != null && dhrVar13 != null) {
                if (!dfg.e(dijVar)) {
                    ebdVar.s("android.widget.ScrollView");
                }
                if (((java.lang.Number) dicVar2.b.a()).floatValue() > 0.0f) {
                    ebdVar.N(true);
                }
                if (wt.d(dijVar)) {
                    if (T(dicVar2)) {
                        ebdVar.i(ebc.g);
                        ebdVar.i(ebc.o);
                    }
                    if (S(dicVar2)) {
                        ebdVar.i(ebc.h);
                        ebdVar.i(ebc.m);
                    }
                }
            }
            defpackage.ddt.b(ebdVar, dijVar);
            ebdVar.I((java.lang.CharSequence) dieVar.g(defpackage.din.d));
            if (wt.d(dijVar)) {
                dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.s);
                if (dhrVar != null) {
                    ebdVar.i(new ebc((java.lang.Object) null, 262144, dhrVar.a, (defpackage.ebo) null, (java.lang.Class) null));
                }
                dhrVar2 = (defpackage.dhr) dieVar.g(defpackage.did.t);
                if (dhrVar2 != null) {
                    ebdVar.i(new ebc((java.lang.Object) null, 524288, dhrVar2.a, (defpackage.ebo) null, (java.lang.Class) null));
                }
                dhrVar3 = (defpackage.dhr) dieVar.g(defpackage.did.u);
                if (dhrVar3 != null) {
                    ebdVar.i(new ebc((java.lang.Object) null, 1048576, dhrVar3.a, (defpackage.ebo) null, (java.lang.Class) null));
                }
                dipVar2 = defpackage.did.w;
                if (dieVar.f(dipVar2)) {
                    list = (java.util.List) dieVar.c(dipVar2);
                    size3 = list.size();
                    acmVar = B;
                    i5 = acmVar.b;
                    if (size3 < i5) {
                        throw new java.lang.IllegalStateException(defpackage.a.bs(i5, "Can't have more than ", " custom actions for one widget"));
                    }
                    aedVar = new defpackage.aed(null);
                    defpackage.ado adoVar3 = defpackage.adp.a;
                    adoVar = new defpackage.ado(6);
                    aedVar2 = this.F;
                    if (aedVar2.a(i) >= 0) {
                        adoVar2 = (defpackage.ado) aee.a(aedVar2, i);
                        acmVar2 = new defpackage.acm(16);
                        iArr = acmVar.a;
                        i7 = acmVar.b;
                        for (i8 = i4; i8 < i7; i8++) {
                            acmVar2.f(iArr[i8]);
                        }
                        arrayList = new java.util.ArrayList();
                        size5 = list.size();
                        i9 = 0;
                        while (i9 < size5) {
                            dhwVar = (dhw) list.get(i9);
                            if (adoVar2 == null) {
                                defpackage.aooh.g();
                            }
                            int i53 = size5;
                            str2 = dhwVar.a;
                            if (adoVar2.a(str2) >= 0) {
                                int iB = adoVar2.b(str2);
                                aedVar.f(iB, str2);
                                adoVar.h(str2, iB);
                                acmVar2.g(iB);
                                ebdVar.i(new ebc((java.lang.Object) null, iB, str2, (defpackage.ebo) null, (java.lang.Class) null));
                            } else {
                                arrayList.add(dhwVar);
                            }
                            i9++;
                            size5 = i53;
                        }
                        size6 = arrayList.size();
                        for (i10 = 0; i10 < size6; i10++) {
                            dhw dhwVar2 = (dhw) arrayList.get(i10);
                            int iA3 = acmVar2.a(i10);
                            java.lang.String str6 = dhwVar2.a;
                            aedVar.f(iA3, str6);
                            adoVar.h(str6, iA3);
                            ebdVar.i(new ebc((java.lang.Object) null, iA3, str6, (defpackage.ebo) null, (java.lang.Class) null));
                        }
                    } else {
                        size4 = list.size();
                        for (i6 = 0; i6 < size4; i6++) {
                            dhw dhwVar3 = (dhw) list.get(i6);
                            int iA4 = acmVar.a(i6);
                            java.lang.String str7 = dhwVar3.a;
                            aedVar.f(iA4, str7);
                            adoVar.h(str7, iA4);
                            ebdVar.i(new ebc((java.lang.Object) null, iA4, str7, (defpackage.ebo) null, (java.lang.Class) null));
                        }
                    }
                    this.i.f(i, aedVar);
                    aedVar2.f(i, adoVar);
                }
            }
            ebdVar.M(wt.g(dijVar, resources, z3));
            iD = this.v.d(i);
            if (iD != -1) {
                deyVarAd2 = degVar2.ad();
                if (deyVarAd2 != null) {
                    viewB2 = defpackage.dff.b(deyVarAd2, iD);
                } else {
                    viewB2 = null;
                }
                if (viewB2 != null) {
                    ebdVar.U(viewB2);
                    degVar = degVar2;
                } else {
                    degVar = degVar2;
                    ebdVar.V(degVar, iD);
                }
                t(i, ebdVar, this.n, null);
            } else {
                degVar = degVar2;
            }
            iD2 = this.w.d(i);
            if (iD2 != -1) {
                deyVarAd = degVar.ad();
                if (deyVarAd != null) {
                    viewB = defpackage.dff.b(deyVarAd, iD2);
                } else {
                    viewB = null;
                }
                if (viewB != null) {
                    ebdVar.T(viewB);
                    t(i, ebdVar, this.o, null);
                }
            }
            str = (java.lang.String) dieVar.g(defpackage.dio.b);
            if (str != null) {
                ebdVar.s(str);
            }
        }
        ebdVar.u(ni.t(dhuVar2.a, dhuVar2.b, 0));
        i4 = 0;
        if (((wx) dijVar.h().g(defpackage.din.g)) == null) {
            throw null;
        }
        dijVarJ2 = dijVar.j();
        if (dijVarJ2 != null) {
            arrayList2 = new java.util.ArrayList();
            listL = dijVarJ2.l((4 & 1) != 0 ? !dijVarJ2.e : false, ((4 & 2) == 0) & true);
            size7 = listL.size();
            i11 = i4;
            i12 = i11;
            while (i11 < size7) {
                dijVar2 = (defpackage.dij) listL.get(i11);
                if (dijVar2.h().f(dipVar6)) {
                    arrayList2.add(dijVar2);
                    if (dijVar2.a.f() < dijVar.a.f()) {
                        i12++;
                    }
                }
                i11++;
            }
            if (!arrayList2.isEmpty()) {
                zD = dfg.d(arrayList2);
                if (true != zD) {
                    i13 = i12;
                } else {
                    i13 = i4;
                }
                if (true != zD) {
                    i14 = i4;
                } else {
                    i14 = i12;
                }
                ebdVar.v(ni.r(i13, 1, i14, 1, false, ((java.lang.Boolean) dijVar.h().d(dipVar6, new bmt(11))).booleanValue()));
            }
        }
        dicVar = (defpackage.dic) dieVar.g(defpackage.din.w);
        defpackage.dhr dhrVar14 = (defpackage.dhr) dieVar.g(defpackage.did.d);
        if (dicVar != null) {
            if (!dfg.e(dijVar)) {
                ebdVar.s("android.widget.HorizontalScrollView");
            }
            if (((java.lang.Number) dicVar.b.a()).floatValue() > 0.0f) {
                ebdVar.N(true);
            }
            if (wt.d(dijVar)) {
                if (T(dicVar)) {
                    ebdVar.i(ebc.g);
                    if (wt.f(dijVar)) {
                        ebcVar2 = ebc.p;
                    } else {
                        ebcVar2 = ebc.n;
                    }
                    ebdVar.i(ebcVar2);
                }
                if (S(dicVar)) {
                    ebdVar.i(ebc.h);
                    if (wt.f(dijVar)) {
                        ebcVar = ebc.n;
                    } else {
                        ebcVar = ebc.p;
                    }
                    ebdVar.i(ebcVar);
                }
            }
        }
        dicVar2 = (defpackage.dic) dieVar.g(defpackage.din.x);
        if (dicVar2 != null) {
            if (!dfg.e(dijVar)) {
                ebdVar.s("android.widget.ScrollView");
            }
            if (((java.lang.Number) dicVar2.b.a()).floatValue() > 0.0f) {
                ebdVar.N(true);
            }
            if (wt.d(dijVar)) {
                if (T(dicVar2)) {
                    ebdVar.i(ebc.g);
                    ebdVar.i(ebc.o);
                }
                if (S(dicVar2)) {
                    ebdVar.i(ebc.h);
                    ebdVar.i(ebc.m);
                }
            }
        }
        defpackage.ddt.b(ebdVar, dijVar);
        ebdVar.I((java.lang.CharSequence) dieVar.g(defpackage.din.d));
        if (wt.d(dijVar)) {
            dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.s);
            if (dhrVar != null) {
                ebdVar.i(new ebc((java.lang.Object) null, 262144, dhrVar.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            dhrVar2 = (defpackage.dhr) dieVar.g(defpackage.did.t);
            if (dhrVar2 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, 524288, dhrVar2.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            dhrVar3 = (defpackage.dhr) dieVar.g(defpackage.did.u);
            if (dhrVar3 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, 1048576, dhrVar3.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            dipVar2 = defpackage.did.w;
            if (dieVar.f(dipVar2)) {
                list = (java.util.List) dieVar.c(dipVar2);
                size3 = list.size();
                acmVar = B;
                i5 = acmVar.b;
                if (size3 < i5) {
                    throw new java.lang.IllegalStateException(defpackage.a.bs(i5, "Can't have more than ", " custom actions for one widget"));
                }
                aedVar = new defpackage.aed(null);
                defpackage.ado adoVar4 = defpackage.adp.a;
                adoVar = new defpackage.ado(6);
                aedVar2 = this.F;
                if (aedVar2.a(i) >= 0) {
                    adoVar2 = (defpackage.ado) aee.a(aedVar2, i);
                    acmVar2 = new defpackage.acm(16);
                    iArr = acmVar.a;
                    i7 = acmVar.b;
                    while (i8 < i7) {
                        acmVar2.f(iArr[i8]);
                    }
                    arrayList = new java.util.ArrayList();
                    size5 = list.size();
                    i9 = 0;
                    while (i9 < size5) {
                        dhwVar = (dhw) list.get(i9);
                        if (adoVar2 == null) {
                            defpackage.aooh.g();
                        }
                        int i54 = size5;
                        str2 = dhwVar.a;
                        if (adoVar2.a(str2) >= 0) {
                            int iB2 = adoVar2.b(str2);
                            aedVar.f(iB2, str2);
                            adoVar.h(str2, iB2);
                            acmVar2.g(iB2);
                            ebdVar.i(new ebc((java.lang.Object) null, iB2, str2, (defpackage.ebo) null, (java.lang.Class) null));
                        } else {
                            arrayList.add(dhwVar);
                        }
                        i9++;
                        size5 = i54;
                    }
                    size6 = arrayList.size();
                    while (i10 < size6) {
                        dhw dhwVar4 = (dhw) arrayList.get(i10);
                        int iA5 = acmVar2.a(i10);
                        java.lang.String str8 = dhwVar4.a;
                        aedVar.f(iA5, str8);
                        adoVar.h(str8, iA5);
                        ebdVar.i(new ebc((java.lang.Object) null, iA5, str8, (defpackage.ebo) null, (java.lang.Class) null));
                    }
                } else {
                    size4 = list.size();
                    while (i6 < size4) {
                        dhw dhwVar5 = (dhw) list.get(i6);
                        int iA6 = acmVar.a(i6);
                        java.lang.String str9 = dhwVar5.a;
                        aedVar.f(iA6, str9);
                        adoVar.h(str9, iA6);
                        ebdVar.i(new ebc((java.lang.Object) null, iA6, str9, (defpackage.ebo) null, (java.lang.Class) null));
                    }
                }
                this.i.f(i, aedVar);
                aedVar2.f(i, adoVar);
            }
        }
        ebdVar.M(wt.g(dijVar, resources, z3));
        iD = this.v.d(i);
        if (iD != -1) {
            deyVarAd2 = degVar2.ad();
            if (deyVarAd2 != null) {
                viewB2 = defpackage.dff.b(deyVarAd2, iD);
            } else {
                viewB2 = null;
            }
            if (viewB2 != null) {
                ebdVar.U(viewB2);
                degVar = degVar2;
            } else {
                degVar = degVar2;
                ebdVar.V(degVar, iD);
            }
            t(i, ebdVar, this.n, null);
        } else {
            degVar = degVar2;
        }
        iD2 = this.w.d(i);
        if (iD2 != -1) {
            deyVarAd = degVar.ad();
            if (deyVarAd != null) {
                viewB = defpackage.dff.b(deyVarAd, iD2);
            } else {
                viewB = null;
            }
            if (viewB != null) {
                ebdVar.T(viewB);
                t(i, ebdVar, this.o, null);
            }
        }
        str = (java.lang.String) dieVar.g(defpackage.dio.b);
        if (str != null) {
            ebdVar.s(str);
        }
    }

    public final void w(dgf dgfVar) {
        if (dgfVar.B()) {
            defpackage.deg degVar = this.a;
            degVar.u.a.c(dgfVar, this.J, new bxq(dgfVar, this, 8));
        }
    }

    public final void x(int i, int i2, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent accessibilityEventO = o(m(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        I(accessibilityEventO);
    }

    public final void y(int i) {
        dej dejVar = this.m;
        if (dejVar != null) {
            defpackage.dij dijVar = dejVar.a;
            int i2 = dijVar.c;
            if (i != i2) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - dejVar.f <= 1000) {
                android.view.accessibility.AccessibilityEvent accessibilityEventO = o(m(i2), 131072);
                accessibilityEventO.setFromIndex(dejVar.d);
                accessibilityEventO.setToIndex(dejVar.e);
                accessibilityEventO.setAction(dejVar.b);
                accessibilityEventO.setMovementGranularity(dejVar.c);
                accessibilityEventO.getText().add(K(dijVar));
                I(accessibilityEventO);
            }
        }
        this.m = null;
    }

    public final void z(int i) {
        int i2 = this.b;
        if (i2 != i) {
            this.b = i;
            H(i, 128, null, null);
            H(i2, 256, null, null);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}

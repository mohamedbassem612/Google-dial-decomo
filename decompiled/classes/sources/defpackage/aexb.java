package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aexb {
    private static final java.lang.Object a = new java.lang.Object();
    public static final /* synthetic */ int d = 0;
    private static volatile defpackage.aexa e = null;
    private static volatile boolean f = false;
    private static final java.util.concurrent.atomic.AtomicInteger g;
    private static final defpackage.ahbm m;
    final defpackage.aewz b;
    final java.lang.String c;
    private java.lang.Object h;
    private volatile int i = -1;
    private volatile java.lang.Object j;
    private final boolean k;
    private volatile boolean l;

    static {
        new java.util.concurrent.atomic.AtomicReference();
        m = new defpackage.ahbm();
        g = new java.util.concurrent.atomic.AtomicInteger();
    }

    public aexb(defpackage.aewz aewzVar, java.lang.String str, java.lang.Object obj, boolean z) {
        if (aewzVar.d == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = aewzVar;
        this.c = str;
        this.h = obj;
        this.k = z;
        this.l = false;
    }

    public static void e() {
        g.incrementAndGet();
    }

    public static void f(android.content.Context context) {
        if (e != null || context == null) {
            return;
        }
        java.lang.Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    try {
                        defpackage.aexa aexaVar = e;
                        android.content.Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (aexaVar == null) {
                            e = new defpackage.aexa(context, defpackage.ahvr.bI(new defpackage.aeex(context, 16)));
                            g.incrementAndGet();
                        } else if (aexaVar.a != context) {
                            java.util.Iterator it = defpackage.aewg.a.values().iterator();
                            while (it.hasNext()) {
                                defpackage.aewg aewgVar = (defpackage.aewg) it.next();
                                synchronized (aewgVar) {
                                    try {
                                        if (aewgVar.f) {
                                            aewgVar.f = false;
                                        } else {
                                            android.database.ContentObserver contentObserver = aewgVar.e;
                                            if (contentObserver != null) {
                                                aewgVar.c.unregisterContentObserver(contentObserver);
                                                aewgVar.e = null;
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                it.remove();
                            }
                            defpackage.aexd.a();
                            defpackage.aewl.a();
                            e = new defpackage.aexa(context, defpackage.ahvr.bI(new defpackage.aeex(context, 16)));
                            g.incrementAndGet();
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private final java.lang.String g(java.lang.String str) {
        boolean zIsEmpty = str.isEmpty();
        java.lang.String str2 = this.c;
        return !zIsEmpty ? str.concat(str2) : str2;
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    /* JADX WARN: Code duplicated, block: B:101:0x01b0 A[Catch: all -> 0x0232, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b6 A[Catch: all -> 0x0232, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1 A[Catch: all -> 0x0232, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01dc A[Catch: SecurityException -> 0x01e0, all -> 0x0232, TryCatch #6 {SecurityException -> 0x01e0, blocks: (B:110:0x01c9, B:112:0x01dc, B:113:0x01df), top: B:172:0x01c9, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01df A[Catch: SecurityException -> 0x01e0, all -> 0x0232, TRY_LEAVE, TryCatch #6 {SecurityException -> 0x01e0, blocks: (B:110:0x01c9, B:112:0x01dc, B:113:0x01df), top: B:172:0x01c9, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec A[Catch: all -> 0x0232, DONT_GENERATE, TRY_LEAVE, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0203 A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0227  */
    /* JADX WARN: Code duplicated, block: B:138:0x022a A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x022f A[Catch: all -> 0x0232, TRY_ENTER, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0236 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x023b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0244 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0249 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r2
      0x0043: PHI (r2v1 ahyn) = (r2v0 ahyn), (r2v0 ahyn), (r2v4 ahyn) binds: [B:11:0x001c, B:13:0x0020, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0139 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0141 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #9 {all -> 0x0177, blocks: (B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:175:0x0144, outer: #11, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x017b A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0185 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x018a  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0193 A[Catch: all -> 0x025d, TryCatch #11 {, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001e, B:14:0x0022, B:16:0x002e, B:18:0x0044, B:22:0x004d, B:24:0x0058, B:26:0x006a, B:61:0x0139, B:63:0x0141, B:64:0x0143, B:83:0x0176, B:87:0x017b, B:88:0x017d, B:90:0x0185, B:93:0x018d, B:95:0x0193, B:96:0x0197, B:119:0x01ed, B:124:0x01ff, B:126:0x0203, B:128:0x020b, B:138:0x022a, B:135:0x021c, B:122:0x01f5, B:142:0x0231, B:146:0x0236, B:148:0x023c, B:151:0x0244, B:152:0x0249, B:153:0x024d, B:27:0x007b, B:29:0x0083, B:52:0x00f8, B:54:0x00ff, B:56:0x010f, B:57:0x0121, B:58:0x0122, B:30:0x0090, B:31:0x0092, B:50:0x00ea, B:156:0x0253, B:159:0x0256, B:160:0x0258, B:161:0x0259, B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f, B:32:0x0093, B:34:0x009b, B:35:0x00a7, B:37:0x00a9, B:39:0x00b5, B:41:0x00c3, B:48:0x00de, B:49:0x00e9, B:43:0x00cd, B:44:0x00d1, B:45:0x00d7, B:65:0x0144, B:67:0x0148, B:76:0x0166, B:78:0x016e, B:79:0x0171, B:80:0x0172, B:68:0x014c, B:75:0x015d), top: B:178:0x0013, inners: #7, #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019c A[Catch: all -> 0x0232, TryCatch #7 {all -> 0x0232, blocks: (B:97:0x0198, B:99:0x019c, B:101:0x01b0, B:103:0x01bb, B:102:0x01b6, B:104:0x01bd, B:106:0x01c1, B:108:0x01c5, B:110:0x01c9, B:112:0x01dc, B:113:0x01df, B:115:0x01e1, B:116:0x01e8, B:118:0x01ec, B:140:0x022f), top: B:173:0x0198, outer: #11, inners: #6 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    public final java.lang.Object b() {
        java.lang.String strP;
        boolean zBooleanValue;
        android.content.pm.ProviderInfo providerInfoResolveContentProvider;
        final defpackage.aewg aewgVarA;
        java.lang.Object objA;
        android.content.Context context;
        defpackage.aewl aewlVar;
        final defpackage.aewl aewlVar2;
        defpackage.aewz aewzVar;
        final java.lang.String strG;
        java.lang.Object obj;
        java.lang.String str;
        defpackage.aewl aewlVar3;
        defpackage.aewl aewlVar4;
        java.util.Map map;
        ?? r8;
        java.lang.String str2;
        java.util.Map map2;
        ?? r9;
        java.util.Map map3;
        defpackage.ahzi ahziVar;
        if (!this.k) {
            boolean z = m.a;
        }
        int i = g.get();
        if (this.i < i) {
            synchronized (this) {
                if (this.i < i) {
                    defpackage.aexa aexaVar = e;
                    defpackage.ahyn ahynVar = defpackage.ahwt.a;
                    java.lang.Object objA2 = null;
                    if (aexaVar == null || (ahziVar = aexaVar.b) == null) {
                        strP = null;
                    } else {
                        ahynVar = (defpackage.ahyn) ahziVar.eZ();
                        if (ahynVar.f()) {
                            defpackage.xtq xtqVar = (defpackage.xtq) ahynVar.b();
                            defpackage.aewz aewzVar2 = this.b;
                            strP = xtqVar.P((android.net.Uri) aewzVar2.d, aewzVar2.a, this.c);
                        } else {
                            strP = null;
                        }
                    }
                    boolean z2 = f;
                    boolean z3 = false;
                    defpackage.ahvr.bZ(aexaVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    java.lang.Object obj2 = this.b.d;
                    if (obj2 == null) {
                        android.content.Context context2 = aexaVar.a;
                        throw null;
                    }
                    android.content.Context context3 = aexaVar.a;
                    java.lang.Object obj3 = defpackage.aewn.b;
                    java.lang.String authority = ((android.net.Uri) obj2).getAuthority();
                    if ("com.google.android.gms.phenotype".equals(authority)) {
                        if (defpackage.aewn.a.f()) {
                            zBooleanValue = ((java.lang.Boolean) defpackage.aewn.a.b()).booleanValue();
                        } else {
                            synchronized (defpackage.aewn.b) {
                                try {
                                    if (defpackage.aewn.a.f()) {
                                        zBooleanValue = ((java.lang.Boolean) defpackage.aewn.a.b()).booleanValue();
                                    } else {
                                        if ("com.google.android.gms".equals(context3.getPackageName()) || ((providerInfoResolveContentProvider = context3.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                                            try {
                                                if ((context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                                    z3 = true;
                                                }
                                            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                            }
                                        }
                                        defpackage.aewn.a = new defpackage.ahys(java.lang.Boolean.valueOf(z3));
                                        zBooleanValue = ((java.lang.Boolean) defpackage.aewn.a.b()).booleanValue();
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (zBooleanValue) {
                            defpackage.aewz aewzVar3 = this.b;
                            int i2 = 2;
                            if (aewzVar3.c) {
                                android.content.Context context4 = aexaVar.a;
                                android.content.ContentResolver contentResolver = context4.getContentResolver();
                                java.lang.String lastPathSegment = ((android.net.Uri) aewzVar3.d).getLastPathSegment();
                                if (lastPathSegment == null) {
                                    throw null;
                                }
                                aewgVarA = defpackage.aewg.a(contentResolver, defpackage.aewo.a(defpackage.aewo.e(context4, lastPathSegment)), new defpackage.aafk(i2));
                            } else {
                                aewgVarA = defpackage.aewg.a(aexaVar.a.getContentResolver(), (android.net.Uri) aewzVar3.d, new defpackage.aafk(i2));
                            }
                        }
                        if (aewgVarA != null) {
                            java.lang.String strD = d();
                            map = aewgVarA.h;
                            if (map == null) {
                                r8 = map;
                                synchronized (aewgVarA.g) {
                                    try {
                                        map2 = aewgVarA.h;
                                        r9 = map2;
                                        if (map2 == null) {
                                            ?? AllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                                            try {
                                                try {
                                                    map3 = (java.util.Map) defpackage.agab.bh(new defpackage.aewi() { // from class: aewe
                                                        @Override // defpackage.aewi
                                                        public final java.lang.Object a() {
                                                            java.util.Map map4;
                                                            java.util.Map map5;
                                                            defpackage.aewg aewgVar = aewgVarA;
                                                            android.content.ContentResolver contentResolver2 = aewgVar.c;
                                                            android.net.Uri uri = aewgVar.d;
                                                            android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                                            try {
                                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                                    android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                    return java.util.Collections.EMPTY_MAP;
                                                                }
                                                                try {
                                                                    android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, defpackage.aewg.b, null, null, null);
                                                                    try {
                                                                        if (cursorQuery == null) {
                                                                            android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                            map4 = java.util.Collections.EMPTY_MAP;
                                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                            return map4;
                                                                        }
                                                                        int count = cursorQuery.getCount();
                                                                        if (count == 0) {
                                                                            map5 = java.util.Collections.EMPTY_MAP;
                                                                        } else {
                                                                            java.util.Map acaVar = count <= 256 ? new defpackage.aca(count) : new java.util.HashMap(count, 1.0f);
                                                                            while (cursorQuery.moveToNext()) {
                                                                                acaVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                                            }
                                                                            if (cursorQuery.isAfterLast()) {
                                                                                cursorQuery.close();
                                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                                return acaVar;
                                                                            }
                                                                            android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                            map5 = java.util.Collections.EMPTY_MAP;
                                                                        }
                                                                        cursorQuery.close();
                                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                        return map5;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        if (cursorQuery == null) {
                                                                            throw th2;
                                                                        }
                                                                        try {
                                                                            cursorQuery.close();
                                                                            throw th2;
                                                                        } catch (java.lang.Throwable th3) {
                                                                            th2.addSuppressed(th3);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                } catch (android.os.RemoteException e2) {
                                                                    android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
                                                                    map4 = java.util.Collections.EMPTY_MAP;
                                                                }
                                                            } catch (java.lang.Throwable th4) {
                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                throw th4;
                                                            }
                                                        }
                                                    });
                                                } catch (java.lang.Throwable th2) {
                                                    android.os.StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                                    throw th2;
                                                }
                                            } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.SecurityException e2) {
                                                android.util.Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e2);
                                                map3 = java.util.Collections.EMPTY_MAP;
                                            }
                                            android.os.StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                            aewgVarA.h = map3;
                                            AllowThreadDiskReads = map3;
                                            r9 = AllowThreadDiskReads;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        throw th3;
                                    }
                                }
                                r8 = r9;
                            }
                            if (r8 == 0) {
                                r8 = java.util.Collections.EMPTY_MAP;
                            }
                            str2 = (java.lang.String) r8.get(strD);
                            if (str2 != null) {
                                objA = a(str2);
                            } else {
                                objA = null;
                            }
                            if (objA == null) {
                                if (!this.b.b) {
                                    context = aexaVar.a;
                                    synchronized (defpackage.aewl.class) {
                                        try {
                                            if (defpackage.aewl.a == null) {
                                                if (defpackage.dff.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                                    aewlVar4 = new defpackage.aewl(context);
                                                } else {
                                                    aewlVar4 = new defpackage.aewl();
                                                }
                                                defpackage.aewl.a = aewlVar4;
                                            }
                                            aewlVar = defpackage.aewl.a;
                                            if (aewlVar != null && aewlVar.c != null && !aewlVar.b) {
                                                try {
                                                    context.getContentResolver().registerContentObserver(defpackage.aayn.a, true, (android.database.ContentObserver) defpackage.aewl.a.c);
                                                    aewlVar3 = defpackage.aewl.a;
                                                    if (aewlVar3 != null) {
                                                        throw null;
                                                    }
                                                    aewlVar3.b = true;
                                                } catch (java.lang.SecurityException e3) {
                                                    android.util.Log.e("GservicesLoader", "Unable to register Gservices content observer", e3);
                                                }
                                            }
                                            aewlVar2 = defpackage.aewl.a;
                                            if (aewlVar2 != null) {
                                                throw null;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    aewzVar = this.b;
                                    if (aewzVar.b) {
                                        strG = null;
                                    } else {
                                        strG = g((java.lang.String) aewzVar.e);
                                    }
                                    if (strG != null) {
                                        obj = aewlVar2.d;
                                        if (obj == null && defpackage.abyl.h((android.content.Context) obj)) {
                                            try {
                                                str = (java.lang.String) defpackage.agab.bh(new defpackage.aewi() { // from class: aewj
                                                    @Override // defpackage.aewi
                                                    public final java.lang.Object a() {
                                                        java.lang.Object obj4 = aewlVar2.d;
                                                        obj4.getClass();
                                                        java.lang.String str3 = strG;
                                                        return defpackage.aaym.a.a(((android.content.Context) obj4).getContentResolver(), str3, null);
                                                    }
                                                });
                                            } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e4) {
                                                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(strG), e4);
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            objA2 = a(str);
                                        }
                                    }
                                }
                                if (objA2 == null) {
                                    objA = c();
                                } else {
                                    objA = objA2;
                                }
                            }
                            if (ahynVar.f()) {
                                if (strP == null) {
                                    objA = c();
                                } else {
                                    objA = a(strP);
                                }
                            }
                            this.j = objA;
                            this.i = i;
                        } else {
                            objA = null;
                            if (objA == null) {
                                if (!this.b.b) {
                                    context = aexaVar.a;
                                    synchronized (defpackage.aewl.class) {
                                        if (defpackage.aewl.a == null) {
                                            if (defpackage.dff.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                                aewlVar4 = new defpackage.aewl(context);
                                            } else {
                                                aewlVar4 = new defpackage.aewl();
                                            }
                                            defpackage.aewl.a = aewlVar4;
                                        }
                                        aewlVar = defpackage.aewl.a;
                                        if (aewlVar != null) {
                                            context.getContentResolver().registerContentObserver(defpackage.aayn.a, true, (android.database.ContentObserver) defpackage.aewl.a.c);
                                            aewlVar3 = defpackage.aewl.a;
                                            if (aewlVar3 != null) {
                                                throw null;
                                            }
                                            aewlVar3.b = true;
                                        }
                                        aewlVar2 = defpackage.aewl.a;
                                        if (aewlVar2 != null) {
                                            throw null;
                                        }
                                        aewzVar = this.b;
                                        if (aewzVar.b) {
                                            strG = null;
                                        } else {
                                            strG = g((java.lang.String) aewzVar.e);
                                        }
                                        if (strG != null) {
                                            obj = aewlVar2.d;
                                            if (obj == null) {
                                                str = null;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                objA2 = a(str);
                                            }
                                        }
                                    }
                                }
                                if (objA2 == null) {
                                    objA = c();
                                } else {
                                    objA = objA2;
                                }
                            }
                            if (ahynVar.f()) {
                                if (strP == null) {
                                    objA = c();
                                } else {
                                    objA = a(strP);
                                }
                            }
                            this.j = objA;
                            this.i = i;
                        }
                    } else {
                        android.util.Log.e("PhenotypeClientHelper", java.lang.String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
                    }
                    aewgVarA = null;
                    if (aewgVarA != null) {
                        java.lang.String strD2 = d();
                        map = aewgVarA.h;
                        if (map == null) {
                            r8 = map;
                            synchronized (aewgVarA.g) {
                                map2 = aewgVarA.h;
                                r9 = map2;
                                if (map2 == null) {
                                    ?? AllowThreadDiskReads2 = android.os.StrictMode.allowThreadDiskReads();
                                    map3 = (java.util.Map) defpackage.agab.bh(new defpackage.aewi() { // from class: aewe
                                        @Override // defpackage.aewi
                                        public final java.lang.Object a() {
                                            java.util.Map map4;
                                            java.util.Map map5;
                                            defpackage.aewg aewgVar = aewgVarA;
                                            android.content.ContentResolver contentResolver2 = aewgVar.c;
                                            android.net.Uri uri = aewgVar.d;
                                            android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                            try {
                                                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                                                    android.util.Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                    return java.util.Collections.EMPTY_MAP;
                                                }
                                                try {
                                                    android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, defpackage.aewg.b, null, null, null);
                                                    try {
                                                        if (cursorQuery == null) {
                                                            android.util.Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                            map4 = java.util.Collections.EMPTY_MAP;
                                                            contentProviderClientAcquireUnstableContentProviderClient.release();
                                                            return map4;
                                                        }
                                                        int count = cursorQuery.getCount();
                                                        if (count == 0) {
                                                            map5 = java.util.Collections.EMPTY_MAP;
                                                        } else {
                                                            java.util.Map acaVar = count <= 256 ? new defpackage.aca(count) : new java.util.HashMap(count, 1.0f);
                                                            while (cursorQuery.moveToNext()) {
                                                                acaVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                            }
                                                            if (cursorQuery.isAfterLast()) {
                                                                cursorQuery.close();
                                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                                return acaVar;
                                                            }
                                                            android.util.Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                            map5 = java.util.Collections.EMPTY_MAP;
                                                        }
                                                        cursorQuery.close();
                                                        contentProviderClientAcquireUnstableContentProviderClient.release();
                                                        return map5;
                                                    } catch (java.lang.Throwable th5) {
                                                        if (cursorQuery == null) {
                                                            throw th5;
                                                        }
                                                        try {
                                                            cursorQuery.close();
                                                            throw th5;
                                                        } catch (java.lang.Throwable th6) {
                                                            th5.addSuppressed(th6);
                                                            throw th5;
                                                        }
                                                    }
                                                } catch (android.os.RemoteException e5) {
                                                    android.util.Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e5);
                                                    map4 = java.util.Collections.EMPTY_MAP;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                                throw th7;
                                            }
                                        }
                                    });
                                    android.os.StrictMode.setThreadPolicy(AllowThreadDiskReads2);
                                    aewgVarA.h = map3;
                                    AllowThreadDiskReads2 = map3;
                                    r9 = AllowThreadDiskReads2;
                                }
                                r8 = r9;
                            }
                        }
                        if (r8 == 0) {
                            r8 = java.util.Collections.EMPTY_MAP;
                        }
                        str2 = (java.lang.String) r8.get(strD2);
                        if (str2 != null) {
                            objA = a(str2);
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!this.b.b) {
                                context = aexaVar.a;
                                synchronized (defpackage.aewl.class) {
                                    if (defpackage.aewl.a == null) {
                                        if (defpackage.dff.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                            aewlVar4 = new defpackage.aewl(context);
                                        } else {
                                            aewlVar4 = new defpackage.aewl();
                                        }
                                        defpackage.aewl.a = aewlVar4;
                                    }
                                    aewlVar = defpackage.aewl.a;
                                    if (aewlVar != null) {
                                        context.getContentResolver().registerContentObserver(defpackage.aayn.a, true, (android.database.ContentObserver) defpackage.aewl.a.c);
                                        aewlVar3 = defpackage.aewl.a;
                                        if (aewlVar3 != null) {
                                            throw null;
                                        }
                                        aewlVar3.b = true;
                                    }
                                    aewlVar2 = defpackage.aewl.a;
                                    if (aewlVar2 != null) {
                                        throw null;
                                    }
                                    aewzVar = this.b;
                                    if (aewzVar.b) {
                                        strG = null;
                                    } else {
                                        strG = g((java.lang.String) aewzVar.e);
                                    }
                                    if (strG != null) {
                                        obj = aewlVar2.d;
                                        if (obj == null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            objA2 = a(str);
                                        }
                                    }
                                }
                            }
                            if (objA2 == null) {
                                objA = c();
                            } else {
                                objA = objA2;
                            }
                        }
                        if (ahynVar.f()) {
                            if (strP == null) {
                                objA = c();
                            } else {
                                objA = a(strP);
                            }
                        }
                        this.j = objA;
                        this.i = i;
                    } else {
                        objA = null;
                        if (objA == null) {
                            if (!this.b.b) {
                                context = aexaVar.a;
                                synchronized (defpackage.aewl.class) {
                                    if (defpackage.aewl.a == null) {
                                        if (defpackage.dff.i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) == 0) {
                                            aewlVar4 = new defpackage.aewl(context);
                                        } else {
                                            aewlVar4 = new defpackage.aewl();
                                        }
                                        defpackage.aewl.a = aewlVar4;
                                    }
                                    aewlVar = defpackage.aewl.a;
                                    if (aewlVar != null) {
                                        context.getContentResolver().registerContentObserver(defpackage.aayn.a, true, (android.database.ContentObserver) defpackage.aewl.a.c);
                                        aewlVar3 = defpackage.aewl.a;
                                        if (aewlVar3 != null) {
                                            throw null;
                                        }
                                        aewlVar3.b = true;
                                    }
                                    aewlVar2 = defpackage.aewl.a;
                                    if (aewlVar2 != null) {
                                        throw null;
                                    }
                                    aewzVar = this.b;
                                    if (aewzVar.b) {
                                        strG = null;
                                    } else {
                                        strG = g((java.lang.String) aewzVar.e);
                                    }
                                    if (strG != null) {
                                        obj = aewlVar2.d;
                                        if (obj == null) {
                                            str = null;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            objA2 = a(str);
                                        }
                                    }
                                }
                            }
                            if (objA2 == null) {
                                objA = c();
                            } else {
                                objA = objA2;
                            }
                        }
                        if (ahynVar.f()) {
                            if (strP == null) {
                                objA = c();
                            } else {
                                objA = a(strP);
                            }
                        }
                        this.j = objA;
                        this.i = i;
                    }
                }
            }
        }
        return this.j;
    }

    public final java.lang.Object c() {
        if (this.l) {
            synchronized (this) {
                if (this.l) {
                    java.lang.Object objA = a(this.h);
                    if (objA == null) {
                        throw null;
                    }
                    this.h = objA;
                    this.l = false;
                }
            }
        }
        return this.h;
    }

    public final java.lang.String d() {
        return g(this.b.a);
    }

    public aexb(defpackage.aewz aewzVar, java.lang.String str, java.lang.String str2) {
        if (aewzVar.d == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = aewzVar;
        this.c = str;
        this.h = str2;
        this.k = true;
        this.l = true;
    }
}

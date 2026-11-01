package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyd implements java.lang.Runnable {
    public static final long a;
    private static final java.lang.String b = defpackage.gsh.b("ForceStopRunnable");
    private final android.content.Context c;
    private final defpackage.guq d;
    private int e = 0;
    private final defpackage.ipc f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        a = 315360000000L;
    }

    public gyd(android.content.Context context, defpackage.guq guqVar) {
        this.c = context.getApplicationContext();
        this.d = guqVar;
        this.f = guqVar.m;
    }

    public static android.content.Intent a(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:109:0x028b A[Catch: IllegalArgumentException -> 0x02f0, SecurityException -> 0x02f2, SQLiteException -> 0x0336, all -> 0x03ee, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:10:0x003a A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x029d A[Catch: IllegalArgumentException -> 0x02f0, SecurityException -> 0x02f2, SQLiteException -> 0x0336, all -> 0x03ee, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b3 A[Catch: IllegalArgumentException -> 0x02f0, SecurityException -> 0x02f2, SQLiteException -> 0x0336, all -> 0x03ee, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02bd A[Catch: IllegalArgumentException -> 0x02f0, SecurityException -> 0x02f2, SQLiteException -> 0x0336, all -> 0x03ee, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02cd A[Catch: IllegalArgumentException -> 0x02f0, SecurityException -> 0x02f2, SQLiteException -> 0x0336, all -> 0x03ee, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02da A[Catch: SQLiteException -> 0x0336, all -> 0x03ee, EDGE_INSN: B:126:0x02da->B:173:0x03cc BREAK  A[LOOP:0: B:5:0x0027->B:201:0x0027], TRY_ENTER, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0047 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:198:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[LOOP:4: B:59:0x0191->B:218:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, LOOP:1: B:20:0x0070->B:21:0x0072, LOOP_END, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00be A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x010f A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0118 A[Catch: SQLiteException -> 0x03b1, all -> 0x03ee, TryCatch #5 {SQLiteException -> 0x03b1, blocks: (B:7:0x002b, B:8:0x002e, B:10:0x003a, B:12:0x0047, B:13:0x004a, B:15:0x0050, B:16:0x0053, B:19:0x006a, B:21:0x0072, B:22:0x00ae, B:24:0x00b9, B:26:0x00ca, B:27:0x00d2, B:29:0x00d8, B:31:0x00f0, B:33:0x00f6, B:34:0x0109, B:36:0x010f, B:38:0x0122, B:37:0x0118, B:25:0x00be), top: B:189:0x002b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0150 A[Catch: SQLiteException -> 0x0338, all -> 0x03ee, TryCatch #0 {SQLiteException -> 0x0338, blocks: (B:41:0x0135, B:43:0x0150, B:45:0x0156, B:47:0x015d, B:49:0x0163, B:50:0x0167, B:52:0x016d, B:54:0x0179, B:56:0x0181, B:57:0x0185, B:58:0x018d, B:59:0x0191, B:61:0x0197, B:63:0x01a3, B:67:0x01b5, B:73:0x01d3, B:75:0x01d8, B:76:0x01db, B:77:0x01dc), top: B:185:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d A[Catch: SQLiteException -> 0x0338, all -> 0x03ee, TryCatch #0 {SQLiteException -> 0x0338, blocks: (B:41:0x0135, B:43:0x0150, B:45:0x0156, B:47:0x015d, B:49:0x0163, B:50:0x0167, B:52:0x016d, B:54:0x0179, B:56:0x0181, B:57:0x0185, B:58:0x018d, B:59:0x0191, B:61:0x0197, B:63:0x01a3, B:67:0x01b5, B:73:0x01d3, B:75:0x01d8, B:76:0x01db, B:77:0x01dc), top: B:185:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0179 A[Catch: SQLiteException -> 0x0338, all -> 0x03ee, TryCatch #0 {SQLiteException -> 0x0338, blocks: (B:41:0x0135, B:43:0x0150, B:45:0x0156, B:47:0x015d, B:49:0x0163, B:50:0x0167, B:52:0x016d, B:54:0x0179, B:56:0x0181, B:57:0x0185, B:58:0x018d, B:59:0x0191, B:61:0x0197, B:63:0x01a3, B:67:0x01b5, B:73:0x01d3, B:75:0x01d8, B:76:0x01db, B:77:0x01dc), top: B:185:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0197 A[Catch: SQLiteException -> 0x0338, all -> 0x03ee, TryCatch #0 {SQLiteException -> 0x0338, blocks: (B:41:0x0135, B:43:0x0150, B:45:0x0156, B:47:0x015d, B:49:0x0163, B:50:0x0167, B:52:0x016d, B:54:0x0179, B:56:0x0181, B:57:0x0185, B:58:0x018d, B:59:0x0191, B:61:0x0197, B:63:0x01a3, B:67:0x01b5, B:73:0x01d3, B:75:0x01d8, B:76:0x01db, B:77:0x01dc), top: B:185:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5 A[Catch: SQLiteException -> 0x0338, all -> 0x03ee, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0338, blocks: (B:41:0x0135, B:43:0x0150, B:45:0x0156, B:47:0x015d, B:49:0x0163, B:50:0x0167, B:52:0x016d, B:54:0x0179, B:56:0x0181, B:57:0x0185, B:58:0x018d, B:59:0x0191, B:61:0x0197, B:63:0x01a3, B:67:0x01b5, B:73:0x01d3, B:75:0x01d8, B:76:0x01db, B:77:0x01dc), top: B:185:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c6 A[Catch: all -> 0x01d7, LOOP:5: B:69:0x01c0->B:71:0x01c6, LOOP_END, TryCatch #4 {all -> 0x01d7, blocks: (B:68:0x01b8, B:69:0x01c0, B:71:0x01c6, B:72:0x01d0), top: B:187:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa A[Catch: all -> 0x032f, TryCatch #9 {all -> 0x032f, blocks: (B:78:0x01e9, B:80:0x01ef, B:85:0x01fa, B:86:0x01fe, B:88:0x0204), top: B:196:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0204 A[Catch: all -> 0x032f, TRY_LEAVE, TryCatch #9 {all -> 0x032f, blocks: (B:78:0x01e9, B:80:0x01ef, B:85:0x01fa, B:86:0x01fe, B:88:0x0204), top: B:196:0x01e9 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x021c A[Catch: all -> 0x032d, TRY_LEAVE, TryCatch #6 {all -> 0x032d, blocks: (B:90:0x020c, B:91:0x021c), top: B:191:0x020c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243 A[Catch: SQLiteException -> 0x0336, all -> 0x03ee, TryCatch #3 {SQLiteException -> 0x0336, blocks: (B:136:0x0332, B:137:0x0335, B:92:0x0224, B:97:0x022f, B:99:0x0243, B:101:0x024d, B:103:0x0273, B:107:0x027e, B:109:0x028b, B:110:0x028e, B:112:0x029d, B:114:0x02a3, B:116:0x02b3, B:117:0x02b7, B:119:0x02bd, B:121:0x02cd, B:131:0x02fd, B:126:0x02da, B:130:0x02f3), top: B:186:0x01dc }] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        androidx.work.impl.WorkDatabase workDatabase;
        android.app.job.JobScheduler jobSchedulerA;
        java.util.List<android.app.job.JobInfo> listF;
        java.util.List listB;
        java.util.HashSet hashSet;
        int size;
        java.util.HashSet hashSet2;
        java.util.Iterator it;
        boolean z;
        androidx.work.impl.WorkDatabase workDatabase2;
        defpackage.gxm gxmVarD;
        defpackage.gxh gxhVarC;
        java.util.List<defpackage.gxl> listG;
        boolean z2;
        boolean z3;
        defpackage.guq guqVar;
        java.lang.Long lA;
        int i3;
        android.app.PendingIntent broadcast;
        java.util.List listM;
        android.app.ApplicationExitInfo applicationExitInfoM;
        defpackage.gxm gxmVarD2;
        java.util.Iterator it2;
        defpackage.gxd gxdVarE;
        java.lang.String str;
        java.lang.String str2;
        java.io.File fileV;
        java.io.File file;
        java.lang.String[] strArr;
        int iAL;
        java.util.LinkedHashMap linkedHashMap;
        int i4;
        defpackage.aoiu aoiuVar;
        java.util.Map mapAM;
        java.io.File file2;
        java.io.File file3;
        java.lang.String strBl;
        try {
            defpackage.guq guqVar2 = this.d;
            java.lang.String str3 = guqVar2.d.i;
            defpackage.gsh gshVarA = defpackage.gsh.a();
            java.lang.String str4 = b;
            gshVarA.c(str4, "The default process name was not specified.");
            android.content.Context context = this.c;
            if (!aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) context.getSystemService(android.os.UserManager.class))) {
                defpackage.gsh.a();
                android.util.Log.e(str4, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                defpackage.dxw dxwVar = guqVar2.d.f;
                if (dxwVar == null) {
                    throw illegalStateException;
                }
                dxwVar.accept(illegalStateException);
                guqVar2.i();
                return;
            }
            while (true) {
                if (context != null) {
                    i2 = 0;
                    if (defpackage.gus.v(context).exists()) {
                        defpackage.gsh gshVarA2 = defpackage.gsh.a();
                        str2 = guf.a;
                        gshVarA2.c(str2, "Migrating WorkDatabase to the no-backup directory");
                        if (context == null) {
                            defpackage.aooh.i("context");
                        }
                        fileV = defpackage.gus.v(context);
                        if (context == null) {
                            defpackage.aooh.i("context");
                        }
                        file = new java.io.File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                        strArr = guf.b;
                        int length = strArr.length;
                        iAL = defpackage.ajsz.aL(3);
                        if (iAL < 16) {
                            iAL = 16;
                        }
                        linkedHashMap = new java.util.LinkedHashMap(iAL);
                        i4 = 0;
                        for (i = 3; i4 < i; i = 3) {
                            java.lang.String str5 = strArr[i4];
                            defpackage.aoiu aoiuVar2 = new defpackage.aoiu(new java.io.File(java.lang.String.valueOf(fileV.getPath()).concat(java.lang.String.valueOf(str5))), new java.io.File(java.lang.String.valueOf(file.getPath()).concat(java.lang.String.valueOf(str5))));
                            linkedHashMap.put(aoiuVar2.a, aoiuVar2.b);
                            i4++;
                        }
                        aoiuVar = new defpackage.aoiu(fileV, file);
                        if (linkedHashMap.isEmpty()) {
                            mapAM = defpackage.ajsz.aM(aoiuVar);
                        } else {
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(linkedHashMap);
                            linkedHashMap2.put(aoiuVar.a, aoiuVar.b);
                            mapAM = linkedHashMap2;
                        }
                        for (java.util.Map.Entry entry : mapAM.entrySet()) {
                            file2 = (java.io.File) entry.getKey();
                            file3 = (java.io.File) entry.getValue();
                            if (!file2.exists()) {
                                if (file3.exists()) {
                                    defpackage.gsh.a();
                                    java.util.Objects.toString(file3);
                                    android.util.Log.w(str2, "Over-writing contents of ".concat(java.lang.String.valueOf(file3)));
                                }
                                if (file2.renameTo(file3)) {
                                    strBl = defpackage.a.bi(file3, file2, "Migrated ", "to ");
                                } else {
                                    strBl = defpackage.a.bl(file3, file2, "Renaming ", " to ", " failed");
                                }
                                defpackage.gsh.a().c(str2, strBl);
                            }
                        }
                    }
                    defpackage.gsh.a().c(b, "Performing cleanup operations.");
                    workDatabase = guqVar2.e;
                    java.lang.String str6 = defpackage.gvl.a;
                    jobSchedulerA = defpackage.gvj.a(context);
                    listF = defpackage.gvl.f(context, jobSchedulerA);
                    listB = workDatabase.A().b();
                    hashSet = new java.util.HashSet(listB);
                    if (listF != null) {
                        size = listF.size();
                    } else {
                        size = 0;
                    }
                    hashSet2 = new java.util.HashSet(size);
                    if (listF != null) {
                        for (android.app.job.JobInfo jobInfo : listF) {
                            gxdVarE = defpackage.gvl.e(jobInfo);
                            if (gxdVarE != null) {
                                str = gxdVarE.a;
                                if (hashSet.contains(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            defpackage.gvl.g(jobSchedulerA, jobInfo.getId());
                        }
                    }
                    it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!hashSet2.contains((java.lang.String) it.next())) {
                                defpackage.gsh.a().c(defpackage.gvl.a, "Reconciling jobs");
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        workDatabase.n();
                        gxmVarD2 = workDatabase.D();
                        it2 = listB.iterator();
                        while (it2.hasNext()) {
                            gxmVarD2.w((java.lang.String) it2.next(), -1L);
                        }
                        workDatabase.q();
                        workDatabase.o();
                    }
                    workDatabase2 = guqVar2.e;
                    gxmVarD = workDatabase2.D();
                    gxhVarC = workDatabase2.C();
                    workDatabase2.n();
                    listG = gxmVarD.g();
                    if (listG != null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        gxhVarC.b();
                        workDatabase2.q();
                        workDatabase2.o();
                        if (z2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        guqVar = this.d;
                        lA = ((androidx.work.impl.WorkDatabase) guqVar.m.a).y().a("reschedule_needed");
                        if (lA != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 31) {
                                i3 = 570425344;
                            } else {
                                i3 = 536870912;
                            }
                            android.content.Context context2 = this.c;
                            broadcast = android.app.PendingIntent.getBroadcast(context2, -1, a(context2), i3);
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context2.getSystemService("activity"), (java.lang.String) null, 0, 0);
                            if (listM != null) {
                                java.lang.Long lA2 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                                if (lA2 != null) {
                                }
                                while (true) {
                                    if (i2 < listM.size()) {
                                        applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                        if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                        }
                                        i2++;
                                    }
                                }
                            }
                            if (!z3) {
                                break;
                            }
                            defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                            defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                            break;
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            i3 = 570425344;
                        } else {
                            i3 = 536870912;
                        }
                        android.content.Context context3 = this.c;
                        broadcast = android.app.PendingIntent.getBroadcast(context3, -1, a(context3), i3);
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context3.getSystemService("activity"), (java.lang.String) null, 0, 0);
                        if (listM != null) {
                            java.lang.Long lA3 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                            if (lA3 != null) {
                            }
                            while (true) {
                                if (i2 < listM.size()) {
                                    applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                    if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                    }
                                    i2++;
                                }
                            }
                        }
                        if (!z3) {
                            break;
                        }
                        defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                        defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                        break;
                    }
                    for (defpackage.gxl gxlVar : listG) {
                        defpackage.gsw gswVar = defpackage.gsw.a;
                        java.lang.String str7 = gxlVar.b;
                        gxmVarD.A(gswVar, str7);
                        gxmVarD.r(str7, -512);
                        gxmVarD.w(str7, -1L);
                    }
                    gxhVarC.b();
                    workDatabase2.q();
                    workDatabase2.o();
                    if (z2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    guqVar = this.d;
                    lA = ((androidx.work.impl.WorkDatabase) guqVar.m.a).y().a("reschedule_needed");
                    if (lA != null) {
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            i3 = 570425344;
                        } else {
                            i3 = 536870912;
                        }
                        android.content.Context context4 = this.c;
                        broadcast = android.app.PendingIntent.getBroadcast(context4, -1, a(context4), i3);
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context4.getSystemService("activity"), (java.lang.String) null, 0, 0);
                        if (listM != null) {
                            java.lang.Long lA4 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                            if (lA4 != null) {
                            }
                            while (true) {
                                if (i2 < listM.size()) {
                                    applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                    if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                    }
                                    i2++;
                                }
                            }
                        }
                        if (!z3) {
                            break;
                        }
                        defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                        defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                        break;
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        i3 = 570425344;
                    } else {
                        i3 = 536870912;
                    }
                    android.content.Context context5 = this.c;
                    broadcast = android.app.PendingIntent.getBroadcast(context5, -1, a(context5), i3);
                    if (broadcast != null) {
                        broadcast.cancel();
                    }
                    listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context5.getSystemService("activity"), (java.lang.String) null, 0, 0);
                    if (listM != null) {
                        java.lang.Long lA5 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                        if (lA5 != null) {
                        }
                        while (true) {
                            if (i2 < listM.size()) {
                                applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                }
                                i2++;
                            }
                        }
                    }
                    if (!z3) {
                        break;
                    }
                    defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                    defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                    break;
                }
                try {
                    defpackage.aooh.i("context");
                    i2 = 0;
                    if (defpackage.gus.v(context).exists()) {
                        defpackage.gsh gshVarA3 = defpackage.gsh.a();
                        str2 = guf.a;
                        gshVarA3.c(str2, "Migrating WorkDatabase to the no-backup directory");
                        if (context == null) {
                            defpackage.aooh.i("context");
                        }
                        fileV = defpackage.gus.v(context);
                        if (context == null) {
                            defpackage.aooh.i("context");
                        }
                        file = new java.io.File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                        strArr = guf.b;
                        int length2 = strArr.length;
                        iAL = defpackage.ajsz.aL(3);
                        if (iAL < 16) {
                            iAL = 16;
                        }
                        linkedHashMap = new java.util.LinkedHashMap(iAL);
                        i4 = 0;
                        while (i4 < i) {
                            java.lang.String str8 = strArr[i4];
                            defpackage.aoiu aoiuVar3 = new defpackage.aoiu(new java.io.File(java.lang.String.valueOf(fileV.getPath()).concat(java.lang.String.valueOf(str8))), new java.io.File(java.lang.String.valueOf(file.getPath()).concat(java.lang.String.valueOf(str8))));
                            linkedHashMap.put(aoiuVar3.a, aoiuVar3.b);
                            i4++;
                        }
                        aoiuVar = new defpackage.aoiu(fileV, file);
                        if (linkedHashMap.isEmpty()) {
                            mapAM = defpackage.ajsz.aM(aoiuVar);
                        } else {
                            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(linkedHashMap);
                            linkedHashMap3.put(aoiuVar.a, aoiuVar.b);
                            mapAM = linkedHashMap3;
                        }
                        while (r0.hasNext()) {
                            file2 = (java.io.File) entry.getKey();
                            file3 = (java.io.File) entry.getValue();
                            if (!file2.exists()) {
                                if (file3.exists()) {
                                    defpackage.gsh.a();
                                    java.util.Objects.toString(file3);
                                    android.util.Log.w(str2, "Over-writing contents of ".concat(java.lang.String.valueOf(file3)));
                                }
                                if (file2.renameTo(file3)) {
                                    strBl = defpackage.a.bi(file3, file2, "Migrated ", "to ");
                                } else {
                                    strBl = defpackage.a.bl(file3, file2, "Renaming ", " to ", " failed");
                                }
                                defpackage.gsh.a().c(str2, strBl);
                            }
                        }
                    }
                    defpackage.gsh.a().c(b, "Performing cleanup operations.");
                    try {
                        workDatabase = guqVar2.e;
                        java.lang.String str9 = defpackage.gvl.a;
                        jobSchedulerA = defpackage.gvj.a(context);
                        listF = defpackage.gvl.f(context, jobSchedulerA);
                        listB = workDatabase.A().b();
                        hashSet = new java.util.HashSet(listB);
                        if (listF != null) {
                            size = listF.size();
                        } else {
                            size = 0;
                        }
                        hashSet2 = new java.util.HashSet(size);
                        if (listF != null && !listF.isEmpty()) {
                            while (r9.hasNext()) {
                                gxdVarE = defpackage.gvl.e(jobInfo);
                                if (gxdVarE != null) {
                                    str = gxdVarE.a;
                                    if (hashSet.contains(str)) {
                                        hashSet2.add(str);
                                    }
                                }
                                defpackage.gvl.g(jobSchedulerA, jobInfo.getId());
                            }
                        }
                        it = listB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!hashSet2.contains((java.lang.String) it.next())) {
                                    defpackage.gsh.a().c(defpackage.gvl.a, "Reconciling jobs");
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            workDatabase.n();
                            try {
                                gxmVarD2 = workDatabase.D();
                                it2 = listB.iterator();
                                while (it2.hasNext()) {
                                    gxmVarD2.w((java.lang.String) it2.next(), -1L);
                                }
                                workDatabase.q();
                                workDatabase.o();
                            } catch (java.lang.Throwable th) {
                                workDatabase.o();
                                throw th;
                            }
                        }
                        try {
                            workDatabase2 = guqVar2.e;
                            gxmVarD = workDatabase2.D();
                            gxhVarC = workDatabase2.C();
                            workDatabase2.n();
                            try {
                                listG = gxmVarD.g();
                                if (listG != null || listG.isEmpty()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    gxhVarC.b();
                                    workDatabase2.q();
                                    workDatabase2.o();
                                    if (z2) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    guqVar = this.d;
                                    lA = ((androidx.work.impl.WorkDatabase) guqVar.m.a).y().a("reschedule_needed");
                                    if (lA != null) {
                                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                                            i3 = 570425344;
                                        } else {
                                            i3 = 536870912;
                                        }
                                        android.content.Context context6 = this.c;
                                        broadcast = android.app.PendingIntent.getBroadcast(context6, -1, a(context6), i3);
                                        if (broadcast != null) {
                                            broadcast.cancel();
                                        }
                                        listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context6.getSystemService("activity"), (java.lang.String) null, 0, 0);
                                        if (listM != null) {
                                            java.lang.Long lA6 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                                            if (lA6 != null) {
                                            }
                                            while (true) {
                                                if (i2 < listM.size()) {
                                                    applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                                    if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                                    }
                                                    i2++;
                                                }
                                            }
                                        }
                                        if (!z3) {
                                            break;
                                        }
                                        defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                                        defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                                        break;
                                    }
                                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                                        i3 = 570425344;
                                    } else {
                                        i3 = 536870912;
                                    }
                                    android.content.Context context7 = this.c;
                                    broadcast = android.app.PendingIntent.getBroadcast(context7, -1, a(context7), i3);
                                    if (broadcast != null) {
                                        broadcast.cancel();
                                    }
                                    listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context7.getSystemService("activity"), (java.lang.String) null, 0, 0);
                                    if (listM != null) {
                                        java.lang.Long lA7 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                                        if (lA7 != null) {
                                        }
                                        while (true) {
                                            if (i2 < listM.size()) {
                                                applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                                if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10) {
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        break;
                                    }
                                    defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                                    defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                                    break;
                                }
                                while (r13.hasNext()) {
                                    try {
                                        defpackage.gsw gswVar2 = defpackage.gsw.a;
                                        java.lang.String str10 = gxlVar.b;
                                        gxmVarD.A(gswVar2, str10);
                                        gxmVarD.r(str10, -512);
                                        gxmVarD.w(str10, -1L);
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        workDatabase2.o();
                                        throw th;
                                    }
                                }
                                gxhVarC.b();
                                workDatabase2.q();
                                workDatabase2.o();
                                if (z2 || z) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                guqVar = this.d;
                                lA = ((androidx.work.impl.WorkDatabase) guqVar.m.a).y().a("reschedule_needed");
                                if (lA != null && lA.longValue() == 1) {
                                    defpackage.gsh.a().c(b, "Rescheduling Workers.");
                                    guqVar.j();
                                    ((androidx.work.impl.WorkDatabase) guqVar.m.a).y().b(new defpackage.gwr("reschedule_needed", 0L));
                                    break;
                                }
                                try {
                                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                                        i3 = 570425344;
                                    } else {
                                        i3 = 536870912;
                                    }
                                    android.content.Context context8 = this.c;
                                    broadcast = android.app.PendingIntent.getBroadcast(context8, -1, a(context8), i3);
                                    if (broadcast != null) {
                                        broadcast.cancel();
                                    }
                                    listM = baa$.ExternalSyntheticApiModelOutline1.m((android.app.ActivityManager) context8.getSystemService("activity"), (java.lang.String) null, 0, 0);
                                    if (listM != null && !listM.isEmpty()) {
                                        java.lang.Long lA8 = ((androidx.work.impl.WorkDatabase) this.f.a).y().a("last_force_stop_ms");
                                        long jLongValue = lA8 != null ? lA8.longValue() : 0L;
                                        while (true) {
                                            if (i2 < listM.size()) {
                                                applicationExitInfoM = baa$.ExternalSyntheticApiModelOutline1.m(listM.get(i2));
                                                if (baa$.ExternalSyntheticApiModelOutline1.m$2(applicationExitInfoM) != 10 && baa$.ExternalSyntheticApiModelOutline1.m(applicationExitInfoM) >= jLongValue) {
                                                    defpackage.gsh.a().c(b, "Application was force-stopped, rescheduling.");
                                                    defpackage.guq guqVar3 = this.d;
                                                    guqVar3.j();
                                                    defpackage.ipc ipcVar = this.f;
                                                    defpackage.gus gusVar = guqVar3.d.p;
                                                    ((androidx.work.impl.WorkDatabase) ipcVar.a).y().b(new defpackage.gwr("last_force_stop_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        break;
                                    }
                                    defpackage.gsh.a().c(b, "Found unfinished work, scheduling it.");
                                    defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                                    break;
                                } catch (java.lang.IllegalArgumentException e) {
                                    e = e;
                                    defpackage.gsh.a();
                                    android.util.Log.w(b, "Ignoring exception", e);
                                } catch (java.lang.SecurityException e2) {
                                    e = e2;
                                    defpackage.gsh.a();
                                    android.util.Log.w(b, "Ignoring exception", e);
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        } catch (android.database.sqlite.SQLiteException e3) {
                            e = e3;
                            int i5 = this.e + 1;
                            this.e = i5;
                            if (i5 >= 3) {
                                if (!(e instanceof android.database.sqlite.SQLiteAccessPermException) && !(e instanceof android.database.sqlite.SQLiteCantOpenDatabaseException) && !(e instanceof android.database.sqlite.SQLiteConstraintException) && !(e instanceof android.database.sqlite.SQLiteDatabaseCorruptException) && !(e instanceof android.database.sqlite.SQLiteDatabaseLockedException) && !(e instanceof android.database.sqlite.SQLiteDiskIOException) && !(e instanceof android.database.sqlite.SQLiteFullException) && !(e instanceof android.database.sqlite.SQLiteTableLockedException)) {
                                    throw e;
                                }
                                defpackage.gsh.a();
                                java.lang.String str11 = b;
                                android.util.Log.e(str11, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                                defpackage.dxw dxwVar2 = this.d.d.f;
                                if (dxwVar2 == null) {
                                    throw illegalStateException2;
                                }
                                defpackage.gsh.a().d(str11, "Routing exception to the specified exception handler", illegalStateException2);
                                dxwVar2.accept(illegalStateException2);
                                break;
                            }
                            long j = i5;
                            defpackage.gsh.a().d(b, "Retrying after " + (j * 300), e);
                            try {
                                java.lang.Thread.sleep(((long) this.e) * 300);
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                    } catch (android.database.sqlite.SQLiteException e4) {
                        e = e4;
                    }
                } catch (android.database.sqlite.SQLiteException e5) {
                    defpackage.gsh.a();
                    android.util.Log.e(b, "Unexpected SQLite exception during migrations");
                    java.lang.IllegalStateException illegalStateException3 = new java.lang.IllegalStateException("Unexpected SQLite exception during migrations", e5);
                    defpackage.dxw dxwVar3 = this.d.d.f;
                    if (dxwVar3 == null) {
                        throw illegalStateException3;
                    }
                    dxwVar3.accept(illegalStateException3);
                }
            }
            this.d.i();
        } catch (java.lang.Throwable th4) {
            this.d.i();
            throw th4;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adnd {
    public static final java.lang.Object a;
    public static final java.util.Map b;
    public static final java.util.Map c;
    public static final defpackage.tvn d;
    public static final defpackage.aogc e;

    static {
        defpackage.tvn tvnVar = new defpackage.tvn((char[]) null);
        d = tvnVar;
        a = new java.lang.Object();
        b = new java.util.HashMap();
        c = new java.util.HashMap();
        e = new defpackage.aogc(tvnVar);
    }

    static java.lang.String a(java.lang.Throwable th) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (th != null) {
            if (sb.length() > 0) {
                sb.append(" >>>> ");
            }
            sb.append(th.getClass().getSimpleName());
            sb.append(':');
            sb.append(th.getMessage());
            th = th.getCause();
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:262:0x05c3 A[Catch: all -> 0x05c9, TryCatch #24 {, blocks: (B:7:0x0011, B:8:0x001a, B:260:0x05b7, B:262:0x05c3, B:263:0x05c6, B:225:0x054c, B:227:0x0558, B:228:0x055b), top: B:300:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x05a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0222, code lost:
    
        if (true == r13.l()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0224, code lost:
    
        r29 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0227, code lost:
    
        r29 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022d, code lost:
    
        if (true == r13.m()) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022f, code lost:
    
        r30 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0232, code lost:
    
        r30 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0238, code lost:
    
        if (true == r13.k()) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023a, code lost:
    
        r31 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023d, code lost:
    
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023f, code lost:
    
        r32 = r13.b();
        r4 = defpackage.adin.f;
        r0 = r0.d(r2, new defpackage.adil(r27, r28, r29, r30, r31, r32), r13.h());
        r24 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0255, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0257, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0259, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0262, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0263, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0265, code lost:
    
        r25 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0267, code lost:
    
        r0 = new defpackage.ajdd(r0);
        r24 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026d, code lost:
    
        r2 = new defpackage.ajcq[1];
        r2[r21] = r0;
        r4 = new defpackage.anpu((boolean) r21, defpackage.aify.o(r2));
        r2 = new defpackage.adne(r7, r0, r3, r13);
        r0 = r7.c;
        r2 = r4.b(r2, r0);
        r4 = new defpackage.vmn(r13, 17);
        r5 = defpackage.aizu.d;
        r5 = new defpackage.aizs(r2, java.lang.Throwable.class, r4);
        r2.c(r5, defpackage.aiql.t(r0, r5));
        r2 = r20;
        r2.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a4, code lost:
    
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c9, code lost:
    
        r4 = defpackage.adhw.d(r13.i());
        r5 = com.google.android.libraries.micore.superpacks.common.PackManifest.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d5, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        r5.l(((defpackage.adhb) r4).a);
        r5.k(((defpackage.adhb) r4).b);
        r5.a = r13.e();
        r2 = r13.g();
        r4 = r2.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f4, code lost:
    
        r25 = r6;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f8, code lost:
    
        if (r6 >= r4) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01fa, code lost:
    
        r5.d((java.lang.String) r2.get(r6));
        r6 = r6 + 1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020c, code lost:
    
        r2 = r5.a();
        r27 = com.google.android.libraries.micore.superpacks.base.BasePriority.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0217, code lost:
    
        if (true == r13.n()) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        r28 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021c, code lost:
    
        r28 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v5, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(defpackage.adni r33, defpackage.tvn r34, defpackage.adnf r35, long r36, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnd.b(adni, tvn, adnf, long, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
    private static void c(defpackage.adnf adnfVar, java.lang.String str, java.util.List list, java.util.Set set, int i, int i2, int i3) {
        java.lang.String str2;
        if (!((defpackage.aiob) defpackage.adhn.a.b()).T() || list.isEmpty()) {
            return;
        }
        defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "logPendingDownloads", 607, "ScheduledDownloadManager.java");
        if (adnfVar == null) {
            str2 = "";
        } else {
            str2 = " (" + adnfVar.e.toString() + ')';
        }
        java.lang.String str3 = str2;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(list.size());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.adjg adjgVar = (defpackage.adjg) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(adjgVar.d().e(true));
            if (e.b.containsKey(adjgVar.i())) {
                sb.append(" @");
            }
            if (set.contains(adjgVar)) {
                sb.append(" *");
            }
            sb.append(' ');
            sb.append(adjgVar.b.m());
        }
        aiobVar.Q("Scheduling: %s%s, %d started, %d paused, %d scheduled, %d pending: %s", str, str3, numValueOf, numValueOf2, numValueOf3, numValueOf4, sb.toString());
    }
}

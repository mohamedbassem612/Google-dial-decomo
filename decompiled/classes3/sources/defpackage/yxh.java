package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxh implements defpackage.ywk {
    private static final java.util.Set a = ajsz.cW(new akfg[]{akfg.dS, akfg.O, akfg.aK});
    private final aolr b;
    private final j$.util.Optional c;
    private final aoin d;
    private final aoin e;
    private final tmi f;

    public yxh(tmi tmiVar, aolr aolrVar, j$.util.Optional optional, aoin aoinVar, aoin aoinVar2) {
        aooh.f(tmiVar, "sharpieConfigProvider");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(optional, "sharpieTestingOverrides");
        aooh.f(aoinVar, "enableSharpieOnUnverifiedCallsWithCallerId");
        aooh.f(aoinVar2, "enableSharpieOnOutgoingCalls");
        this.f = tmiVar;
        this.b = aolrVar;
        this.c = optional;
        this.d = aoinVar;
        this.e = aoinVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywk
    public final java.lang.Object a(defpackage.ywn ywnVar, aoln aolnVar) {
        defpackage.yxd yxdVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yxd) {
            yxdVar = (defpackage.yxd) aolnVar;
            int i = yxdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxdVar.c = i - Integer.MIN_VALUE;
            } else {
                yxdVar = new defpackage.yxd(this, aolnVar);
            }
        } else {
            yxdVar = new defpackage.yxd(this, aolnVar);
        }
        java.lang.Object obj = yxdVar.a;
        defpackage.ywr ywrVar = aolu.a;
        int i2 = yxdVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yxdVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1192, "SharpieSharedCallPreconditions_checkCall");
            try {
                aolr aolrVar = this.b;
                ytl ytlVar = new ytl(this, ywnVar, (aoln) null, 3);
                yxdVar.d = ahoqVarZ;
                yxdVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, ytlVar, yxdVar);
                if (objAj != ywrVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return ywrVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yxdVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        ywrVar = (defpackage.ywr) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ywrVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026c  */
    /* JADX WARN: Code duplicated, block: B:104:0x027c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x029a  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b0 A[PHI: r2
      0x02b0: PHI (r2v59 int) = (r2v51 int), (r2v60 int) binds: [B:99:0x026a, B:113:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02db  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:138:0x0325  */
    /* JADX WARN: Code duplicated, block: B:146:0x034e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0369 A[PHI: r8
      0x0369: PHI (r8v36 int) = (r8v0 int), (r8v0 int), (r8v37 int) binds: [B:72:0x01ea, B:76:0x01fc, B:149:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0376  */
    /* JADX WARN: Code duplicated, block: B:160:0x0391  */
    /* JADX WARN: Code duplicated, block: B:162:0x039d  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c4 A[PHI: r5
      0x03c4: PHI (r5v51 int) = (r5v35 int), (r5v52 int) binds: [B:133:0x030f, B:171:0x03c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:56:0x019e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01da  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223  */
    /* JADX WARN: Code duplicated, block: B:90:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:96:0x0258  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e7, code lost:
    
        r1 = r1;
        if (r2 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0338, code lost:
    
        if (((defpackage.ywl) r2).a != null) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ywn] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v128 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ywn r18, aoln r19) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxh.b(ywn, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.yxf yxfVar;
        if (aolnVar instanceof defpackage.yxf) {
            yxfVar = (defpackage.yxf) aolnVar;
            int i = yxfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxfVar.c = i - Integer.MIN_VALUE;
            } else {
                yxfVar = new defpackage.yxf(this, aolnVar);
            }
        } else {
            yxfVar = new defpackage.yxf(this, aolnVar);
        }
        java.lang.Object objB = yxfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yxfVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            tmi tmiVar = this.f;
            yxfVar.c = 1;
            objB = tmiVar.b(yxfVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        defpackage.yur yurVar = ((defpackage.yuw) objB).b;
        return java.lang.Boolean.valueOf(yvl.a(yurVar.b, yurVar.a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.yxg yxgVar;
        ?? r6;
        if (aolnVar instanceof defpackage.yxg) {
            yxgVar = (defpackage.yxg) aolnVar;
            int i = yxgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxgVar.d = i - Integer.MIN_VALUE;
            } else {
                yxgVar = new defpackage.yxg(this, aolnVar);
            }
        } else {
            yxgVar = new defpackage.yxg(this, aolnVar);
        }
        java.lang.Object obj = yxgVar.b;
        aolu aoluVar = aolu.a;
        int i2 = yxgVar.d;
        boolean z = false;
        if (i2 == 0) {
            aooc.af(obj);
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                tmi tmiVar = this.f;
                java.util.Set set = a;
                yxgVar.a = set;
                yxgVar.d = 1;
                java.lang.Object objB = tmiVar.b(yxgVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                obj = objB;
                r6 = set;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj2 = yxgVar.a;
        aooc.af(obj);
        r6 = obj2;
        if (r6.contains(((defpackage.yuw) obj).b.b)) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}

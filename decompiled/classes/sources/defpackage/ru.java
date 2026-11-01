package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ru {
    static java.util.List a(android.app.appsearch.SearchResult searchResult) {
        return rp$.ExternalSyntheticApiModelOutline0.m(searchResult);
    }

    public static final int b(dvv dvvVar) {
        if (dvvVar == null) {
            return 0;
        }
        java.lang.String str = dvvVar.d;
        return str != null ? str.hashCode() : j$.util.Objects.hash(new java.lang.Object[]{dvvVar.a, dvvVar.c, java.lang.Boolean.valueOf(dvvVar.e), java.lang.Boolean.valueOf(dvvVar.f)});
    }

    public static final boolean c(dvv dvvVar, dvv dvvVar2) {
        if (dvvVar == null) {
            if (dvvVar2 == null) {
                return true;
            }
        } else if (dvvVar2 != null) {
            java.lang.String str = dvvVar.d;
            java.lang.String str2 = dvvVar2.d;
            if (str != null || str2 != null) {
                return defpackage.aooh.n(str, str2);
            }
            if (defpackage.aooh.n(j$.util.Objects.toString(dvvVar.a), j$.util.Objects.toString(dvvVar2.a)) && defpackage.aooh.n(dvvVar.c, dvvVar2.c) && dvvVar.e == dvvVar2.e && dvvVar.f == dvvVar2.f) {
                return true;
            }
        }
        return false;
    }

    public static final int d(bcc bccVar, defpackage.aso asoVar) {
        return (int) (asoVar == defpackage.aso.a ? bccVar.k & 4294967295L : bccVar.k >> 32);
    }

    public static final int e(bcc bccVar, defpackage.aso asoVar) {
        return (int) (asoVar == defpackage.aso.a ? bccVar.j & 4294967295L : bccVar.j >> 32);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0130  */
    /* JADX WARN: Code duplicated, block: B:31:0x013c A[LOOP:2: B:27:0x012c->B:31:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0381 -> B:14:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(defpackage.cwc r37, boolean r38, defpackage.aowi r39, defpackage.aonj r40, defpackage.aoln r41) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru.f(cwc, boolean, aowi, aonj, aoln):java.lang.Object");
    }

    public static final defpackage.cpm g(defpackage.cvf cvfVar) {
        long jBl;
        int i = cvfVar.e;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        java.util.List list = cvfVar.a;
        cvm cvmVar = (cvm) (list.isEmpty() ? null : list.get(0));
        if (cvmVar != null) {
            long j = cvmVar.l;
            java.util.List listA = cvmVar.a();
            defpackage.cpm cpmVar = new defpackage.cpm(0L);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                cpmVar = new defpackage.cpm(defpackage.mni.aM(cpmVar.a, ((cuy) listA.get(i2)).d));
            }
            jBl = defpackage.mni.bl(j ^ (-9223372034707292160L), cpmVar.a);
        } else {
            jBl = 0;
        }
        if (jBl == 0) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cvm) list.get(i3)).b();
        }
        return new defpackage.cpm(jBl);
    }

    public static final java.lang.Float h(defpackage.cvf cvfVar) {
        int i = cvfVar.e;
        if (i == 7 || i == 8 || i == 9) {
            java.util.List list = cvfVar.a;
            int size = list.size();
            float f = 1.0f;
            for (int i2 = 0; i2 < size; i2++) {
                cvm cvmVar = (cvm) list.get(i2);
                f *= cvmVar.k;
                java.util.List listA = cvmVar.a();
                int size2 = listA.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    f *= ((cuy) listA.get(i3)).c;
                }
            }
            if (f != 1.0f) {
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((cvm) list.get(i4)).b();
                }
                return java.lang.Float.valueOf(f);
            }
        }
        return null;
    }

    public static final defpackage.cpm i(defpackage.cwc cwcVar, defpackage.cvf cvfVar, ni niVar) {
        long j;
        long jBl;
        if ((cvfVar.d & 4096) == 0) {
            return null;
        }
        int i = cvfVar.e;
        if (i != 6 && i != 10 && i != 11 && i != 12) {
            return null;
        }
        cwcVar.o();
        long jA = niVar.a(cvfVar);
        java.util.List list = cvfVar.a;
        cvm cvmVar = (cvm) (list.isEmpty() ? null : list.get(0));
        long j2 = 0;
        if (cvmVar != null) {
            long j3 = cvmVar.l;
            java.util.List listA = cvmVar.a();
            defpackage.cpm cpmVar = new defpackage.cpm(0L);
            int size = listA.size();
            int i2 = 0;
            while (i2 < size) {
                cpmVar = new defpackage.cpm(defpackage.mni.aM(cpmVar.a, ((cuy) listA.get(i2)).d));
                i2++;
                j2 = j2;
            }
            j = j2;
            jBl = defpackage.mni.bl(j3 ^ (-9223372034707292160L), cpmVar.a);
        } else {
            j = 0;
            jBl = 0;
        }
        long jBl2 = defpackage.mni.bl(jA, jBl);
        if (jBl2 == j) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((cvm) list.get(i3)).b();
        }
        return new defpackage.cpm(jBl2);
    }

    public static /* synthetic */ defpackage.cmw j(defpackage.cmw cmwVar, defpackage.css cssVar, defpackage.cmj cmjVar, cwy cwyVar, float f, defpackage.cqh cqhVar, int i) {
        if ((i & 4) != 0) {
            cmjVar = defpackage.cmh.e;
        }
        defpackage.cmj cmjVar2 = cmjVar;
        if ((i & 8) != 0) {
            cwyVar = defpackage.cwx.c;
        }
        cwy cwyVar2 = cwyVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return cmwVar.a(new defpackage.coe(cssVar, z, cmjVar2, cwyVar2, f, cqhVar));
    }

    public static final defpackage.cmw k(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new cnx(aonjVar));
    }

    public static final defpackage.cmw l(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new coa(aonjVar));
    }

    public static final defpackage.cmw m(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new cob(aonjVar));
    }

    public static final cnv n(defpackage.aonj aonjVar) {
        return new cnv(new cnw(), aonjVar);
    }

    public static final defpackage.cmw o(defpackage.cmw cmwVar, float f) {
        return f != 1.0f ? defpackage.cfd.K(cmwVar, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 0, 1044475) : cmwVar;
    }

    public static final long p(ni niVar) {
        android.view.DragEvent dragEvent = (android.view.DragEvent) niVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) java.lang.Float.floatToRawIntBits(x)) << 32) | (((long) java.lang.Float.floatToRawIntBits(y)) & 4294967295L);
    }
}
